package pb;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m0 extends IOException {
    public m0(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String message = th2.getMessage();
        StringBuilder sb2 = new StringBuilder(c7.a.d(simpleName.length() + 13, message));
        sb2.append("Unexpected ");
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(message);
        super(sb2.toString(), th2);
    }
}
