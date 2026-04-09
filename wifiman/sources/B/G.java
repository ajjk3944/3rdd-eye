package B;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.t1;
import c0.AbstractC4181j;
import c0.AbstractC4183l;
import c0.InterfaceC4176e;
import c0.InterfaceC4179h;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
final class G implements InterfaceC4179h, InterfaceC4176e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f882d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4179h f883a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f884b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f885c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4179h f886a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC4179h interfaceC4179h) {
            super(1);
            this.f886a = interfaceC4179h;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            InterfaceC4179h interfaceC4179h = this.f886a;
            return Boolean.valueOf(interfaceC4179h != null ? interfaceC4179h.a(obj) : true);
        }
    }

    public static final class b {

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final a f887a = new a();

            a() {
                super(2);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke(InterfaceC4184m interfaceC4184m, G g10) {
                Map mapB = g10.b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            }
        }

        /* renamed from: B.G$b$b, reason: collision with other inner class name */
        static final class C0033b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4179h f888a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033b(InterfaceC4179h interfaceC4179h) {
                super(1);
                this.f888a = interfaceC4179h;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(Map map) {
                return new G(this.f888a, map);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a(InterfaceC4179h interfaceC4179h) {
            return AbstractC4183l.a(a.f887a, new C0033b(interfaceC4179h));
        }

        private b() {
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f890b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ G f891a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f892b;

            public a(G g10, Object obj) {
                this.f891a = g10;
                this.f892b = obj;
            }

            @Override // T.K
            public void dispose() {
                this.f891a.f885c.add(this.f892b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f890b = obj;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            G.this.f885c.remove(this.f890b);
            return new a(G.this, this.f890b);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f894b = obj;
            this.f895c = interfaceC6839p;
            this.f896d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            G.this.d(this.f894b, this.f895c, interfaceC3540l, L0.a(this.f896d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public G(InterfaceC4179h interfaceC4179h) {
        this.f883a = interfaceC4179h;
        this.f884b = t1.d(null, null, 2, null);
        this.f885c = new LinkedHashSet();
    }

    @Override // c0.InterfaceC4179h
    public boolean a(Object obj) {
        return this.f883a.a(obj);
    }

    @Override // c0.InterfaceC4179h
    public Map b() {
        InterfaceC4176e interfaceC4176eH = h();
        if (interfaceC4176eH != null) {
            Iterator it = this.f885c.iterator();
            while (it.hasNext()) {
                interfaceC4176eH.f(it.next());
            }
        }
        return this.f883a.b();
    }

    @Override // c0.InterfaceC4179h
    public Object c(String str) {
        return this.f883a.c(str);
    }

    @Override // c0.InterfaceC4176e
    public void d(Object obj, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-697180401);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-697180401, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            InterfaceC4176e interfaceC4176eH = h();
            if (interfaceC4176eH == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i12 = i11 & 14;
            interfaceC4176eH.d(obj, interfaceC6839p, interfaceC3540lR, i11 & 126);
            boolean zL = interfaceC3540lR.l(this) | interfaceC3540lR.l(obj);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new c(obj);
                interfaceC3540lR.K(objF);
            }
            T.O.c(obj, (InterfaceC6835l) objF, interfaceC3540lR, i12);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(obj, interfaceC6839p, i10));
        }
    }

    @Override // c0.InterfaceC4179h
    public InterfaceC4179h.a e(String str, InterfaceC6824a interfaceC6824a) {
        return this.f883a.e(str, interfaceC6824a);
    }

    @Override // c0.InterfaceC4176e
    public void f(Object obj) {
        InterfaceC4176e interfaceC4176eH = h();
        if (interfaceC4176eH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        interfaceC4176eH.f(obj);
    }

    public final InterfaceC4176e h() {
        return (InterfaceC4176e) this.f884b.getValue();
    }

    public final void i(InterfaceC4176e interfaceC4176e) {
        this.f884b.setValue(interfaceC4176e);
    }

    public G(InterfaceC4179h interfaceC4179h, Map map) {
        this(AbstractC4181j.a(map, new a(interfaceC4179h)));
    }
}
