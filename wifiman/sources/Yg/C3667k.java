package Yg;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Yg.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3667k implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f25007e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final C3667k f25008f = C3668l.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f25009a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25010b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25011c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25012d;

    /* renamed from: Yg.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3667k(int i10, int i11, int i12) {
        this.f25009a = i10;
        this.f25010b = i11;
        this.f25011c = i12;
        this.f25012d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3667k other) {
        AbstractC6492s.i(other, "other");
        return this.f25012d - other.f25012d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3667k c3667k = obj instanceof C3667k ? (C3667k) obj : null;
        return c3667k != null && this.f25012d == c3667k.f25012d;
    }

    public int hashCode() {
        return this.f25012d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25009a);
        sb2.append('.');
        sb2.append(this.f25010b);
        sb2.append('.');
        sb2.append(this.f25011c);
        return sb2.toString();
    }

    public C3667k(int i10, int i11) {
        this(i10, i11, 0);
    }
}
