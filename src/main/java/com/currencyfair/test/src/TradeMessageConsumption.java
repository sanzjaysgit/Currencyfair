package com.currencyfair.test.src;

 

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Handles requests for the application.
 */


@Controller
public class TradeMessageConsumption {

	private static final Logger logger = LoggerFactory.getLogger(TradeMessageConsumption.class);
	
	private static Map<String, TradeMessage> hashTradeMsgs = new HashMap<String, TradeMessage>();
	
	@Autowired
	private TradeMessageProcessor tradeMessageProcessor;
	 
	 
	public TradeMessageConsumption() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value="/processTradeMsg", method=RequestMethod.POST )
    @ResponseBody
	  public TradeMessage processTradeMsg(@ModelAttribute("tradeMessage") TradeMessage tradeMessage) {
	     
	    if (tradeMessage != null) {
	      logger.info("Inside processTradeMsg, adding: " + tradeMessage.toString());
	      
	      tradeMessageProcessor.processTradeMessage(tradeMessage);
	        
	    } else {
	      logger.info("Inside processTradeMsg...");
	    }
	    
	    logger.info("Call Message Processor to process Trade Messages");
	    
	    
	    
	    hashTradeMsgs.put(tradeMessage.getUserId(), tradeMessage);
	    return tradeMessage;
	  }
	
	
	@RequestMapping(value="/postTraderMsg", method=RequestMethod.GET)
	  public ModelAndView postTraderMessage() {
	     
	    return new ModelAndView("MessageFE", "command", new TradeMessage());
	  }
	
	
	@RequestMapping(value="/processedTMessages", method=RequestMethod.GET)
	  @ResponseBody
	  public Map<String, TradeMessage> getAllProcessedTradeMessages() {
	    logger.info("Getting all trade messages...");
	     
	    return hashTradeMsgs;
	  }
}
