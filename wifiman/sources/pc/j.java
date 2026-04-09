package pc;

import W7.c;
import Yg.J;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6835l;
import r3.C7567e;
import tc.InterfaceC8077a;

/* loaded from: classes4.dex */
public final class j implements InterfaceC7283a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f57856f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final LocationManager f57857a;

    /* renamed from: b, reason: collision with root package name */
    private final z f57858b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f57859c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f57860d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f57861e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f57862a = new b();

        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean serviceEnabled, Boolean hasPermissions) {
            AbstractC6492s.i(serviceEnabled, "serviceEnabled");
            AbstractC6492s.i(hasPermissions, "hasPermissions");
            return Boolean.valueOf(serviceEnabled.booleanValue() && hasPermissions.booleanValue());
        }
    }

    static final class c implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f57864a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(W7.c it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final b f57865a = new b();

            b() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable it) {
                AbstractC6492s.i(it, "it");
                Z7.b.j("Location Fetch FAILED", it, null, 4, null);
            }
        }

        /* renamed from: pc.j$c$c, reason: collision with other inner class name */
        static final class C2034c implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C2034c f57866a = new C2034c();

            C2034c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(5000L, TimeUnit.MILLISECONDS);
            }
        }

        static final class d implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f57867a = new d();

            d() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.R(60000L, TimeUnit.MILLISECONDS);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean locationEnabled) {
            AbstractC6492s.i(locationEnabled, "locationEnabled");
            if (locationEnabled.booleanValue()) {
                gg.i iVarZ1 = j.this.f57858b.Q(2000L, TimeUnit.MILLISECONDS).A(a.f57864a).m(b.f57865a).L(C2034c.f57866a).K(d.f57867a).z1(new C6556a(null));
                AbstractC6492s.f(iVarZ1);
                return iVarZ1;
            }
            gg.i iVarK0 = gg.i.K0(new C6556a(null));
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f57868a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            W7.c cVar = (W7.c) c6556a.a();
            Z7.b.h("Location Fetch Result: " + (cVar != null ? cVar.b() : null), null, 2, null);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f57869a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION));
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f57870a = new f();

        f() {
        }

        public final void a(Intent it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            a((Intent) obj);
            return J.f24997a;
        }
    }

    static final class g implements n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(J it) {
            AbstractC6492s.i(it, "it");
            j jVar = j.this;
            return Boolean.valueOf(jVar.n(jVar.f57857a));
        }
    }

    public j(final Context applicationContext, InterfaceC8077a androidOsIntentreceiver, LocationManager locationManager, com.ui.wifiman.model.android.permissions.d permissionManager) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(androidOsIntentreceiver, "androidOsIntentreceiver");
        AbstractC6492s.i(locationManager, "locationManager");
        AbstractC6492s.i(permissionManager, "permissionManager");
        this.f57857a = locationManager;
        z zVarE = z.i(new C() { // from class: pc.b
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                j.o(applicationContext, interfaceC5910A);
            }
        }).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        this.f57858b = zVarE;
        gg.i iVarW = permissionManager.b().N0(e.f57869a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f57859c = iVarW;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        J j10 = J.f24997a;
        gg.i iVarI2 = androidOsIntentreceiver.a(intentFilter).N0(f.f57870a).z1(J.f24997a).N0(new g()).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f57860d = iVarI2;
        gg.i iVarI22 = gg.i.v(a(), iVarW, b.f57862a).W().I1(new c()).f0(d.f57868a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f57861e = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(LocationManager locationManager) {
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Context context, final InterfaceC5910A it) {
        AbstractC6492s.i(it, "it");
        I3.b bVarA = I3.e.a(context);
        AbstractC6492s.h(bVarA, "getFusedLocationProviderClient(...)");
        int iG = C7567e.n().g(context);
        if (iG == 1 || iG == 2 || iG == 3) {
            it.c(new IllegalStateException("Google play services unavailable"));
        }
        Task taskD = bVarA.d();
        final InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: pc.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.p(it, (LocationAvailability) obj);
            }
        };
        taskD.addOnSuccessListener(new OnSuccessListener() { // from class: pc.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                j.q(interfaceC6835l, obj);
            }
        });
        bVarA.d().addOnFailureListener(new OnFailureListener() { // from class: pc.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                j.r(it, exc);
            }
        });
        Task taskC = bVarA.c();
        AbstractC6492s.h(taskC, "getLastLocation(...)");
        taskC.addOnCompleteListener(new OnCompleteListener() { // from class: pc.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                j.s(task);
            }
        });
        final InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: pc.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return j.t(it, (Location) obj);
            }
        };
        taskC.addOnSuccessListener(new OnSuccessListener() { // from class: pc.h
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                j.u(interfaceC6835l2, obj);
            }
        });
        taskC.addOnFailureListener(new OnFailureListener() { // from class: pc.i
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                j.v(it, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(InterfaceC5910A interfaceC5910A, LocationAvailability locationAvailability) {
        if (locationAvailability != null && (!locationAvailability.b())) {
            interfaceC5910A.c(new IllegalStateException("Location services unavailable"));
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC6835l interfaceC6835l, Object obj) {
        interfaceC6835l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(InterfaceC5910A interfaceC5910A, Exception error) {
        AbstractC6492s.i(error, "error");
        interfaceC5910A.c(new IllegalStateException("Location unavailable", error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Task it) {
        AbstractC6492s.i(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(InterfaceC5910A interfaceC5910A, Location location) {
        if (location != null) {
            interfaceC5910A.onSuccess(new W7.c(new c.a(location.getLatitude(), location.getLongitude()), Double.valueOf(location.getAccuracy())));
        } else {
            interfaceC5910A.c(new IllegalStateException("Location unavailable"));
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(InterfaceC6835l interfaceC6835l, Object obj) {
        interfaceC6835l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC5910A interfaceC5910A, Throwable error) {
        AbstractC6492s.i(error, "error");
        interfaceC5910A.c(error);
    }

    @Override // pc.InterfaceC7283a
    public gg.i a() {
        return this.f57860d;
    }

    @Override // pc.InterfaceC7283a
    public gg.i b() {
        return this.f57861e;
    }
}
