package c5;

import cc.s;

/* loaded from: classes.dex */
public abstract class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        s.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, Throwable th2) {
        super(str, th2);
        s.f(str, "Detail message must not be empty");
    }
}
