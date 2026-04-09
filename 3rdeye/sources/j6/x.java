package j6;

import H6.C0672i;
import H6.C0685w;
import N7.C1217ic;
import N7.C1259lc;
import N7.Z;
import b9.C1992A;
import j6.q;
import java.util.ArrayList;
import java.util.Iterator;
import k2.C5211b;
import x6.InterfaceC5773e;
import z6.C5865d;

/* compiled from: DivViewDataPreloader.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C0685w f43064a;

    /* renamed from: b, reason: collision with root package name */
    public final m f43065b;

    /* renamed from: c, reason: collision with root package name */
    public final C5211b f43066c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5773e.a f43067d;

    /* compiled from: DivViewDataPreloader.kt */
    public final class a extends i7.i<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        public final q.b f43068b;

        /* renamed from: c, reason: collision with root package name */
        public final q.a f43069c;

        /* renamed from: d, reason: collision with root package name */
        public final q.e f43070d = new q.e();

        public a(q.b bVar, q.a aVar) {
            this.f43068b = bVar;
            this.f43069c = aVar;
        }

        @Override // i7.i
        public final /* bridge */ /* synthetic */ C1992A d(C0672i c0672i, Z z10, C5865d c5865d) {
            j(c0672i, z10, c5865d);
            return C1992A.f18074a;
        }

        @Override // i7.i
        public final C1992A g(Z.b data, C0672i c0672i, C5865d path) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(path, "path");
            super.g(data, c0672i, path);
            x xVar = x.this;
            q.a aVar = this.f43069c;
            this.f43070d.a(xVar.f43065b.preload(data.f7814c, aVar));
            return C1992A.f18074a;
        }

        @Override // i7.i
        public final C1992A i(Z.q data, C0672i c0672i, C5865d path) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(path, "path");
            j(c0672i, data, path);
            A7.d resolver = c0672i.f2147b;
            kotlin.jvm.internal.l.f(resolver, "resolver");
            C1217ic c1217ic = data.f7829c;
            if (c1217ic.f8422A.a(resolver).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = c1217ic.f8438Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1259lc) it.next()).f8741d.a(resolver));
                }
                x.this.f43067d.getClass();
                this.f43070d.a(q.c.a.f43053a);
            }
            return C1992A.f18074a;
        }

        public final void j(C0672i context, Z data, C5865d path) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(path, "path");
            x xVar = x.this;
            C0685w c0685w = xVar.f43064a;
            q.b bVar = this.f43068b;
            A7.d dVar = context.f2147b;
            ArrayList arrayListA = c0685w.a(data, dVar, bVar);
            if (arrayListA != null) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    w6.e reference = (w6.e) it.next();
                    q.e eVar = this.f43070d;
                    eVar.getClass();
                    kotlin.jvm.internal.l.f(reference, "reference");
                    eVar.f43059a.add(new s(reference));
                }
            }
            xVar.f43066c.e(data.d(), dVar);
        }
    }

    public x(C0685w c0685w, m customContainerViewAdapter, C5211b c5211b, InterfaceC5773e.a videoPreloader) {
        kotlin.jvm.internal.l.f(customContainerViewAdapter, "customContainerViewAdapter");
        kotlin.jvm.internal.l.f(videoPreloader, "videoPreloader");
        this.f43064a = c0685w;
        this.f43065b = customContainerViewAdapter;
        this.f43066c = c5211b;
        this.f43067d = videoPreloader;
    }
}
