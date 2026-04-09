package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class qb1 {

    /* renamed from: a, reason: collision with root package name */
    private final ke2 f32128a;

    /* renamed from: b, reason: collision with root package name */
    private final ma1 f32129b;

    /* renamed from: c, reason: collision with root package name */
    private final double f32130c;

    public /* synthetic */ qb1(ia1 ia1Var, ke2 ke2Var) {
        this(ia1Var, ke2Var, new ma1(ia1Var));
    }

    public final void a(ov0 ov0Var) {
        if (ov0Var != null) {
            CheckBox muteControl = ov0Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new N2(1, this, muteControl));
                muteControl.setVisibility(this.f32128a.d() ? 0 : 8);
            }
            ProgressBar videoProgress = ov0Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f32128a.b() ? 8 : 0);
            }
            TextView countDownProgress = ov0Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qb1(com.yandex.mobile.ads.impl.ia1 r3, com.yandex.mobile.ads.impl.ke2 r4, com.yandex.mobile.ads.impl.ma1 r5) {
        /*
            r2 = this;
            java.lang.String r0 = "nativeVideoAdPlayer"
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r3 = "videoOptions"
            kotlin.jvm.internal.l.f(r4, r3)
            java.lang.String r3 = "playerVolumeManager"
            kotlin.jvm.internal.l.f(r5, r3)
            r2.<init>()
            r2.f32128a = r4
            r2.f32129b = r5
            java.lang.Double r3 = r4.a()
            if (r3 == 0) goto L34
            double r4 = r3.doubleValue()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            r3 = 0
        L2d:
            if (r3 == 0) goto L34
            double r3 = r3.doubleValue()
            goto L36
        L34:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L36:
            r2.f32130c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qb1.<init>(com.yandex.mobile.ads.impl.ia1, com.yandex.mobile.ads.impl.ke2, com.yandex.mobile.ads.impl.ma1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qb1 this$0, CheckBox checkBox, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f32129b.a(Double.valueOf(!checkBox.isChecked() ? this$0.f32130c : 0.0d));
    }
}
