package androidx.core.os;

import E1.d;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(d.e(str, "The operation has been canceled."));
    }
}
