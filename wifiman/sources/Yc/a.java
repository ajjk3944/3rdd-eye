package Yc;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import gg.AbstractC5912b;
import gg.i;
import gg.r;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class a extends g {

    /* renamed from: f, reason: collision with root package name */
    public static final b f24857f = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f24858d;

    /* renamed from: e, reason: collision with root package name */
    private final i f24859e;

    /* renamed from: Yc.a$a, reason: collision with other inner class name */
    private static final class C0947a extends Exception implements Wc.d {
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f24860a = new c();

        /* renamed from: Yc.a$c$a, reason: collision with other inner class name */
        static final class C0948a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0948a f24861a = new C0948a();

            C0948a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof C0947a ? i.K0(error) : i.k0(error);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it.p0(C0948a.f24861a);
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24862a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!(it.b() == null));
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f24863a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(Boolean networkAvailable) {
            AbstractC6492s.i(networkAvailable, "networkAvailable");
            return networkAvailable.booleanValue() ? gg.n.h() : gg.n.y(3000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f24864a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long it) {
            AbstractC6492s.i(it, "it");
            return AbstractC5912b.D(new C0947a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConnectivityManager connectivityManager) {
        super("Cellular", new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), connectivityManager);
        AbstractC6492s.i(connectivityManager, "connectivityManager");
        AbstractC5912b abstractC5912bT0 = super.e().N0(d.f24862a).W().M1(e.f24863a).t0(f.f24864a);
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        this.f24858d = abstractC5912bT0;
        i iVarI2 = super.e().U0(abstractC5912bT0).p1(c.f24860a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f24859e = iVarI2;
    }

    @Override // Yc.g, Yc.c
    public i e() {
        return this.f24859e;
    }
}
