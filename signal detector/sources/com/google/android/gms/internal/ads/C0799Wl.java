package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import f4.InterfaceFutureC2326a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799Wl implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12310a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12311b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12312c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12313d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12314e;

    public /* synthetic */ C0799Wl(InterfaceC2084wl interfaceC2084wl, C2189yi c2189yi, C2202yv c2202yv, C0633Mp c0633Mp) {
        this.f12311b = interfaceC2084wl;
        this.f12313d = c2189yi;
        this.f12312c = c2202yv;
        this.f12314e = c0633Mp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        switch (this.f12310a) {
            case 0:
                C0816Xl c0816Xl = (C0816Xl) ((WeakReference) this.f12311b).get();
                String str = (String) map.get("u");
                if (c0816Xl != null && !TextUtils.isEmpty(str)) {
                    ((C2202yv) this.f12312c).b(str, (d4.h) this.f12313d, (Xu) this.f12314e, c0816Xl.f12468R);
                    break;
                }
                break;
            case 1:
                Object obj2 = ((WeakReference) this.f12311b).get();
                if (obj2 != null) {
                    ((InterfaceC0466Db) this.f12313d).e(obj2, map);
                    break;
                } else {
                    ((C1547mn) this.f12314e).c((String) this.f12312c, this);
                    break;
                }
            default:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                AbstractC0449Cb.b(map, (InterfaceC2084wl) this.f12311b);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    C0633Mp c0633Mp = (C0633Mp) this.f12314e;
                    C2202yv c2202yv = (C2202yv) this.f12312c;
                    C2189yi c2189yi = (C2189yi) this.f12313d;
                    InterfaceFutureC2326a interfaceFutureC2326aA = AbstractC0449Cb.a(interfaceC0828Yg, str2);
                    C1431kf c1431kf = new C1431kf(interfaceC0828Yg, c2189yi, c2202yv, c0633Mp, 23, false);
                    interfaceFutureC2326aA.a(new CD(interfaceFutureC2326aA, 0, c1431kf), AbstractC0640Nf.f10005a);
                    break;
                } else {
                    u2.k.h("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ C0799Wl(C0816Xl c0816Xl, C2202yv c2202yv, d4.h hVar, Xu xu) {
        this.f12311b = new WeakReference(c0816Xl);
        this.f12312c = c2202yv;
        this.f12313d = hVar;
        this.f12314e = xu;
    }

    public /* synthetic */ C0799Wl(C1547mn c1547mn, WeakReference weakReference, String str, InterfaceC0466Db interfaceC0466Db) {
        this.f12314e = c1547mn;
        this.f12311b = weakReference;
        this.f12312c = str;
        this.f12313d = interfaceC0466Db;
    }
}
