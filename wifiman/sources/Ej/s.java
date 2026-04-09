package ej;

import Zg.AbstractC3672d;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class s extends AbstractC3672d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a f46493d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final h[] f46494b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f46495c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C5481e c5481e, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            C5481e c5481e2;
            int i17 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (((h) list.get(i18)).b0() < i17) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i12 - 1);
            int i19 = -1;
            if (i17 == hVar.b0()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i20 = i11 + 1;
                h hVar3 = (h) list.get(i20);
                i13 = i20;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.l(i17) == hVar2.l(i17)) {
                int iMin = Math.min(hVar.b0(), hVar2.b0());
                int i21 = 0;
                for (int i22 = i17; i22 < iMin && hVar.l(i22) == hVar2.l(i22); i22++) {
                    i21++;
                }
                long jC = j10 + c(c5481e) + 2 + i21 + 1;
                c5481e.o(-i21);
                c5481e.o(i14);
                int i23 = i21 + i17;
                while (i17 < i23) {
                    c5481e.o(hVar.l(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i23 != ((h) list.get(i13)).b0()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c5481e.o(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C5481e c5481e3 = new C5481e();
                    c5481e.o(((int) (c(c5481e3) + jC)) * (-1));
                    a(jC, c5481e3, i23, list, i13, i12, list2);
                    c5481e.e0(c5481e3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (((h) list.get(i25 - 1)).l(i17) != ((h) list.get(i25)).l(i17)) {
                    i24++;
                }
            }
            long jC2 = j10 + c(c5481e) + 2 + (i24 * 2);
            c5481e.o(i24);
            c5481e.o(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte bL = ((h) list.get(i26)).l(i17);
                if (i26 == i13 || bL != ((h) list.get(i26 - 1)).l(i17)) {
                    c5481e.o(bL & 255);
                }
            }
            C5481e c5481e4 = new C5481e();
            while (i13 < i12) {
                byte bL2 = ((h) list.get(i13)).l(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bL2 != ((h) list.get(i28)).l(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == ((h) list.get(i13)).b0()) {
                    c5481e.o(((Number) list2.get(i13)).intValue());
                    i16 = i15;
                    c5481e2 = c5481e4;
                } else {
                    c5481e.o(((int) (jC2 + c(c5481e4))) * i19);
                    i16 = i15;
                    c5481e2 = c5481e4;
                    a(jC2, c5481e4, i17 + 1, list, i13, i15, list2);
                }
                c5481e4 = c5481e2;
                i13 = i16;
                i19 = -1;
            }
            c5481e.e0(c5481e4);
        }

        static /* synthetic */ void b(a aVar, long j10, C5481e c5481e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, c5481e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C5481e c5481e) {
            return c5481e.D0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ej.s d(ej.h... r17) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ej.s.a.d(ej.h[]):ej.s");
        }

        private a() {
        }
    }

    public /* synthetic */ s(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public static final s b0(h... hVarArr) {
        return f46493d.d(hVarArr);
    }

    public final h[] C() {
        return this.f46494b;
    }

    public final int[] J() {
        return this.f46495c;
    }

    public /* bridge */ int S(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int T(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return v((h) obj);
        }
        return false;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return S((h) obj);
        }
        return -1;
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f46494b.length;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return T((h) obj);
        }
        return -1;
    }

    public /* bridge */ boolean v(h hVar) {
        return super.contains(hVar);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public h get(int i10) {
        return this.f46494b[i10];
    }

    private s(h[] hVarArr, int[] iArr) {
        this.f46494b = hVarArr;
        this.f46495c = iArr;
    }
}
