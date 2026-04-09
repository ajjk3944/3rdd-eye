package kotlin.uuid;

import com.mbridge.msdk.MBridgeConstans;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.uuid.Uuid;
import s9.r;
import y8.n;

@SinceKotlin(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkotlin/uuid/Uuid;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "writeReplace", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "h", "()J", "getMostSignificantBits$annotations", "()V", "g", "getLeastSignificantBits$annotations", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalUuidApi
/* loaded from: classes4.dex */
public final class Uuid implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Uuid f22198b = new Uuid(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f22199c = new Comparator() { // from class: u9.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Uuid.b((Uuid) obj, (Uuid) obj2);
        }
    };
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* renamed from: kotlin.uuid.Uuid$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Uuid a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new Uuid(j10, j11);
        }

        public final Uuid b() {
            return Uuid.f22198b;
        }

        public Companion() {
        }
    }

    public Uuid(long j10, long j11) {
        this.mostSignificantBits = j10;
        this.leastSignificantBits = j11;
    }

    public static final int b(Uuid a10, Uuid b10) {
        p.e(a10, "a");
        p.e(b10, "b");
        long j10 = a10.mostSignificantBits;
        return j10 != b10.mostSignificantBits ? Long.compare(n.b(j10) ^ Long.MIN_VALUE, n.b(b10.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(n.b(a10.leastSignificantBits) ^ Long.MIN_VALUE, n.b(b10.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    private final Object writeReplace() {
        return a.a(this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    /* renamed from: g, reason: from getter */
    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    /* renamed from: h, reason: from getter */
    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        long j10 = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        b.c(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        b.c(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        b.c(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        b.c(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        b.c(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return r.u(bArr);
    }
}
