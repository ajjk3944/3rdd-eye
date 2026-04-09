package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class Gw {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8481a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f8482b;

    public Gw(Context context, Looper looper) {
        this.f8481a = context;
        this.f8482b = looper;
    }

    public final void a(String str) {
        Kw kwA = Lw.A();
        Context context = this.f8481a;
        String packageName = context.getPackageName();
        kwA.b();
        ((Lw) kwA.f13551b).B(packageName);
        kwA.b();
        ((Lw) kwA.f13551b).D(2);
        Iw iwA = Jw.A();
        iwA.b();
        ((Jw) iwA.f13551b).B(str);
        iwA.b();
        ((Jw) iwA.f13551b).C(2);
        kwA.b();
        ((Lw) kwA.f13551b).C((Jw) iwA.d());
        Ou ou = new Ou(context, this.f8482b, (Lw) kwA.d());
        synchronized (ou.f10273e) {
            try {
                if (!ou.f10269a) {
                    ou.f10269a = true;
                    ((Pw) ou.f10271c).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
