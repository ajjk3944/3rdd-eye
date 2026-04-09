package Bi;

import Yg.E;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.AbstractC6512f;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1826c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final b f1827d = new b(0, 0);

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f1828e = new Comparator() { // from class: Bi.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b.c((b) obj, (b) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final long f1829a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1830b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new b(j10, j11);
        }

        public final b b() {
            return b.f1827d;
        }

        public final b c(String uuidString) {
            AbstractC6492s.i(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long jK = AbstractC6512f.k(uuidString, 0, 8, null, 4, null);
            d.c(uuidString, 8);
            long jK2 = AbstractC6512f.k(uuidString, 9, 13, null, 4, null);
            d.c(uuidString, 13);
            long jK3 = AbstractC6512f.k(uuidString, 14, 18, null, 4, null);
            d.c(uuidString, 18);
            long jK4 = AbstractC6512f.k(uuidString, 19, 23, null, 4, null);
            d.c(uuidString, 23);
            return a((jK << 32) | (jK2 << 16) | jK3, AbstractC6512f.k(uuidString, 24, 36, null, 4, null) | (jK4 << 48));
        }

        private a() {
        }
    }

    public b(long j10, long j11) {
        this.f1829a = j10;
        this.f1830b = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(b a10, b b10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        long j10 = a10.f1829a;
        return j10 != b10.f1829a ? Long.compareUnsigned(E.b(j10), E.b(b10.f1829a)) : Long.compareUnsigned(E.b(a10.f1830b), E.b(b10.f1830b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1829a == bVar.f1829a && this.f1830b == bVar.f1830b;
    }

    public int hashCode() {
        long j10 = this.f1829a ^ this.f1830b;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        d.d(this.f1830b, bArr, 24, 6);
        bArr[23] = 45;
        d.d(this.f1830b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        d.d(this.f1829a, bArr, 14, 2);
        bArr[13] = 45;
        d.d(this.f1829a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        d.d(this.f1829a >>> 32, bArr, 0, 4);
        return t.y(bArr);
    }
}
