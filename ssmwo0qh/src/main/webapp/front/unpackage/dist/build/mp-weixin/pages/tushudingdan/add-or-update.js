(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/tushudingdan/add-or-update"],{"2dea":function(e,n,t){"use strict";t.r(n);var r=t("f678"),u=t.n(r);for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);n["default"]=u.a},6701:function(e,n,t){"use strict";(function(e){t("55a6");r(t("66fd"));var n=r(t("9b75"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},"9b75":function(e,n,t){"use strict";t.r(n);var r=t("ded8"),u=t("2dea");for(var a in u)"default"!==a&&function(e){t.d(n,e,(function(){return u[e]}))}(a);t("e2e3");var i,o=t("f0c5"),s=Object(o["a"])(u["default"],r["b"],r["c"],!1,null,"8c55aa34",null,!1,r["a"],i);n["default"]=s.exports},ad95:function(e,n,t){},ded8:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return u})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return r}));var u=function(){var e=this,n=e.$createElement;e._self._c},a=[]},e2e3:function(e,n,t){"use strict";var r=t("ad95"),u=t.n(r);u.a},f678:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=u(t("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,r,u,a,i){try{var o=e[a](i),s=o.value}catch(c){return void t(c)}o.done?n(s):Promise.resolve(s).then(r,u)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(r,u){var i=e.apply(n,t);function o(e){a(i,r,u,o,s,"next",e)}function s(e){a(i,r,u,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("5065"))}.bind(null,t)).catch(t.oe)},s={data:function(){return{ruleForm:{dingdanbianhao:this.getUUID(),shujimingcheng:"",fenlei:"",fengmian:"",jiage:"",zuozhe:"",yonghuzhanghao:"",yonghuxingming:"",yonghushouji:"",sfsh:"",shhf:"",ispay:"",userid:""},fenleiOptions:[],fenleiIndex:0,user:{},ro:{dingdanbianhao:!1,shujimingcheng:!1,fenlei:!1,fengmian:!1,jiage:!1,zuozhe:!1,yonghuzhanghao:!1,yonghuxingming:!1,yonghushouji:!1,sfsh:!1,shhf:!1,ispay:!1,userid:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return i(r.default.mark((function u(){var a,i,o,s;return r.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return a=e.getStorageSync("nowTable"),u.next=3,t.$api.session(a);case 3:return i=u.sent,t.user=i.data,t.ruleForm.yonghuzhanghao=t.user.yonghuzhanghao,t.ruleForm.yonghuxingming=t.user.yonghuxingming,t.ruleForm.yonghushouji=t.user.yonghushouji,u.next=10,t.$api.option("fenlei","fenlei",{});case 10:if(i=u.sent,t.fenleiOptions=i.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){u.next=20;break}return t.ruleForm.id=n.id,u.next=18,t.$api.info("tushudingdan",t.ruleForm.id);case 18:i=u.sent,t.ruleForm=i.data;case 20:if(!n.cross){u.next=67;break}o=e.getStorageSync("crossObj"),u.t0=r.default.keys(o);case 23:if((u.t1=u.t0()).done){u.next=67;break}if(s=u.t1.value,"dingdanbianhao"!=s){u.next=29;break}return t.ruleForm.dingdanbianhao=o[s],t.ro.dingdanbianhao=!0,u.abrupt("continue",23);case 29:if("shujimingcheng"!=s){u.next=33;break}return t.ruleForm.shujimingcheng=o[s],t.ro.shujimingcheng=!0,u.abrupt("continue",23);case 33:if("fenlei"!=s){u.next=37;break}return t.ruleForm.fenlei=o[s],t.ro.fenlei=!0,u.abrupt("continue",23);case 37:if("fengmian"!=s){u.next=41;break}return t.ruleForm.fengmian=o[s],t.ro.fengmian=!0,u.abrupt("continue",23);case 41:if("jiage"!=s){u.next=45;break}return t.ruleForm.jiage=o[s],t.ro.jiage=!0,u.abrupt("continue",23);case 45:if("zuozhe"!=s){u.next=49;break}return t.ruleForm.zuozhe=o[s],t.ro.zuozhe=!0,u.abrupt("continue",23);case 49:if("yonghuzhanghao"!=s){u.next=53;break}return t.ruleForm.yonghuzhanghao=o[s],t.ro.yonghuzhanghao=!0,u.abrupt("continue",23);case 53:if("yonghuxingming"!=s){u.next=57;break}return t.ruleForm.yonghuxingming=o[s],t.ro.yonghuxingming=!0,u.abrupt("continue",23);case 57:if("yonghushouji"!=s){u.next=61;break}return t.ruleForm.yonghushouji=o[s],t.ro.yonghushouji=!0,u.abrupt("continue",23);case 61:if("userid"!=s){u.next=65;break}return t.ruleForm.userid=o[s],t.ro.userid=!0,u.abrupt("continue",23);case 65:u.next=23;break;case 67:t.styleChange();case 68:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},fenleiChange:function(e){this.fenleiIndex=e.target.value,this.ruleForm.fenlei=this.fenleiOptions[this.fenleiIndex]},fengmianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.fengmian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return i(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.userid){n.next=3;break}return e.$utils.msg("用户id不能为空"),n.abrupt("return");case 3:if(!e.ruleForm.id){n.next=8;break}return n.next=6,e.$api.update("tushudingdan",e.ruleForm);case 6:n.next=10;break;case 8:return n.next=10,e.$api.add("tushudingdan",e.ruleForm);case 10:e.$utils.msgBack("提交成功");case 11:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,u=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,u=u>9?u:"0"+u,"".concat(t,"-").concat(r,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,t("543d")["default"])}},[["6701","common/runtime","common/vendor"]]]);