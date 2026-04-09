package A7;

import b9.C1992A;
import c9.C2092m;
import c9.C2097r;
import j6.C5196a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import l7.g;
import p9.l;

/* compiled from: ExpressionList.kt */
/* loaded from: classes.dex */
public final class e<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f104a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f105b;

    /* renamed from: c, reason: collision with root package name */
    public final g<T> f106c;

    /* renamed from: d, reason: collision with root package name */
    public final z7.c f107d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f108e;

    /* compiled from: ExpressionList.kt */
    public static final class a extends m implements l<T, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m f109g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e<T> f110h;
        public final /* synthetic */ d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super List<? extends T>, C1992A> lVar, e<T> eVar, d dVar) {
            super(1);
            this.f109g = (m) lVar;
            this.f110h = eVar;
            this.i = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // p9.l
        public final C1992A invoke(Object obj) {
            kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
            this.f109g.invoke(this.f110h.b(this.i));
            return C1992A.f18074a;
        }
    }

    public e(String key, ArrayList arrayList, g listValidator, z7.c logger) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(listValidator, "listValidator");
        kotlin.jvm.internal.l.f(logger, "logger");
        this.f104a = key;
        this.f105b = arrayList;
        this.f106c = listValidator;
        this.f107d = logger;
    }

    @Override // A7.c
    public final j6.d a(d resolver, l<? super List<? extends T>, C1992A> lVar) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        a aVar = new a(lVar, this, resolver);
        ArrayList arrayList = this.f105b;
        if (arrayList.size() == 1) {
            return ((b) C2097r.p0(arrayList)).d(resolver, aVar);
        }
        C5196a c5196a = new C5196a();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            j6.d disposable = ((b) it.next()).d(resolver, aVar);
            kotlin.jvm.internal.l.f(disposable, "disposable");
            if (c5196a.f42984c) {
                throw new IllegalArgumentException("close() method was called");
            }
            if (disposable != j6.d.f42990m8) {
                c5196a.f42983b.add(disposable);
            }
        }
        return c5196a;
    }

    @Override // A7.c
    public final List<T> b(d resolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        try {
            ArrayList arrayListC = c(resolver);
            this.f108e = arrayListC;
            return arrayListC;
        } catch (z7.d e4) {
            this.f107d.d(e4);
            ArrayList arrayList = this.f108e;
            if (arrayList != null) {
                return arrayList;
            }
            throw e4;
        }
    }

    public final ArrayList c(d dVar) {
        ArrayList arrayList = this.f105b;
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b) it.next()).a(dVar));
        }
        if (this.f106c.a(arrayList2)) {
            return arrayList2;
        }
        throw z7.e.c(arrayList2, this.f104a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f105b.equals(((e) obj).f105b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f105b.hashCode() * 16;
    }
}
