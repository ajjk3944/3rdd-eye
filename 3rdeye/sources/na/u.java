package na;

import java.io.Serializable;

/* compiled from: ThaiBuddhistChronology.java */
/* loaded from: classes3.dex */
public final class u extends g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final u f44486d = new u();

    /* compiled from: ThaiBuddhistChronology.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44487a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44487a = iArr;
            try {
                iArr[qa.a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44487a[qa.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44487a[qa.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Object readResolve() {
        return f44486d;
    }

    @Override // na.g
    public final b a(qa.e eVar) {
        return eVar instanceof v ? (v) eVar : new v(ma.e.t0(eVar));
    }

    @Override // na.g
    public final h e(int i) {
        return w.of(i);
    }

    @Override // na.g
    public final String g() {
        return "buddhist";
    }

    @Override // na.g
    public final String h() {
        return "ThaiBuddhist";
    }

    @Override // na.g
    public final e<v> k(ma.d dVar, ma.p pVar) {
        return f.w0(this, dVar, pVar);
    }

    public final qa.m m(qa.a aVar) {
        int i = a.f44487a[aVar.ordinal()];
        if (i == 1) {
            qa.m mVarRange = qa.a.PROLEPTIC_MONTH.range();
            return qa.m.c(mVarRange.f45482b + 6516, mVarRange.f45485e + 6516);
        }
        if (i == 2) {
            qa.m mVarRange2 = qa.a.YEAR.range();
            return qa.m.d(1L, 1L, (-(mVarRange2.f45482b + 543)) + 1, mVarRange2.f45485e + 543);
        }
        if (i != 3) {
            return aVar.range();
        }
        qa.m mVarRange3 = qa.a.YEAR.range();
        return qa.m.c(mVarRange3.f45482b + 543, mVarRange3.f45485e + 543);
    }
}
