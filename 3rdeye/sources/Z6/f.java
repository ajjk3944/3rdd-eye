package Z6;

/* compiled from: VariableMutationException.kt */
/* loaded from: classes.dex */
public final class f extends RuntimeException {
    public f(int i, String str, Exception exc) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }
}
