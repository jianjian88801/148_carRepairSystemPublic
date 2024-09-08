import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import qichexiulidan from '@/views/modules/qichexiulidan/list'
    import peijianleixing from '@/views/modules/peijianleixing/list'
    import caigoujinhuodan from '@/views/modules/caigoujinhuodan/list'
    import peijianshenqing from '@/views/modules/peijianshenqing/list'
    import weixiuyuan from '@/views/modules/weixiuyuan/list'
    import kehu from '@/views/modules/kehu/list'
    import xiangmuleixing from '@/views/modules/xiangmuleixing/list'
    import weixiuyuyue from '@/views/modules/weixiuyuyue/list'
    import qichexiulitaizhang from '@/views/modules/qichexiulitaizhang/list'
    import cheliangxinxi from '@/views/modules/cheliangxinxi/list'
    import weixiuxiangmu from '@/views/modules/weixiuxiangmu/list'
    import qichepeijiankucun from '@/views/modules/qichepeijiankucun/list'
    import peijianlingyong from '@/views/modules/peijianlingyong/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/qichexiulidan',
        name: '汽车修理单',
        component: qichexiulidan
      }
      ,{
	path: '/peijianleixing',
        name: '配件类型',
        component: peijianleixing
      }
      ,{
	path: '/caigoujinhuodan',
        name: '采购进货单',
        component: caigoujinhuodan
      }
      ,{
	path: '/peijianshenqing',
        name: '配件申请',
        component: peijianshenqing
      }
      ,{
	path: '/weixiuyuan',
        name: '维修员',
        component: weixiuyuan
      }
      ,{
	path: '/kehu',
        name: '客户',
        component: kehu
      }
      ,{
	path: '/xiangmuleixing',
        name: '项目类型',
        component: xiangmuleixing
      }
      ,{
	path: '/weixiuyuyue',
        name: '维修预约',
        component: weixiuyuyue
      }
      ,{
	path: '/qichexiulitaizhang',
        name: '汽车修理台账',
        component: qichexiulitaizhang
      }
      ,{
	path: '/cheliangxinxi',
        name: '车辆信息',
        component: cheliangxinxi
      }
      ,{
	path: '/weixiuxiangmu',
        name: '维修项目',
        component: weixiuxiangmu
      }
      ,{
	path: '/qichepeijiankucun',
        name: '汽车配件库存',
        component: qichepeijiankucun
      }
      ,{
	path: '/peijianlingyong',
        name: '配件领用',
        component: peijianlingyong
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
