package z6;

import kotlin.jvm.internal.l;

/* compiled from: DivStatePath.kt */
/* loaded from: classes.dex */
public final class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String message, NumberFormatException numberFormatException) {
        super(message, numberFormatException);
        l.f(message, "message");
    }
}
