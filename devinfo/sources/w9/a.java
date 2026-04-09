package w9;

import android.graphics.Color;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36538a = 0;

    static {
        Color.rgb(207, 248, 246);
        Color.rgb(148, 212, 212);
        Color.rgb(136, 180, 187);
        Color.rgb(118, 174, 175);
        Color.rgb(42, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 130);
        Color.rgb(217, 80, 138);
        Color.rgb(254, 149, 7);
        Color.rgb(254, 247, 120);
        Color.rgb(106, 167, 134);
        Color.rgb(53, 194, 209);
        Color.rgb(64, 89, 128);
        Color.rgb(149, 165, 124);
        Color.rgb(217, 184, 162);
        Color.rgb(191, 134, 134);
        Color.rgb(179, 48, 80);
        Color.rgb(193, 37, 82);
        Color.rgb(255, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 0);
        Color.rgb(245, 199, 0);
        Color.rgb(106, 150, 31);
        Color.rgb(179, 100, 53);
        Color.rgb(192, 255, 140);
        Color.rgb(255, 247, 140);
        Color.rgb(255, 208, 140);
        Color.rgb(140, 234, 255);
        Color.rgb(255, 140, 157);
        a("#2ecc71");
        a("#f1c40f");
        a("#e74c3c");
        a("#3498db");
    }

    public static void a(String str) {
        int i4 = (int) Long.parseLong(str.replace("#", ""), 16);
        Color.rgb((i4 >> 16) & 255, (i4 >> 8) & 255, i4 & 255);
    }
}
