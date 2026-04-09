package kotlinx.coroutines.channels;

/* loaded from: classes4.dex */
public abstract class d {
    public static final a a(int i10, BufferOverflow bufferOverflow, l9.l lVar) {
        if (i10 == -2) {
            return bufferOverflow == BufferOverflow.f22240a ? new BufferedChannel(a.I8.a(), lVar) : new j(1, bufferOverflow, lVar);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.f22240a ? new BufferedChannel(i10, lVar) : new j(i10, bufferOverflow, lVar) : new BufferedChannel(Integer.MAX_VALUE, lVar) : bufferOverflow == BufferOverflow.f22240a ? new BufferedChannel(0, lVar) : new j(1, bufferOverflow, lVar);
        }
        if (bufferOverflow == BufferOverflow.f22240a) {
            return new j(1, BufferOverflow.f22241b, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ a b(int i10, BufferOverflow bufferOverflow, l9.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f22240a;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, bufferOverflow, lVar);
    }
}
