package com.lefan.signal.ui.wifi;

import F4.d;
import Y4.w;
import a4.p;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Q;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C1277hl;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h.AbstractActivityC2349g;
import q5.i;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class WifiDetectionActivity extends AbstractActivityC2349g {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f19393h0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public C1277hl f19394O;

    /* renamed from: S, reason: collision with root package name */
    public WifiSafeView f19398S;

    /* renamed from: T, reason: collision with root package name */
    public WifiSafeView f19399T;

    /* renamed from: U, reason: collision with root package name */
    public WifiSafeView f19400U;

    /* renamed from: V, reason: collision with root package name */
    public WifiSafeView f19401V;

    /* renamed from: W, reason: collision with root package name */
    public WifiSafeView f19402W;

    /* renamed from: X, reason: collision with root package name */
    public WifiSafeView f19403X;

    /* renamed from: Y, reason: collision with root package name */
    public WifiSafeView f19404Y;

    /* renamed from: Z, reason: collision with root package name */
    public WifiSafeView f19405Z;

    /* renamed from: a0, reason: collision with root package name */
    public CircularProgressIndicator f19406a0;
    public MaterialButton b0;

    /* renamed from: c0, reason: collision with root package name */
    public WifiManager f19407c0;

    /* renamed from: d0, reason: collision with root package name */
    public Group f19408d0;

    /* renamed from: e0, reason: collision with root package name */
    public AppCompatTextView f19409e0;

    /* renamed from: P, reason: collision with root package name */
    public final int f19395P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public final int f19396Q = 2;

    /* renamed from: R, reason: collision with root package name */
    public final int f19397R = 3;

    /* renamed from: f0, reason: collision with root package name */
    public final long f19410f0 = 2000;

    /* renamed from: g0, reason: collision with root package name */
    public int f19411g0 = 100;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(com.lefan.signal.ui.wifi.WifiDetectionActivity r5, j5.b r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Y4.C0239t
            if (r0 == 0) goto L13
            r0 = r6
            Y4.t r0 = (Y4.C0239t) r0
            int r1 = r0.f4500f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4500f = r1
            goto L18
        L13:
            Y4.t r0 = new Y4.t
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4498d
            int r1 = r0.f4500f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r6)
            goto L55
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            R2.a.H(r6)
            android.net.wifi.WifiManager r6 = r5.f19407c0
            q5.i.b(r6)
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()
            com.lefan.signal.ui.wifi.WifiSafeView r1 = r5.f19398S
            if (r1 == 0) goto L42
            int r3 = r5.f19395P
            r1.setStatus(r3)
        L42:
            G5.d r1 = z5.D.f24486b
            Y4.u r3 = new Y4.u
            r4 = 0
            r3.<init>(r5, r6, r4)
            r0.f4500f = r2
            java.lang.Object r6 = z5.AbstractC3046w.r(r1, r0, r3)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r6 != r0) goto L55
            return r0
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L6d
            com.lefan.signal.ui.wifi.WifiSafeView r6 = r5.f19398S
            if (r6 == 0) goto L66
            int r0 = r5.f19396Q
            r6.setStatus(r0)
        L66:
            int r6 = r5.f19411g0
            int r6 = r6 + (-5)
            r5.f19411g0 = r6
            goto L76
        L6d:
            com.lefan.signal.ui.wifi.WifiSafeView r6 = r5.f19398S
            if (r6 == 0) goto L76
            int r5 = r5.f19397R
            r6.setStatus(r5)
        L76:
            c5.i r5 = c5.C0412i.f5929a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.C(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D(com.lefan.signal.ui.wifi.WifiDetectionActivity r5, j5.b r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Y4.x
            if (r0 == 0) goto L13
            r0 = r6
            Y4.x r0 = (Y4.x) r0
            int r1 = r0.f4508f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4508f = r1
            goto L18
        L13:
            Y4.x r0 = new Y4.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4506d
            int r1 = r0.f4508f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r6)
            goto L55
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            R2.a.H(r6)
            android.net.wifi.WifiManager r6 = r5.f19407c0
            q5.i.b(r6)
            android.net.wifi.WifiInfo r6 = r6.getConnectionInfo()
            com.lefan.signal.ui.wifi.WifiSafeView r1 = r5.f19399T
            if (r1 == 0) goto L42
            int r3 = r5.f19395P
            r1.setStatus(r3)
        L42:
            G5.d r1 = z5.D.f24486b
            Y4.y r3 = new Y4.y
            r4 = 0
            r3.<init>(r5, r6, r4)
            r0.f4508f = r2
            java.lang.Object r6 = z5.AbstractC3046w.r(r1, r0, r3)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r6 != r0) goto L55
            return r0
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            com.lefan.signal.ui.wifi.WifiSafeView r6 = r5.f19399T
            if (r6 == 0) goto L76
            int r5 = r5.f19397R
            r6.setStatus(r5)
            goto L76
        L67:
            com.lefan.signal.ui.wifi.WifiSafeView r6 = r5.f19399T
            if (r6 == 0) goto L70
            int r0 = r5.f19396Q
            r6.setStatus(r0)
        L70:
            int r6 = r5.f19411g0
            int r6 = r6 + (-15)
            r5.f19411g0 = r6
        L76:
            c5.i r5 = c5.C0412i.f5929a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.D(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(com.lefan.signal.ui.wifi.WifiDetectionActivity r4, j5.b r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Y4.z
            if (r0 == 0) goto L13
            r0 = r5
            Y4.z r0 = (Y4.z) r0
            int r1 = r0.f4514f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4514f = r1
            goto L18
        L13:
            Y4.z r0 = new Y4.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4512d
            int r1 = r0.f4514f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r5)
            goto L4c
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            R2.a.H(r5)
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19400U
            if (r5 == 0) goto L39
            int r1 = r4.f19395P
            r5.setStatus(r1)
        L39:
            G5.d r5 = z5.D.f24486b
            Y4.A r1 = new Y4.A
            r3 = 0
            r1.<init>(r4, r3)
            r0.f4514f = r2
            java.lang.Object r5 = z5.AbstractC3046w.r(r5, r0, r1)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5e
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19400U
            if (r5 == 0) goto L6d
            int r4 = r4.f19397R
            r5.setStatus(r4)
            goto L6d
        L5e:
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19400U
            if (r5 == 0) goto L67
            int r0 = r4.f19396Q
            r5.setStatus(r0)
        L67:
            int r5 = r4.f19411g0
            int r5 = r5 + (-5)
            r4.f19411g0 = r5
        L6d:
            c5.i r4 = c5.C0412i.f5929a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.E(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    public static final void F(WifiDetectionActivity wifiDetectionActivity) {
        WifiManager wifiManager = wifiDetectionActivity.f19407c0;
        if (wifiManager != null && !wifiManager.isWifiEnabled()) {
            d.b(wifiDetectionActivity, wifiDetectionActivity.getString(R.string.wifi_not_connected));
            wifiDetectionActivity.finish();
        }
        WifiManager wifiManager2 = wifiDetectionActivity.f19407c0;
        WifiInfo connectionInfo = wifiManager2 != null ? wifiManager2.getConnectionInfo() : null;
        if (connectionInfo != null) {
            SupplicantState supplicantState = connectionInfo.getSupplicantState();
            SupplicantState supplicantState2 = SupplicantState.DISCONNECTED;
            if (supplicantState != supplicantState2 && connectionInfo.getSupplicantState() != supplicantState2) {
                return;
            }
        }
        d.b(wifiDetectionActivity, wifiDetectionActivity.getString(R.string.wifi_not_connected));
        wifiDetectionActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G(com.lefan.signal.ui.wifi.WifiDetectionActivity r6, j5.b r7) throws java.lang.Throwable {
        /*
            int r0 = r6.f19397R
            int r1 = r6.f19396Q
            boolean r2 = r7 instanceof Y4.B
            if (r2 == 0) goto L17
            r2 = r7
            Y4.B r2 = (Y4.B) r2
            int r3 = r2.f4393f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4393f = r3
            goto L1c
        L17:
            Y4.B r2 = new Y4.B
            r2.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r2.f4391d
            int r3 = r2.f4393f
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            R2.a.H(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            R2.a.H(r7)
            com.lefan.signal.ui.wifi.WifiSafeView r7 = r6.f19404Y
            if (r7 == 0) goto L3d
            int r3 = r6.f19395P
            r7.setStatus(r3)
        L3d:
            G5.d r7 = z5.D.f24486b
            Y4.C r3 = new Y4.C
            r5 = 0
            r3.<init>(r6, r5)
            r2.f4393f = r4
            java.lang.Object r7 = z5.AbstractC3046w.r(r7, r2, r3)
            i5.a r2 = i5.EnumC2380a.f20635a
            if (r7 != r2) goto L50
            return r2
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L66
            com.lefan.signal.ui.wifi.WifiSafeView r2 = r6.f19404Y
            if (r2 == 0) goto L5f
            r2.setStatus(r1)
        L5f:
            int r2 = r6.f19411g0
            int r2 = r2 + (-20)
            r6.f19411g0 = r2
            goto L6d
        L66:
            com.lefan.signal.ui.wifi.WifiSafeView r2 = r6.f19404Y
            if (r2 == 0) goto L6d
            r2.setStatus(r0)
        L6d:
            com.lefan.signal.ui.wifi.WifiSafeView r6 = r6.f19404Y
            if (r6 == 0) goto L78
            if (r7 != 0) goto L74
            goto L75
        L74:
            r0 = r1
        L75:
            r6.setStatus(r0)
        L78:
            c5.i r6 = c5.C0412i.f5929a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.G(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object H(com.lefan.signal.ui.wifi.WifiDetectionActivity r4, j5.b r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Y4.D
            if (r0 == 0) goto L13
            r0 = r5
            Y4.D r0 = (Y4.D) r0
            int r1 = r0.f4399f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4399f = r1
            goto L18
        L13:
            Y4.D r0 = new Y4.D
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4397d
            int r1 = r0.f4399f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r5)
            goto L4c
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            R2.a.H(r5)
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19402W
            if (r5 == 0) goto L39
            int r1 = r4.f19395P
            r5.setStatus(r1)
        L39:
            G5.d r5 = z5.D.f24486b
            Y4.E r1 = new Y4.E
            r3 = 0
            r1.<init>(r4, r3)
            r0.f4399f = r2
            java.lang.Object r5 = z5.AbstractC3046w.r(r5, r0, r1)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19402W
            if (r5 == 0) goto L5d
            int r0 = r4.f19396Q
            r5.setStatus(r0)
        L5d:
            int r5 = r4.f19411g0
            int r5 = r5 + (-15)
            r4.f19411g0 = r5
            goto L6d
        L64:
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19402W
            if (r5 == 0) goto L6d
            int r4 = r4.f19397R
            r5.setStatus(r4)
        L6d:
            c5.i r4 = c5.C0412i.f5929a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.H(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I(com.lefan.signal.ui.wifi.WifiDetectionActivity r4, j5.b r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Y4.F
            if (r0 == 0) goto L13
            r0 = r5
            Y4.F r0 = (Y4.F) r0
            int r1 = r0.f4404f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4404f = r1
            goto L18
        L13:
            Y4.F r0 = new Y4.F
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4402d
            int r1 = r0.f4404f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r5)
            goto L4c
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            R2.a.H(r5)
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19405Z
            if (r5 == 0) goto L39
            int r1 = r4.f19395P
            r5.setStatus(r1)
        L39:
            G5.d r5 = z5.D.f24486b
            Y4.G r1 = new Y4.G
            r3 = 0
            r1.<init>(r4, r3)
            r0.f4404f = r2
            java.lang.Object r5 = z5.AbstractC3046w.r(r5, r0, r1)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19405Z
            if (r5 == 0) goto L5d
            int r0 = r4.f19396Q
            r5.setStatus(r0)
        L5d:
            int r5 = r4.f19411g0
            int r5 = r5 + (-20)
            r4.f19411g0 = r5
            goto L6d
        L64:
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19405Z
            if (r5 == 0) goto L6d
            int r4 = r4.f19397R
            r5.setStatus(r4)
        L6d:
            c5.i r4 = c5.C0412i.f5929a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.I(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object J(com.lefan.signal.ui.wifi.WifiDetectionActivity r6, j5.b r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Y4.H
            if (r0 == 0) goto L13
            r0 = r7
            Y4.H r0 = (Y4.H) r0
            int r1 = r0.f4410g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4410g = r1
            goto L18
        L13:
            Y4.H r0 = new Y4.H
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f4408e
            int r1 = r0.f4410g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            android.net.wifi.WifiInfo r0 = r0.f4407d
            R2.a.H(r7)
            goto L5c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            R2.a.H(r7)
            android.net.wifi.WifiManager r7 = r6.f19407c0
            q5.i.b(r7)
            android.net.wifi.WifiInfo r7 = r7.getConnectionInfo()
            com.lefan.signal.ui.wifi.WifiSafeView r1 = r6.f19403X
            if (r1 == 0) goto L44
            int r3 = r6.f19395P
            r1.setStatus(r3)
        L44:
            G5.d r1 = z5.D.f24486b
            Y4.I r3 = new Y4.I
            r4 = 0
            r3.<init>(r6, r7, r4)
            r0.f4407d = r7
            r0.f4410g = r2
            java.lang.Object r0 = z5.AbstractC3046w.r(r1, r0, r3)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 != r1) goto L59
            return r1
        L59:
            r5 = r0
            r0 = r7
            r7 = r5
        L5c:
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r6.f19411g0
            int r2 = r0.getRssi()
            r3 = -35
            if (r2 >= r3) goto L6a
            r0 = 0
            goto L70
        L6a:
            int r0 = r0.getRssi()
            int r0 = r0 / 20
        L70:
            int r1 = r1 + r0
            r6.f19411g0 = r1
            com.lefan.signal.ui.wifi.WifiSafeView r0 = r6.f19403X
            if (r0 == 0) goto L7a
            r0.setSignalVal(r7)
        L7a:
            com.lefan.signal.ui.wifi.WifiSafeView r7 = r6.f19403X
            if (r7 == 0) goto L83
            int r6 = r6.f19397R
            r7.setStatus(r6)
        L83:
            c5.i r6 = c5.C0412i.f5929a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.J(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K(com.lefan.signal.ui.wifi.WifiDetectionActivity r4, j5.b r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof Y4.J
            if (r0 == 0) goto L13
            r0 = r5
            Y4.J r0 = (Y4.J) r0
            int r1 = r0.f4416f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4416f = r1
            goto L18
        L13:
            Y4.J r0 = new Y4.J
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4414d
            int r1 = r0.f4416f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            R2.a.H(r5)
            goto L4c
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            R2.a.H(r5)
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19401V
            if (r5 == 0) goto L39
            int r1 = r4.f19395P
            r5.setStatus(r1)
        L39:
            G5.d r5 = z5.D.f24486b
            Y4.K r1 = new Y4.K
            r3 = 0
            r1.<init>(r4, r3)
            r0.f4416f = r2
            java.lang.Object r5 = z5.AbstractC3046w.r(r5, r0, r1)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L64
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19401V
            if (r5 == 0) goto L5d
            int r0 = r4.f19396Q
            r5.setStatus(r0)
        L5d:
            int r5 = r4.f19411g0
            int r5 = r5 + (-15)
            r4.f19411g0 = r5
            goto L6d
        L64:
            com.lefan.signal.ui.wifi.WifiSafeView r5 = r4.f19401V
            if (r5 == 0) goto L6d
            int r4 = r4.f19397R
            r5.setStatus(r4)
        L6d:
            c5.i r4 = c5.C0412i.f5929a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiDetectionActivity.K(com.lefan.signal.ui.wifi.WifiDetectionActivity, j5.b):java.lang.Object");
    }

    public final void L() {
        Group group = this.f19408d0;
        if (group == null) {
            i.g("loadGroup");
            throw null;
        }
        group.setVisibility(0);
        AppCompatTextView appCompatTextView = this.f19409e0;
        if (appCompatTextView == null) {
            i.g("scoreText");
            throw null;
        }
        appCompatTextView.setVisibility(8);
        MaterialButton materialButton = this.b0;
        if (materialButton != null) {
            materialButton.setText(getString(R.string.detection));
        }
        MaterialButton materialButton2 = this.b0;
        if (materialButton2 != null) {
            materialButton2.setEnabled(false);
        }
        WifiSafeView wifiSafeView = this.f19398S;
        if (wifiSafeView != null) {
            wifiSafeView.setStatus(0);
        }
        WifiSafeView wifiSafeView2 = this.f19399T;
        if (wifiSafeView2 != null) {
            wifiSafeView2.setStatus(0);
        }
        WifiSafeView wifiSafeView3 = this.f19400U;
        if (wifiSafeView3 != null) {
            wifiSafeView3.setStatus(0);
        }
        WifiSafeView wifiSafeView4 = this.f19401V;
        if (wifiSafeView4 != null) {
            wifiSafeView4.setStatus(0);
        }
        WifiSafeView wifiSafeView5 = this.f19402W;
        if (wifiSafeView5 != null) {
            wifiSafeView5.setStatus(0);
        }
        WifiSafeView wifiSafeView6 = this.f19403X;
        if (wifiSafeView6 != null) {
            wifiSafeView6.setStatus(0);
        }
        WifiSafeView wifiSafeView7 = this.f19404Y;
        if (wifiSafeView7 != null) {
            wifiSafeView7.setStatus(0);
        }
        WifiSafeView wifiSafeView8 = this.f19405Z;
        if (wifiSafeView8 != null) {
            wifiSafeView8.setStatus(0);
        }
        AbstractC3046w.l(Q.f(this), null, new w(this, null), 3);
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_wifi_detection, (ViewGroup) null, false);
        int i = R.id.app_bar;
        if (((AppBarLayout) p.e(R.id.app_bar, viewInflate)) != null) {
            i = R.id.bottom_layout;
            NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.bottom_layout, viewInflate);
            if (nestedScrollView != null) {
                i = R.id.detection_score;
                AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.detection_score, viewInflate);
                if (appCompatTextView != null) {
                    i = R.id.itemArp;
                    WifiSafeView wifiSafeView = (WifiSafeView) p.e(R.id.itemArp, viewInflate);
                    if (wifiSafeView != null) {
                        i = R.id.itemDns;
                        WifiSafeView wifiSafeView2 = (WifiSafeView) p.e(R.id.itemDns, viewInflate);
                        if (wifiSafeView2 != null) {
                            i = R.id.itemEncipherment;
                            WifiSafeView wifiSafeView3 = (WifiSafeView) p.e(R.id.itemEncipherment, viewInflate);
                            if (wifiSafeView3 != null) {
                                i = R.id.itemModified;
                                WifiSafeView wifiSafeView4 = (WifiSafeView) p.e(R.id.itemModified, viewInflate);
                                if (wifiSafeView4 != null) {
                                    i = R.id.itemPhisher;
                                    WifiSafeView wifiSafeView5 = (WifiSafeView) p.e(R.id.itemPhisher, viewInflate);
                                    if (wifiSafeView5 != null) {
                                        i = R.id.itemPublicWifi;
                                        WifiSafeView wifiSafeView6 = (WifiSafeView) p.e(R.id.itemPublicWifi, viewInflate);
                                        if (wifiSafeView6 != null) {
                                            i = R.id.itemSignal;
                                            WifiSafeView wifiSafeView7 = (WifiSafeView) p.e(R.id.itemSignal, viewInflate);
                                            if (wifiSafeView7 != null) {
                                                i = R.id.itemSsl;
                                                WifiSafeView wifiSafeView8 = (WifiSafeView) p.e(R.id.itemSsl, viewInflate);
                                                if (wifiSafeView8 != null) {
                                                    i = R.id.loading_group;
                                                    Group group = (Group) p.e(R.id.loading_group, viewInflate);
                                                    if (group != null) {
                                                        i = R.id.progress_circular;
                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p.e(R.id.progress_circular, viewInflate);
                                                        if (circularProgressIndicator != null) {
                                                            i = R.id.start_btn;
                                                            MaterialButton materialButton = (MaterialButton) p.e(R.id.start_btn, viewInflate);
                                                            if (materialButton != null) {
                                                                i = R.id.toolbar;
                                                                Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                                                                if (toolbar != null) {
                                                                    i = R.id.toolbar_layout;
                                                                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) p.e(R.id.toolbar_layout, viewInflate);
                                                                    if (collapsingToolbarLayout != null) {
                                                                        i = R.id.wifi_icon;
                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) p.e(R.id.wifi_icon, viewInflate);
                                                                        if (appCompatImageView != null) {
                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                                                                            this.f19394O = new C1277hl(coordinatorLayout, nestedScrollView, appCompatTextView, wifiSafeView, wifiSafeView2, wifiSafeView3, wifiSafeView4, wifiSafeView5, wifiSafeView6, wifiSafeView7, wifiSafeView8, group, circularProgressIndicator, materialButton, toolbar, collapsingToolbarLayout, appCompatImageView);
                                                                            setContentView(coordinatorLayout);
                                                                            C1277hl c1277hl = this.f19394O;
                                                                            if (c1277hl == null) {
                                                                                i.g("binding");
                                                                                throw null;
                                                                            }
                                                                            CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) c1277hl.f14542E;
                                                                            if (c1277hl == null) {
                                                                                i.g("binding");
                                                                                throw null;
                                                                            }
                                                                            d.a(collapsingToolbarLayout2, (NestedScrollView) c1277hl.f14545c);
                                                                            C1277hl c1277hl2 = this.f19394O;
                                                                            if (c1277hl2 == null) {
                                                                                i.g("binding");
                                                                                throw null;
                                                                            }
                                                                            Toolbar toolbar2 = (Toolbar) c1277hl2.f14541D;
                                                                            B(toolbar2);
                                                                            com.bumptech.glide.d dVarR = r();
                                                                            if (dVarR != null) {
                                                                                dVarR.S(true);
                                                                            }
                                                                            final int i3 = 0;
                                                                            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: Y4.s

                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                public final /* synthetic */ WifiDetectionActivity f4497b;

                                                                                {
                                                                                    this.f4497b = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i6 = i3;
                                                                                    WifiDetectionActivity wifiDetectionActivity = this.f4497b;
                                                                                    switch (i6) {
                                                                                        case 0:
                                                                                            int i7 = WifiDetectionActivity.f19393h0;
                                                                                            wifiDetectionActivity.finish();
                                                                                            break;
                                                                                        default:
                                                                                            int i8 = WifiDetectionActivity.f19393h0;
                                                                                            wifiDetectionActivity.L();
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                            this.f19407c0 = (WifiManager) getApplicationContext().getSystemService("wifi");
                                                                            C1277hl c1277hl3 = this.f19394O;
                                                                            if (c1277hl3 == null) {
                                                                                i.g("binding");
                                                                                throw null;
                                                                            }
                                                                            this.f19406a0 = (CircularProgressIndicator) c1277hl3.f14555n;
                                                                            MaterialButton materialButton2 = (MaterialButton) c1277hl3.f14540C;
                                                                            this.b0 = materialButton2;
                                                                            this.f19398S = (WifiSafeView) c1277hl3.f14549g;
                                                                            this.f19399T = (WifiSafeView) c1277hl3.i;
                                                                            this.f19400U = (WifiSafeView) c1277hl3.f14551j;
                                                                            this.f19401V = (WifiSafeView) c1277hl3.f14553l;
                                                                            this.f19402W = (WifiSafeView) c1277hl3.f14548f;
                                                                            this.f19403X = (WifiSafeView) c1277hl3.f14552k;
                                                                            this.f19404Y = (WifiSafeView) c1277hl3.f14547e;
                                                                            this.f19405Z = (WifiSafeView) c1277hl3.f14550h;
                                                                            this.f19408d0 = (Group) c1277hl3.f14554m;
                                                                            this.f19409e0 = (AppCompatTextView) c1277hl3.f14546d;
                                                                            final int i6 = 1;
                                                                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Y4.s

                                                                                /* renamed from: b, reason: collision with root package name */
                                                                                public final /* synthetic */ WifiDetectionActivity f4497b;

                                                                                {
                                                                                    this.f4497b = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i62 = i6;
                                                                                    WifiDetectionActivity wifiDetectionActivity = this.f4497b;
                                                                                    switch (i62) {
                                                                                        case 0:
                                                                                            int i7 = WifiDetectionActivity.f19393h0;
                                                                                            wifiDetectionActivity.finish();
                                                                                            break;
                                                                                        default:
                                                                                            int i8 = WifiDetectionActivity.f19393h0;
                                                                                            wifiDetectionActivity.L();
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            });
                                                                            L();
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
