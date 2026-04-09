package org.jacoco.core.analysis;

import androidx.appcompat.app.z;
import java.io.Serializable;
import java.util.Comparator;
import org.jacoco.core.analysis.ICounter;

/* loaded from: classes4.dex */
public class CounterComparator implements Comparator<ICounter>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final CounterComparator f23800a = new CounterComparator(ICounter.CounterValue.TOTALCOUNT);

    /* renamed from: b, reason: collision with root package name */
    public static final CounterComparator f23801b = new CounterComparator(ICounter.CounterValue.COVEREDCOUNT);

    /* renamed from: c, reason: collision with root package name */
    public static final CounterComparator f23802c = new CounterComparator(ICounter.CounterValue.MISSEDCOUNT);

    /* renamed from: d, reason: collision with root package name */
    public static final CounterComparator f23803d = new CounterComparator(ICounter.CounterValue.COVEREDRATIO);

    /* renamed from: e, reason: collision with root package name */
    public static final CounterComparator f23804e = new CounterComparator(ICounter.CounterValue.MISSEDRATIO);
    private static final long serialVersionUID = -3777463066252746748L;
    private final boolean reverse;
    private final ICounter.CounterValue value;

    public CounterComparator(ICounter.CounterValue counterValue) {
        this(counterValue, false);
    }

    public int a(ICounter iCounter, ICounter iCounter2) {
        int iCompare = Double.compare(iCounter.a(this.value), iCounter2.a(this.value));
        return this.reverse ? -iCompare : iCompare;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(ICounter iCounter, ICounter iCounter2) {
        z.a(iCounter);
        z.a(iCounter2);
        return a(null, null);
    }

    public CounterComparator(ICounter.CounterValue counterValue, boolean z10) {
        this.value = counterValue;
        this.reverse = z10;
    }
}
