package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class b44 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final d44 b() {
        if (this instanceof d44) {
            return (d44) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final f44 c() {
        if (this instanceof f44) {
            return (f44) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            r44 r44Var = new r44(new n44(sb));
            r44Var.m = 1;
            p44.a.getClass();
            o44.r0(r44Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
