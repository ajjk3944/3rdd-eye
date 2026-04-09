package e7;

import e7.InterfaceC4322a;
import kotlin.jvm.internal.C5261a;
import p9.InterfaceC5480a;

/* compiled from: HistogramConfiguration.kt */
/* loaded from: classes.dex */
public interface j extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37745a = new a();

    /* compiled from: HistogramConfiguration.kt */
    public static class a implements j {

        /* renamed from: b, reason: collision with root package name */
        public final B7.e f37746b = new B7.e(b.f37750b);

        /* renamed from: c, reason: collision with root package name */
        public final B7.e f37747c = new B7.e(C0450a.f37749g);

        /* renamed from: d, reason: collision with root package name */
        public final B7.e f37748d;

        /* compiled from: HistogramConfiguration.kt */
        /* renamed from: e7.j$a$a, reason: collision with other inner class name */
        public static final class C0450a extends kotlin.jvm.internal.m implements InterfaceC5480a<InterfaceC4322a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0450a f37749g = new C0450a(0);

            @Override // p9.InterfaceC5480a
            public final InterfaceC4322a invoke() {
                return new InterfaceC4322a.C0448a();
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        public /* synthetic */ class b extends kotlin.jvm.internal.k implements InterfaceC5480a<n> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f37750b = new b(0, n.class, "<init>", "<init>()V", 0);

            @Override // p9.InterfaceC5480a
            public final n invoke() {
                return new n();
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        public /* synthetic */ class c extends C5261a implements InterfaceC5480a<o> {

            /* renamed from: h, reason: collision with root package name */
            public static final c f37751h = new c();

            @Override // p9.InterfaceC5480a
            public final o invoke() {
                return new o(0);
            }
        }

        /* compiled from: HistogramConfiguration.kt */
        public /* synthetic */ class d extends kotlin.jvm.internal.k implements InterfaceC5480a<e7.c> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f37752b = new d(0, e7.c.class, "<init>", "<init>()V", 0);

            @Override // p9.InterfaceC5480a
            public final e7.c invoke() {
                return new e7.c();
            }
        }

        public a() {
            new B7.e(d.f37752b);
            this.f37748d = new B7.e(c.f37751h);
        }

        @Override // e7.j
        public final B7.e a() {
            return this.f37747c;
        }

        @Override // e7.j
        public final B7.e b() {
            return this.f37746b;
        }

        @Override // e7.l
        public final B7.e c() {
            return this.f37748d;
        }
    }

    B7.e a();

    B7.e b();
}
