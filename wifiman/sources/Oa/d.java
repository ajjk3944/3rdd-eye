package Oa;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.J;
import Ii.N;
import Yg.v;
import Zg.AbstractC3689v;
import android.accounts.Account;
import android.accounts.AccountManager;
import ch.AbstractC4260a;
import com.ui.sso.account.UIAccountManager;
import com.ui.sso.auth.a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class d implements UIAccountManager {

    /* renamed from: g, reason: collision with root package name */
    public static final a f17707g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f17708a;

    /* renamed from: b, reason: collision with root package name */
    private final AccountManager f17709b;

    /* renamed from: c, reason: collision with root package name */
    private final Oa.a f17710c;

    /* renamed from: d, reason: collision with root package name */
    private final J f17711d;

    /* renamed from: e, reason: collision with root package name */
    private final Na.c f17712e;

    /* renamed from: f, reason: collision with root package name */
    private UIAccountManager.a f17713f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private final String f17714a;

        public b(String message) {
            AbstractC6492s.i(message, "message");
            this.f17714a = message;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f17714a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17715a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f17717c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17718a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "removeAccountExplicitly failed due to DENIED access to AccountManager";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(UUID uuid, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17717c = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new c(this.f17717c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17715a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            UUID uuid = this.f17717c;
            synchronized (dVar) {
                try {
                    dVar.u();
                    Na.b bVarX = dVar.x(uuid);
                    try {
                        if (!dVar.f17709b.removeAccountExplicitly(dVar.z(bVarX)) && dVar.t(dVar.A(bVarX))) {
                            throw new UIAccountManager.Error.IO("Failed to delete system account", null, 2, null);
                        }
                        Yg.J j10 = Yg.J.f24997a;
                    } catch (SecurityException e10) {
                        Ua.a.f(a.f17718a, e10);
                        throw new UIAccountManager.Error.AccessRestricted(e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d.this.f17710c.b();
            d.this.f17710c.a(this.f17717c);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: Oa.d$d, reason: collision with other inner class name */
    static final class C0613d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SecurityException f17720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0613d(SecurityException securityException) {
            super(0);
            this.f17720b = securityException;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - DENIED access to '" + d.this.w() + "' account type - " + this.f17720b.getMessage();
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f17721a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - integrity check started";
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17722a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10) {
            super(0);
            this.f17722a = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - integrity check finished in " + this.f17722a + " ms";
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17723a;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((Na.b) obj).c(), ((Na.b) obj2).c());
            }
        }

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new g(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List listY;
            AbstractC5467b.g();
            if (this.f17723a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            synchronized (dVar) {
                dVar.u();
                listY = dVar.y();
            }
            return AbstractC3689v.X0(listY, new a());
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Account f17725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Account account) {
            super(0);
            this.f17725a = account;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove invalid account '" + this.f17725a.name + "' while ensuring accounts integrity";
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Account f17726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Account account) {
            super(0);
            this.f17726a = account;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove invalid account '" + this.f17726a.name + "' while ensuring accounts integrity";
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17727a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f17729c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17730d;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17731a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "getAuthTokens failed due to DENIED access to AccountManager";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17729c = uuid;
            this.f17730d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new j(this.f17729c, this.f17730d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strPeekAuthToken;
            AbstractC5467b.g();
            if (this.f17727a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            UUID uuid = this.f17729c;
            String str = this.f17730d;
            synchronized (dVar) {
                dVar.u();
                try {
                    strPeekAuthToken = dVar.f17709b.peekAuthToken(dVar.z(dVar.x(uuid)), str);
                } catch (SecurityException e10) {
                    Ua.a.f(a.f17731a, e10);
                    throw new UIAccountManager.Error.AccessRestricted(e10);
                }
            }
            return strPeekAuthToken;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((j) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Account f17732a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Account account) {
            super(0);
            this.f17732a = account;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - getUiAccount '" + this.f17732a.name + "'";
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Account f17733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Account account, long j10) {
            super(0);
            this.f17733a = account;
            this.f17734b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - getUiAccount '" + this.f17733a.name + "' finished in " + this.f17734b + " ms";
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17735a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f17737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17738d;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17739a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "invalidateAuthToken failed due to DENIED access to AccountManager";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f17740a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f17741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UUID uuid, String str) {
                super(0);
                this.f17740a = uuid;
                this.f17741b = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17740a + " token '" + this.f17741b + "' invalidated";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17737c = uuid;
            this.f17738d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new m(this.f17737c, this.f17738d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17735a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            UUID uuid = this.f17737c;
            String str = this.f17738d;
            synchronized (dVar) {
                dVar.u();
                try {
                    String strPeekAuthToken = dVar.f17709b.peekAuthToken(dVar.z(dVar.x(uuid)), str);
                    if (strPeekAuthToken == null) {
                        throw new UIAccountManager.Error.NotFound("No Auth to invalidate found for acc" + uuid + ", type: " + str);
                    }
                    dVar.f17709b.invalidateAuthToken(dVar.w(), strPeekAuthToken);
                    Yg.J j10 = Yg.J.f24997a;
                } catch (SecurityException e10) {
                    Ua.a.f(a.f17739a, e10);
                    throw new UIAccountManager.Error.AccessRestricted(e10);
                }
            }
            Ua.a.e(new b(this.f17737c, this.f17738d));
            d.this.f17710c.a(this.f17737c);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((m) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17742a;

        n(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new n(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17742a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                d.this.u();
                return kotlin.coroutines.jvm.internal.b.a(true);
            } catch (UIAccountManager.Error.AccessRestricted unused) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((n) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Na.b f17744a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Na.b bVar) {
            super(0);
            this.f17744a = bVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - account " + this.f17744a.c() + " user data update started";
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Na.b f17745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Na.b bVar, long j10) {
            super(0);
            this.f17745a = bVar;
            this.f17746b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "AccountManager - account " + this.f17745a.c() + " user data update finished in " + this.f17746b + " ms";
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17747a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Na.b f17749c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Na.b f17750a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Na.b bVar) {
                super(0);
                this.f17750a = bVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17750a.c() + " update started";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Na.b f17751a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Na.b bVar) {
                super(0);
                this.f17751a = bVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17751a.c() + " update requested, but account data seems to be the same";
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Na.b f17752a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Na.b bVar) {
                super(0);
                this.f17752a = bVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17752a.c() + " name migration necessary!! (email changed)";
            }
        }

        /* renamed from: Oa.d$q$d, reason: collision with other inner class name */
        static final class C0614d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0614d f17753a = new C0614d();

            C0614d() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "addAccountExplicitly failed due to DENIED access to AccountManager";
            }
        }

        static final class e extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Na.b f17754a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f17755b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Na.b bVar, long j10) {
                super(0);
                this.f17754a = bVar;
                this.f17755b = j10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17754a.c() + " update finished in " + (System.currentTimeMillis() - this.f17755b) + " ms";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Na.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17749c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new q(this.f17749c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Na.b bVarX;
            AbstractC5467b.g();
            if (this.f17747a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            Na.b bVar = this.f17749c;
            synchronized (dVar) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ua.a.e(new a(bVar));
                dVar.u();
                dVar.v();
                try {
                    bVarX = dVar.x(bVar.c());
                } catch (UIAccountManager.Error.NotFound unused) {
                    bVarX = null;
                }
                if (AbstractC6492s.d(bVarX, bVar)) {
                    Ua.a.e(new b(bVar));
                    return Yg.J.f24997a;
                }
                boolean z10 = (bVarX == null || AbstractC6492s.d(dVar.A(bVarX), dVar.A(bVar))) ? false : true;
                if (z10) {
                    Ua.a.e(new c(bVar));
                }
                Account accountZ = dVar.z(bVar);
                if (bVarX == null || z10) {
                    try {
                        if (!dVar.f17709b.addAccountExplicitly(accountZ, null, null) && !dVar.t(dVar.A(bVar))) {
                            throw new UIAccountManager.Error.IO("Failed to update system account", null, 2, null);
                        }
                    } catch (SecurityException e10) {
                        Ua.a.f(C0614d.f17753a, e10);
                        throw new UIAccountManager.Error.AccessRestricted(e10);
                    }
                }
                dVar.D(bVar);
                if (bVarX != null && z10) {
                    dVar.C(bVarX, bVar);
                }
                Ua.a.e(new e(bVar, jCurrentTimeMillis));
                Yg.J j10 = Yg.J.f24997a;
                d.this.f17710c.b();
                return Yg.J.f24997a;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((q) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17756a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f17758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f17760e;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f17761a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "updateAuthToken failed due to DENIED access to AccountManager";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f17762a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f17763b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(UUID uuid, String str) {
                super(0);
                this.f17762a = uuid;
                this.f17763b = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "AccountManager - account " + this.f17762a + " token '" + this.f17763b + "' updated";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(UUID uuid, String str, String str2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17758c = uuid;
            this.f17759d = str;
            this.f17760e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return d.this.new r(this.f17758c, this.f17759d, this.f17760e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17756a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d dVar = d.this;
            UUID uuid = this.f17758c;
            String str = this.f17759d;
            String str2 = this.f17760e;
            synchronized (dVar) {
                dVar.u();
                try {
                    dVar.f17709b.setAuthToken(dVar.z(dVar.x(uuid)), str, str2);
                    Yg.J j10 = Yg.J.f24997a;
                } catch (SecurityException e10) {
                    Ua.a.f(a.f17761a, e10);
                    throw new UIAccountManager.Error.AccessRestricted(e10);
                }
            }
            Ua.a.e(new b(this.f17758c, this.f17759d));
            d.this.f17710c.a(this.f17758c);
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((r) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public d(String accountType, AccountManager accountManager, Oa.a accountManagerChangeRegistry, J dispatcherIO) {
        AbstractC6492s.i(accountType, "accountType");
        AbstractC6492s.i(accountManager, "accountManager");
        AbstractC6492s.i(accountManagerChangeRegistry, "accountManagerChangeRegistry");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        this.f17708a = accountType;
        this.f17709b = accountManager;
        this.f17710c = accountManagerChangeRegistry;
        this.f17711d = dispatcherIO;
        this.f17712e = Na.c.ANDROID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A(Na.b bVar) {
        return bVar.b();
    }

    private final Na.b B(Account account) throws b {
        Ua.a.e(new k(account));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                String userData = this.f17709b.getUserData(account, "uuid");
                if (userData == null) {
                    throw new b("UUID unavailable");
                }
                UUID uuidFromString = UUID.fromString(userData);
                String userData2 = this.f17709b.getUserData(account, "username");
                if (userData2 == null) {
                    throw new b("Username unavailable");
                }
                String userData3 = this.f17709b.getUserData(account, "email");
                if (userData3 == null) {
                    throw new b("Email unavailable");
                }
                String userData4 = this.f17709b.getUserData(account, "avatar");
                AbstractC6492s.f(uuidFromString);
                Na.b bVar = new Na.b(uuidFromString, userData3, userData2, userData4);
                Ua.a.e(new l(account, System.currentTimeMillis() - jCurrentTimeMillis));
                return bVar;
            } catch (IllegalArgumentException unused) {
                throw new b("UUID format error");
            }
        } catch (SecurityException e10) {
            throw new UIAccountManager.Error.AccessRestricted(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Na.b bVar, Na.b bVar2) {
        Account accountZ = z(bVar);
        Account accountZ2 = z(bVar2);
        for (a.EnumC1372a enumC1372a : a.EnumC1372a.getEntries()) {
            String strPeekAuthToken = this.f17709b.peekAuthToken(accountZ, enumC1372a.getId());
            if (strPeekAuthToken != null) {
                AbstractC6492s.f(strPeekAuthToken);
                this.f17709b.setAuthToken(accountZ2, enumC1372a.getId(), strPeekAuthToken);
            }
        }
        this.f17709b.removeAccountExplicitly(accountZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Na.b bVar) {
        Account accountZ = z(bVar);
        Ua.a.e(new o(bVar));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f17709b.setUserData(accountZ, "uuid", bVar.c().toString());
            this.f17709b.setUserData(accountZ, "username", bVar.d());
            this.f17709b.setUserData(accountZ, "email", bVar.b());
            this.f17709b.setUserData(accountZ, "avatar", bVar.a());
            Ua.a.e(new p(bVar, System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (SecurityException e10) {
            throw new UIAccountManager.Error.AccessRestricted(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(String str) {
        Account account;
        Account[] accountsByType = this.f17709b.getAccountsByType(this.f17708a);
        AbstractC6492s.h(accountsByType, "getAccountsByType(...)");
        int length = accountsByType.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                account = null;
                break;
            }
            account = accountsByType[i10];
            if (AbstractC6492s.d(account.name, str)) {
                break;
            }
            i10++;
        }
        return account != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        try {
            this.f17709b.clearPassword(new Account(UUID.randomUUID().toString(), this.f17708a));
        } catch (SecurityException e10) {
            Ua.a.e(new C0613d(e10));
            throw new UIAccountManager.Error.AccessRestricted(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        Ua.a.e(e.f17721a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        y();
        Ua.a.e(new f(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Na.b x(UUID uuid) {
        Object next;
        Iterator it = y().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC6492s.d(((Na.b) next).c(), uuid)) {
                break;
            }
        }
        Na.b bVar = (Na.b) next;
        if (bVar != null) {
            return bVar;
        }
        throw new UIAccountManager.Error.NotFound("No Account " + uuid + " found ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List y() {
        List listC = AbstractC3689v.c();
        Account[] accountsByType = this.f17709b.getAccountsByType(this.f17708a);
        AbstractC6492s.h(accountsByType, "getAccountsByType(...)");
        for (Account account : accountsByType) {
            try {
                try {
                    AbstractC6492s.f(account);
                    listC.add(B(account));
                } catch (b unused) {
                    if (!this.f17709b.removeAccountExplicitly(account)) {
                        Ua.a.d(new h(account), null, 2, null);
                    }
                }
            } catch (Throwable th2) {
                Ua.a.c(new i(account), th2);
            }
        }
        return AbstractC3689v.a(listC);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object b(Na.b bVar, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f17711d, new q(bVar, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object c(UUID uuid, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f17711d, new c(uuid, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Na.c d() {
        return this.f17712e;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object e(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f17711d, new n(null), interfaceC5380e);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object f(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f17711d, new g(null), interfaceC5380e);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public void g(UIAccountManager.a aVar) {
        if (aVar != null) {
            this.f17710c.d(aVar);
        } else {
            UIAccountManager.a aVar2 = this.f17713f;
            if (aVar2 != null) {
                this.f17710c.c(aVar2);
            }
        }
        this.f17713f = aVar;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object h(UUID uuid, String str, String str2, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f17711d, new r(uuid, str, str2, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object i(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f17711d, new j(uuid, str, null), interfaceC5380e);
    }

    @Override // com.ui.sso.account.UIAccountManager
    public Object j(UUID uuid, String str, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f17711d, new m(uuid, str, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    public final String w() {
        return this.f17708a;
    }

    public final Account z(Na.b acc) {
        AbstractC6492s.i(acc, "acc");
        return new Account(A(acc), this.f17708a);
    }

    public /* synthetic */ d(String str, AccountManager accountManager, Oa.a aVar, J j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, accountManager, (i10 & 4) != 0 ? Oa.a.f17689a.a() : aVar, (i10 & 8) != 0 ? C3048c0.b() : j10);
    }
}
