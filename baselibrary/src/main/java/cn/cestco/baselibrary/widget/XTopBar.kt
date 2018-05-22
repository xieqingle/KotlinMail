package cn.cestco.baselibrary.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * 作者：RockQ on 2018/5/22
 * 邮箱：qingle6616@sina.com
 */
class XTopBar @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : RelativeLayout(context, attrs, defStyleAttr) {
    /**
     * 左侧 View 集合
     */
    private lateinit var mLeftView: MutableIterable<View>
    /**
     * 右侧 View 集合
     */
    private lateinit var mRightView: MutableIterable<View>
    /**
     *中间标题
     */
    private lateinit var mTitleView: TextView
    /**
     * 子标题
     */
    private lateinit var mSubTitleView: TextView
    /**
     * 标题和子标题的容器
     */
    private lateinit var mTitleContanierView: LinearLayout

    /**
     * 获取对应的属性
     */
    init {
        mLeftView = mutableListOf()
        mRightView = mutableListOf()
        


    }

}