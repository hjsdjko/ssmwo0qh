(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/tushudingdan/list"],{2391:function(t,e,n){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var i=a(n("a34a"));function a(t){return t&&t.__esModule?t:{default:t}}function r(t,e,n,i,a,r,s){try{var u=t[r](s),c=u.value}catch(o){return void n(o)}u.done?e(c):Promise.resolve(c).then(i,a)}function s(t){return function(){var e=this,n=arguments;return new Promise((function(i,a){var s=t.apply(e,n);function u(t){r(s,i,a,u,c,"next",t)}function c(t){r(s,i,a,u,c,"throw",t)}u(void 0)}))}}var u={data:function(){return{queryList:[{queryName:"书籍名称"}],queryIndex:0,list:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:5,textNoMore:"~ 没有更多了 ~"},hasNext:!0,searchForm:{},categoryList:[],categoryName:"全部",CustomBar:"0"}},onShow:function(){var t=this;return s(i.default.mark((function e(){var n;return i.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,t.$api.list("fenlei",{page:1,limit:100});case 2:n=e.sent,n.data.list.splice(0,0,{id:0,fenlei:"全部"}),t.categoryList=n.data.list,t.hasNext=!0,t.mescroll&&t.mescroll.resetUpScroll();case 7:case"end":return e.stop()}}),e)})))()},onLoad:function(){this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll()},methods:{queryChange:function(t){this.queryIndex=t.detail.value,this.searchForm.shujimingcheng=""},categoryClick:function(t){this.categoryName=t,this.mescroll.resetUpScroll()},mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(t){var e=this;return s(i.default.mark((function n(){var a,r;return i.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return a={page:t.num,limit:t.size},"全部"!=e.categoryName&&(a.fenlei="%"+e.categoryName+"%"),n.next=4,e.$api.list("tushudingdan",a);case 4:r=n.sent,1==t.num&&(e.list=[]),e.list=e.list.concat(r.data.list),0==r.data.list.length&&(e.hasNext=!1),t.endSuccess(t.size,e.hasNext);case 9:case"end":return n.stop()}}),n)})))()},onDetailTap:function(t){this.$utils.jump("./detail?id=".concat(t.id))},onUpdateTap:function(t){this.$utils.jump("./add-or-update?id=".concat(t))},onAddTap:function(){this.$utils.jump("./add-or-update")},onDeleteTap:function(e){var n=this;t.showModal({title:"提示",content:"是否确认删除",success:function(){var t=s(i.default.mark((function t(a){return i.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!a.confirm){t.next=5;break}return t.next=3,n.$api.del("tushudingdan",JSON.stringify([e]));case 3:n.hasNext=!0,n.mescroll.resetUpScroll();case 5:case"end":return t.stop()}}),t)})));function a(e){return t.apply(this,arguments)}return a}()})},search:function(){var t=this;return s(i.default.mark((function e(){var n,a;return i.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t.mescroll.num=1,n={page:t.mescroll.num,limit:t.mescroll.size},t.searchForm.shujimingcheng&&(n["shujimingcheng"]="%"+t.searchForm.shujimingcheng+"%"),e.next=5,t.$api.list("tushudingdan",n);case 5:a=e.sent,1==t.mescroll.num&&(t.list=[]),t.list=t.list.concat(a.data.list),0==a.data.list.length&&(t.hasNext=!1),t.mescroll.endSuccess(t.mescroll.size,t.hasNext);case 10:case"end":return e.stop()}}),e)})))()}}};e.default=u}).call(this,n("543d")["default"])},"46de":function(t,e,n){"use strict";n.r(e);var i=n("52b6"),a=n("830a");for(var r in a)"default"!==r&&function(t){n.d(e,t,(function(){return a[t]}))}(r);n("6d8e");var s,u=n("f0c5"),c=Object(u["a"])(a["default"],i["b"],i["c"],!1,null,null,null,!1,i["a"],s);e["default"]=c.exports},"52b6":function(t,e,n){"use strict";n.d(e,"b",(function(){return a})),n.d(e,"c",(function(){return r})),n.d(e,"a",(function(){return i}));var i={mescrollUni:function(){return Promise.all([n.e("common/vendor"),n.e("components/mescroll-uni/mescroll-uni")]).then(n.bind(null,"c1a4"))}},a=function(){var t=this,e=t.$createElement,n=(t._self._c,t.isAuth("tushudingdan","修改")),i=t.isAuth("tushudingdan","删除"),a=t.__map(t.list,(function(e,n){var i=t.__get_orig(e),a=e.fengmian?e.fengmian.split(","):null;return{$orig:i,g0:a}})),r=t.isAuth("tushudingdan","新增");t.$mp.data=Object.assign({},{$root:{m0:n,m1:i,l0:a,m2:r}})},r=[]},"6d8e":function(t,e,n){"use strict";var i=n("94ee"),a=n.n(i);a.a},"830a":function(t,e,n){"use strict";n.r(e);var i=n("2391"),a=n.n(i);for(var r in i)"default"!==r&&function(t){n.d(e,t,(function(){return i[t]}))}(r);e["default"]=a.a},"94ee":function(t,e,n){},d26e:function(t,e,n){"use strict";(function(t){n("55a6");i(n("66fd"));var e=i(n("46de"));function i(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,n("543d")["createPage"])}},[["d26e","common/runtime","common/vendor"]]]);