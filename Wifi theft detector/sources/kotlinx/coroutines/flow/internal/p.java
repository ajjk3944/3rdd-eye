package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.d1;

/* loaded from: classes4.dex */
public final class p extends SharedFlowImpl implements d1 {
    public p(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.f22241b);
        a(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.d1
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zA;
        synchronized (this) {
            zA = a(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return zA;
    }
}
