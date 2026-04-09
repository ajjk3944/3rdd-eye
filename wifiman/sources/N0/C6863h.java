package n0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6737x0;
import m0.C6733v0;
import n0.AbstractC6857b;
import org.snmp4j.smi.Counter32;

/* renamed from: n0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6863h {

    /* renamed from: g, reason: collision with root package name */
    public static final a f54137g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6858c f54138a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6858c f54139b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6858c f54140c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6858c f54141d;

    /* renamed from: e, reason: collision with root package name */
    private final int f54142e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f54143f;

    /* renamed from: n0.h$a */
    public static final class a {

        /* renamed from: n0.h$a$a, reason: collision with other inner class name */
        public static final class C1964a extends C6863h {
            C1964a(AbstractC6858c abstractC6858c, int i10) {
                super(abstractC6858c, abstractC6858c, i10, null);
            }

            @Override // n0.C6863h
            public long a(long j10) {
                return j10;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10) {
            if (!n.e(i10, n.f54165a.a())) {
                return null;
            }
            long jE = abstractC6858c.e();
            AbstractC6857b.a aVar = AbstractC6857b.f54104a;
            boolean zE = AbstractC6857b.e(jE, aVar.b());
            boolean zE2 = AbstractC6857b.e(abstractC6858c2.e(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                abstractC6858c = abstractC6858c2;
            }
            AbstractC6492s.g(abstractC6858c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) abstractC6858c;
            float[] fArrC = zE ? xVar.N().c() : k.f54148a.c();
            float[] fArrC2 = zE2 ? xVar.N().c() : k.f54148a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final C6863h c(AbstractC6858c abstractC6858c) {
            return new C1964a(abstractC6858c, n.f54165a.c());
        }

        private a() {
        }
    }

    /* renamed from: n0.h$b */
    public static final class b extends C6863h {

        /* renamed from: h, reason: collision with root package name */
        private final x f54144h;

        /* renamed from: i, reason: collision with root package name */
        private final x f54145i;

        /* renamed from: j, reason: collision with root package name */
        private final float[] f54146j;

        public /* synthetic */ b(x xVar, x xVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(xVar, xVar2, i10);
        }

        private final float[] b(x xVar, x xVar2, int i10) {
            if (AbstractC6859d.f(xVar.N(), xVar2.N())) {
                return AbstractC6859d.l(xVar2.G(), xVar.M());
            }
            float[] fArrM = xVar.M();
            float[] fArrG = xVar2.G();
            float[] fArrC = xVar.N().c();
            float[] fArrC2 = xVar2.N().c();
            z zVarN = xVar.N();
            k kVar = k.f54148a;
            if (!AbstractC6859d.f(zVarN, kVar.b())) {
                float[] fArrB = AbstractC6856a.f54099b.a().b();
                float[] fArrC3 = kVar.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                AbstractC6492s.h(fArrCopyOf, "copyOf(this, size)");
                fArrM = AbstractC6859d.l(AbstractC6859d.e(fArrB, fArrC, fArrCopyOf), xVar.M());
            }
            if (!AbstractC6859d.f(xVar2.N(), kVar.b())) {
                float[] fArrB2 = AbstractC6856a.f54099b.a().b();
                float[] fArrC4 = kVar.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                AbstractC6492s.h(fArrCopyOf2, "copyOf(this, size)");
                fArrG = AbstractC6859d.k(AbstractC6859d.l(AbstractC6859d.e(fArrB2, fArrC2, fArrCopyOf2), xVar2.M()));
            }
            if (n.e(i10, n.f54165a.a())) {
                fArrM = AbstractC6859d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrM);
            }
            return AbstractC6859d.l(fArrG, fArrM);
        }

        @Override // n0.C6863h
        public long a(long j10) {
            float fR = C6733v0.r(j10);
            float fQ = C6733v0.q(j10);
            float fO = C6733v0.o(j10);
            float fN = C6733v0.n(j10);
            float fA = (float) this.f54144h.E().a(fR);
            float fA2 = (float) this.f54144h.E().a(fQ);
            float fA3 = (float) this.f54144h.E().a(fO);
            float[] fArr = this.f54146j;
            return AbstractC6737x0.a((float) this.f54145i.I().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.f54145i.I().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.f54145i.I().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fN, this.f54145i);
        }

        private b(x xVar, x xVar2, int i10) {
            super(xVar, xVar2, xVar, xVar2, i10, null, null);
            this.f54144h = xVar;
            this.f54145i = xVar2;
            this.f54146j = b(xVar, xVar2, i10);
        }
    }

    public /* synthetic */ C6863h(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6858c, abstractC6858c2, i10);
    }

    public long a(long j10) {
        float fR = C6733v0.r(j10);
        float fQ = C6733v0.q(j10);
        float fO = C6733v0.o(j10);
        float fN = C6733v0.n(j10);
        long jH = this.f54140c.h(fR, fQ, fO);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & Counter32.MAX_COUNTER32_VALUE));
        float fI = this.f54140c.i(fR, fQ, fO);
        float[] fArr = this.f54143f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fI *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.f54141d.j(f10, fIntBitsToFloat2, fI, fN, this.f54139b);
    }

    public /* synthetic */ C6863h(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, AbstractC6858c abstractC6858c3, AbstractC6858c abstractC6858c4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6858c, abstractC6858c2, abstractC6858c3, abstractC6858c4, i10, fArr);
    }

    private C6863h(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, AbstractC6858c abstractC6858c3, AbstractC6858c abstractC6858c4, int i10, float[] fArr) {
        this.f54138a = abstractC6858c;
        this.f54139b = abstractC6858c2;
        this.f54140c = abstractC6858c3;
        this.f54141d = abstractC6858c4;
        this.f54142e = i10;
        this.f54143f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C6863h(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10) {
        long jE = abstractC6858c.e();
        AbstractC6857b.a aVar = AbstractC6857b.f54104a;
        this(abstractC6858c, abstractC6858c2, AbstractC6857b.e(jE, aVar.b()) ? AbstractC6859d.d(abstractC6858c, k.f54148a.b(), null, 2, null) : abstractC6858c, AbstractC6857b.e(abstractC6858c2.e(), aVar.b()) ? AbstractC6859d.d(abstractC6858c2, k.f54148a.b(), null, 2, null) : abstractC6858c2, i10, f54137g.b(abstractC6858c, abstractC6858c2, i10), null);
    }
}
