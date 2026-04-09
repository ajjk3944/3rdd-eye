package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q4 implements i6, i7, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public static final q4 f19474b = new q4(0);

    /* renamed from: c, reason: collision with root package name */
    public static final q4 f19475c = new q4(1);

    /* renamed from: d, reason: collision with root package name */
    public static final q4 f19476d = new q4(2);

    /* renamed from: e, reason: collision with root package name */
    public static final q4 f19477e = new q4(3);

    /* renamed from: f, reason: collision with root package name */
    public static final q4 f19478f = new q4(4);
    public static final q4 g = new q4(5);

    /* renamed from: h, reason: collision with root package name */
    public static final q4 f19479h = new q4(6);

    /* renamed from: i, reason: collision with root package name */
    public static final q4 f19480i = new q4(7);
    public static final q4 j = new q4(8);

    /* renamed from: k, reason: collision with root package name */
    public static final q4 f19481k = new q4(9);

    /* renamed from: l, reason: collision with root package name */
    public static final q4 f19482l = new q4(10);

    /* renamed from: m, reason: collision with root package name */
    public static final q4 f19483m = new q4(11);

    /* renamed from: n, reason: collision with root package name */
    public static final q4 f19484n = new q4(12);

    /* renamed from: o, reason: collision with root package name */
    public static final q4 f19485o = new q4(13);

    /* renamed from: p, reason: collision with root package name */
    public static final q4 f19486p = new q4(14);

    /* renamed from: q, reason: collision with root package name */
    public static final q4 f19487q = new q4(15);

    /* renamed from: r, reason: collision with root package name */
    public static final q4 f19488r = new q4(16);

    /* renamed from: s, reason: collision with root package name */
    public static final q4 f19489s = new q4(17);

    /* renamed from: t, reason: collision with root package name */
    public static final q4 f19490t = new q4(18);

    /* renamed from: u, reason: collision with root package name */
    public static final q4 f19491u = new q4(19);

    /* renamed from: v, reason: collision with root package name */
    public static final q4 f19492v = new q4(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19493a;

    public /* synthetic */ q4(int i4) {
        this.f19493a = i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public Object a() {
        switch (this.f19493a) {
            case 21:
                return new b();
            default:
                i0 i0Var = j0.f19384b;
                l0.c(i0Var);
                return new v0(i0Var);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i6
    public p6 d(Class cls) {
        switch (this.f19493a) {
            case 20:
                if (!w5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (p6) w5.h(cls.asSubclass(w5.class)).f(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i6
    public boolean e(Class cls) {
        switch (this.f19493a) {
            case 20:
                return w5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
    }
}
