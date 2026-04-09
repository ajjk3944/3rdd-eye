package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q90 implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15262a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15263b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15264c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15265d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15266e;

    public /* synthetic */ q90(t80 t80Var, t20 t20Var, ct0 ct0Var, lh0 lh0Var) {
        this.f15263b = t80Var;
        this.f15265d = t20Var;
        this.f15264c = ct0Var;
        this.f15266e = lh0Var;
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f15262a) {
            case 0:
                r90 r90Var = (r90) ((WeakReference) this.f15263b).get();
                String str = (String) map.get("u");
                if (r90Var != null && !TextUtils.isEmpty(str)) {
                    ((ct0) this.f15264c).b(str, (z.e) this.f15265d, (bs0) this.f15266e, r90Var.D);
                    break;
                }
                break;
            case 1:
                Object obj2 = ((WeakReference) this.f15263b).get();
                if (obj2 != null) {
                    ((oo) this.f15265d).k(obj2, map);
                    break;
                } else {
                    ((hc0) this.f15266e).c((String) this.f15264c, this);
                    break;
                }
            default:
                qz qzVar = (qz) obj;
                no.b(map, (t80) this.f15263b);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    lh0 lh0Var = (lh0) this.f15266e;
                    ct0 ct0Var = (ct0) this.f15264c;
                    t20 t20Var = (t20) this.f15265d;
                    vd.b bVarA = no.a(qzVar, str2);
                    aw awVar = new aw(qzVar, t20Var, ct0Var, lh0Var, 23, false);
                    bVarA.a(new q81(0, bVarA, awVar), fx.f11274a);
                    break;
                } else {
                    za.i.h("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ q90(r90 r90Var, ct0 ct0Var, z.e eVar, bs0 bs0Var) {
        this.f15263b = new WeakReference(r90Var);
        this.f15264c = ct0Var;
        this.f15265d = eVar;
        this.f15266e = bs0Var;
    }

    public /* synthetic */ q90(hc0 hc0Var, WeakReference weakReference, String str, oo ooVar) {
        this.f15266e = hc0Var;
        this.f15263b = weakReference;
        this.f15264c = str;
        this.f15265d = ooVar;
    }
}
