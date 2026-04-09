package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class e50 implements qy, Serializable {
    public final int f;

    public e50(int i) {
        this.f = i;
    }

    @Override // defpackage.qy
    public final int b() {
        return this.f;
    }

    public final String toString() {
        dp0.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        i30.l(string, "renderLambdaToString(...)");
        return string;
    }
}
