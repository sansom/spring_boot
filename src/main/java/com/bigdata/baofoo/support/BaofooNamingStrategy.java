package com.bigdata.baofoo.support;


import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.spi.MetadataBuildingContext;

public class BaofooNamingStrategy extends ImplicitNamingStrategyJpaCompliantImpl {

	private static final long serialVersionUID = 6363358274933974635L;
	
@Override
protected Identifier toIdentifier(String stringForm, MetadataBuildingContext buildingContext) {
	// 指定表名+列名的前缀
	return super.toIdentifier("bf_"+stringForm, buildingContext);
}
}