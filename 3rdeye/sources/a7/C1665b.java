package a7;

/* compiled from: EvaluableException.kt */
/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1665b extends RuntimeException {
    public /* synthetic */ C1665b(String str) {
        this(null, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1665b(RuntimeException runtimeException, String message) {
        super(message, runtimeException);
        kotlin.jvm.internal.l.f(message, "message");
    }
}
