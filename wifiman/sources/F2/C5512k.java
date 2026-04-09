package f2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC4003a;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC4011i;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.K;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import b2.AbstractC4056a;
import b2.C4057b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import q2.C7416d;
import q2.C7417e;
import q2.InterfaceC7418f;

/* renamed from: f2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5512k implements InterfaceC4017o, S, InterfaceC4011i, InterfaceC7418f {

    /* renamed from: o, reason: collision with root package name */
    public static final a f46731o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f46732a;

    /* renamed from: b, reason: collision with root package name */
    private r f46733b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f46734c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC4013k.b f46735d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5497C f46736e;

    /* renamed from: f, reason: collision with root package name */
    private final String f46737f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f46738g;

    /* renamed from: h, reason: collision with root package name */
    private C4018p f46739h;

    /* renamed from: i, reason: collision with root package name */
    private final C7417e f46740i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46741j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f46742k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f46743l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC4013k.b f46744m;

    /* renamed from: n, reason: collision with root package name */
    private final P.c f46745n;

    /* renamed from: f2.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5512k b(a aVar, Context context, r rVar, Bundle bundle, AbstractC4013k.b bVar, InterfaceC5497C interfaceC5497C, String str, Bundle bundle2, int i10, Object obj) {
            String str2;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            AbstractC4013k.b bVar2 = (i10 & 8) != 0 ? AbstractC4013k.b.CREATED : bVar;
            InterfaceC5497C interfaceC5497C2 = (i10 & 16) != 0 ? null : interfaceC5497C;
            if ((i10 & 32) != 0) {
                String string = UUID.randomUUID().toString();
                AbstractC6492s.h(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return aVar.a(context, rVar, bundle3, bVar2, interfaceC5497C2, str2, (i10 & 64) != 0 ? null : bundle2);
        }

        public final C5512k a(Context context, r destination, Bundle bundle, AbstractC4013k.b hostLifecycleState, InterfaceC5497C interfaceC5497C, String id2, Bundle bundle2) {
            AbstractC6492s.i(destination, "destination");
            AbstractC6492s.i(hostLifecycleState, "hostLifecycleState");
            AbstractC6492s.i(id2, "id");
            return new C5512k(context, destination, bundle, hostLifecycleState, interfaceC5497C, id2, bundle2, null);
        }

        private a() {
        }
    }

    /* renamed from: f2.k$b */
    private static final class b extends AbstractC4003a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7418f owner) {
            super(owner, null);
            AbstractC6492s.i(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractC4003a
        protected N f(String key, Class modelClass, androidx.lifecycle.E handle) {
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(handle, "handle");
            return new c(handle);
        }
    }

    /* renamed from: f2.k$c */
    private static final class c extends N {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.lifecycle.E f46746b;

        public c(androidx.lifecycle.E handle) {
            AbstractC6492s.i(handle, "handle");
            this.f46746b = handle;
        }

        public final androidx.lifecycle.E X() {
            return this.f46746b;
        }
    }

    /* renamed from: f2.k$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            Context context = C5512k.this.f46732a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            C5512k c5512k = C5512k.this;
            return new K(application, c5512k, c5512k.d());
        }
    }

    /* renamed from: f2.k$e */
    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.E invoke() {
            if (!C5512k.this.f46741j) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (C5512k.this.O().b() != AbstractC4013k.b.DESTROYED) {
                return ((c) new P(C5512k.this, new b(C5512k.this)).a(c.class)).X();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ C5512k(Context context, r rVar, Bundle bundle, AbstractC4013k.b bVar, InterfaceC5497C interfaceC5497C, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, rVar, bundle, bVar, interfaceC5497C, str, bundle2);
    }

    private final K e() {
        return (K) this.f46742k.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        return this.f46739h;
    }

    public final Bundle d() {
        if (this.f46734c == null) {
            return null;
        }
        return new Bundle(this.f46734c);
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof C5512k)) {
            return false;
        }
        C5512k c5512k = (C5512k) obj;
        if (!AbstractC6492s.d(this.f46737f, c5512k.f46737f) || !AbstractC6492s.d(this.f46733b, c5512k.f46733b) || !AbstractC6492s.d(O(), c5512k.O()) || !AbstractC6492s.d(t(), c5512k.t())) {
            return false;
        }
        if (!AbstractC6492s.d(this.f46734c, c5512k.f46734c)) {
            Bundle bundle = this.f46734c;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj2 = this.f46734c.get(str);
                    Bundle bundle2 = c5512k.f46734c;
                    if (!AbstractC6492s.d(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final r f() {
        return this.f46733b;
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public P.c g() {
        return this.f46745n;
    }

    @Override // androidx.lifecycle.InterfaceC4011i
    public AbstractC4056a h() {
        C4057b c4057b = new C4057b(null, 1, null);
        Context context = this.f46732a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            c4057b.c(P.a.f31628h, application);
        }
        c4057b.c(H.f31605a, this);
        c4057b.c(H.f31606b, this);
        Bundle bundleD = d();
        if (bundleD != null) {
            c4057b.c(H.f31607c, bundleD);
        }
        return c4057b;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f46737f.hashCode() * 31) + this.f46733b.hashCode();
        Bundle bundle = this.f46734c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.f46734c.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + O().hashCode()) * 31) + t().hashCode();
    }

    public final String i() {
        return this.f46737f;
    }

    public final AbstractC4013k.b j() {
        return this.f46744m;
    }

    public final androidx.lifecycle.E k() {
        return (androidx.lifecycle.E) this.f46743l.getValue();
    }

    public final void l(AbstractC4013k.a event) {
        AbstractC6492s.i(event, "event");
        this.f46735d = event.getTargetState();
        q();
    }

    public final void m(Bundle outBundle) {
        AbstractC6492s.i(outBundle, "outBundle");
        this.f46740i.e(outBundle);
    }

    public final void n(r rVar) {
        AbstractC6492s.i(rVar, "<set-?>");
        this.f46733b = rVar;
    }

    @Override // androidx.lifecycle.S
    public Q o() {
        if (!this.f46741j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (O().b() == AbstractC4013k.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        InterfaceC5497C interfaceC5497C = this.f46736e;
        if (interfaceC5497C != null) {
            return interfaceC5497C.l(this.f46737f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void p(AbstractC4013k.b maxState) {
        AbstractC6492s.i(maxState, "maxState");
        this.f46744m = maxState;
        q();
    }

    public final void q() {
        if (!this.f46741j) {
            this.f46740i.c();
            this.f46741j = true;
            if (this.f46736e != null) {
                H.c(this);
            }
            this.f46740i.d(this.f46738g);
        }
        if (this.f46735d.ordinal() < this.f46744m.ordinal()) {
            this.f46739h.m(this.f46735d);
        } else {
            this.f46739h.m(this.f46744m);
        }
    }

    @Override // q2.InterfaceC7418f
    public C7416d t() {
        return this.f46740i.b();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5512k.class.getSimpleName());
        sb2.append('(' + this.f46737f + ')');
        sb2.append(" destination=");
        sb2.append(this.f46733b);
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }

    private C5512k(Context context, r rVar, Bundle bundle, AbstractC4013k.b bVar, InterfaceC5497C interfaceC5497C, String str, Bundle bundle2) {
        this.f46732a = context;
        this.f46733b = rVar;
        this.f46734c = bundle;
        this.f46735d = bVar;
        this.f46736e = interfaceC5497C;
        this.f46737f = str;
        this.f46738g = bundle2;
        this.f46739h = new C4018p(this);
        this.f46740i = C7417e.f58360d.a(this);
        this.f46742k = Yg.n.b(new d());
        this.f46743l = Yg.n.b(new e());
        this.f46744m = AbstractC4013k.b.INITIALIZED;
        this.f46745n = e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5512k(C5512k entry, Bundle bundle) {
        this(entry.f46732a, entry.f46733b, bundle, entry.f46735d, entry.f46736e, entry.f46737f, entry.f46738g);
        AbstractC6492s.i(entry, "entry");
        this.f46735d = entry.f46735d;
        p(entry.f46744m);
    }
}
