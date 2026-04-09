package c0;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import Yg.J;
import Zg.U;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4177f implements InterfaceC4176e {

    /* renamed from: d, reason: collision with root package name */
    public static final c f33606d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC4182k f33607e = AbstractC4183l.a(a.f33611a, b.f33612a);

    /* renamed from: a, reason: collision with root package name */
    private final Map f33608a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f33609b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4179h f33610c;

    /* renamed from: c0.f$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33611a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(InterfaceC4184m interfaceC4184m, C4177f c4177f) {
            return c4177f.h();
        }
    }

    /* renamed from: c0.f$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33612a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4177f invoke(Map map) {
            return new C4177f(map);
        }
    }

    /* renamed from: c0.f$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return C4177f.f33607e;
        }

        private c() {
        }
    }

    /* renamed from: c0.f$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final Object f33613a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33614b = true;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC4179h f33615c;

        /* renamed from: c0.f$d$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4177f f33617a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4177f c4177f) {
                super(1);
                this.f33617a = c4177f;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                InterfaceC4179h interfaceC4179hG = this.f33617a.g();
                return Boolean.valueOf(interfaceC4179hG != null ? interfaceC4179hG.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.f33613a = obj;
            this.f33615c = AbstractC4181j.a((Map) C4177f.this.f33608a.get(obj), new a(C4177f.this));
        }

        public final InterfaceC4179h a() {
            return this.f33615c;
        }

        public final void b(Map map) {
            if (this.f33614b) {
                Map mapB = this.f33615c.b();
                if (mapB.isEmpty()) {
                    map.remove(this.f33613a);
                } else {
                    map.put(this.f33613a, mapB);
                }
            }
        }

        public final void c(boolean z10) {
            this.f33614b = z10;
        }
    }

    /* renamed from: c0.f$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f33619b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f33620c;

        /* renamed from: c0.f$e$a */
        public static final class a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f33621a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4177f f33622b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f33623c;

            public a(d dVar, C4177f c4177f, Object obj) {
                this.f33621a = dVar;
                this.f33622b = c4177f;
                this.f33623c = obj;
            }

            @Override // T.K
            public void dispose() {
                this.f33621a.b(this.f33622b.f33608a);
                this.f33622b.f33609b.remove(this.f33623c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, d dVar) {
            super(1);
            this.f33619b = obj;
            this.f33620c = dVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            boolean zContainsKey = C4177f.this.f33609b.containsKey(this.f33619b);
            Object obj = this.f33619b;
            if (!zContainsKey) {
                C4177f.this.f33608a.remove(this.f33619b);
                C4177f.this.f33609b.put(this.f33619b, this.f33620c);
                return new a(this.f33620c, C4177f.this, this.f33619b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* renamed from: c0.f$f, reason: collision with other inner class name */
    static final class C1172f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f33625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f33626c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33627d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1172f(Object obj, InterfaceC6839p interfaceC6839p, int i10) {
            super(2);
            this.f33625b = obj;
            this.f33626c = interfaceC6839p;
            this.f33627d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            C4177f.this.d(this.f33625b, this.f33626c, interfaceC3540l, L0.a(this.f33627d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public C4177f(Map map) {
        this.f33608a = map;
        this.f33609b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map h() {
        Map mapX = U.x(this.f33608a);
        Iterator it = this.f33609b.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(mapX);
        }
        if (mapX.isEmpty()) {
            return null;
        }
        return mapX;
    }

    @Override // c0.InterfaceC4176e
    public void d(Object obj, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1198538093);
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
                AbstractC3546o.Q(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            interfaceC3540lR.y(207, obj);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                InterfaceC4179h interfaceC4179h = this.f33610c;
                if (!(interfaceC4179h != null ? interfaceC4179h.a(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objF = new d(obj);
                interfaceC3540lR.K(objF);
            }
            d dVar = (d) objF;
            AbstractC3561w.a(AbstractC4181j.d().d(dVar.a()), interfaceC6839p, interfaceC3540lR, (i11 & 112) | I0.f20869i);
            J j10 = J.f24997a;
            boolean zL = interfaceC3540lR.l(this) | interfaceC3540lR.l(obj) | interfaceC3540lR.l(dVar);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new e(obj, dVar);
                interfaceC3540lR.K(objF2);
            }
            O.c(j10, (InterfaceC6835l) objF2, interfaceC3540lR, 6);
            interfaceC3540lR.d();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new C1172f(obj, interfaceC6839p, i10));
        }
    }

    @Override // c0.InterfaceC4176e
    public void f(Object obj) {
        d dVar = (d) this.f33609b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f33608a.remove(obj);
        }
    }

    public final InterfaceC4179h g() {
        return this.f33610c;
    }

    public final void i(InterfaceC4179h interfaceC4179h) {
        this.f33610c = interfaceC4179h;
    }

    public /* synthetic */ C4177f(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
