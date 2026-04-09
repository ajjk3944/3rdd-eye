package androidx.compose.ui.draw;

import com.google.android.gms.internal.measurement.i4;
import kotlin.Metadata;
import mq.x;
import t2.b;
import v1.a0;
import v1.q;
import x1.h0;
import x1.l0;
import x1.m;
import x1.m0;
import x1.v;
import z0.e;
import z0.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Lx1/v;", "Lz0/l;", "Lx1/m;", "Ll1/a;", "painter", "Ll1/a;", "c0", "()Ll1/a;", "f0", "(Ll1/a;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class PainterNode extends l implements v, m {

    /* renamed from: p, reason: collision with root package name */
    public e f1124p;
    private l1.a painter;

    /* renamed from: q, reason: collision with root package name */
    public float f1125q;

    /* renamed from: r, reason: collision with root package name */
    public g1.m f1126r;

    public PainterNode(l1.a aVar, e eVar, float f10, g1.m mVar) {
        this.painter = aVar;
        this.f1124p = eVar;
        this.f1125q = f10;
        this.f1126r = mVar;
    }

    public static boolean d0(long j) {
        return !f1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean e0(long j) {
        return !f1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // x1.v
    public final l0 K(m0 m0Var, q qVar, long j) {
        long jA;
        boolean z10 = t2.a.d(j) && t2.a.c(j);
        boolean z11 = t2.a.f(j) && t2.a.e(j);
        if ((this.painter.d() == 9205357640488583168L && z10) || z11) {
            jA = t2.a.a(j, t2.a.h(j), 0, t2.a.g(j), 0, 10);
        } else {
            long jD = this.painter.d();
            long jFloatToRawIntBits = (Float.floatToRawIntBits(b.f(e0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : t2.a.j(j), j)) << 32) | (Float.floatToRawIntBits(b.e(d0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : t2.a.i(j), j)) & 4294967295L);
            if (this.painter.d() != 9205357640488583168L) {
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!e0(this.painter.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.d() >> 32))) << 32) | (Float.floatToRawIntBits(!d0(this.painter.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.d() & 4294967295L))) & 4294967295L);
                if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                    jFloatToRawIntBits = 0;
                } else {
                    float fA = i4.a(jFloatToRawIntBits2, jFloatToRawIntBits);
                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
                    int i10 = a0.f23755a;
                    jFloatToRawIntBits = ic.a.O(jFloatToRawIntBits2, (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L));
                }
            }
            jA = t2.a.a(j, b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, b.e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
        }
        v1.v vVarS = qVar.s(jA);
        return m0Var.g0(vVarS.f23809b, vVarS.f23810c, x.f16946a, new d1.b(vVarS, 0));
    }

    @Override // z0.l
    public final boolean R() {
        return false;
    }

    /* renamed from: c0, reason: from getter */
    public final l1.a getPainter() {
        return this.painter;
    }

    @Override // x1.m
    public final void d(h0 h0Var) {
        long jO;
        i1.b bVar = h0Var.f24844b;
        long jD = this.painter.d();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(e0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (bVar.C() >> 32))) << 32) | (Float.floatToRawIntBits(d0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (bVar.C() & 4294967295L))) & 4294967295L);
        if (Float.intBitsToFloat((int) (bVar.C() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.C() & 4294967295L)) == 0.0f) {
            jO = 0;
        } else {
            float fA = i4.a(jFloatToRawIntBits, bVar.C());
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
            int i10 = a0.f23755a;
            jO = ic.a.O(jFloatToRawIntBits, jFloatToRawIntBits2);
        }
        long jA = this.f1124p.a((Math.round(Float.intBitsToFloat((int) (jO >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jO & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.C() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.C() & 4294967295L))) & 4294967295L), h0Var.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((h7.h0) bVar.f11141c.f2826d).W(f10, f11);
        try {
            this.painter.c(h0Var, jO, this.f1125q, this.f1126r);
            ((h7.h0) bVar.f11141c.f2826d).W(-f10, -f11);
            h0Var.a();
        } catch (Throwable th2) {
            ((h7.h0) bVar.f11141c.f2826d).W(-f10, -f11);
            throw th2;
        }
    }

    public final void f0(l1.a aVar) {
        this.painter = aVar;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f1124p + ", alpha=" + this.f1125q + ", colorFilter=" + this.f1126r + ')';
    }
}
