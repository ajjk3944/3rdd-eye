package androidx.room;

import A8.q;
import android.content.Intent;
import b9.C1992A;
import h9.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;
import w1.k;
import w1.u;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final k f16789a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f16790b;

    /* renamed from: c, reason: collision with root package name */
    public final u f16791c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f16792d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f16793e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.e f16794f;

    /* renamed from: g, reason: collision with root package name */
    public final B8.c f16795g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f16796h;
    public e i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f16797j;

    /* compiled from: InvalidationTracker.android.kt */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f16798a;

        public a(String[] strArr) {
            this.f16798a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    public c(k kVar, HashMap map, HashMap map2, String... strArr) {
        this.f16789a = kVar;
        this.f16790b = strArr;
        u uVar = new u(kVar, map, map2, strArr, kVar.f47241k, new q(1, this, c.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 2));
        this.f16791c = uVar;
        this.f16792d = new LinkedHashMap();
        this.f16793e = new ReentrantLock();
        this.f16794f = new G1.e(this, 8);
        this.f16795g = new B8.c(this, 6);
        l.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f16797j = new Object();
        uVar.f47293k = new H8.e(this, 6);
    }

    public final Object a(i iVar) throws Throwable {
        k kVar = this.f16789a;
        if (kVar.l() && !kVar.p()) {
            return C1992A.f18074a;
        }
        Object objF = this.f16791c.f(iVar);
        return objF == g9.a.COROUTINE_SUSPENDED ? objF : C1992A.f18074a;
    }
}
