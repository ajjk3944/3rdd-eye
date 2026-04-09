package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kg0 implements n70 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13154a;

    /* renamed from: b, reason: collision with root package name */
    public final dw f13155b;

    public kg0(Context context, dw dwVar) {
        this.f13154a = context;
        this.f13155b = dwVar;
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = ((yp0) dq0Var.f10544b.f9452c).f18823e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dw dwVar = this.f13155b;
        Context context = this.f13154a;
        dwVar.getClass();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.P0)).booleanValue() && dwVar.a(context) && dw.g(context)) {
            synchronized (dwVar.f10566i) {
            }
        }
        dwVar.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
    }
}
