package ia;

import c9.AbstractC2082c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.KotlinVersion;

/* compiled from: Options.kt */
/* loaded from: classes3.dex */
public final class s extends AbstractC2082c<h> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final h[] f38671b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f38672c;

    /* compiled from: Options.kt */
    public static final class a {
        public static void a(long j4, C4468d c4468d, int i, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) throws IOException {
            int i12;
            int i13;
            ArrayList arrayList3;
            long j10;
            int i14;
            int i15 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i10 >= i11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i16 = i10; i16 < i11; i16++) {
                if (((h) arrayList4.get(i16)).c() < i15) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) arrayList.get(i10);
            h hVar2 = (h) arrayList4.get(i11 - 1);
            if (i15 == hVar.c()) {
                int iIntValue = ((Number) arrayList5.get(i10)).intValue();
                int i17 = i10 + 1;
                h hVar3 = (h) arrayList4.get(i17);
                i12 = i17;
                i13 = iIntValue;
                hVar = hVar3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (hVar.f(i15) == hVar2.f(i15)) {
                int iMin = Math.min(hVar.c(), hVar2.c());
                int i18 = 0;
                for (int i19 = i15; i19 < iMin && hVar.f(i19) == hVar2.f(i19); i19++) {
                    i18++;
                }
                long j11 = 4;
                long j12 = (c4468d.f38643c / j11) + j4 + 2 + i18 + 1;
                c4468d.O0(-i18);
                c4468d.O0(i13);
                int i20 = i15 + i18;
                while (i15 < i20) {
                    c4468d.O0(hVar.f(i15) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i15++;
                }
                if (i12 + 1 == i11) {
                    if (i20 != ((h) arrayList4.get(i12)).c()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c4468d.O0(((Number) arrayList5.get(i12)).intValue());
                    return;
                } else {
                    C4468d c4468d2 = new C4468d();
                    c4468d.O0(((int) ((c4468d2.f38643c / j11) + j12)) * (-1));
                    a(j12, c4468d2, i20, arrayList4, i12, i11, arrayList5);
                    c4468d.X(c4468d2);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i12 + 1; i22 < i11; i22++) {
                if (((h) arrayList4.get(i22 - 1)).f(i15) != ((h) arrayList4.get(i22)).f(i15)) {
                    i21++;
                }
            }
            long j13 = 4;
            long j14 = (c4468d.f38643c / j13) + j4 + 2 + (i21 * 2);
            c4468d.O0(i21);
            c4468d.O0(i13);
            for (int i23 = i12; i23 < i11; i23++) {
                int iF = ((h) arrayList4.get(i23)).f(i15);
                if (i23 == i12 || iF != ((h) arrayList4.get(i23 - 1)).f(i15)) {
                    c4468d.O0(iF & KotlinVersion.MAX_COMPONENT_VALUE);
                }
            }
            C4468d c4468d3 = new C4468d();
            int i24 = i12;
            while (i24 < i11) {
                byte bF = ((h) arrayList4.get(i24)).f(i15);
                int i25 = i24 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i11) {
                        i26 = i11;
                        break;
                    } else if (bF != ((h) arrayList4.get(i26)).f(i15)) {
                        break;
                    } else {
                        i26++;
                    }
                }
                if (i25 == i26 && i15 + 1 == ((h) arrayList4.get(i24)).c()) {
                    c4468d.O0(((Number) arrayList5.get(i24)).intValue());
                    arrayList3 = arrayList5;
                    j10 = j14;
                    i14 = i26;
                } else {
                    c4468d.O0(((int) ((c4468d3.f38643c / j13) + j14)) * (-1));
                    arrayList3 = arrayList5;
                    j10 = j14;
                    i14 = i26;
                    a(j10, c4468d3, i15 + 1, arrayList, i24, i14, arrayList3);
                    arrayList4 = arrayList;
                }
                j14 = j10;
                i24 = i14;
                arrayList5 = arrayList3;
            }
            c4468d.X(c4468d3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static ia.s b(ia.h... r12) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ia.s.a.b(ia.h[]):ia.s");
        }
    }

    public s(h[] hVarArr, int[] iArr) {
        this.f38671b = hVarArr;
        this.f38672c = iArr;
    }

    @Override // c9.AbstractC2080a
    public final int c() {
        return this.f38671b.length;
    }

    @Override // c9.AbstractC2080a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f38671b[i];
    }

    @Override // c9.AbstractC2082c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // c9.AbstractC2082c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
