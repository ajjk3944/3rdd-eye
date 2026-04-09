package I;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class U0 implements CharSequence {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8084e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f8085f = 8;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f8086a;

    /* renamed from: b, reason: collision with root package name */
    private W f8087b;

    /* renamed from: c, reason: collision with root package name */
    private int f8088c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f8089d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public U0(CharSequence charSequence) {
        this.f8086a = charSequence;
    }

    public static /* synthetic */ void d(U0 u02, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        u02.c(i10, i11, charSequence, i15, i13);
    }

    public char a(int i10) {
        W w10 = this.f8087b;
        if (w10 != null && i10 >= this.f8088c) {
            int iE = w10.e();
            int i11 = this.f8088c;
            return i10 < iE + i11 ? w10.d(i10 - i11) : this.f8086a.charAt(i10 - ((iE - this.f8089d) + i11));
        }
        return this.f8086a.charAt(i10);
    }

    public int b() {
        W w10 = this.f8087b;
        return w10 == null ? this.f8086a.length() : (this.f8086a.length() - (this.f8089d - this.f8088c)) + w10.e();
    }

    public final void c(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start=" + i10 + " > end=" + i11).toString());
        }
        if (i12 > i13) {
            throw new IllegalArgumentException(("textStart=" + i12 + " > textEnd=" + i13).toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(("textStart must be non-negative, but was " + i12).toString());
        }
        W w10 = this.f8087b;
        int i14 = i13 - i12;
        if (w10 != null) {
            int i15 = this.f8088c;
            int i16 = i10 - i15;
            int i17 = i11 - i15;
            if (i16 >= 0 && i17 <= w10.e()) {
                w10.g(i16, i17, charSequence, i12, i13);
                return;
            }
            this.f8086a = toString();
            this.f8087b = null;
            this.f8088c = -1;
            this.f8089d = -1;
            c(i10, i11, charSequence, i12, i13);
            return;
        }
        int iMax = Math.max(255, i14 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f8086a.length() - i11, 64);
        int i18 = i10 - iMin;
        n1.a(this.f8086a, cArr, 0, i18, i10);
        int i19 = iMax - iMin2;
        int i20 = iMin2 + i11;
        n1.a(this.f8086a, cArr, i19, i11, i20);
        n1.a(charSequence, cArr, iMin, i12, i13);
        this.f8087b = new W(cArr, iMin + i14, i19);
        this.f8088c = i18;
        this.f8089d = i20;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return b();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        W w10 = this.f8087b;
        if (w10 == null) {
            return this.f8086a.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8086a, 0, this.f8088c);
        w10.a(sb2);
        CharSequence charSequence = this.f8086a;
        sb2.append(charSequence, this.f8089d, charSequence.length());
        return sb2.toString();
    }
}
