package com.mood.entity.project;

import com.mood.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 项目
 *
 * @author chaiwei
 * @time 2018-05-09 17:34
 */
@Data
@Table(name = "ethico_project")
public class Project extends BaseEntity {

    @Id
    private String id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目名称说明
     */
    private String saleDesciption;

    /**
     * 项目说明图片
     */
    private String imageURL_Big;

    /**
     * 项目图标
     */
    private String imageURL_Small;

    /**
     * 开始时间
     */
    private Long startDate;

    /**
     * 结束时间
     */
    private Long endDate;

    /**
     * 发布者名称
     */
    private String ownerName;

    /**
     * 发布者logo
     */
    private String ownerImageURL;

    /**
     * 类型：1.预售
     */
    private Integer tag;

    /**
     * 专家综合评分
     */
    private Integer expertRate;

    /**
     * 介绍视频
     */
    private String videoURL;

    /**
     * 类型：1.预售
     */
    private String saleContent;

    /**
     * 基本介绍
     */
    private String content;

    /**
     * 白皮书地址
     */
    private String whitepaperURL;

    /**
     * 团队地址
     */
    private String teamURL;

    /**
     * 代码
     */
    private String symbol;

    /**
     * 参考价格
     */
    private String price;

    /**
     * 代币地址
     */
    private String address;

    /**
     *
     */
    private String minimalInvestment;

    /**
     * 软顶
     */
    private String softCap;

    /**
     * 硬顶
     */
    private String hardCap;

    /**
     * 官网
     */
    private String webURL;

    /**
     * 手续费
     */
    private String fee;

    /**
     * 剩余额度
     */
    private String remainingRoom;

    /**
     * 已分配额度
     */
    private String allocation;

    /**
     *
     */
    private String v;

    /**
     *
     */
    private String restrictMode;

    /**
     *
     */
    private String onceLimit;

    /**
     *
     */
    private String sequence;

    /**
     * 是否活跃
     */
    private String active;

    /**
     * 是否公开
     */
    private String published;

}
