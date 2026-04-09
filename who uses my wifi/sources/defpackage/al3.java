package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class al3 extends a30 implements Serializable {
    public final Pattern t;

    public al3(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.t = pattern;
    }

    @Override // defpackage.a30
    public final String toString() {
        return this.t.toString();
    }
}
