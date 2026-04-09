package Va;

import Ii.AbstractC3059i;
import Ii.J;
import Ii.N;
import Yg.m;
import Yg.n;
import Yg.v;
import android.content.Context;
import android.content.SharedPreferences;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class b implements Va.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f23293d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final J f23294b;

    /* renamed from: c, reason: collision with root package name */
    private final m f23295c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Va.b$b, reason: collision with other inner class name */
    static final class C0865b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f23296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0865b(UUID uuid) {
            super(0);
            this.f23296a = uuid;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Device ID generated: " + this.f23296a;
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23297a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f23297a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                return b.this.i().getString("systemAccountOwner", null);
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23299a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23300b;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = b.this.new d(interfaceC5380e);
            dVar.f23300b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            UUID uuidJ;
            AbstractC5467b.g();
            if (this.f23299a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            N n10 = (N) this.f23300b;
            b bVar = b.this;
            synchronized (n10) {
                uuidJ = null;
                try {
                    uuidJ = UUID.fromString(bVar.i().getString("id", null));
                } catch (ClassCastException | IllegalArgumentException unused) {
                }
                if (uuidJ == null) {
                    uuidJ = bVar.j();
                }
            }
            return uuidJ;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23302a;

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new e(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f23302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                return b.this.i().getString("localAccountOwner", null);
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class f extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23304a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23306c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f23307a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f23307a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Android Account storage owner set: " + this.f23307a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23306c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new f(this.f23306c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f23304a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            b.this.i().edit().putString("systemAccountOwner", this.f23306c).apply();
            Ua.a.e(new a(this.f23306c));
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f23308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.f23308a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Local Account storage owner set: " + this.f23308a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23309a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(0);
            this.f23309a = context;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return this.f23309a.getSharedPreferences("ui_sso_prefs", 0);
        }
    }

    public b(Context context, J dispatcherIO) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        this.f23294b = dispatcherIO;
        this.f23295c = n.b(new h(context));
    }

    private final UUID h() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Ua.a.e(new C0865b(uuidRandomUUID));
        AbstractC6492s.f(uuidRandomUUID);
        return uuidRandomUUID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences i() {
        return (SharedPreferences) this.f23295c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID j() {
        UUID uuidH = h();
        i().edit().putString("id", uuidH.toString()).apply();
        return uuidH;
    }

    @Override // Qa.a
    public Object a(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f23294b, new c(null), interfaceC5380e);
    }

    @Override // Qa.a
    public Object b(String str, InterfaceC5380e interfaceC5380e) {
        i().edit().putString("localAccountOwner", str).apply();
        Ua.a.e(new g(str));
        return Yg.J.f24997a;
    }

    @Override // Qa.a
    public Object c(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f23294b, new e(null), interfaceC5380e);
    }

    @Override // Qa.a
    public Object d(String str, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(this.f23294b, new f(str, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }

    @Override // Ta.a
    public Object e(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f23294b, new d(null), interfaceC5380e);
    }
}
