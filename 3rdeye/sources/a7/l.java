package a7;

/* compiled from: EvaluableException.kt */
/* loaded from: classes.dex */
public final class l extends C1665b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String expression) {
        super(null, "Failed to evaluate [" + expression + "]. Integer overflow.");
        kotlin.jvm.internal.l.f(expression, "expression");
    }
}
