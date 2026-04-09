package l2;

import java.util.List;
import p2.C5443c;
import r7.s;
import u2.C5628g;
import v2.C5673a;

/* compiled from: GradientColorKeyframeAnimation.java */
/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5272e extends AbstractC5274g {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f43712j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5272e(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.f43712j = new v2.c();
                break;
            default:
                int iMax = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    C5443c c5443c = (C5443c) ((C5673a) list.get(i10)).f47012b;
                    if (c5443c != null) {
                        iMax = Math.max(iMax, c5443c.f45020b.length);
                    }
                }
                this.f43712j = new C5443c(new float[iMax], new int[iMax]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        T t10;
        float f11;
        switch (this.i) {
            case 0:
                C5443c c5443c = (C5443c) c5673a.f47012b;
                C5443c c5443c2 = (C5443c) c5673a.f47013c;
                C5443c c5443c3 = (C5443c) this.f43712j;
                c5443c3.getClass();
                if (c5443c.equals(c5443c2) || f10 <= 0.0f) {
                    c5443c3.a(c5443c);
                } else if (f10 >= 1.0f) {
                    c5443c3.a(c5443c2);
                } else {
                    int[] iArr = c5443c.f45020b;
                    int length = iArr.length;
                    int[] iArr2 = c5443c2.f45020b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(B4.i.j(sb, iArr2.length, ")"));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = c5443c3.f45020b;
                        float[] fArr = c5443c3.f45019a;
                        if (i < length2) {
                            fArr[i] = C5628g.e(c5443c.f45019a[i], c5443c2.f45019a[i], f10);
                            iArr3[i] = s.d(f10, iArr[i], iArr2[i]);
                            i++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return c5443c3;
            default:
                T t11 = c5673a.f47012b;
                if (t11 == 0 || (t10 = c5673a.f47013c) == 0) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                v2.c cVar = (v2.c) t11;
                v2.c cVar2 = (v2.c) t10;
                B0.f fVar = this.f43690e;
                if (fVar != null) {
                    f11 = f10;
                    v2.c cVar3 = (v2.c) fVar.e(c5673a.f47017g, c5673a.f47018h.floatValue(), cVar, cVar2, f11, e(), this.f43689d);
                    if (cVar3 != null) {
                        return cVar3;
                    }
                } else {
                    f11 = f10;
                }
                float fE = C5628g.e(cVar.f47033a, cVar2.f47033a, f11);
                float fE2 = C5628g.e(cVar.f47034b, cVar2.f47034b, f11);
                v2.c cVar4 = (v2.c) this.f43712j;
                cVar4.f47033a = fE;
                cVar4.f47034b = fE2;
                return cVar4;
        }
    }
}
