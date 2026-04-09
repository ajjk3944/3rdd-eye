package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl {
    public boolean fkw = false;

    /* renamed from: le, reason: collision with root package name */
    public boolean f7988le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f7989lh;
    public final Activity ouw;
    public final ouw vt;
    com.bytedance.sdk.component.adexpress.dynamic.yu yu;

    public ryl(ouw ouwVar) {
        this.ouw = ouwVar.jvy;
        this.vt = ouwVar;
    }

    public final void fkw(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setSkipEnable(z3);
    }

    public final void lh(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setShowSound(z3);
    }

    public final void ouw(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setShowDislike(z3);
    }

    public final void vt(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f7989lh;
        if (lhVar != null) {
            lhVar.setSoundMute(z3);
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu yuVar = this.yu;
        if (yuVar != null) {
            yuVar.setSoundMute(z3);
        }
    }

    public final void yu(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setShowSkip(z3);
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f7989lh;
        if (lhVar != null) {
            lhVar.clickSkip();
        }
    }

    public final void ouw(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setTime(String.valueOf(str), charSequence);
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setSkipInvisiable();
    }

    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.showSkipButton();
    }

    public final void ouw(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.setSkipText(charSequence);
    }

    public final void ouw() {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
        if (this.f7988le || (lhVar = this.f7989lh) == null) {
            return;
        }
        lhVar.showCountDownText();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.top.vt vtVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.f7989lh;
        if (lhVar != null) {
            lhVar.setListener(vtVar);
        }
    }
}
