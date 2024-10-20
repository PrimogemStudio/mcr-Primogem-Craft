
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ceshi.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ceshi.PrimogemcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PrimogemcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrimogemcraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ZHENGHUO = REGISTRY.register("zhenghuo",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.primogemcraft.zhenghuo")).icon(() -> new ItemStack(PrimogemcraftModItems.YUANSHI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PrimogemcraftModItems.MINGWEI_YIQIEDEKAISHI.get());
				tabData.accept(PrimogemcraftModItems.YUANSHI.get());
				tabData.accept(PrimogemcraftModItems.YSSP.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIF.get());
				tabData.accept(PrimogemcraftModItems.XINGCHEN.get());
				tabData.accept(PrimogemcraftModItems.XINGHUI.get());
				tabData.accept(PrimogemcraftModItems.XIXIANGYUZHIYUAN.get());
				tabData.accept(PrimogemcraftModItems.JIJIUCHANZHIYUAN.get());
				tabData.accept(PrimogemcraftModItems.SHILIANCHOU.get());
				tabData.accept(PrimogemcraftModItems.JINGUANGBAODI_01.get());
				tabData.accept(PrimogemcraftModItems.CHUANGSHIJIEJING.get());
				tabData.accept(PrimogemcraftModItems.MMOLA_01.get());
				tabData.accept(PrimogemcraftModItems.YUZHOUSUIPIAN.get());
				tabData.accept(PrimogemcraftModItems.WMOLADAI.get());
				tabData.accept(PrimogemcraftModItems.XIAODAIMOLA.get());
				tabData.accept(PrimogemcraftModItems.JINZHIMOLA.get());
				tabData.accept(PrimogemcraftModItems.MLJNB.get());
				tabData.accept(PrimogemcraftModItems.YIYINHEDALETOU.get());
				tabData.accept(PrimogemcraftModItems.XINGJIDALETOU.get());
				tabData.accept(PrimogemcraftModItems.JLBJ.get());
				tabData.accept(PrimogemcraftModItems.QWXYZQ.get());
				tabData.accept(PrimogemcraftModItems.QWKWZJ.get());
				tabData.accept(PrimogemcraftModItems.QWYMZJ.get());
				tabData.accept(PrimogemcraftModItems.FENLIEJINBI.get());
				tabData.accept(PrimogemcraftModItems.QWFLYB.get());
				tabData.accept(PrimogemcraftModItems.SSANBAMIANTOU.get());
				tabData.accept(PrimogemcraftModItems.WAWANXIANGWUCHANGTOU.get());
				tabData.accept(PrimogemcraftModItems.QWLBTDGCL.get());
				tabData.accept(PrimogemcraftModItems.CEBUZHUNXIA.get());
				tabData.accept(PrimogemcraftModItems.QWTCJLBPTBG.get());
				tabData.accept(PrimogemcraftModItems.XIANGDANGANLAO.get());
				tabData.accept(PrimogemcraftModItems.QUXGJIBING.get());
				tabData.accept(PrimogemcraftModItems.QWQCXXMX.get());
				tabData.accept(PrimogemcraftModItems.QWYZZM.get());
				tabData.accept(PrimogemcraftModItems.CHUNMEIZHIPAO.get());
				tabData.accept(PrimogemcraftModItems.QWJZYJ.get());
				tabData.accept(PrimogemcraftModItems.QWSMCL.get());
				tabData.accept(PrimogemcraftModItems.FULINJIAO.get());
				tabData.accept(PrimogemcraftModItems.QWXBZSQ.get());
				tabData.accept(PrimogemcraftModItems.WANSHINANG.get());
				tabData.accept(PrimogemcraftModItems.YIYIMUGUOSHI.get());
				tabData.accept(PrimogemcraftModItems.QWHDLZ.get());
				tabData.accept(PrimogemcraftModItems.QWYBTZDYPJ.get());
				tabData.accept(PrimogemcraftModItems.PENGKELUODEJINGSHEN.get());
				tabData.accept(PrimogemcraftModItems.QWTLDHY.get());
				tabData.accept(PrimogemcraftModItems.QWQSKXJXT.get());
				tabData.accept(PrimogemcraftModItems.QWWXNTDMJ.get());
				tabData.accept(PrimogemcraftModItems.QIWUCHONGWANG.get());
				tabData.accept(PrimogemcraftModItems.LUANQIBAZAODEDAIMA.get());
				tabData.accept(PrimogemcraftModItems.YOUDIANQIQIAODEDAIMA.get());
				tabData.accept(PrimogemcraftModItems.ZHONGGUIZHONGJUDEDAIMA.get());
				tabData.accept(PrimogemcraftModItems.JINGQUEYOUYADAIMA.get());
				tabData.accept(PrimogemcraftModItems.MEIYOUZHUSHIDAIMA.get());
				tabData.accept(PrimogemcraftModItems.WUXIANDIGUIDEDAIMA.get());
				tabData.accept(PrimogemcraftModItems.HQFENG.get());
				tabData.accept(PrimogemcraftModItems.HQYAN.get());
				tabData.accept(PrimogemcraftModItems.HQLEI.get());
				tabData.accept(PrimogemcraftModItems.HQCAO.get());
				tabData.accept(PrimogemcraftModItems.HQSHUI.get());
				tabData.accept(PrimogemcraftModItems.HQHUO.get());
				tabData.accept(PrimogemcraftModItems.HQBING.get());
				tabData.accept(PrimogemcraftModItems.GONGSIDEGUGUZHONG.get());
				tabData.accept(PrimogemcraftModItems.QIWUHEISENLINGGZ.get());
				tabData.accept(PrimogemcraftModItems.QWGGZFENLIE_A.get());
				tabData.accept(PrimogemcraftModItems.QWGGZFENLIE_B.get());
				tabData.accept(PrimogemcraftModItems.YDGGZ.get());
				tabData.accept(PrimogemcraftModItems.GUZHONGLINGJIAN.get());
				tabData.accept(PrimogemcraftModItems.GZSMZ.get());
				tabData.accept(PrimogemcraftModItems.SHXJDLT.get());
				tabData.accept(PrimogemcraftModItems.SHQWYHDLT.get());
				tabData.accept(PrimogemcraftModItems.SHQWFNJ.get());
				tabData.accept(PrimogemcraftModItems.SHCBZX.get());
				tabData.accept(PrimogemcraftModItems.ZHZHENYINHEDALETOU.get());
				tabData.accept(PrimogemcraftModItems.SHENMILIHE.get());
				tabData.accept(PrimogemcraftModItems.QHZLH.get());
				tabData.accept(PrimogemcraftModItems.QHZLLH_2.get());
				tabData.accept(PrimogemcraftModItems.Q_QU_HANG_ZHOULLH.get());
				tabData.accept(PrimogemcraftModItems.QHZLLH_4.get());
				tabData.accept(PrimogemcraftModItems.JIANGLILIULANGZHEJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.JIANGLIMAOXIANJIAJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.JIANGLIDAYINXIONGJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.MZSJ.get());
				tabData.accept(PrimogemcraftModItems.MZSJ_2.get());
				tabData.accept(PrimogemcraftModItems.MZSJ_3.get());
				tabData.accept(PrimogemcraftModItems.YISHIJIEMUGUN.get());
				tabData.accept(PrimogemcraftModItems.JIUCHANZHIYUANXIAN.get());
				tabData.accept(PrimogemcraftModItems.LIULANGZHEDEJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.MAOXIANJIADEJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.DAYINGXIONGDEJINGYAN.get());
				tabData.accept(PrimogemcraftModItems.JLZA.get());
				tabData.accept(PrimogemcraftModItems.JLLIANG.get());
				tabData.accept(PrimogemcraftModItems.JLMO.get());
				tabData.accept(PrimogemcraftModItems.ZZJS.get());
				tabData.accept(PrimogemcraftModItems.JLZS.get());
				tabData.accept(PrimogemcraftModItems.YHJS.get());
				tabData.accept(PrimogemcraftModItems.ZHJS.get());
				tabData.accept(PrimogemcraftModItems.ZYJS.get());
				tabData.accept(PrimogemcraftModItems.RYJS.get());
				tabData.accept(PrimogemcraftModItems.LIJS.get());
				tabData.accept(PrimogemcraftModItems.ZZJLL.get());
				tabData.accept(PrimogemcraftModItems.JLJSL.get());
				tabData.accept(PrimogemcraftModItems.YHJSL.get());
				tabData.accept(PrimogemcraftModItems.ZHJSL.get());
				tabData.accept(PrimogemcraftModItems.ZYJSL.get());
				tabData.accept(PrimogemcraftModItems.RYJLL.get());
				tabData.accept(PrimogemcraftModItems.LAJSL.get());
				tabData.accept(PrimogemcraftModItems.MLLP.get());
				tabData.accept(PrimogemcraftModItems.MLLPZS.get());
				tabData.accept(PrimogemcraftModItems.MLLPHJ.get());
				tabData.accept(PrimogemcraftModItems.MLLPWZ.get());
				tabData.accept(PrimogemcraftModItems.XIWANGDEYITIAN_011.get());
				tabData.accept(PrimogemcraftModItems.BBUZAINIANQINGDEQINCEZHUANG_012.get());
				tabData.accept(PrimogemcraftModItems.SSHENHUDEZHUFU_013.get());
				tabData.accept(PrimogemcraftModItems.CCANGRUIMILINJIAN_014.get());
				tabData.accept(PrimogemcraftModItems.FENGDANDAIBIAO.get());
				tabData.accept(PrimogemcraftModItems.TAIKONGMANBUCHANGPIAN.get());
				tabData.accept(PrimogemcraftModItems.YYANZIYUELIANGCHANGPIAN.get());
				tabData.accept(PrimogemcraftModItems.TASHANGLVTUCHANGPIAN.get());
				tabData.accept(PrimogemcraftModItems.ZHAIQUAN.get());
				tabData.accept(PrimogemcraftModItems.TEZHIDIEYINGQI.get());
				tabData.accept(PrimogemcraftModItems.MMOLAPEIZIWUPIN.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIYUANPEI.get());
				tabData.accept(PrimogemcraftModItems.CUNQUPINGZHENG.get());
				tabData.accept(PrimogemcraftModItems.YISHIJIECUNZHE.get());
				tabData.accept(PrimogemcraftModItems.LAOSHI.get());
				tabData.accept(PrimogemcraftModBlocks.XIAOGUANZI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DAGUANZI.get().asItem());
				tabData.accept(PrimogemcraftModItems.XIANTIAOQIANG.get());
				tabData.accept(PrimogemcraftModBlocks.LAJITONG.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.GANJINGLAJITONGXIANGZI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MMOLAZHILAJITONG.get().asItem());
				tabData.accept(PrimogemcraftModItems.SUIJI_1SHIJIAN.get());
				tabData.accept(PrimogemcraftModItems.HHAOKANDELAJI.get());
				tabData.accept(PrimogemcraftModItems.YSJBFPK.get());
				tabData.accept(PrimogemcraftModItems.BUFENGPING.get());
				tabData.accept(PrimogemcraftModItems.MENGYING.get());
				tabData.accept(PrimogemcraftModItems.POSUIMENGYING.get());
				tabData.accept(PrimogemcraftModItems.SHIWUTSSLM.get());
				tabData.accept(PrimogemcraftModItems.SHANBIANZHICHEN.get());
				tabData.accept(PrimogemcraftModItems.XIAODENGWUPIN.get());
				tabData.accept(PrimogemcraftModItems.WEIZHIYEPIAN.get());
				tabData.accept(PrimogemcraftModItems.JIANMUSHENGFAQI.get());
				tabData.accept(PrimogemcraftModBlocks.CESHIXIAODENGFASHEQI.get().asItem());
				tabData.accept(PrimogemcraftModItems.CUKUANGKONGYUE.get());
				tabData.accept(PrimogemcraftModItems.CUKUANGCHIYUE.get());
				tabData.accept(PrimogemcraftModItems.CUKUANGMANYUE.get());
				tabData.accept(PrimogemcraftModItems.ZHONGKOUWEITIEDING.get());
				tabData.accept(PrimogemcraftModItems.ZHAPIANDINGZHENGSHI.get());
				tabData.accept(PrimogemcraftModItems.CHIYUEJINSHU.get());
				tabData.accept(PrimogemcraftModItems.XINYUEJINSHU.get());
				tabData.accept(PrimogemcraftModItems.MANYUEJINSHU.get());
				tabData.accept(PrimogemcraftModBlocks.SHENMIWANOU.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.HHYINBAOQI.get().asItem());
				tabData.accept(PrimogemcraftModItems.SH_JWUPIN.get());
				tabData.accept(PrimogemcraftModItems.SJBCQ.get());
				tabData.accept(PrimogemcraftModItems.KONGYUEZHUFU.get());
				tabData.accept(PrimogemcraftModItems.SANYUEZHUFU.get());
				tabData.accept(PrimogemcraftModItems.SHENSHENGHUABAN.get());
				tabData.accept(PrimogemcraftModBlocks.CHUANGZAOXIAODENGFASHEQI.get().asItem());
				tabData.accept(PrimogemcraftModItems.LAJI.get());
				tabData.accept(PrimogemcraftModItems.ZHUANGMANLAJIDELAJITONG.get());
				tabData.accept(PrimogemcraftModItems.LAJITONGZUNYAN.get());
				tabData.accept(PrimogemcraftModItems.CCHONGGAODAODEDEZANXU.get());
				tabData.accept(PrimogemcraftModItems.DISUI.get());
				tabData.accept(PrimogemcraftModItems.LAJITONGSUIPIAN.get());
				tabData.accept(PrimogemcraftModItems.LIULANGZHEZHINANG.get());
				tabData.accept(PrimogemcraftModItems.MAOXIANJIAZHINANG.get());
				tabData.accept(PrimogemcraftModItems.YIBANGRENZHINANG.get());
				tabData.accept(PrimogemcraftModItems.YINGJICUNCHUNANG.get());
				tabData.accept(PrimogemcraftModItems.FEIQIUPINGZHENG.get());
				tabData.accept(PrimogemcraftModItems.QGDYSJ.get());
				tabData.accept(PrimogemcraftModItems.YSFC.get());
				tabData.accept(PrimogemcraftModItems.CAOYUANHE.get());
				tabData.accept(PrimogemcraftModItems.QQIYUAN_JIN_GUANG_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.Q_QYUANCHUZI_01_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.QQ_QYUANCHULAN_01_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.CAOYUANHESHENGWU_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.XIAODENG_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.XIAOHEITA_SPAWN_EGG.get());
				tabData.accept(PrimogemcraftModItems.ZSSP.get());
				tabData.accept(PrimogemcraftModItems.YHDLTYIDIE.get());
				tabData.accept(PrimogemcraftModItems.YDFMS.get());
				tabData.accept(PrimogemcraftModItems.YSRZ_0.get());
				tabData.accept(PrimogemcraftModItems.YSRQSP.get());
				tabData.accept(PrimogemcraftModItems.YSRZSPSX.get());
				tabData.accept(PrimogemcraftModItems.QYCX.get());
				tabData.accept(PrimogemcraftModItems.QYHX.get());
				tabData.accept(PrimogemcraftModItems.QYHXSHILIAN.get());
				tabData.accept(PrimogemcraftModItems.QYHX_0WUJIACHENG.get());
				tabData.accept(PrimogemcraftModItems.QWRHJ.get());
				tabData.accept(PrimogemcraftModItems.QWHCJ.get());
				tabData.accept(PrimogemcraftModItems.QWFJJ.get());
				tabData.accept(PrimogemcraftModItems.QWFJJWL.get());
				tabData.accept(PrimogemcraftModItems.QWLHS.get());
				tabData.accept(PrimogemcraftModItems.QWLHA.get());
				tabData.accept(PrimogemcraftModItems.QWLHB.get());
				tabData.accept(PrimogemcraftModItems.QWLHCC.get());
				tabData.accept(PrimogemcraftModItems.QWKWZG.get());
				tabData.accept(PrimogemcraftModItems.QWCBZG.get());
				tabData.accept(PrimogemcraftModItems.QWYPZGS.get());
				tabData.accept(PrimogemcraftModItems.QWHYDLT.get());
				tabData.accept(PrimogemcraftModItems.QWZJXXMX.get());
				tabData.accept(PrimogemcraftModItems.QWFLB.get());
				tabData.accept(PrimogemcraftModItems.QWFLDYHDLB.get());
				tabData.accept(PrimogemcraftModItems.QWSBMB.get());
				tabData.accept(PrimogemcraftModItems.QWWXWCX.get());
				tabData.accept(PrimogemcraftModItems.QWYHNJ.get());
				tabData.accept(PrimogemcraftModItems.QWXGJB.get());
				tabData.accept(PrimogemcraftModItems.QWYHJB.get());
				tabData.accept(PrimogemcraftModItems.QWXGDBMT.get());
				tabData.accept(PrimogemcraftModItems.QWWSG.get());
				tabData.accept(PrimogemcraftModItems.QWTHHJ.get());
				tabData.accept(PrimogemcraftModItems.QWXXGG.get());
				tabData.accept(PrimogemcraftModItems.QWWSZJ.get());
				tabData.accept(PrimogemcraftModItems.QWKWGL.get());
				tabData.accept(PrimogemcraftModItems.QWKWZT.get());
				tabData.accept(PrimogemcraftModItems.QWZCGS.get());
				tabData.accept(PrimogemcraftModItems.QWWCN.get());
				tabData.accept(PrimogemcraftModItems.QWWSGL.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> YUANSHIGONGJUXUANXIANGKA = REGISTRY.register("yuanshigongjuxuanxiangka",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.primogemcraft.yuanshigongjuxuanxiangka")).icon(() -> new ItemStack(PrimogemcraftModItems.WUFENGJIAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PrimogemcraftModItems.JIUCHANZHIYUANGAO.get());
				tabData.accept(PrimogemcraftModItems.WUQIE_5.get());
				tabData.accept(PrimogemcraftModItems.QINLAODEZHEXUE.get());
				tabData.accept(PrimogemcraftModItems.HUANGJINDEZHEXUE.get());
				tabData.accept(PrimogemcraftModItems.FFANRONGDEZHEXUE.get());
				tabData.accept(PrimogemcraftModItems.KKUIJIACESHI_HELMET.get());
				tabData.accept(PrimogemcraftModItems.KKUIJIACESHI_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.KKUIJIACESHI_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.KKUIJIACESHI_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.MMOLAGAO.get());
				tabData.accept(PrimogemcraftModItems.MMOLAFU.get());
				tabData.accept(PrimogemcraftModItems.MMOLACHAN.get());
				tabData.accept(PrimogemcraftModItems.MMOLAJIAN.get());
				tabData.accept(PrimogemcraftModItems.MMOLACHUTOU.get());
				tabData.accept(PrimogemcraftModItems.WUFENGJIAN.get());
				tabData.accept(PrimogemcraftModItems.ZIZIYOUSONGSHISUIXIE.get());
				tabData.accept(PrimogemcraftModItems.ZZIYOUSONGSHIDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.ZZIYOUSONGSHIKUAI.get());
				tabData.accept(PrimogemcraftModItems.ZZIYOUSONGSHI.get());
				tabData.accept(PrimogemcraftModItems.JIANRANSUIXIE.get());
				tabData.accept(PrimogemcraftModItems.JIANLAODUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.JIANLAOKUAIWUPIN.get());
				tabData.accept(PrimogemcraftModItems.JIANLAOHUANGYU.get());
				tabData.accept(PrimogemcraftModItems.ZUISHENGSUIXIE.get());
				tabData.accept(PrimogemcraftModItems.ZUISHENGDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.ZUISHENGKUAI.get());
				tabData.accept(PrimogemcraftModItems.ZUISHENGZIJING.get());
				tabData.accept(PrimogemcraftModItems.SHENGZHANGBIFEISUIXIE.get());
				tabData.accept(PrimogemcraftModItems.SHENGZHANGDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.SHENGZHANGKUAI.get());
				tabData.accept(PrimogemcraftModItems.SHENGZHANGBIFEI.get());
				tabData.accept(PrimogemcraftModItems.DIJINGSUIXIE.get());
				tabData.accept(PrimogemcraftModItems.DIJINGDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.DIJINGKUAI.get());
				tabData.accept(PrimogemcraftModItems.DIIJINGQINGJING.get());
				tabData.accept(PrimogemcraftModItems.RANYUANSUIXIE.get());
				tabData.accept(PrimogemcraftModItems.RANYUANDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.RANYUANKUAI.get());
				tabData.accept(PrimogemcraftModItems.RRANYUANMANAO.get());
				tabData.accept(PrimogemcraftModItems.AIXUBINGYUSUIXIE.get());
				tabData.accept(PrimogemcraftModItems.AAIXUBINGYUDUANPIAN.get());
				tabData.accept(PrimogemcraftModItems.AIXUBINGYUKUAI.get());
				tabData.accept(PrimogemcraftModItems.AIXUBINGYU.get());
				tabData.accept(PrimogemcraftModItems.YUANSUJINGTI.get());
				tabData.accept(PrimogemcraftModItems.TIAOGUOZHANG.get());
				tabData.accept(PrimogemcraftModItems.WUQIEZHIHUIGUANG.get());
				tabData.accept(PrimogemcraftModItems.WUQIE_2.get());
				tabData.accept(PrimogemcraftModItems.WUQIE_3.get());
				tabData.accept(PrimogemcraftModItems.WUQIE_4.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIJIAN.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIGAO.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIFU.get());
				tabData.accept(PrimogemcraftModItems.YUANSHIQIAO.get());
				tabData.accept(PrimogemcraftModItems.YUANSHICHUTOU.get());
				tabData.accept(PrimogemcraftModItems.LJTG_02.get());
				tabData.accept(PrimogemcraftModItems.XZCFYXWZD.get());
				tabData.accept(PrimogemcraftModItems.LJTG_01.get());
				tabData.accept(PrimogemcraftModItems.QHMBML.get());
				tabData.accept(PrimogemcraftModItems.QHMBMLYS_01.get());
				tabData.accept(PrimogemcraftModItems.QHMBMLYS_02.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIZIZAITIE.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIJLTIEWP.get());
				tabData.accept(PrimogemcraftModItems.SJZST.get());
				tabData.accept(PrimogemcraftModItems.SZSJTIE.get());
				tabData.accept(PrimogemcraftModItems.DJTSJ.get());
				tabData.accept(PrimogemcraftModItems.RYTSJ.get());
				tabData.accept(PrimogemcraftModItems.AXTSJ.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIZIZAIZUAN.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIJLZSWP.get());
				tabData.accept(PrimogemcraftModItems.SSJZSZS.get());
				tabData.accept(PrimogemcraftModItems.SZZSSJ.get());
				tabData.accept(PrimogemcraftModItems.DJZSSJ.get());
				tabData.accept(PrimogemcraftModItems.RYZSSJ.get());
				tabData.accept(PrimogemcraftModItems.AXZSSJ.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIZIZAIHEJ.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIJLHJWP.get());
				tabData.accept(PrimogemcraftModItems.SJZSHJ.get());
				tabData.accept(PrimogemcraftModItems.SZHJSJ.get());
				tabData.accept(PrimogemcraftModItems.DJHJSJ.get());
				tabData.accept(PrimogemcraftModItems.RYHJSJ.get());
				tabData.accept(PrimogemcraftModItems.AXHJSJ.get());
				tabData.accept(PrimogemcraftModItems.SHENGJIZUANSHEJIN.get());
				tabData.accept(PrimogemcraftModItems.SSHENGJIJLZSSHJWP.get());
				tabData.accept(PrimogemcraftModItems.SJZSZSSHJ.get());
				tabData.accept(PrimogemcraftModItems.SZBFZSSHJSJ.get());
				tabData.accept(PrimogemcraftModItems.DJZSSHJSJ.get());
				tabData.accept(PrimogemcraftModItems.RYZSSHJSJ.get());
				tabData.accept(PrimogemcraftModItems.AXZSSHJSJ.get());
				tabData.accept(PrimogemcraftModItems.ZIZIZAIHEJINTAO_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZIZIZAIHEJINTAO_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZIZIZAIHEJINTAO_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZIZIZAIHEJINTAO_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.JLKJHJ_HELMET.get());
				tabData.accept(PrimogemcraftModItems.JLKJHJ_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.JLKJHJ_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.JLKJHJ_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZSHJT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZSHJT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZSHJT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZSHJT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.SZHJKJ_HELMET.get());
				tabData.accept(PrimogemcraftModItems.SZHJKJ_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.SZHJKJ_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.SZHJKJ_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.DJHJT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.DJHJT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.DJHJT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.DJHJT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.RYHJT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.RYHJT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.RYHJT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.RYHJT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.AXHJT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.AXHJT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.AXHJT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.AXHJT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIZUANTAO_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIZUANTAO_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIZUANTAO_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIZUANTAO_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.JLKJZS_HELMET.get());
				tabData.accept(PrimogemcraftModItems.JLKJZS_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.JLKJZS_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.JLKJZS_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZSZST_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZSZST_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZSZST_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZSZST_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.SZZSKJ_HELMET.get());
				tabData.accept(PrimogemcraftModItems.SZZSKJ_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.SZZSKJ_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.SZZSKJ_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.DJZST_HELMET.get());
				tabData.accept(PrimogemcraftModItems.DJZST_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.DJZST_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.DJZST_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.RUZST_HELMET.get());
				tabData.accept(PrimogemcraftModItems.RUZST_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.RUZST_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.RUZST_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.AXZST_HELMET.get());
				tabData.accept(PrimogemcraftModItems.AXZST_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.AXZST_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.AXZST_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZIZAITIEJIA_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZIZAITIEJIA_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZIZAITIEJIA_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZIZAITIEJIA_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.KJJLT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.KJJLT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.KJJLT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.KJJLT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZSTKJ_HELMET.get());
				tabData.accept(PrimogemcraftModItems.ZSTKJ_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.ZSTKJ_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.ZSTKJ_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.SZKJTIE_HELMET.get());
				tabData.accept(PrimogemcraftModItems.SZKJTIE_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.SZKJTIE_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.SZKJTIE_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.DJTT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.DJTT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.DJTT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.DJTT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.RYTT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.RYTT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.RYTT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.RYTT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.AXTT_HELMET.get());
				tabData.accept(PrimogemcraftModItems.AXTT_CHESTPLATE.get());
				tabData.accept(PrimogemcraftModItems.AXTT_LEGGINGS.get());
				tabData.accept(PrimogemcraftModItems.AXTT_BOOTS.get());
				tabData.accept(PrimogemcraftModItems.ZIZAITIEJIAN.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIZUANSHIJIAN.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIHEJINJIAN.get());
				tabData.accept(PrimogemcraftModItems.ZIZGAO.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIFU.get());
				tabData.accept(PrimogemcraftModItems.ZIZAIQIAO.get());
				tabData.accept(PrimogemcraftModItems.ZIZAICHU.get());
				tabData.accept(PrimogemcraftModItems.JLJTIE.get());
				tabData.accept(PrimogemcraftModItems.JLJZS.get());
				tabData.accept(PrimogemcraftModItems.JJLJXJHJ.get());
				tabData.accept(PrimogemcraftModItems.JLG.get());
				tabData.accept(PrimogemcraftModItems.JLF.get());
				tabData.accept(PrimogemcraftModItems.JLQ.get());
				tabData.accept(PrimogemcraftModItems.JLC.get());
				tabData.accept(PrimogemcraftModItems.ZSTJ.get());
				tabData.accept(PrimogemcraftModItems.ZSZSJ.get());
				tabData.accept(PrimogemcraftModItems.ZSHJJ.get());
				tabData.accept(PrimogemcraftModItems.ZSG.get());
				tabData.accept(PrimogemcraftModItems.ZSQ.get());
				tabData.accept(PrimogemcraftModItems.ZSF.get());
				tabData.accept(PrimogemcraftModItems.ZSC.get());
				tabData.accept(PrimogemcraftModItems.SZTJ.get());
				tabData.accept(PrimogemcraftModItems.SZZSJ.get());
				tabData.accept(PrimogemcraftModItems.SZHJJ.get());
				tabData.accept(PrimogemcraftModItems.SZG.get());
				tabData.accept(PrimogemcraftModItems.ZFG.get());
				tabData.accept(PrimogemcraftModItems.SZF.get());
				tabData.accept(PrimogemcraftModItems.SZQ.get());
				tabData.accept(PrimogemcraftModItems.SZC.get());
				tabData.accept(PrimogemcraftModItems.DJTJ.get());
				tabData.accept(PrimogemcraftModItems.DDJZSJ.get());
				tabData.accept(PrimogemcraftModItems.DJHJJ.get());
				tabData.accept(PrimogemcraftModItems.DJG.get());
				tabData.accept(PrimogemcraftModItems.DJF.get());
				tabData.accept(PrimogemcraftModItems.DJQ.get());
				tabData.accept(PrimogemcraftModItems.DJC.get());
				tabData.accept(PrimogemcraftModItems.RYTJ.get());
				tabData.accept(PrimogemcraftModItems.RYZSJ.get());
				tabData.accept(PrimogemcraftModItems.RYHJJ.get());
				tabData.accept(PrimogemcraftModItems.RYG.get());
				tabData.accept(PrimogemcraftModItems.RYF.get());
				tabData.accept(PrimogemcraftModItems.RYQ.get());
				tabData.accept(PrimogemcraftModItems.RYC.get());
				tabData.accept(PrimogemcraftModItems.AXTJ.get());
				tabData.accept(PrimogemcraftModItems.AXZSJ.get());
				tabData.accept(PrimogemcraftModItems.AXHJJ.get());
				tabData.accept(PrimogemcraftModItems.AXG.get());
				tabData.accept(PrimogemcraftModItems.YXAXG.get());
				tabData.accept(PrimogemcraftModItems.AXF.get());
				tabData.accept(PrimogemcraftModItems.AXQ.get());
				tabData.accept(PrimogemcraftModItems.AXC.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> YUANSHIFANGKUAIKA = REGISTRY.register("yuanshifangkuaika",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.primogemcraft.yuanshifangkuaika")).icon(() -> new ItemStack(PrimogemcraftModBlocks.YUANSHIKUANGSHI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PrimogemcraftModBlocks.YUANSHIKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SHENBANYANYUANSHIKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SHIZUOYUANSHIKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEYUANMUMUBAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YIYISHIJIEMUBANLOUQI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YIYISHIJIEYUANMUBANZHUAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YIYISHIJIEMUZHALAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUZHALAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.HUALIDUANZAO.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JIUCHANZHIYUANKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MOLADUI_02.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MLXDML_01.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MLXDML_02.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MLXDML_03.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DBMLK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MOLAKUAI_01.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SANYUEQIDIAOXIANG_01.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JINGZHIMOLAKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LLIANJIAMOLAKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LIANJIAMOLAKUAIBANKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LLIANJIAMOLAKUIAITAIJIE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LLIANJIAMOLAKUAIQIANG.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZIYOUSONGSHIKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZIYOUSONGSHIKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JIANLAOKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SHENBANJIANLAOHUANGYUKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JIANLAOHUANGYUKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZUISHENGKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZUISNEGZIJINGKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SHENGZHANGKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DIJINGQINJINGKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.SHENGZHANGBIFEIDAKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DIJINGQINGJINKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.RANYUANMANAOKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.RANYUANKUAI_2.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.AIXUBINGYUKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.AIXUBINGYUFANGKU_I.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YUANSUJINGSHIKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZZJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JLJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YHJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZHJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.ZYJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.RYJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LAJSK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JDYK.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DISUIKUAI_1.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DISUISHUIJINGTI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOYUANHEKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_PLANKS.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOYUANHEHUAMUBAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.D_11.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOYUANHEHUABUBAN_2.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CCAOYUANHEHUAMUBAN_3.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XIUMU.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CANGSANGSHIZHUAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_STAIRS.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_STAIRS.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.D_12.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMULOUTI_21.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_31.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XIUXIUMULOUQI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CANGSANGSHIZHUANLOUTI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_SLAB.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_SLAB.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.D_13.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_22.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_32.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CANGSANGSHIZHUANTAIJIE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_FENCE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_FENCE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.D_14.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMO_23.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_33.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XIUMUZHALAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_FENCE_GATE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_FENCE_GATE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.D_15.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_24.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOMU_34.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.LIANJIAXIAJIEHEJINKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MUTANKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XIJAIEYANGENGDI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XINYUEKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.MANYUEJINSHUKUANGSHI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CHIYUEJINSHUKUANG.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XIUTIEKUAI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CSHIXIUTIEZHALAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CANGSANGSHIZHUANWEIQIANG.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.CAOYUANSUECI.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.DANGAOLIYUE.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.XJHPYHFH.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.BWDXJHPYHFH.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.JIANSHIJINGBAN.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YSJTSJ_0.get().asItem());
				tabData.accept(PrimogemcraftModBlocks.YSJTSJ_1.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {

			tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_PRESSURE_PLATE.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.CESHI_MUCAIBAO_BUTTON.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.CAOMU_25.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.CAOMU_26.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.CAOMU_35.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.CAOMU_36.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_PRESSURE_PLATE.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.YISHIJIEMUBAN_BUTTON.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.D_16.get().asItem());
			tabData.accept(PrimogemcraftModBlocks.D_17.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(PrimogemcraftModItems.CESHIYONGWUPIN.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(PrimogemcraftModItems.GONGZHUXINGHUA.get());

		}
	}
}
