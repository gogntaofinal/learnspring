/**
 * @link http://www.dimpt.com/
 * @copyright Copyright (c) 2015 CITC
 * @license http://www.dimpt.com/
 */

/**
 * @author songqj
 * @since 1.0
 */


function showObjProps(obj) 
{ 
    // 用来保存所有的属性名称和值
    var props = "";
    props = enumObjProps(obj);
    alert(props);
}

function enumObjProps(obj)
{
    // 用来保存所有的属性名称和值
    var propsTxt = "";
    // 开始遍历
    for(var p in obj){ 
        // 方法
        if(typeof(obj[p])=="function"){ 
            ;//obj[p]();
        }
		else
		{ 
			if(typeof(obj[p])=="object")
			{
                //propsTxt = propsTxt + p + "=[object]\n"
				//
				objstr=enumObjProps(obj[p]);
                propsTxt = propsTxt + p + "="+objstr;
			}
			else
			{
                //p为属性名称，obj[p]为对应属性的值
                propsTxt = propsTxt + p + "=" + obj[p] + "\n"
			};
        } 
    } 
    // 最后显示所有的属性
    return propsTxt;

}

function getUrlParam(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    //if (r!=null) return unescape(r[2]); return null; //返回参数值
	if (r!=null) return decodeURIComponent(r[2]); return null; //返回参数值

} 