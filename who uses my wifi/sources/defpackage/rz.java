package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rz extends x40 {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(int i, List list) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new dt0();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    qz qzVar = (qz) ((w40) list.get(i2)).b;
                    if (qzVar != null) {
                        iMax = Math.max(iMax, qzVar.b.length);
                    }
                }
                this.j = new qz(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.ba
    public final Object f(w40 w40Var, float f) {
        Object obj;
        float f2;
        switch (this.i) {
            case 0:
                qz qzVar = (qz) this.j;
                qz qzVar2 = (qz) w40Var.b;
                qz qzVar3 = (qz) w40Var.c;
                int[] iArr = qzVar.b;
                float[] fArr = qzVar.a;
                boolean zEquals = qzVar2.equals(qzVar3);
                int[] iArr2 = qzVar2.b;
                if (zEquals || f <= 0.0f) {
                    qzVar.a(qzVar2);
                } else if (f >= 1.0f) {
                    qzVar.a(qzVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = qzVar3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(ex0.i(sb, iArr3.length, ")"));
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = te0.f(qzVar2.a[i], qzVar3.a[i], f);
                        iArr[i] = zt0.n(f, iArr2[i], iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return qzVar;
            case 1:
                return l(w40Var, f, f, f);
            default:
                dt0 dt0Var = (dt0) this.j;
                Object obj2 = w40Var.b;
                if (obj2 == null || (obj = w40Var.c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                dt0 dt0Var2 = (dt0) obj2;
                dt0 dt0Var3 = (dt0) obj;
                vq2 vq2Var = this.e;
                if (vq2Var != null) {
                    f2 = f;
                    dt0 dt0Var4 = (dt0) vq2Var.j(w40Var.g, w40Var.h.floatValue(), dt0Var2, dt0Var3, f2, d(), this.d);
                    if (dt0Var4 != null) {
                        return dt0Var4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = te0.f(dt0Var2.a, dt0Var3.a, f2);
                float f4 = te0.f(dt0Var2.b, dt0Var3.b, f2);
                dt0Var.a = f3;
                dt0Var.b = f4;
                return dt0Var;
        }
    }

    @Override // defpackage.ba
    public /* bridge */ /* synthetic */ Object g(w40 w40Var, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(w40Var, f, f2, f3);
            default:
                return super.g(w40Var, f, f2, f3);
        }
    }

    public PointF l(w40 w40Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = w40Var.b;
        if (obj2 == null || (obj = w40Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        vq2 vq2Var = this.e;
        if (vq2Var != null && (pointF = (PointF) vq2Var.j(w40Var.g, w40Var.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float fD = ex0.d(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(fD, ex0.d(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
