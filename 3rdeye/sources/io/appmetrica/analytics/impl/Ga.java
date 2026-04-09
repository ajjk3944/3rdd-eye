package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* loaded from: classes3.dex */
public final class Ga {

    /* renamed from: F, reason: collision with root package name */
    public static volatile Ga f39501F;

    /* renamed from: C, reason: collision with root package name */
    public volatile C4609fa f39504C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f39507a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C5052wg f39508b;

    /* renamed from: c, reason: collision with root package name */
    public volatile W6 f39509c;

    /* renamed from: e, reason: collision with root package name */
    public volatile C4576e3 f39511e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C5055wj f39512f;

    /* renamed from: g, reason: collision with root package name */
    public volatile T f39513g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C4627g2 f39514h;
    public volatile PlatformIdentifiers i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Ff f39515j;

    /* renamed from: k, reason: collision with root package name */
    public volatile V3 f39516k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C4769lf f39517l;

    /* renamed from: m, reason: collision with root package name */
    public volatile uo f39518m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C4851oj f39519n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Yb f39520o;

    /* renamed from: p, reason: collision with root package name */
    public C5082xl f39521p;

    /* renamed from: r, reason: collision with root package name */
    public volatile C5031vk f39523r;

    /* renamed from: w, reason: collision with root package name */
    public volatile InterfaceC4560dc f39528w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C4699in f39529x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C4905ql f39530y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Id f39531z;

    /* renamed from: q, reason: collision with root package name */
    public final Fa f39522q = new Fa();

    /* renamed from: s, reason: collision with root package name */
    public final C4767ld f39524s = new C4767ld();

    /* renamed from: t, reason: collision with root package name */
    public final C4819nd f39525t = new C4819nd();

    /* renamed from: u, reason: collision with root package name */
    public final C4595em f39526u = new C4595em();

    /* renamed from: v, reason: collision with root package name */
    public final C4722jk f39527v = new C4722jk();

    /* renamed from: A, reason: collision with root package name */
    public final C4510be f39502A = new C4510be();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f39503B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C4904qk f39505D = new C4904qk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f39506E = new ReferenceHolder();

    /* renamed from: d, reason: collision with root package name */
    public final C4852ok f39510d = new C4852ok();

    public Ga(Context context) {
        this.f39507a = context;
    }

