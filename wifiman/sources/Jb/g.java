package jb;

import Yg.J;
import Zg.AbstractC3689v;
import cb.EnumC4235a;
import gg.AbstractC5912b;
import gg.D;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import jb.g;
import kg.InterfaceC6464a;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;
import lb.CloudCredentials;
import lb.CreateCredentials;
import lb.UnifiCloudAccess;
import mb.Device;
import mb.UcoreDevice;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.logging.HttpLoggingInterceptor;
import sb.C7931a;
import ub.C8156c;
import wb.C8294d;
import wb.InterfaceC8291a;
import zb.C8726b;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.f f50204a;

    /* renamed from: b, reason: collision with root package name */
    private final Fb.a f50205b;

    /* renamed from: c, reason: collision with root package name */
    private final C7931a f50206c;

    /* renamed from: d, reason: collision with root package name */
    private final n f50207d;

    /* renamed from: e, reason: collision with root package name */
    private CloudCredentials f50208e;

    /* renamed from: f, reason: collision with root package name */
    private z f50209f;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CloudCredentials apply(CloudCredentials cloudCredentials) {
            AbstractC6492s.i(cloudCredentials, "cloudCredentials");
            g.this.q(cloudCredentials);
            return cloudCredentials;
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f50211a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List list) {
            AbstractC6492s.i(list, "list");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Device device = (Device) ((lb.h) it.next()).c();
                if (device != null) {
                    arrayList.add(device);
                }
            }
            return arrayList;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50212a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Device c(UcoreDevice it) {
            AbstractC6492s.i(it, "it");
            return it.getDevice();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List apply(List list) {
            AbstractC6492s.i(list, "list");
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((lb.h) it.next()).d(new InterfaceC6835l() { // from class: jb.h
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return g.c.c((UcoreDevice) obj);
                    }
                }));
            }
            return arrayList;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f50213a;

        d(D d10) {
            this.f50213a = d10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(CloudCredentials it) {
            AbstractC6492s.i(it, "it");
            return this.f50213a;
        }
    }

    public g(EnumC4235a environment, UnifiCloudAccess unifiCloudAccess, String clientAppName, String clientAppVersion, Gb.f storage, InterfaceC8291a interfaceC8291a, Cb.a trustedDeviceHelper, HttpLoggingInterceptor.Level httpLogLevel) throws SecurityException {
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(unifiCloudAccess, "unifiCloudAccess");
        AbstractC6492s.i(clientAppName, "clientAppName");
        AbstractC6492s.i(clientAppVersion, "clientAppVersion");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(trustedDeviceHelper, "trustedDeviceHelper");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        this.f50204a = storage;
        this.f50205b = new Fb.a(1, new InterfaceC6824a() { // from class: jb.e
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return g.s(this.f50201a);
            }
        });
        C7931a c7931a = new C7931a();
        this.f50206c = c7931a;
        Object objB = new C8294d(unifiCloudAccess.getApiGateway().getUrl(), null, AbstractC3689v.o(c7931a, new Db.a(environment.getSsoConfig(), storage), new C8726b(clientAppName, clientAppVersion), new Db.d(trustedDeviceHelper)), null, null, null, C8156c.f62925a.d(), interfaceC8291a, httpLogLevel, 58, null).d().b(n.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f50207d = (n) objB;
    }

    private final z h(boolean z10) {
        z zVarL = this.f50207d.b(new CreateCredentials(true, z10)).A(new a()).e().l(new InterfaceC6464a() { // from class: jb.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                g.i(this.f50200a);
            }
        });
        AbstractC6492s.h(zVarL, "doFinally(...)");
        this.f50209f = zVarL;
        return zVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(g gVar) {
        gVar.f50209f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CloudCredentials j(boolean z10, g gVar) {
        if (z10) {
            gVar.f50208e = null;
        }
        return gVar.f50208e;
    }

    public static /* synthetic */ z l(g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return gVar.k(z10);
    }

    private final z o() {
        z zVarJ = z.j(new q() { // from class: jb.c
            @Override // kg.q
            public final Object get() {
                return g.p(this.f50199a);
            }
        });
        AbstractC6492s.h(zVarJ, "defer(...)");
        return zVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D p(g gVar) {
        z zVar = gVar.f50209f;
        return zVar == null ? gVar.h(false) : zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(CloudCredentials cloudCredentials) {
        this.f50208e = cloudCredentials;
        this.f50206c.b(cloudCredentials);
    }

    private final z r(D d10) {
        z zVarL = l(this, false, 1, null).s(new d(d10)).L(this.f50205b);
        AbstractC6492s.h(zVarL, "retryWhen(...)");
        return zVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J s(g gVar) {
        gVar.g();
        return J.f24997a;
    }

    public final AbstractC5912b f() {
        AbstractC5912b abstractC5912bY = l(this, false, 1, null).y();
        AbstractC6492s.h(abstractC5912bY, "ignoreElement(...)");
        return abstractC5912bY;
    }

    public final void g() {
        this.f50208e = null;
    }

    public final z k(final boolean z10) {
        z zVarX = gg.n.m(new Callable() { // from class: jb.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.j(z10, this);
            }
        }).x(o());
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    public final z m() {
        z zVarA = n().A(b.f50211a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    public final z n() {
        z zVarA = r(this.f50207d.a()).A(c.f50212a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }
}
