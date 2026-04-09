package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19394e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f19395f = 8;

    /* renamed from: a, reason: collision with root package name */
    private String f19396a;

    /* renamed from: b, reason: collision with root package name */
    private C3462o f19397b;

    /* renamed from: c, reason: collision with root package name */
    private int f19398c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f19399d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public I(String str) {
        this.f19396a = str;
    }

    public final char a(int i10) {
        C3462o c3462o = this.f19397b;
        if (c3462o != null && i10 >= this.f19398c) {
            int iE = c3462o.e();
            int i11 = this.f19398c;
            return i10 < iE + i11 ? c3462o.d(i10 - i11) : this.f19396a.charAt(i10 - ((iE - this.f19399d) + i11));
        }
        return this.f19396a.charAt(i10);
    }

    public final int b() {
        C3462o c3462o = this.f19397b;
        return c3462o == null ? this.f19396a.length() : (this.f19396a.length() - (this.f19399d - this.f19398c)) + c3462o.e();
    }

    public final void c(int i10, int i11, String str) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i10 + " > " + i11).toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
        C3462o c3462o = this.f19397b;
        if (c3462o != null) {
            int i12 = this.f19398c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= c3462o.e()) {
                c3462o.g(i13, i14, str);
                return;
            }
            this.f19396a = toString();
            this.f19397b = null;
            this.f19398c = -1;
            this.f19399d = -1;
            c(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f19396a.length() - i11, 64);
        int i15 = i10 - iMin;
        AbstractC3464q.a(this.f19396a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        AbstractC3464q.a(this.f19396a, cArr, i16, i11, i17);
        AbstractC3463p.b(str, cArr, iMin);
        this.f19397b = new C3462o(cArr, iMin + str.length(), i16);
        this.f19398c = i15;
        this.f19399d = i17;
    }

    public String toString() {
        C3462o c3462o = this.f19397b;
        if (c3462o == null) {
            return this.f19396a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f19396a, 0, this.f19398c);
        c3462o.a(sb2);
        String str = this.f19396a;
        sb2.append((CharSequence) str, this.f19399d, str.length());
        return sb2.toString();
    }
}
