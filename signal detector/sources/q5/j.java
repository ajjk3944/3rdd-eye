package q5;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class j implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f23294a;

    public j(int i) {
        this.f23294a = i;
    }

    @Override // q5.g
    public final int c() {
        return this.f23294a;
    }

    public final String toString() {
        p.f23300a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        i.d(string, "renderLambdaToString(...)");
        return string;
    }
}
