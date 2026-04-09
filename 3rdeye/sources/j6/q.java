package j6;

import H6.C0685w;
import N7.Ba;
import N7.C1217ic;
import N7.C1259lc;
import N7.R3;
import N7.X9;
import N7.Z;
import android.graphics.drawable.PictureDrawable;
import b9.C1992A;
import i7.C4460a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C5211b;
import w6.C5738b;
import w6.C5739c;
import x6.InterfaceC5773e;

/* compiled from: DivPreloader.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final l f43041e = new l();

    /* renamed from: a, reason: collision with root package name */
    public final C0685w f43042a;

    /* renamed from: b, reason: collision with root package name */
    public final m f43043b;

    /* renamed from: c, reason: collision with root package name */
    public final C5211b f43044c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5773e.a f43045d;

    /* compiled from: DivPreloader.kt */
    public interface a {
        void b(boolean z10);
    }

    /* compiled from: DivPreloader.kt */
    public static final class b extends C5739c {

        /* renamed from: a, reason: collision with root package name */
        public final a f43046a;

        /* renamed from: b, reason: collision with root package name */
        public int f43047b;

        /* renamed from: c, reason: collision with root package name */
        public int f43048c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f43049d;

        /* compiled from: UiThreadHandler.kt */
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int i = bVar.f43047b - 1;
                bVar.f43047b = i;
                if (i == 0 && bVar.f43049d) {
                    bVar.f43046a.b(bVar.f43048c != 0);
                }
            }
        }

        /* compiled from: UiThreadHandler.kt */
        /* renamed from: j6.q$b$b, reason: collision with other inner class name */
        public static final class RunnableC0478b implements Runnable {
            public RunnableC0478b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                bVar.f43048c++;
                bVar.d();
            }
        }

        /* compiled from: UiThreadHandler.kt */
        public static final class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                bVar.f43049d = true;
                if (bVar.f43047b == 0) {
                    bVar.f43046a.b(bVar.f43048c != 0);
                }
            }
        }

        public b(a aVar) {
            this.f43046a = aVar;
        }

        @Override // w6.C5739c
        public final void a() {
            if (!o7.d.a()) {
                o7.d.f44878a.post(new RunnableC0478b());
            } else {
                this.f43048c++;
                d();
            }
        }

        @Override // w6.C5739c
        public final void b(PictureDrawable pictureDrawable) {
            d();
        }

        @Override // w6.C5739c
        public final void c(C5738b c5738b) {
            d();
        }

        public final void d() {
            if (!o7.d.a()) {
                o7.d.f44878a.post(new a());
                return;
            }
            int i = this.f43047b - 1;
            this.f43047b = i;
            if (i == 0 && this.f43049d) {
                this.f43046a.b(this.f43048c != 0);
            }
        }

        public final void e() {
            if (!o7.d.a()) {
                o7.d.f44878a.post(new c());
                return;
            }
            this.f43049d = true;
            if (this.f43047b == 0) {
                this.f43046a.b(this.f43048c != 0);
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    public interface c {

        /* compiled from: DivPreloader.kt */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final r f43053a = new r();
        }

        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    public final class d extends i7.j<C1992A> {

        /* renamed from: a, reason: collision with root package name */
        public final b f43054a;

        /* renamed from: b, reason: collision with root package name */
        public final B6.e f43055b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.d f43056c;

        /* renamed from: d, reason: collision with root package name */
        public final e f43057d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q f43058e;

        public d(q qVar, b bVar, B6.e eVar, A7.d resolver) {
            kotlin.jvm.internal.l.f(resolver, "resolver");
            this.f43058e = qVar;
            this.f43054a = bVar;
            this.f43055b = eVar;
            this.f43056c = resolver;
            this.f43057d = new e();
        }

        @Override // i7.j
        public final /* bridge */ /* synthetic */ C1992A a(Z z10, A7.d dVar) {
            o(z10, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A b(Z.a data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            for (i7.b bVar : C4460a.b(data.f7813c, dVar)) {
                n(bVar.f38460a, bVar.f38461b);
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A c(Z.b data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            R3 r32 = data.f7814c;
            List<Z> list = r32.f6139q;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    n((Z) it.next(), dVar);
                }
            }
            this.f43057d.a(this.f43058e.f43043b.preload(r32, this.f43055b));
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A d(Z.c data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            for (i7.b bVar : C4460a.c(data.f7815c, dVar)) {
                n(bVar.f38460a, bVar.f38461b);
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A f(Z.e data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            Iterator<T> it = C4460a.i(data.f7817c).iterator();
            while (it.hasNext()) {
                n((Z) it.next(), dVar);
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A h(Z.i data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            for (i7.b bVar : C4460a.d(data.f7821c, dVar)) {
                n(bVar.f38460a, bVar.f38461b);
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A j(Z.m data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            Iterator<T> it = data.f7825c.f7743y.iterator();
            while (it.hasNext()) {
                Z z10 = ((X9.a) it.next()).f7747c;
                if (z10 != null) {
                    n(z10, dVar);
                }
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A k(Z.o data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            Iterator<T> it = data.f7827c.f4949q.iterator();
            while (it.hasNext()) {
                n(((Ba.a) it.next()).f4959a, dVar);
            }
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A m(Z.q data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            C1217ic c1217ic = data.f7829c;
            if (c1217ic.f8422A.a(dVar).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = c1217ic.f8438Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1259lc) it.next()).f8741d.a(dVar));
                }
                this.f43058e.f43045d.getClass();
                this.f43057d.a(c.a.f43053a);
            }
            return C1992A.f18074a;
        }

        public final void o(Z data, A7.d resolver) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(resolver, "resolver");
            q qVar = this.f43058e;
            ArrayList<w6.e> arrayListA = qVar.f43042a.a(data, resolver, this.f43054a);
            if (arrayListA != null) {
                for (w6.e reference : arrayListA) {
                    e eVar = this.f43057d;
                    eVar.getClass();
                    kotlin.jvm.internal.l.f(reference, "reference");
                    eVar.f43059a.add(new s(reference));
                }
            }
            qVar.f43044c.e(data.d(), resolver);
        }
    }

    /* compiled from: DivPreloader.kt */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f43059a = new ArrayList();

        public final void a(c reference) {
            kotlin.jvm.internal.l.f(reference, "reference");
            this.f43059a.add(reference);
        }
    }

    public q(C0685w c0685w, m customContainerViewAdapter, C5211b c5211b, InterfaceC5773e.a videoPreloader) {
        kotlin.jvm.internal.l.f(customContainerViewAdapter, "customContainerViewAdapter");
        kotlin.jvm.internal.l.f(videoPreloader, "videoPreloader");
        this.f43042a = c0685w;
        this.f43043b = customContainerViewAdapter;
        this.f43044c = c5211b;
        this.f43045d = videoPreloader;
    }
}
