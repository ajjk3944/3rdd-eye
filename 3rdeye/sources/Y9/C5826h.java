package y9;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: Regex.kt */
/* renamed from: y9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5826h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f48380b;

    public C5826h(String pattern) {
        kotlin.jvm.internal.l.f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
        this.f48380b = patternCompile;
    }

    public final boolean a(String input) {
        kotlin.jvm.internal.l.f(input, "input");
        return this.f48380b.matcher(input).matches();
    }

    public final String toString() {
        String string = this.f48380b.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
