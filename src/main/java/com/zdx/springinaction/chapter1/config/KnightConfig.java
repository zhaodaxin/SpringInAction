package com.zdx.springinaction.chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zdx.springinaction.chapter1.BraveKnight;
import com.zdx.springinaction.chapter1.Knight;
import com.zdx.springinaction.chapter1.Quest;
import com.zdx.springinaction.chapter1.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
