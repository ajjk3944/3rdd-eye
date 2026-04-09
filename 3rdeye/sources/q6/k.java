package Q6;

import H6.C0671h;
import H6.C0675l;
import Q6.g;
import b9.C1992A;
import java.util.ArrayList;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11349a;

    /* renamed from: b, reason: collision with root package name */
    public final E7.b f11350b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11351c;

    /* renamed from: d, reason: collision with root package name */
    public final g f11352d;

    /* renamed from: e, reason: collision with root package name */
    public C0675l f11353e;

    /* renamed from: f, reason: collision with root package name */
    public i f11354f;

    /* compiled from: ErrorVisualMonitor.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<C0671h, C1992A> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [Q6.b] */
        @Override // p9.l
        public final C1992A invoke(C0671h c0671h) {
            C0671h it = c0671h;
            kotlin.jvm.internal.l.f(it, "it");
            g gVar = k.this.f11352d;
            gVar.getClass();
            b bVar = gVar.f11333g;
            if (bVar != null) {
                bVar.close();
            }
            final c cVarA = gVar.f11327a.a(it.f2145b, it.f2144a);
            final g.a observer = gVar.f11334h;
            kotlin.jvm.internal.l.f(observer, "observer");
            cVarA.f11317a.add(observer);
            cVarA.c();
            observer.invoke(cVarA.f11321e, cVarA.f11320d);
            gVar.f11333g = new j6.d() { // from class: Q6.b
                @Override // java.lang.AutoCloseable, java.io.Closeable
                public final void close() {
                    c cVar = cVarA;
                    g.a observer2 = observer;
                    kotlin.jvm.internal.l.f(observer2, "$observer");
                    cVar.f11317a.remove(observer2);
                }
            };
            return C1992A.f18074a;
        }
    }

    public k(d dVar, C0675l divView, boolean z10, boolean z11, E7.b bVar) {
        kotlin.jvm.internal.l.f(divView, "divView");
        this.f11349a = z11;
        this.f11350b = bVar;
        this.f11351c = z10 || z11;
        this.f11352d = new g(dVar, divView, z10);
        b();
    }

    public final void a(C0675l root) {
        kotlin.jvm.internal.l.f(root, "root");
        this.f11353e = root;
        if (this.f11351c) {
            i iVar = this.f11354f;
            if (iVar != null) {
                iVar.close();
            }
            this.f11354f = new i(root, this.f11352d, this.f11349a);
        }
    }

    public final void b() {
        if (!this.f11351c) {
            i iVar = this.f11354f;
            if (iVar != null) {
                iVar.close();
            }
            this.f11354f = null;
            return;
        }
        a aVar = new a();
        E7.b bVar = this.f11350b;
        aVar.invoke((C0671h) bVar.f1475b);
        ((ArrayList) bVar.f1476c).add(aVar);
        C0675l c0675l = this.f11353e;
        if (c0675l != null) {
            a(c0675l);
        }
    }
}
