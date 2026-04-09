package A8;

import Te.W;
import Te.X;
import Yg.J;
import android.graphics.Color;
import b8.AbstractC4075b;
import com.ubnt.mlkit.product.a;
import com.ui.wifiman.model.signalmapper.floorplan.b;
import gc.EnumC5895b;
import h7.C5954a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import mh.InterfaceC6835l;
import od.InterfaceC7122d;
import od.f;
import od.i;

/* loaded from: classes3.dex */
public final class z extends h7.g {

    /* renamed from: r, reason: collision with root package name */
    public static final a f538r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f539s = 8;

    /* renamed from: j, reason: collision with root package name */
    private final com.ui.wifiman.model.signalmapper.floorplan.b f540j;

    /* renamed from: k, reason: collision with root package name */
    private final EnumC5895b f541k;

    /* renamed from: l, reason: collision with root package name */
    private final r f542l;

    /* renamed from: m, reason: collision with root package name */
    private final s f543m;

    /* renamed from: n, reason: collision with root package name */
    private final t f544n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6835l f545o;

    /* renamed from: p, reason: collision with root package name */
    private EnumC5895b f546p;

    /* renamed from: q, reason: collision with root package name */
    private final int f547q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f548a;

        static {
            int[] iArr = new int[EnumC5895b.values().length];
            try {
                iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5895b.LATENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f548a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C5954a renderer) {
        super(renderer);
        AbstractC6492s.i(renderer, "renderer");
        EnumC5895b enumC5895b = EnumC5895b.SIGNAL;
        this.f541k = enumC5895b;
        this.f542l = new r();
        this.f543m = new s();
        this.f544n = new t();
        this.f545o = o0(enumC5895b);
        this.f546p = enumC5895b;
        this.f540j = new com.ui.wifiman.model.signalmapper.floorplan.b(0.1f);
    }

    private final int e0(int i10) {
        return Color.argb(216, Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    private final int f0(W w10, float f10) {
        X xA = w10.a(f10);
        return g0(AbstractC6737x0.j(xA.b()), AbstractC6737x0.j(xA.a()), xA.d(f10));
    }

    private final int g0(int i10, int i11, float f10) {
        float fMax = Math.max(0.0f, Math.min(1.0f, f10));
        float f11 = 1.0f - fMax;
        return Color.argb(255, (int) ((Color.red(i10) * f11) + (Color.red(i11) * fMax)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * fMax)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * fMax)));
    }

    private final int i0(AbstractC4075b abstractC4075b) {
        return abstractC4075b != null ? f0(Ue.r.f22430a.a(), abstractC4075b.b()) : this.f547q;
    }

    private final int l0(W7.f fVar) {
        return fVar != null ? f0(Ue.r.f22430a.c(), fVar.b()) : this.f547q;
    }

    private final int n0(W7.a aVar) {
        return aVar != null ? f0(Ue.r.f22430a.b(), aVar.c()) : this.f547q;
    }

    private final InterfaceC6835l o0(EnumC5895b enumC5895b) {
        int i10 = b.f548a[enumC5895b.ordinal()];
        if (i10 == 1) {
            return new InterfaceC6835l() { // from class: A8.u
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(z.p0(this.f532a, (od.i) obj));
                }
            };
        }
        if (i10 == 2) {
            return new InterfaceC6835l() { // from class: A8.v
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(z.q0(this.f533a, (od.i) obj));
                }
            };
        }
        if (i10 == 3) {
            return new InterfaceC6835l() { // from class: A8.w
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Integer.valueOf(z.r0(this.f534a, (od.i) obj));
                }
            };
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p0(z zVar, od.i tile) {
        AbstractC6492s.i(tile, "tile");
        return zVar.e0(zVar.l0(tile.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q0(z zVar, od.i tile) {
        AbstractC6492s.i(tile, "tile");
        return zVar.e0(zVar.n0(tile.m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r0(z zVar, od.i tile) {
        AbstractC6492s.i(tile, "tile");
        return zVar.e0(zVar.i0(tile.j()));
    }

    private final void w0() {
        final ArrayList arrayList = new ArrayList();
        v().d(new InterfaceC6835l() { // from class: A8.x
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return z.x0(this.f535a, arrayList, (od.i) obj);
            }
        });
        E().K();
        E().Q(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J x0(z zVar, List list, od.i it) {
        AbstractC6492s.i(it, "it");
        it.p(zVar.f545o);
        list.add(it);
        return J.f24997a;
    }

    private final void y0(float f10, float f11, final S8.l lVar) {
        super.J(f10, f11, new InterfaceC6835l() { // from class: A8.y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return z.z0(lVar, (i.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Yg.J z0(S8.l r1, od.i.a r2) {
        /*
            java.lang.String r0 = "$this$onPositionChanged"
            kotlin.jvm.internal.AbstractC6492s.i(r2, r0)
            W7.f r0 = r2.c()
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1d
            W7.f r0 = r2.c()
            kotlin.jvm.internal.AbstractC6492s.f(r0)
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L1d
        L1a:
            r2.e(r1)
        L1d:
            Yg.J r1 = Yg.J.f24997a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A8.z.z0(S8.l, od.i$a):Yg.J");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.g
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public s v() {
        return this.f543m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.g
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public r w() {
        return this.f542l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.g
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public t x() {
        return this.f544n;
    }

    public final com.ui.wifiman.model.signalmapper.floorplan.b m0() {
        return this.f540j;
    }

    public final void s0(float f10, float f11, S8.l lVar) {
        InterfaceC7122d.a.b(this.f540j, f10, f11, 0L, lVar, 4, null);
        y0(f10, f11, lVar);
    }

    public void t0(float f10, float f11, od.f obj) {
        AbstractC6492s.i(obj, "obj");
        super.K(f10, f11, obj);
        InterfaceC7122d.a.a(this.f540j, f10, f11, 0L, obj.h(), 4, null);
    }

    public final void u0(EnumC5895b value) {
        AbstractC6492s.i(value, "value");
        this.f546p = value;
        this.f545o = o0(value);
        v().f(this.f545o);
        w0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.g
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void Y(od.f fVar, od.f fVar2) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(fVar2, "new");
        fVar.i(fVar2.e());
        fVar.j(fVar2.h());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C5954a renderer, com.ui.wifiman.model.signalmapper.floorplan.b session, com.ubnt.mlkit.product.a arObjectMatcher) {
        super(renderer);
        AbstractC6492s.i(renderer, "renderer");
        AbstractC6492s.i(session, "session");
        AbstractC6492s.i(arObjectMatcher, "arObjectMatcher");
        EnumC5895b enumC5895b = EnumC5895b.SIGNAL;
        this.f541k = enumC5895b;
        this.f542l = new r();
        this.f543m = new s();
        this.f544n = new t();
        this.f545o = o0(enumC5895b);
        this.f546p = enumC5895b;
        this.f540j = session;
        Iterator it = session.d().iterator();
        while (it.hasNext()) {
            y0(r1.a().a() * session.e(), r1.a().b() * session.e(), ((b.C1415b) it.next()).c());
        }
        for (b.a aVar : session.c()) {
            float fA = aVar.a().a() * session.e();
            float fB = aVar.a().b() * session.e();
            W7.d dVarA = aVar.a();
            String strB = aVar.b();
            a.b bVarA = arObjectMatcher.a(aVar.b(), 1.0f);
            super.K(fA, fB, new od.f(dVarA, strB, bVarA != null ? new f.a(AbstractC2409a.b(bVarA), renderer.L(36)) : null));
        }
    }
}
