package F7;

/* compiled from: DivStorageErrorException.kt */
/* loaded from: classes.dex */
public final class d extends H7.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String errorMessage, Exception exc) {
        super(errorMessage.concat(""), exc);
        kotlin.jvm.internal.l.f(errorMessage, "errorMessage");
    }
}
