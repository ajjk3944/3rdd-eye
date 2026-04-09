package s2;

import i2.C4448h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o2.C5410a;
import o2.C5411b;
import o2.C5412c;
import o2.C5413d;
import o2.C5414e;
import p2.C5443c;
import t2.AbstractC5601b;
import u2.C5629h;
import v2.C5673a;

/* compiled from: AnimatableValueParser.java */
/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5558d {
    public static C5410a a(t2.c cVar, C4448h c4448h) throws IOException {
        return new C5410a(t.a(cVar, c4448h, 1.0f, C5561g.f45978a, false), 0);
    }

    public static C5411b b(AbstractC5601b abstractC5601b, C4448h c4448h, boolean z10) throws IOException {
        return new C5411b(t.a(abstractC5601b, c4448h, z10 ? C5629h.c() : 1.0f, C5565k.f45989a, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5412c c(t2.c cVar, C4448h c4448h, int i) throws IOException {
        n nVar = new n();
        nVar.f45993a = i;
        ArrayList arrayListA = t.a(cVar, c4448h, 1.0f, nVar, false);
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            C5673a c5673a = (C5673a) arrayListA.get(i10);
            C5443c c5443c = (C5443c) c5673a.f47012b;
            C5443c c5443c2 = (C5443c) c5673a.f47013c;
            if (c5443c != null && c5443c2 != null) {
                float[] fArr = c5443c.f45019a;
                int length = fArr.length;
                float[] fArr2 = c5443c2.f45019a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length2; i12++) {
                        float f11 = fArr3[i12];
                        if (f11 != f10) {
                            fArr3[i11] = f11;
                            i11++;
                            f10 = fArr3[i12];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i11);
                    c5673a = new C5673a(c5443c.b(fArrCopyOfRange), c5443c2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i10, c5673a);
        }
        return new C5412c(arrayListA, 0);
    }

    public static C5413d d(AbstractC5601b abstractC5601b, C4448h c4448h) throws IOException {
        return new C5413d(t.a(abstractC5601b, c4448h, 1.0f, q.f45999a, false), 0);
    }

    public static C5414e e(t2.c cVar, C4448h c4448h) throws IOException {
        return new C5414e(t.a(cVar, c4448h, C5629h.c(), y.f46016a, true));
    }
}
