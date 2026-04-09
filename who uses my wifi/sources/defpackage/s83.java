package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s83 {
    public final Pattern a;

    public s83() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) tw1.e.c.a(mz1.i7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.a = patternCompile;
    }
}
