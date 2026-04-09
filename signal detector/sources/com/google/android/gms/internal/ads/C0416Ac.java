package com.google.android.gms.internal.ads;

import android.content.Context;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416Ac {

    /* renamed from: b, reason: collision with root package name */
    public static final W9 f7013b = new W9(10);

    /* renamed from: a, reason: collision with root package name */
    public final C0895ak f7014a;

    public C0416Ac(Context context, C2951a c2951a, String str, Yu yu) {
        C0895ak c0895ak = new C0895ak();
        c0895ak.f13214b = new Object();
        c0895ak.f13219g = 1;
        c0895ak.f13215c = str;
        c0895ak.f13213a = context.getApplicationContext();
        c0895ak.f13216d = c2951a;
        c0895ak.f13217e = yu;
        this.f7014a = c0895ak;
    }

    public final C0450Cc a(String str, InterfaceC2237zc interfaceC2237zc, InterfaceC2183yc interfaceC2183yc) {
        return new C0450Cc(this.f7014a, str, interfaceC2237zc, interfaceC2183yc);
    }
}
