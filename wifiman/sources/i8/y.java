package i8;

import Yg.J;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.invitation.TeleportInvitationService;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import i8.s;
import i8.y;
import java.util.concurrent.Executor;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import l5.C6544a;
import l9.C6556a;
import mh.InterfaceC6835l;
import t1.AbstractC8021a;
import u1.AbstractC8127a;

/* loaded from: classes3.dex */
public final class y implements s.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49087a;

    /* renamed from: b, reason: collision with root package name */
    private final TeleportInvitationService f49088b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f49089c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f49090d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f49091e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f49092f;

    static final class a implements kg.n {

        /* renamed from: i8.y$a$a, reason: collision with other inner class name */
        static final class C1845a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f49094a;

            /* renamed from: i8.y$a$a$a, reason: collision with other inner class name */
            public static final class C1846a implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ y f49095a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f49096b;

                public C1846a(y yVar, s sVar) {
                    this.f49095a = yVar;
                    this.f49096b = sVar;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        this.f49095a.f49090d.h(new C6556a(this.f49096b));
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            C1845a(y yVar) {
                this.f49094a = yVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(s deepLink) {
                AbstractC6492s.i(deepLink, "deepLink");
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1846a(this.f49094a, deepLink));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(y yVar) {
            yVar.f49089c.h(new C6556a(null));
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Intent intent = (Intent) c6556a.a();
            if (intent == null) {
                return AbstractC5912b.m();
            }
            AbstractC5912b abstractC5912bK = y.this.t(intent).k(new C1845a(y.this));
            final y yVar = y.this;
            return abstractC5912bK.w(new InterfaceC6464a() { // from class: i8.x
                @Override // kg.InterfaceC6464a
                public final void run() {
                    y.a.c(yVar);
                }
            });
        }
    }

    public static final class b implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f49097a;

        public b(Uri uri) {
            this.f49097a = uri;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                s sVarB = s.f49070a.b(this.f49097a);
                if (sVarB != null) {
                    oVar.onSuccess(sVarB);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49098a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TeleportInvitationService.Error.InvitationNotValid ? gg.n.h() : gg.n.i(error);
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f49099a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(TeleportCloud.e.b it) {
            AbstractC6492s.i(it, "it");
            return new s.g(it.a());
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f49100a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return !(it.b() == null) ? gg.i.K0(J.f24997a) : gg.i.j0();
        }
    }

    public static final class f implements gg.q {
        public f() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            s sVar;
            try {
                C6556a c6556a = (C6556a) y.this.f49090d.l2();
                s sVar2 = null;
                if (c6556a != null && (sVar = (s) c6556a.b()) != null) {
                    y.this.f49090d.h(new C6556a(null));
                    sVar2 = sVar;
                }
                if (sVar2 != null) {
                    oVar.onSuccess(sVar2);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class g implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Uri f49103a;

            a(Uri uri) {
                this.f49103a = uri;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(s it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Firebase link " + this.f49103a + " processed as: " + it, null, 2, null);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Uri uri) {
            AbstractC6492s.i(uri, "uri");
            return y.this.m(uri).g(new a(uri));
        }
    }

    public static final class h implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f49104a;

        public h(Intent intent) {
            this.f49104a = intent;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                Uri data = this.f49104a.getData();
                if (data != null) {
                    oVar.onSuccess(data);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class i implements kg.n {

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Uri f49106a;

            a(Uri uri) {
                this.f49106a = uri;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(s it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("Implicit intent " + this.f49106a + " processed as: " + it, null, 2, null);
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Uri uri) {
            AbstractC6492s.i(uri, "uri");
            return y.this.m(uri).g(new a(uri));
        }
    }

    public y(Context applicationContext, TeleportInvitationService teleportInvitationService) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(teleportInvitationService, "teleportInvitationService");
        this.f49087a = applicationContext;
        this.f49088b = teleportInvitationService;
        Fg.a aVarK2 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f49089c = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f49090d = aVarK22;
        gg.i iVarU0 = aVarK22.e1().Y0(Gg.a.a(), false, 1).U0(aVarK2.e1().Y0(Gg.a.a(), false, 1).t0(new a()));
        AbstractC6492s.h(iVarU0, "mergeWith(...)");
        this.f49091e = iVarU0;
        gg.i iVarI2 = iVarU0.I1(e.f49100a).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f49092f = iVarI2;
    }

    private final long l() {
        return AbstractC8127a.a(this.f49087a.getPackageManager().getPackageInfo(this.f49087a.getPackageName(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.n m(Uri uri) {
        if (AbstractC6492s.d(uri.getHost(), "teleport.ui.link")) {
            gg.n nVarP = this.f49088b.b(uri).X().s(c.f49098a).p(d.f49099a);
            AbstractC6492s.h(nVarP, "map(...)");
            return nVarP;
        }
        if (AbstractC6492s.d(uri.getScheme(), "wifiman") && AbstractC6492s.d(uri.getHost(), "deeplink_v1")) {
            gg.n nVarC = gg.n.c(new b(uri));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
        gg.n nVarH = gg.n.h();
        AbstractC6492s.h(nVarH, "empty(...)");
        return nVarH;
    }

    private final gg.n n(final Intent intent) {
        gg.n nVarJ = gg.n.c(new gg.q() { // from class: i8.w
            @Override // gg.q
            public final void a(gg.o oVar) {
                y.o(intent, this, oVar);
            }
        }).j(new g());
        AbstractC6492s.h(nVarJ, "flatMap(...)");
        return nVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Intent intent, final y yVar, final gg.o emitter) {
        AbstractC6492s.i(emitter, "emitter");
        Task taskA = X4.a.a(C6544a.f52387a).a(intent);
        Executor executorH = AbstractC8021a.h(yVar.f49087a);
        final InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: i8.t
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return y.p(this.f49080a, emitter, (V4.b) obj);
            }
        };
        taskA.addOnSuccessListener(executorH, new OnSuccessListener() { // from class: i8.u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                y.q(interfaceC6835l, obj);
            }
        }).addOnFailureListener(AbstractC8021a.h(yVar.f49087a), new OnFailureListener() { // from class: i8.v
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                y.r(emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(y yVar, gg.o oVar, V4.b bVar) {
        if (bVar == null) {
            oVar.a();
        } else if (bVar.b() == 0 || bVar.b() >= yVar.l()) {
            Uri uriA = bVar.a();
            if (uriA != null) {
                oVar.onSuccess(uriA);
            } else {
                Z7.b.h("Firebase link can't be processed as internal deep link. Link: " + bVar.a(), null, 2, null);
                oVar.a();
            }
        } else {
            Z7.b.h("Firebase deep link minimal app version requirements not met. min version: " + bVar.b() + ", current:" + yVar.l(), null, 2, null);
            oVar.a();
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC6835l interfaceC6835l, Object obj) {
        interfaceC6835l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(gg.o oVar, Exception error) {
        AbstractC6492s.i(error, "error");
        Z7.b.j("Firebase universal link fetch failed", error, null, 4, null);
        oVar.a();
    }

    private final gg.n s(Intent intent) {
        gg.n nVarC = gg.n.c(new h(intent));
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        gg.n nVarJ = nVarC.j(new i());
        AbstractC6492s.h(nVarJ, "flatMap(...)");
        return nVarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.n t(Intent intent) {
        gg.n nVarW = n(intent).w(s(intent));
        AbstractC6492s.h(nVarW, "switchIfEmpty(...)");
        return nVarW;
    }

    @Override // i8.s.d
    public gg.n a() {
        gg.n nVarC = gg.n.c(new f());
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        return nVarC;
    }

    @Override // i8.s.d
    public gg.i b() {
        return this.f49092f;
    }

    @Override // i8.s.d
    public void c(Intent intent) {
        AbstractC6492s.i(intent, "intent");
        this.f49089c.h(new C6556a(intent));
    }
}
