package a7;

/* compiled from: EvaluableException.kt */
/* loaded from: classes.dex */
public final class s extends C1665b {

    /* renamed from: b, reason: collision with root package name */
    public final String f14234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String variableName) {
        super(null, "Variable '" + variableName + "' is missing.");
        kotlin.jvm.internal.l.f(variableName, "variableName");
        this.f14234b = variableName;
    }
}
