package Yg;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class r extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String message) {
        super(message);
        AbstractC6492s.i(message, "message");
    }

    public /* synthetic */ r(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
