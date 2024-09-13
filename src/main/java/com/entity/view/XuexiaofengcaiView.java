package com.entity.view;

import com.entity.XuexiaofengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校风采
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 14:31:03
 */
@TableName("xuexiaofengcai")
public class XuexiaofengcaiView  extends XuexiaofengcaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaofengcaiView(){
	}
 
 	public XuexiaofengcaiView(XuexiaofengcaiEntity xuexiaofengcaiEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaofengcaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
