package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r80 extends hp1 implements xg {

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f15573c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f15574d;

    /* renamed from: e, reason: collision with root package name */
    public final wp0 f15575e;

    public r80(Context context, Set set, wp0 wp0Var) {
        super(set);
        this.f15573c = new WeakHashMap(1);
        this.f15574d = context;
        this.f15575e = wp0Var;
    }

    public final synchronized void v1(View view) {
        try {
            WeakHashMap weakHashMap = this.f15573c;
            yg ygVar = (yg) weakHashMap.get(view);
            if (ygVar == null) {
                yg ygVar2 = new yg(this.f15574d, view);
                ygVar2.f18745l.add(this);
                ygVar2.d(3);
                weakHashMap.put(view, ygVar2);
                ygVar = ygVar2;
            }
            if (this.f15575e.X) {
                pk pkVar = sk.M1;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    ygVar.f18743i.j(((Long) sVar.f36166c.a(sk.L1)).longValue());
                    return;
                }
            }
            ygVar.f18743i.j(yg.f18735o);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final synchronized void w(wg wgVar) {
        p1(new fk0(25, wgVar));
    }
}
