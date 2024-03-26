package com.zdx.springinaction.chapter1;

/**
 * BraveKnight没有与任何特定的Quest实现发生耦合,被要求挑战的探险任务只要实现了Quest接口，那么具体是哪种类型的探险就无关紧要了，
 * 这就是DI所带来的最大收益 ——松耦合
 * 
 * @author daxin
 *
 */
public class BraveKnight implements Knight {

	private Quest quest;

	/**
	 * 不同于之前的 DamselRescuingKnight，BraveKnight没有自行创建探险任
	 * 务，而是在构造的时候把探险任务作为构造器参数传入。这是依赖注 入的方式之一，即构造器注入（constructor injection）
	 * 
	 * @param quest 传入的探险类型是Quest——所有探险任务都必须实现的一个接口，BraveKnight能够响应任意的Quest实现
	 */
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}
