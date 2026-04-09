package y5;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f24263a;

    public d(String str) {
        Pattern patternCompile = Pattern.compile(str);
        q5.i.d(patternCompile, "compile(...)");
        this.f24263a = patternCompile;
    }

    public final String toString() {
        String string = this.f24263a.toString();
        q5.i.d(string, "toString(...)");
        return string;
    }
}
