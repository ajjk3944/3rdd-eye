package j$.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2390j implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = LinearLayoutManager.INVALID_OFFSET;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final void a(C2390j c2390j) {
        this.count += c2390j.count;
        this.sum += c2390j.sum;
        this.min = Math.min(this.min, c2390j.min);
        this.max = Math.max(this.max, c2390j.max);
    }

    public final String toString() {
        String simpleName = C2390j.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j6 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j6 > 0 ? this.sum / j6 : 0.0d), Integer.valueOf(this.max));
    }
}
