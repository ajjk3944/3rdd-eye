package Mc;

import Mc.a;
import Zc.e;
import Zc.f;
import gg.C;
import gg.InterfaceC5910A;
import gg.i;
import gg.z;
import inet.ipaddr.g;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc.InterfaceC6794a;

/* loaded from: classes4.dex */
public final class b implements Mc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13097c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6794a f13098a;

    /* renamed from: b, reason: collision with root package name */
    private final i f13099b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Mc.b$b, reason: collision with other inner class name */
    static final class C0515b implements n {

        /* renamed from: Mc.b$b$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f13101a = new a();

            /* renamed from: Mc.b$b$a$a, reason: collision with other inner class name */
            static final class C0516a implements n {

                /* renamed from: a, reason: collision with root package name */
                public static final C0516a f13102a = new C0516a();

                C0516a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(Object it) {
                    AbstractC6492s.i(it, "it");
                    return i.d2(5000L, TimeUnit.MILLISECONDS);
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(i it) {
                AbstractC6492s.i(it, "it");
                return it.p0(C0516a.f13102a);
            }
        }

        /* renamed from: Mc.b$b$b, reason: collision with other inner class name */
        public static final class C0517b implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f13103a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f13104b;

            public C0517b(e eVar, b bVar) {
                this.f13103a = eVar;
                this.f13104b = bVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                g gVarB;
                try {
                    ArrayList arrayList = new ArrayList();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    e.a aVarB = this.f13103a.b();
                    if (aVarB == null) {
                        aVarB = this.f13103a.c();
                    }
                    if (aVarB != null && (gVarB = aVarB.b()) != null) {
                        arrayList.add(new a.C0514a(gVarB, this.f13104b.f13098a.getName(), this.f13104b.f13098a.b(), this.f13104b.f13098a.c(), this.f13103a.e(), this.f13104b.f13098a.e(), this.f13104b.f13098a.a(), this.f13104b.f13098a.d(), jCurrentTimeMillis, 10000 + jCurrentTimeMillis));
                    }
                    interfaceC5910A.onSuccess(arrayList);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        C0515b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(e networkConnection) {
            AbstractC6492s.i(networkConnection, "networkConnection");
            z zVarI = z.i(new C0517b(networkConnection, b.this));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI.K(a.f13101a);
        }
    }

    public b(f networkConnectionManager, InterfaceC6794a androidDeviceInfo) {
        AbstractC6492s.i(networkConnectionManager, "networkConnectionManager");
        AbstractC6492s.i(androidDeviceInfo, "androidDeviceInfo");
        this.f13098a = androidDeviceInfo;
        i iVarI2 = networkConnectionManager.getState().I1(new C0515b()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f13099b = iVarI2;
    }

    @Override // Ec.t
    public i b() {
        return this.f13099b;
    }
}
