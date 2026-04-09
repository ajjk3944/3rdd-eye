package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uj0 extends AbstractList implements RandomAccess {
    public final jc[] f;
    public final int[] g;

    public uj0(jc[] jcVarArr, int[] iArr) {
        this.f = jcVarArr;
        this.g = iArr;
    }

    public static void a(long j, ac acVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        ArrayList arrayList3;
        long j2;
        int i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((jc) arrayList4.get(i8)).g() < i) {
                throw new AssertionError();
            }
        }
        jc jcVar = (jc) arrayList.get(i2);
        jc jcVar2 = (jc) arrayList4.get(i3 - 1);
        if (i == jcVar.g()) {
            int iIntValue = ((Integer) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            jc jcVar3 = (jc) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            jcVar = jcVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (jcVar.b(i) == jcVar2.b(i)) {
            int iMin = Math.min(jcVar.g(), jcVar2.g());
            int i10 = 0;
            for (int i11 = i; i11 < iMin && jcVar.b(i11) == jcVar2.b(i11); i11++) {
                i10++;
            }
            long j3 = j + ((int) (acVar.g / 4)) + 2 + i10 + 1;
            acVar.m(-i10);
            acVar.m(i5);
            int i12 = i;
            while (true) {
                i6 = i + i10;
                if (i12 >= i6) {
                    break;
                }
                acVar.m(jcVar.b(i12) & 255);
                i12++;
            }
            if (i4 + 1 == i3) {
                if (i6 != ((jc) arrayList4.get(i4)).g()) {
                    throw new AssertionError();
                }
                acVar.m(((Integer) arrayList5.get(i4)).intValue());
                return;
            } else {
                ac acVar2 = new ac();
                acVar.m((int) ((((int) (acVar2.g / 4)) + j3) * (-1)));
                a(j3, acVar2, i6, arrayList4, i4, i3, arrayList5);
                acVar.k(acVar2, acVar2.g);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((jc) arrayList4.get(i14 - 1)).b(i) != ((jc) arrayList4.get(i14)).b(i)) {
                i13++;
            }
        }
        long j4 = j + ((int) (acVar.g / 4)) + 2 + (i13 * 2);
        acVar.m(i13);
        acVar.m(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            byte b = ((jc) arrayList4.get(i15)).b(i);
            if (i15 == i4 || b != ((jc) arrayList4.get(i15 - 1)).b(i)) {
                acVar.m(b & 255);
            }
        }
        ac acVar3 = new ac();
        int i16 = i4;
        while (i16 < i3) {
            byte b2 = ((jc) arrayList4.get(i16)).b(i);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (b2 != ((jc) arrayList4.get(i18)).b(i)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i + 1 == ((jc) arrayList4.get(i16)).g()) {
                acVar.m(((Integer) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i18;
            } else {
                acVar.m((int) ((((int) (acVar3.g / 4)) + j4) * (-1)));
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i18;
                a(j2, acVar3, i + 1, arrayList, i16, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i7;
            arrayList5 = arrayList3;
        }
        acVar.k(acVar3, acVar3.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00be, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.uj0 b(defpackage.jc... r15) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj0.b(jc[]):uj0");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.length;
    }
}
