package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s64 extends yq2 {
    public final t64 g;
    public yq2 h;

    public s64(u64 u64Var) {
        super(2);
        this.g = new t64(u64Var);
        this.h = b();
    }

    @Override // defpackage.yq2
    public final byte a() {
        yq2 yq2Var = this.h;
        if (yq2Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = yq2Var.a();
        if (!this.h.hasNext()) {
            this.h = b();
        }
        return bA;
    }

    public final w44 b() {
        t64 t64Var = this.g;
        if (t64Var.hasNext()) {
            return new w44(t64Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h != null;
    }
}
