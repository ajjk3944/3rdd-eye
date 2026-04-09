package com.yandex.mobile.ads.impl;

import c9.C2079C;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import c9.C2101v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class uj0 {

    /* renamed from: a, reason: collision with root package name */
    private final qj0 f34074a;

    /* renamed from: b, reason: collision with root package name */
    private final jb1 f34075b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<jj0> f34076a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<jj0> f34077b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<jj0> f34078c;

        public a(HashSet imagesToLoad, Set imagesToLoadPreview, Set imagesToLoadInBack) {
            kotlin.jvm.internal.l.f(imagesToLoad, "imagesToLoad");
            kotlin.jvm.internal.l.f(imagesToLoadPreview, "imagesToLoadPreview");
            kotlin.jvm.internal.l.f(imagesToLoadInBack, "imagesToLoadInBack");
            this.f34076a = imagesToLoad;
            this.f34077b = imagesToLoadPreview;
            this.f34078c = imagesToLoadInBack;
        }

        public final Set<jj0> a() {
            return this.f34076a;
        }

        public final Set<jj0> b() {
            return this.f34077b;
        }

        public final Set<jj0> c() {
            return this.f34078c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f34076a, aVar.f34076a) && kotlin.jvm.internal.l.b(this.f34077b, aVar.f34077b) && kotlin.jvm.internal.l.b(this.f34078c, aVar.f34078c);
        }

        public final int hashCode() {
            return this.f34078c.hashCode() + ((this.f34077b.hashCode() + (this.f34076a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Images(imagesToLoad=" + this.f34076a + ", imagesToLoadPreview=" + this.f34077b + ", imagesToLoadInBack=" + this.f34078c + ")";
        }
    }

    public /* synthetic */ uj0() {
        this(new qj0(), new jb1());
    }

    public final a a(j41 nativeAdBlock) {
        LinkedHashSet linkedHashSet;
        Set setL0;
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        a8<?> a8VarB = nativeAdBlock.b();
        p61 p61VarC = nativeAdBlock.c();
        List<w31> nativeAds = p61VarC.e();
        qj0 qj0Var = this.f34074a;
        qj0Var.getClass();
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        ArrayList arrayList = new ArrayList(C2092m.T(nativeAds, 10));
        for (w31 w31Var : nativeAds) {
            arrayList.add(qj0Var.a(w31Var.b(), w31Var.e()));
        }
        Set setL02 = C2097r.L0(C2092m.U(arrayList));
        this.f34074a.getClass();
        List<w20> listC = p61VarC.c();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            List<jj0> listD = ((w20) it.next()).d();
            if (listD != null) {
                arrayList2.add(listD);
            }
        }
        Set setC = C2079C.c(setL02, C2097r.L0(C2092m.U(arrayList2)));
        Set<jj0> setC2 = this.f34075b.c(p61VarC);
        LinkedHashSet linkedHashSetC = C2079C.c(setC, setC2);
        if (!a8VarB.Q()) {
            setC = null;
        }
        if (setC == null) {
            setC = C2101v.f18583b;
        }
        LinkedHashSet linkedHashSetC2 = C2079C.c(setC2, setC);
        HashSet hashSet = new HashSet();
        for (Object obj : linkedHashSetC2) {
            if (((jj0) obj).b()) {
                hashSet.add(obj);
            }
        }
        Collection<?> collectionD0 = C2095p.d0(hashSet);
        if (collectionD0.isEmpty()) {
            setL0 = C2097r.L0(linkedHashSetC);
        } else {
            if (collectionD0 instanceof Set) {
                linkedHashSet = new LinkedHashSet();
                for (Object obj2 : linkedHashSetC) {
                    if (!((Set) collectionD0).contains(obj2)) {
                        linkedHashSet.add(obj2);
                    }
                }
            } else {
                linkedHashSet = new LinkedHashSet(linkedHashSetC);
                linkedHashSet.removeAll(collectionD0);
            }
            setL0 = linkedHashSet;
        }
        return new a(hashSet, linkedHashSetC, setL0);
    }

    public uj0(qj0 imageValuesProvider, jb1 nativeVideoUrlsProvider) {
        kotlin.jvm.internal.l.f(imageValuesProvider, "imageValuesProvider");
        kotlin.jvm.internal.l.f(nativeVideoUrlsProvider, "nativeVideoUrlsProvider");
        this.f34074a = imageValuesProvider;
        this.f34075b = nativeVideoUrlsProvider;
    }
}
