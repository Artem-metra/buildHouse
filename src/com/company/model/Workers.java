package com.company.model;

import java.util.Objects;


  public  enum Workers{
      CRANE_OPERATOR(7.5),
      PLASTERER(8),
      MASON(4),
      MASTER(6);


      public double laborCosts;

      Workers(double laborCosts) {
          this.laborCosts = laborCosts;
      }

      public double getlaborCosts() {
          return laborCosts;
      }

      }


