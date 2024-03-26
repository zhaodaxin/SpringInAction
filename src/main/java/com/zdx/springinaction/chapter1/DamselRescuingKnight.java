package com.zdx.springinaction.chapter1;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	/**
	 * DamselRescuingKnight在它的构造函数中自行创建了
	 * RescueDamselQuest。这使得DamselRescuingKnight紧密地
	 * 和RescueDamselQuest耦合到了一起，因此极大地限制了这个骑士执行探险的能力
	 */
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	/**
	 * 为这个DamselRescuingKnight编写单元测试将出奇地困难。在这样的一个测试中，你必须保证当骑士的
	 * embarkOnQuest()方法被调用的时候，探险的embark()方法也要被调用。
	 */
	public void embarkOnQuest() {
		quest.embark();
	}

}
