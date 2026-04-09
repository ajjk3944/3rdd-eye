package cj;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class d extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String msg) {
        super(msg);
        AbstractC6492s.i(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(th.d baseClass, th.d concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(concreteClass, "concreteClass");
    }
}
