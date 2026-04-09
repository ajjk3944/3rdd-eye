package j$.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class y implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = LinearLayoutManager.INVALID_OFFSET;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i4) {
        this.count++;
        this.sum += i4;
        this.min = Math.min(this.min, i4);
        this.max = Math.max(this.max, i4);
    }

    public final void a(y yVar) {
        this.count += yVar.count;
        this.sum += yVar.sum;
        this.min = Math.min(this.min, yVar.min);
        this.max = Math.max(this.max, yVar.max);
    }

    public final String toString() {
        String simpleName = y.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
