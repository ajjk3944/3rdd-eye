package O5;

import E6.e;
import T.InterfaceC3551q0;
import T.t1;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;
import sh.AbstractC7978m;
import w.y;
import w.z;
import y6.AbstractC8618g;

/* loaded from: classes3.dex */
public final class c implements y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f17575a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f17576b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f17577c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17578d;

    /* renamed from: e, reason: collision with root package name */
    private final y f17579e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17580a;

        static {
            int[] iArr = new int[E6.d.values().length];
            try {
                iArr[E6.d.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E6.d.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17580a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final Float a(float f10) {
            float fI = c.this.i() + f10;
            float fFloatValue = ((Number) AbstractC7978m.o(Float.valueOf(fI), AbstractC8618g.a(0.0f, c.this.h()))).floatValue();
            float fI2 = fFloatValue - c.this.i();
            c cVar = c.this;
            cVar.m(cVar.i() + fI2);
            if (fI != fFloatValue) {
                f10 = fI2;
            }
            return Float.valueOf(f10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    public c() {
        Float fValueOf = Float.valueOf(0.0f);
        this.f17575a = t1.d(fValueOf, null, 2, null);
        this.f17576b = t1.d(fValueOf, null, 2, null);
        this.f17577c = new LinkedHashSet();
        this.f17579e = z.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(float f10) {
        float fI = i();
        this.f17575a.setValue(Float.valueOf(f10));
        Iterator it = this.f17577c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(fI, f10);
        }
    }

    @Override // w.y
    public boolean a() {
        return this.f17579e.a();
    }

    @Override // w.y
    public Object c(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objC = this.f17579e.c(enumC7839L, interfaceC6839p, interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : J.f24997a;
    }

    @Override // w.y
    public float f(float f10) {
        return this.f17579e.f(f10);
    }

    public final float h() {
        return ((Number) this.f17576b.getValue()).floatValue();
    }

    public final float i() {
        return ((Number) this.f17575a.getValue()).floatValue();
    }

    public final void j(E6.d initialScroll) {
        float fH;
        AbstractC6492s.i(initialScroll, "initialScroll");
        if (this.f17578d) {
            return;
        }
        int i10 = a.f17580a[initialScroll.ordinal()];
        if (i10 == 1) {
            fH = 0.0f;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fH = h();
        }
        m(fH);
        this.f17578d = true;
    }

    public void k(e scrollListener) {
        AbstractC6492s.i(scrollListener, "scrollListener");
        if (this.f17577c.add(scrollListener)) {
            scrollListener.b(i(), i());
            scrollListener.a(h(), h());
        }
    }

    public final void l(float f10) {
        float fH = h();
        this.f17576b.setValue(Float.valueOf(f10));
        if (Math.abs(i()) > Math.abs(f10)) {
            m(f10);
        }
        Iterator it = this.f17577c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(fH, f10);
        }
    }
}
