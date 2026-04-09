package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final uw0 f29052a;

    public static final class a extends kotlin.jvm.internal.m implements p9.l<ya2, mb2<ab1>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29053b = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public final mb2<ab1> invoke(ya2 ya2Var) {
            ya2 it = ya2Var;
            kotlin.jvm.internal.l.f(it, "it");
            return it.b();
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<mb2<ab1>, b9.l<? extends String, ? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f29054b = new b();

        public b() {
            super(1);
        }

        @Override // p9.l
        public final b9.l<? extends String, ? extends String> invoke(mb2<ab1> mb2Var) {
            mb2<ab1> it = mb2Var;
            kotlin.jvm.internal.l.f(it, "it");
            return new b9.l<>(it.d().getUrl(), it.e());
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements p9.l<ya2, jj0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f29055b = new c();

        public c() {
            super(1);
        }

        @Override // p9.l
        public final jj0 invoke(ya2 ya2Var) {
            ya2 it = ya2Var;
            kotlin.jvm.internal.l.f(it, "it");
            return it.a();
        }
    }

    public /* synthetic */ jb1() {
        this(new uw0());
    }

    public final SortedSet b(p61 nativeAdResponse) {
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        x9.m mVarJ = x9.l.J(x9.l.J(x9.l.K(x9.l.H(C2097r.j0(nativeAdResponse.e()), new mb1(this)), nb1.f30830b), kb1.f29584b), lb1.f29967b);
        TreeSet treeSet = new TreeSet();
        Iterator it = mVarJ.f47848a.iterator();
        while (it.hasNext()) {
            treeSet.add(mVarJ.f47849b.invoke(it.next()));
        }
        return treeSet;
    }

    public final Set<jj0> c(p61 nativeAdResponse) {
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        return x9.l.M(x9.l.K(x9.l.K(x9.l.H(C2097r.j0(nativeAdResponse.e()), new mb1(this)), nb1.f30830b), c.f29055b));
    }

    public final List<b9.l<String, String>> a(p61 nativeAdResponse) {
        kotlin.jvm.internal.l.f(nativeAdResponse, "nativeAdResponse");
        return x9.l.L(x9.l.J(x9.l.J(x9.l.K(x9.l.H(C2097r.j0(nativeAdResponse.e()), new mb1(this)), nb1.f30830b), a.f29053b), b.f29054b));
    }

    public jb1(uw0 mediaValuesProvider) {
        kotlin.jvm.internal.l.f(mediaValuesProvider, "mediaValuesProvider");
        this.f29052a = mediaValuesProvider;
    }
}
