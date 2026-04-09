package t9;

import j9.C5203b;
import java.io.Serializable;
import l9.C5303a;
import u9.C5639a;

/* compiled from: Random.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46467b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC5614a f46468c;

    /* compiled from: Random.kt */
    public static final class a extends c implements Serializable {
        @Override // t9.c
        public final int a(int i) {
            return c.f46468c.a(i);
        }

        @Override // t9.c
        public final int b() {
            return c.f46468c.b();
        }

        @Override // t9.c
        public final int c(int i) {
            return c.f46468c.c(i);
        }
    }

    static {
        C5203b.f43142a.getClass();
        Integer num = C5303a.C0493a.f43926a;
        f46468c = (num == null || num.intValue() >= 34) ? new C5639a() : new C5615b();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i) {
        int iB;
        int i10;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iB = b() >>> 1;
                i10 = iB % i;
            } while ((i - 1) + (iB - i10) < 0);
            return i10;
        }
        while (true) {
            int iB2 = b();
            if (iB2 >= 0 && iB2 < i) {
                return iB2;
            }
        }
    }
}
