package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.theme.ouw {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private fkw dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.le.ouw mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.vt.cf mRenderListener;
    private com.bytedance.sdk.component.adexpress.vt.mwh mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.vt muteListener;
    protected final com.bytedance.sdk.component.adexpress.vt.jg renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.lh> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.fkw videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z3, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, com.bytedance.sdk.component.adexpress.dynamic.le.ouw ouwVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
        this.renderResult = jgVar;
        jgVar.ouw = 2;
        this.mDynamicClickListener = ouwVar;
        ouwVar.ouw(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.ouw(this);
        this.mIsMute = z3;
        this.mRenderRequest = mwhVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar = pnoVar.bly;
        if (fkwVar == null || (leVar = fkwVar.f7280lh) == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        boolean z3 = leVar.zjp;
        if (jgVar.ko) {
            return;
        }
        jgVar.ko = z3;
    }

    private boolean checkSizeValid() {
        fkw fkwVar = this.dynamicBaseWidget;
        return fkwVar.fkw > 0.0f && fkwVar.f7231le > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f7280lh;
        if (leVar.zvq < 0 || leVar.myk < 0 || leVar.mt < 0 || leVar.xdk < 0) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i4, String str) {
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.vt = false;
        jgVar.f7391jg = i4;
        jgVar.mwh = str;
        this.mRenderListener.ouw(jgVar);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.le.ouw getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.vt.cf getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.vt.mwh getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.lh> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ouw
    public void onThemeChanged(int i4) {
        fkw fkwVar = this.dynamicBaseWidget;
        if (fkwVar == null) {
            return;
        }
        fkwVar.ouw(i4);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
        try {
            this.videoListener.ouw();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, int i4) {
        this.dynamicBaseWidget = renderDynamicView(pnoVar, this, i4);
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.vt = true;
        jgVar.f7393lh = r3.fkw;
        jgVar.yu = r3.f7231le;
        jgVar.rn = this.videoView;
        this.mRenderListener.ouw(jgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.yu.pno r7, android.view.ViewGroup r8, int r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView.renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.yu.pno, android.view.ViewGroup, int):com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw");
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i4) {
        this.logoUnionHeight = i4;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.vt vtVar) {
        this.muteListener = vtVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.vt.cf cfVar) {
        this.mRenderListener = cfVar;
        this.mDynamicClickListener.ouw(cfVar);
    }

    public void setScoreCountWithIcon(int i4) {
        this.scoreCountWithIcon = i4;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setSoundMute(boolean z3) {
        com.bytedance.sdk.component.adexpress.dynamic.vt vtVar = this.muteListener;
        if (vtVar != null) {
            vtVar.setSoundMute(z3);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i4, int i10, boolean z3) {
        for (int i11 = 0; i11 < this.timeOutListener.size(); i11++) {
            if (this.timeOutListener.get(i11) != null) {
                this.timeOutListener.get(i11).ouw(charSequence, i4 == 1, i10, z3);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.lh lhVar) {
        this.timeOutListener.add(lhVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i4) {
        this.videoListener.setTimeUpdate(i4);
    }

    public void setTimedown(int i4) {
        this.timedown = i4;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.fkw fkwVar) {
        this.videoListener = fkwVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        com.bytedance.sdk.component.adexpress.vt.jg jgVar = this.renderResult;
        jgVar.fkw = d10;
        jgVar.f7392le = d11;
        jgVar.f7390cf = d12;
        jgVar.ryl = d13;
        jgVar.ra = f10;
        jgVar.pno = f10;
        jgVar.bly = f10;
        jgVar.tlj = f10;
    }

    public void beginShowFromInvisible(fkw fkwVar, int i4) {
        if (fkwVar == null) {
            return;
        }
        if (fkwVar.getBeginInvisibleAndShow()) {
            fkwVar.setVisibility(i4);
            View view = fkwVar.ko;
            if (view != null) {
                view.setVisibility(i4);
            }
        }
        int childCount = fkwVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            if (fkwVar.getChildAt(i10) instanceof fkw) {
                beginShowFromInvisible((fkw) fkwVar.getChildAt(i10), i4);
            }
        }
    }
}
