package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class in3 implements Iterator {
    public static final in3 f;
    public static final /* synthetic */ in3[] g;

    static {
        in3 in3Var = new in3("INSTANCE", 0);
        f = in3Var;
        g = new in3[]{in3Var};
    }

    public static in3[] values() {
        return (in3[]) g.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zt0.c0("no calls to next() since the last call to remove()", false);
    }
}
