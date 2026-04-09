package M6;

import N7.G7;

/* compiled from: DivPagerPageSizeProvider.kt */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f4277a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4278b;

    /* renamed from: c, reason: collision with root package name */
    public final G7.a f4279c;

    /* compiled from: DivPagerPageSizeProvider.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4280a;

        static {
            int[] iArr = new int[G7.a.values().length];
            try {
                iArr[G7.a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G7.a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G7.a.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4280a = iArr;
        }
    }

    public n(int i, j jVar, G7.a aVar) {
        this.f4277a = i;
        this.f4278b = jVar;
        this.f4279c = aVar;
    }

    public abstract Float d(int i);

    public final Float e(int i) {
        int i10 = a.f4280a[this.f4279c.ordinal()];
        j jVar = this.f4278b;
        int i11 = this.f4277a;
        if (i10 == 1) {
            Float fD = d(i);
            if (fD == null) {
                return null;
            }
            return Float.valueOf((i11 - jVar.f4257g) - fD.floatValue());
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return Float.valueOf(jVar.f4258h);
            }
            throw new b9.j();
        }
        Float fD2 = d(i);
        if (fD2 == null) {
            return null;
        }
        return Float.valueOf((i11 - fD2.floatValue()) / 2.0f);
    }

    public final Float f(int i) {
        int i10 = a.f4280a[this.f4279c.ordinal()];
        j jVar = this.f4278b;
        if (i10 == 1) {
            return Float.valueOf(jVar.f4257g);
        }
        int i11 = this.f4277a;
        if (i10 == 2) {
            Float fD = d(i);
            if (fD == null) {
                return null;
            }
            return Float.valueOf((i11 - fD.floatValue()) / 2.0f);
        }
        if (i10 != 3) {
            throw new b9.j();
        }
        Float fD2 = d(i);
        if (fD2 == null) {
            return null;
        }
        return Float.valueOf((i11 - jVar.f4258h) - fD2.floatValue());
    }
}
