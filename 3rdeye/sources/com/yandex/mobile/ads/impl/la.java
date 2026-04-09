package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.q71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class la implements q71 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f29950a;

    /* renamed from: b, reason: collision with root package name */
    private final n71 f29951b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<? extends String> f29952c;

    /* renamed from: d, reason: collision with root package name */
    private String f29953d;

    /* renamed from: e, reason: collision with root package name */
    private x61 f29954e;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f29956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(0);
            this.f29956c = z10;
        }

        @Override // p9.InterfaceC5480a
        public final Boolean invoke() {
            return Boolean.valueOf(la.this.e() && !this.f29956c);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<Boolean> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final Boolean invoke() {
            return Boolean.valueOf(la.this.e());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private la(List<? extends ag<?>> assets, n71 nativeAdsConfiguration, Set<? extends String> rules) {
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(nativeAdsConfiguration, "nativeAdsConfiguration");
        kotlin.jvm.internal.l.f(rules, "rules");
        this.f29950a = assets;
        this.f29951b = nativeAdsConfiguration;
        this.f29952c = rules;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(la this$0, x61 nativeAdViewAdapter) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<ag<?>> list = this$0.f29950a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bg<?> bgVarA = nativeAdViewAdapter.a((ag<?>) it.next());
            if (bgVarA != null && bgVarA.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(la this$0, x61 nativeAdViewAdapter) {
        Object next;
        bg<?> bgVarA;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        Iterator<T> it = this$0.f29950a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ag agVar = (ag) next;
            if (agVar.f() && kotlin.jvm.internal.l.b(agVar.b(), "sponsored")) {
                break;
            }
        }
        ag<?> agVar2 = (ag) next;
        return (agVar2 == null || (bgVarA = nativeAdViewAdapter.a(agVar2)) == null || !bgVarA.d()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(la this$0, x61 nativeAdViewAdapter) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<ag<?>> list = this$0.f29950a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ag<?> agVar = (ag) next;
            bg<?> bgVarA = nativeAdViewAdapter.a(agVar);
            if (bgVarA == null) {
                bgVarA = null;
            }
            if (bgVarA == null || !bgVarA.a(agVar.d())) {
                break;
            }
        }
        ag agVar2 = (ag) next;
        this$0.f29953d = agVar2 != null ? agVar2.b() : null;
        return agVar2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(la this$0, x61 nativeAdViewAdapter) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<ag<?>> list = this$0.f29950a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bg<?> bgVarA = nativeAdViewAdapter.a((ag<?>) next);
            if (bgVarA == null || !bgVarA.e()) {
                break;
            }
        }
        ag agVar = (ag) next;
        this$0.f29953d = agVar != null ? agVar.b() : null;
        return agVar == null;
    }

    public final boolean e() {
        return !a(new X1(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(la this$0, x61 nativeAdViewAdapter) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<ag<?>> list = this$0.f29950a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bg<?> bgVarA = nativeAdViewAdapter.a((ag<?>) next);
            if (bgVarA == null || !bgVarA.b()) {
                break;
            }
        }
        ag agVar = (ag) next;
        this$0.f29953d = agVar != null ? agVar.b() : null;
        return agVar == null;
    }

    public final boolean b() {
        return !a(new Q1(this, 4));
    }

    public /* synthetic */ la(List list, n71 n71Var, Set set, int i) {
        this(list, n71Var, set);
    }

    private final boolean a(q71.a aVar) {
        x61 x61Var = this.f29954e;
        if (x61Var == null) {
            return false;
        }
        this.f29951b.c();
        return aVar.a(x61Var);
    }

    public final boolean c() {
        return !a(new K0(this, 7));
    }

    public final boolean d() {
        return !a(new U1(this, 6));
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final void a(x61 x61Var) {
        this.f29954e = x61Var;
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final kq1 a() {
        return new kq1(this.f29953d, a(new R1(this, 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    @Override // com.yandex.mobile.ads.impl.q71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.a92 a(boolean r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L8
            com.yandex.mobile.ads.impl.la$a r6 = new com.yandex.mobile.ads.impl.la$a
            r6.<init>(r5)
            goto Ld
        L8:
            com.yandex.mobile.ads.impl.la$b r6 = new com.yandex.mobile.ads.impl.la$b
            r6.<init>()
        Ld:
            java.util.Set<? extends java.lang.String> r0 = r4.f29952c
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.f24566h
            java.lang.String r2 = "status"
            kotlin.jvm.internal.l.f(r1, r2)
            java.lang.String r3 = r1.a()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L2a
            boolean r0 = r4.c()
            if (r0 == 0) goto L2a
            if (r5 != 0) goto L2a
            goto Laf
        L2a:
            java.util.Set<? extends java.lang.String> r0 = r4.f29952c
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.i
            kotlin.jvm.internal.l.f(r1, r2)
            java.lang.String r1 = r1.a()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L77
            java.util.List<com.yandex.mobile.ads.impl.ag<?>> r0 = r4.f29950a
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L48
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L48
            goto L77
        L48:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L4d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r0.next()
            com.yandex.mobile.ads.impl.ag r3 = (com.yandex.mobile.ads.impl.ag) r3
            boolean r3 = r3.f()
            if (r3 == 0) goto L4d
            int r1 = r1 + 1
            if (r1 < 0) goto L64
            goto L4d
        L64:
            c9.C2092m.Z()
            r5 = 0
            throw r5
        L69:
            r0 = 2
            if (r1 < r0) goto L77
            boolean r0 = r4.b()
            if (r0 == 0) goto L77
            if (r5 != 0) goto L77
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.i
            goto Laf
        L77:
            java.util.Set<? extends java.lang.String> r5 = r4.f29952c
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.f24569l
            kotlin.jvm.internal.l.f(r1, r2)
            java.lang.String r0 = r1.a()
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L95
            java.lang.Object r5 = r6.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L95
            goto Laf
        L95:
            java.util.Set<? extends java.lang.String> r5 = r4.f29952c
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.f24563e
            kotlin.jvm.internal.l.f(r1, r2)
            java.lang.String r6 = r1.a()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto Lad
            boolean r5 = r4.d()
            if (r5 == 0) goto Lad
            goto Laf
        Lad:
            com.yandex.mobile.ads.impl.a92$a r1 = com.yandex.mobile.ads.impl.a92.a.f24561c
        Laf:
            com.yandex.mobile.ads.impl.a92 r5 = new com.yandex.mobile.ads.impl.a92
            java.lang.String r6 = r4.f29953d
            r5.<init>(r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.la.a(boolean, boolean):com.yandex.mobile.ads.impl.a92");
    }
}
