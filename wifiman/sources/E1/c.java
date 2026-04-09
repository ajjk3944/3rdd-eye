package E1;

import Zg.S;
import android.util.LongSparseArray;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a extends S {

        /* renamed from: a, reason: collision with root package name */
        private int f4011a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LongSparseArray f4012b;

        a(LongSparseArray longSparseArray) {
            this.f4012b = longSparseArray;
        }

        @Override // Zg.S
        public long d() {
            LongSparseArray longSparseArray = this.f4012b;
            int i10 = this.f4011a;
            this.f4011a = i10 + 1;
            return longSparseArray.keyAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4011a < this.f4012b.size();
        }
    }

    public static final S a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
