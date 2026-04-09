package Mi;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public abstract class n {
    public static final void a(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }
}
