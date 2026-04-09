package kotlinx.coroutines.flow.internal;

/* loaded from: classes4.dex */
public abstract class h {
    public static final void a(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}
