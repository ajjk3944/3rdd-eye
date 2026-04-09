package androidx.compose.foundation;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import T.o1;
import T.z1;
import Yg.J;
import androidx.compose.runtime.snapshots.g;
import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import s.EnumC7839L;
import sh.AbstractC7978m;
import w.y;
import w.z;
import y.AbstractC8557l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public final class o implements y {

    /* renamed from: i, reason: collision with root package name */
    public static final c f28379i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    private static final InterfaceC4182k f28380j = AbstractC4183l.a(a.f28389a, b.f28390a);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3545n0 f28381a;

    /* renamed from: e, reason: collision with root package name */
    private float f28385e;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3545n0 f28382b = AbstractC3528f1.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8558m f28383c = AbstractC8557l.a();

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC3545n0 f28384d = AbstractC3528f1.a(MPv3.MAX_MESSAGE_ID);

    /* renamed from: f, reason: collision with root package name */
    private final y f28386f = z.a(new f());

    /* renamed from: g, reason: collision with root package name */
    private final z1 f28387g = o1.e(new e());

    /* renamed from: h, reason: collision with root package name */
    private final z1 f28388h = o1.e(new d());

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28389a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(InterfaceC4184m interfaceC4184m, o oVar) {
            return Integer.valueOf(oVar.m());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28390a = new b();

        b() {
            super(1);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return o.f28380j;
        }

        private c() {
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() > 0);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() < o.this.l());
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {
        f() {
            super(1);
        }

        public final Float a(float f10) {
            float fM = o.this.m() + f10 + o.this.f28385e;
            float fJ = AbstractC7978m.j(fM, 0.0f, o.this.l());
            boolean z10 = fM == fJ;
            float fM2 = fJ - o.this.m();
            int iRound = Math.round(fM2);
            o oVar = o.this;
            oVar.o(oVar.m() + iRound);
            o.this.f28385e = fM2 - iRound;
            if (!z10) {
                f10 = fM2;
            }
            return Float.valueOf(f10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public o(int i10) {
        this.f28381a = AbstractC3528f1.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int i10) {
        this.f28381a.l(i10);
    }

    @Override // w.y
    public boolean a() {
        return this.f28386f.a();
    }

    @Override // w.y
    public Object c(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objC = this.f28386f.c(enumC7839L, interfaceC6839p, interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : J.f24997a;
    }

    @Override // w.y
    public boolean d() {
        return ((Boolean) this.f28388h.getValue()).booleanValue();
    }

    @Override // w.y
    public boolean e() {
        return ((Boolean) this.f28387g.getValue()).booleanValue();
    }

    @Override // w.y
    public float f(float f10) {
        return this.f28386f.f(f10);
    }

    public final InterfaceC8558m k() {
        return this.f28383c;
    }

    public final int l() {
        return this.f28384d.e();
    }

    public final int m() {
        return this.f28381a.e();
    }

    public final void n(int i10) {
        this.f28384d.l(i10);
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            if (m() > i10) {
                o(i10);
            }
            J j10 = J.f24997a;
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        } catch (Throwable th2) {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            throw th2;
        }
    }

    public final void p(int i10) {
        this.f28382b.l(i10);
    }
}