    public static void a(Context context) {
        if (f39501F == null) {
            synchronized (Ga.class) {
                try {
                    if (f39501F == null) {
                        f39501F = new Ga(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Ga j() {
        return f39501F;
    }

    public final C4699in A() {
        C4699in c4699in;
        C4699in c4699in2 = this.f39529x;
        if (c4699in2 != null) {
            return c4699in2;
        }
        synchronized (this) {
            try {
                c4699in = this.f39529x;
                if (c4699in == null) {
                    c4699in = new C4699in(this.f39507a);
                    this.f39529x = c4699in;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4699in;
    }

    public final synchronized uo B() {
        try {
            if (this.f39518m == null) {
                this.f39518m = new uo(this.f39507a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39518m;
    }

    public final void C() {
        if (this.f39515j == null) {
            synchronized (this) {
                try {
                    if (this.f39515j == null) {
                        Om omA = Nm.a(C4873pf.class);
                        Context context = this.f39507a;
                        ProtobufStateStorage<Object> protobufStateStorageA = omA.a(context, omA.c(context));
                        C4873pf c4873pf = (C4873pf) protobufStateStorageA.read();
                        this.f39515j = new Ff(this.f39507a, protobufStateStorageA, new C5051wf(), new C4821nf(c4873pf), new Ef(), new C5026vf(this.f39507a), new Af(j().x()), new C4899qf(), c4873pf, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final T b() {
        T t10;
        T t11 = this.f39513g;
        if (t11 != null) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = this.f39513g;
                if (t10 == null) {
                    t10 = new T(this.f39507a, this.f39510d.a(), this.f39526u.b());
                    this.f39526u.a(t10);
                    this.f39513g = t10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    public final C4627g2 c() {
        C4627g2 c4627g2;
        C4627g2 c4627g22 = this.f39514h;
        if (c4627g22 != null) {
            return c4627g22;
        }
        synchronized (this) {
            try {
                c4627g2 = this.f39514h;
                if (c4627g2 == null) {
                    c4627g2 = new C4627g2(this.f39507a, AbstractC4653h2.a());
                    this.f39514h = c4627g2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4627g2;
    }

    public final C4782m2 d() {
        return k().f40415b;
    }

    public final V3 e() {
        if (this.f39516k == null) {
            synchronized (this) {
                try {
                    if (this.f39516k == null) {
                        Om omA = Nm.a(O3.class);
                        Context context = this.f39507a;
                        ProtobufStateStorage<Object> protobufStateStorageA = omA.a(context, omA.c(context));
                        this.f39516k = new V3(this.f39507a, protobufStateStorageA, new W3(), new J3(), new Z3(), new C4567dj(this.f39507a), new X3(x()), new K3(), (O3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f39516k;
    }

    public final Context f() {
        return this.f39507a;
    }

    public final W6 g() {
        if (this.f39509c == null) {
            synchronized (this) {
                try {
                    if (this.f39509c == null) {
                        this.f39509c = new W6(new V6(x()));
                    }
                } finally {
                }
            }
        }
        return this.f39509c;
    }

    public final C4609fa h() {
        C4609fa c4609fa;
        C4609fa c4609fa2 = this.f39504C;
        if (c4609fa2 != null) {
            return c4609fa2;
        }
        synchronized (this) {
            try {
                c4609fa = this.f39504C;
                if (c4609fa == null) {
                    c4609fa = new C4609fa(this.f39507a);
                    this.f39504C = c4609fa;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4609fa;
    }

    public final PermissionExtractor i() {
        C4905ql c4905ql = this.f39530y;
        if (c4905ql != null) {
            return c4905ql;
        }
        synchronized (this) {
            try {
                C4905ql c4905ql2 = this.f39530y;
                if (c4905ql2 != null) {
                    return c4905ql2;
                }
                C4905ql c4905ql3 = new C4905ql(o().f41882c.getAskForPermissionStrategy());
                this.f39530y = c4905ql3;
                return c4905ql3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Yb k() {
        Yb yb;
        Yb yb2 = this.f39520o;
        if (yb2 != null) {
            return yb2;
        }
        synchronized (this) {
            try {
                yb = this.f39520o;
                if (yb == null) {
                    yb = new Yb(new C4499b3(this.f39507a, this.f39510d.a()), new C4782m2());
                    this.f39520o = yb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yb;
    }

    public final InterfaceC4560dc l() {
        InterfaceC4560dc c4611fc;
        InterfaceC4560dc interfaceC4560dc = this.f39528w;
        if (interfaceC4560dc != null) {
            return interfaceC4560dc;
        }
        synchronized (this) {
            try {
                c4611fc = this.f39528w;
                if (c4611fc == null) {
                    Context context = this.f39507a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    c4611fc = locationClient == null ? new C4611fc() : new C4585ec(context, new C4766lc(), locationClient);
                    this.f39528w = c4611fc;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4611fc;
    }

    public final InterfaceC4560dc m() {
        return l();
    }

    public final C4819nd n() {
        return this.f39525t;
    }

    public final C5031vk o() {
        C5031vk c5031vk;
        C5031vk c5031vk2 = this.f39523r;
        if (c5031vk2 != null) {
            return c5031vk2;
        }
        synchronized (this) {
            try {
                c5031vk = this.f39523r;
                if (c5031vk == null) {
                    c5031vk = new C5031vk();
                    this.f39523r = c5031vk;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5031vk;
    }

    public final Id p() {
        Id id;
        Id id2 = this.f39531z;
        if (id2 != null) {
            return id2;
        }
        synchronized (this) {
            try {
                id = this.f39531z;
                if (id == null) {
                    id = new Id(this.f39507a, new C4675ho());
                    this.f39531z = id;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return id;
    }

    public final C4510be q() {
        return this.f39502A;
    }

    public final PlatformIdentifiers r() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(b(), c());
                    this.i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final Ff s() {
        C();
        return this.f39515j;
    }

    public final C5052wg t() {
        if (this.f39508b == null) {
            synchronized (this) {
                try {
                    if (this.f39508b == null) {
                        this.f39508b = new C5052wg(this.f39507a, f39501F.B().f41823c);
                    }
                } finally {
                }
            }
        }
        return this.f39508b;
    }

    public final C4851oj u() {
        C4851oj c4851oj;
        C4851oj c4851oj2 = this.f39519n;
        if (c4851oj2 != null) {
            return c4851oj2;
        }
        synchronized (this) {
            try {
                c4851oj = this.f39519n;
                if (c4851oj == null) {
                    c4851oj = new C4851oj(this.f39507a);
                    this.f39519n = c4851oj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4851oj;
    }

    public final synchronized C5055wj v() {
        return this.f39512f;
    }

    public final C4852ok w() {
        return this.f39510d;
    }

    public final C4769lf x() {
        if (this.f39517l == null) {
            synchronized (this) {
                try {
                    if (this.f39517l == null) {
                        this.f39517l = new C4769lf(C4916r7.a(this.f39507a).c());
                    }
                } finally {
                }
            }
        }
        return this.f39517l;
    }

    public final synchronized X2 y() {
        try {
            if (this.f39521p == null) {
                C5082xl c5082xl = new C5082xl(this.f39507a);
                this.f39521p = c5082xl;
                this.f39526u.a(c5082xl);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39521p;
    }

    public final C4595em z() {
        return this.f39526u;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f39503B.getActivationBarrier();
    }
}
