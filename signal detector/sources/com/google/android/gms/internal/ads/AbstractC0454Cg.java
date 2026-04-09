package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0454Cg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7635b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f7636c;

    public AbstractC0454Cg(InterfaceC0828Yg interfaceC0828Yg) {
        Context context = interfaceC0828Yg.getContext();
        this.f7634a = context;
        this.f7635b = p2.j.f22785C.f22790c.F(context, interfaceC0828Yg.r().f23784a);
        this.f7636c = new WeakReference(interfaceC0828Yg);
    }

    public void a() {
    }

    public abstract boolean b(String str);

    public boolean c(String str, String[] strArr) {
        return b(str);
    }

    public boolean e(String str, String[] strArr, C1971ug c1971ug) {
        return b(str);
    }

    public void f(int i) {
    }

    public void h(int i) {
    }

    public void j(int i) {
    }

    public abstract void k();

    public final void l(String str, String str2, String str3, String str4) {
        u2.f.f23795b.post(new RunnableC0437Bg(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap map) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7636c.get();
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.a("onPrecacheEvent", map);
        }
    }

    public void i(int i) {
    }
}
