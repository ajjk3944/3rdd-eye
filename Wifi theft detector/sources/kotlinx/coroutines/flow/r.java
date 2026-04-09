package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.i;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class r {
    public static final b a(b bVar, int i10, BufferOverflow bufferOverflow) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.f22240a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            bufferOverflow = BufferOverflow.f22241b;
            i10 = 0;
        }
        int i11 = i10;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (bVar instanceof kotlinx.coroutines.flow.internal.i) {
            return i.a.a((kotlinx.coroutines.flow.internal.i) bVar, null, i11, bufferOverflow2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.e(bVar, null, i11, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ b b(b bVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f22240a;
        }
        return d.c(bVar, i10, bufferOverflow);
    }
}
