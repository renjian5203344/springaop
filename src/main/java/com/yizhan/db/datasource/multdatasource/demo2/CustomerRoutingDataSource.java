package com.yizhan.db.datasource.multdatasource.demo2;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.logging.Logger;

public class CustomerRoutingDataSource extends AbstractRoutingDataSource {
 
   @Override
   protected Object determineCurrentLookupKey() {
      return CustomerContextHolder.getCustomerType();
   }

   @Override
   public Logger getParentLogger()    {
      return null;
   }
}
