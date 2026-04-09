package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes4.dex */
public interface i extends kotlinx.coroutines.flow.b {

    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.b a(i iVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                dVar = EmptyCoroutineContext.f21979a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.f22240a;
            }
            return iVar.b(dVar, i10, bufferOverflow);
        }
    }

    kotlinx.coroutines.flow.b b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow);
}
