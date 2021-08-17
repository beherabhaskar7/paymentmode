package com.springboot.payment;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties("paytm.payment.sandbox")
public class PaytmDetails {

	private String merchantId;

    private String merchantKey;

    private String channelId;

    private String website;

    private String industryTypeId;

    private String paytmUrl;

    private Map<String, String> details;

//	public String getPaytmUrl() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public TreeMap<String, String> getDetails() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
}
