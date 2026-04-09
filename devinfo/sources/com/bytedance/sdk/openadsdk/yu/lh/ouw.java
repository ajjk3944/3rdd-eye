package com.bytedance.sdk.openadsdk.yu.lh;

import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.uoy;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.yu.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0119ouw {
        public static final String fkw;

        /* renamed from: le, reason: collision with root package name */
        public static final String f8807le;

        /* renamed from: lh, reason: collision with root package name */
        public static final String f8808lh;
        public static final String ouw;
        public static final String vt;
        public static final String yu;

        static {
            CharSequence[] charSequenceArr = {uoy.pd(), "load_start"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr[1]);
            ouw = sb2.toString();
            CharSequence[] charSequenceArr2 = {uoy.pd(), "load_finish"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr2[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[1]);
            vt = sb3.toString();
            CharSequence[] charSequenceArr3 = {uoy.pd(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr3[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[1]);
            f8808lh = sb4.toString();
            CharSequence[] charSequenceArr4 = {uoy.pd(), uoy.uq()};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr4[0]);
            sb5.append((CharSequence) "_");
            sb5.append(charSequenceArr4[1]);
            yu = sb5.toString();
            CharSequence[] charSequenceArr5 = {uoy.pd(), uoy.uq(), "show"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr5[0]);
            for (int i4 = 1; i4 < 3; i4++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr5[i4]);
            }
            fkw = sb6.toString();
            CharSequence[] charSequenceArr6 = {uoy.pd(), uoy.uq(), "progress"};
            StringBuilder sb7 = new StringBuilder();
            sb7.append(charSequenceArr6[0]);
            for (int i10 = 1; i10 < 3; i10++) {
                sb7.append((CharSequence) "_");
                sb7.append(charSequenceArr6[i10]);
            }
            f8807le = sb7.toString();
        }
    }
}
