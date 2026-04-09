package kotlin.random;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import f9.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import o9.c;

/* loaded from: classes4.dex */
public abstract class Random {

    /* renamed from: a, reason: collision with root package name */
    public static final Default f22054a = new Default(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Random f22055b = b.f21175a.b();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "writeReplace", "()Ljava/lang/Object;", "", "bitCount", "e", "(I)I", "g", "()I", "until", "h", "from", "i", "(II)I", "", "j", "()J", CampaignEx.JSON_KEY_AD_K, "(JJ)J", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serialized implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public static final Serialized f22056a = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f22054a;
            }
        }

        public /* synthetic */ Default(i iVar) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f22056a;
        }

        @Override // kotlin.random.Random
        public int e(int bitCount) {
            return Random.f22055b.e(bitCount);
        }

        @Override // kotlin.random.Random
        public int g() {
            return Random.f22055b.g();
        }

        @Override // kotlin.random.Random
        public int h(int until) {
            return Random.f22055b.h(until);
        }

        @Override // kotlin.random.Random
        public int i(int from, int until) {
            return Random.f22055b.i(from, until);
        }

        @Override // kotlin.random.Random
        public long j() {
            return Random.f22055b.j();
        }

        @Override // kotlin.random.Random
        public long k(long from, long until) {
            return Random.f22055b.k(from, until);
        }

        private Default() {
        }
    }

    public abstract int e(int i10);

    public abstract int g();

    public int h(int i10) {
        return i(0, i10);
    }

    public int i(int i10, int i11) {
        int iG;
        int i12;
        int iE;
        c.b(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iE = e(c.d(i13));
            } else {
                do {
                    iG = g() >>> 1;
                    i12 = iG % i13;
                } while ((iG - i12) + (i13 - 1) < 0);
                iE = i12;
            }
            return i10 + iE;
        }
        while (true) {
            int iG2 = g();
            if (i10 <= iG2 && iG2 < i11) {
                return iG2;
            }
        }
    }

    public long j() {
        return (g() << 32) + g();
    }

    public long k(long j10, long j11) {
        long j12;
        long j13;
        long jE;
        int iG;
        c.c(j10, j11);
        long j14 = j11 - j10;
        if (j14 > 0) {
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    iG = e(c.d(i10));
                } else if (i11 == 1) {
                    iG = g();
                } else {
                    jE = (e(c.d(i11)) << 32) + (4294967295L & g());
                }
                jE = iG & 4294967295L;
            } else {
                do {
                    j12 = j() >>> 1;
                    j13 = j12 % j14;
                } while ((j12 - j13) + (j14 - 1) < 0);
                jE = j13;
            }
            return j10 + jE;
        }
        while (true) {
            long j15 = j();
            if (j10 <= j15 && j15 < j11) {
                return j15;
            }
        }
    }
}
