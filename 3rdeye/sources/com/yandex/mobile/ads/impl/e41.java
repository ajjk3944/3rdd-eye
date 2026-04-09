package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.q71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class e41 implements q71 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f26660a;

    /* renamed from: b, reason: collision with root package name */
    private final n71 f26661b;

    /* renamed from: c, reason: collision with root package name */
    private String f26662c;

    /* renamed from: d, reason: collision with root package name */
    private x61 f26663d;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10) {
            super(0);
            this.f26665c = z10;
        }

        @Override // p9.InterfaceC5480a
        public final Boolean invoke() {
            return Boolean.valueOf(e41.this.d() && !this.f26665c);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<Boolean> {
        public b() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final Boolean invoke() {
            return Boolean.valueOf(e41.this.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e41(List<? extends ag<?>> assets, n71 nativeAdsConfiguration) {
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(nativeAdsConfiguration, "nativeAdsConfiguration");
        this.f26660a = assets;
        this.f26661b = nativeAdsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(e41 this$0, x61 it) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        List<ag<?>> list = this$0.f26660a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ag<?> agVar = (ag) it2.next();
            x61 x61Var = this$0.f26663d;
            bg<?> bgVarA = x61Var != null ? x61Var.a(agVar) : null;
            if (bgVarA != null && bgVarA.d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(e41 this$0, x61 it) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        List<ag<?>> list = this$0.f26660a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ag<?> agVar = (ag) next;
            x61 x61Var = this$0.f26663d;
            bg<?> bgVarA = x61Var != null ? x61Var.a(agVar) : null;
            if (bgVarA == null) {
                bgVarA = null;
            }
            if (bgVarA == null || !bgVarA.a(agVar.d())) {
                break;
            }
        }
        ag agVar2 = (ag) next;
        this$0.f26662c = agVar2 != null ? agVar2.b() : null;
        return agVar2 == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(e41 this$0, x61 it) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        List<ag<?>> list = this$0.f26660a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ag<?> agVar = (ag) next;
            x61 x61Var = this$0.f26663d;
            bg<?> bgVarA = x61Var != null ? x61Var.a(agVar) : null;
            if (bgVarA == null || !bgVarA.e()) {
                break;
            }
        }
        ag agVar2 = (ag) next;
        this$0.f26662c = agVar2 != null ? agVar2.b() : null;
        return agVar2 == null;
    }

    public final boolean d() {
        return !a(new X1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(e41 this$0, x61 it) {
        Object next;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(it, "it");
        List<ag<?>> list = this$0.f26660a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).f()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ag<?> agVar = (ag) next;
            x61 x61Var = this$0.f26663d;
            bg<?> bgVarA = x61Var != null ? x61Var.a(agVar) : null;
            if (bgVarA == null || !bgVarA.b()) {
                break;
            }
        }
        ag agVar2 = (ag) next;
        this$0.f26662c = agVar2 != null ? agVar2.b() : null;
        return agVar2 == null;
    }

    private final boolean a(q71.a aVar) {
        x61 x61Var = this.f26663d;
        if (x61Var == null) {
            return false;
        }
        this.f26661b.c();
        return aVar.a(x61Var);
    }

    public final boolean b() {
        return !a(new Q1(this, 3));
    }

    public final boolean c() {
        return !a(new K0(this, 5));
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final void a(x61 x61Var) {
        this.f26663d = x61Var;
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final kq1 a() {
        return new kq1(this.f26662c, a(new U1(this, 4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    @Override // com.yandex.mobile.ads.impl.q71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.a92 a(boolean r4, boolean r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L8
            com.yandex.mobile.ads.impl.e41$a r5 = new com.yandex.mobile.ads.impl.e41$a
            r5.<init>(r4)
            goto Ld
        L8:
            com.yandex.mobile.ads.impl.e41$b r5 = new com.yandex.mobile.ads.impl.e41$b
            r5.<init>()
        Ld:
            java.util.List<com.yandex.mobile.ads.impl.ag<?>> r0 = r3.f26660a
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1a
            goto L49
        L1a:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            com.yandex.mobile.ads.impl.ag r2 = (com.yandex.mobile.ads.impl.ag) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L1f
            int r1 = r1 + 1
            if (r1 < 0) goto L36
            goto L1f
        L36:
            c9.C2092m.Z()
            r4 = 0
            throw r4
        L3b:
            r0 = 2
            if (r1 < r0) goto L49
            boolean r0 = r3.b()
            if (r0 == 0) goto L49
            if (r4 != 0) goto L49
            com.yandex.mobile.ads.impl.a92$a r4 = com.yandex.mobile.ads.impl.a92.a.i
            goto L63
        L49:
            java.lang.Object r4 = r5.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L58
            com.yandex.mobile.ads.impl.a92$a r4 = com.yandex.mobile.ads.impl.a92.a.f24569l
            goto L63
        L58:
            boolean r4 = r3.c()
            if (r4 == 0) goto L61
            com.yandex.mobile.ads.impl.a92$a r4 = com.yandex.mobile.ads.impl.a92.a.f24563e
            goto L63
        L61:
            com.yandex.mobile.ads.impl.a92$a r4 = com.yandex.mobile.ads.impl.a92.a.f24561c
        L63:
            com.yandex.mobile.ads.impl.a92 r5 = new com.yandex.mobile.ads.impl.a92
            java.lang.String r0 = r3.f26662c
            r5.<init>(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e41.a(boolean, boolean):com.yandex.mobile.ads.impl.a92");
    }
}
