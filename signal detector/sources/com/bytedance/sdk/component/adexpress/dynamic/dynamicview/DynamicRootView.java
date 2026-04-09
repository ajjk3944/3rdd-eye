package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.dg, com.bytedance.sdk.component.adexpress.theme.emc {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private bw dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.ycc.emc mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.ypw.gbl mRenderListener;
    private com.bytedance.sdk.component.adexpress.ypw.sz mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.ypw muteListener;
    protected final com.bytedance.sdk.component.adexpress.ypw.qh renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.xq> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.bw videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z6, com.bytedance.sdk.component.adexpress.ypw.sz szVar, com.bytedance.sdk.component.adexpress.dynamic.ycc.emc emcVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
        this.renderResult = qhVar;
        qhVar.emc(2);
        this.mDynamicClickListener = emcVar;
        emcVar.emc(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.emc(this);
        this.mIsMute = z6;
        this.mRenderRequest = szVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw;
        com.bytedance.sdk.component.adexpress.dynamic.dg.bw bwVarRu = mswVar.ru();
        if (bwVarRu == null || (yccVarBw = bwVarRu.bw()) == null) {
            return;
        }
        this.renderResult.ypw(yccVarBw.igv());
    }

    private boolean checkSizeValid() {
        bw bwVar = this.dynamicBaseWidget;
        return bwVar.bw > 0.0f && bwVar.ycc > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !mswVar.hxp()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.emc(false);
        this.renderResult.ypw(i);
        this.renderResult.emc(str);
        this.mRenderListener.emc(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ycc.emc getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.ypw.gbl getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.ypw.sz getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.xq> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.emc
    public void onThemeChanged(int i) {
        bw bwVar = this.dynamicBaseWidget;
        if (bwVar == null) {
            return;
        }
        bwVar.emc(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void onvideoComplate() {
        try {
            this.videoListener.emc();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, int i) {
        this.dynamicBaseWidget = renderDynamicView(mswVar, this, i);
        this.renderResult.emc(true);
        this.renderResult.emc(this.dynamicBaseWidget.bw);
        this.renderResult.ypw(this.dynamicBaseWidget.ycc);
        this.renderResult.emc(this.videoView);
        this.mRenderListener.emc(this.renderResult);
    }

    public bw renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, ViewGroup viewGroup, int i) {
        if (mswVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl = mswVar.gbl();
        bw bwVarEmc = com.bytedance.sdk.component.adexpress.dynamic.emc.ypw.emc(this.mContext, this, mswVar);
        if (bwVarEmc instanceof xmt) {
            callBackRenderFail(i == 3 ? 128 : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(mswVar);
        bwVarEmc.xq();
        if (viewGroup != null) {
            viewGroup.addView(bwVarEmc);
            setClipChildren(viewGroup, mswVar);
        }
        if (listGbl == null || listGbl.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = listGbl.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), bwVarEmc, i);
        }
        return bwVarEmc;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.ypw ypwVar) {
        this.muteListener = ypwVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.ypw.gbl gblVar) {
        this.mRenderListener = gblVar;
        this.mDynamicClickListener.emc(gblVar);
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setSoundMute(boolean z6) {
        com.bytedance.sdk.component.adexpress.dynamic.ypw ypwVar = this.muteListener;
        if (ypwVar != null) {
            ypwVar.setSoundMute(z6);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTime(CharSequence charSequence, int i, int i3, boolean z6) {
        for (int i6 = 0; i6 < this.timeOutListener.size(); i6++) {
            if (this.timeOutListener.get(i6) != null) {
                this.timeOutListener.get(i6).emc(charSequence, i == 1, i3, z6);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.xq xqVar) {
        this.timeOutListener.add(xqVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.bw bwVar) {
        this.videoListener = bwVar;
    }

    public void updateRenderInfoForVideo(double d6, double d7, double d8, double d9, float f2) {
        this.renderResult.xq(d6);
        this.renderResult.dg(d7);
        this.renderResult.bw(d8);
        this.renderResult.ycc(d9);
        this.renderResult.emc(f2);
        this.renderResult.ypw(f2);
        this.renderResult.xq(f2);
        this.renderResult.dg(f2);
    }

    public void beginShowFromInvisible(bw bwVar, int i) {
        if (bwVar == null) {
            return;
        }
        if (bwVar.getBeginInvisibleAndShow()) {
            bwVar.setVisibility(i);
            View view = bwVar.cf;
            if (view != null) {
                view.setVisibility(i);
            }
        }
        int childCount = bwVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            if (bwVar.getChildAt(i3) instanceof bw) {
                beginShowFromInvisible((bw) bwVar.getChildAt(i3), i);
            }
        }
    }
}
