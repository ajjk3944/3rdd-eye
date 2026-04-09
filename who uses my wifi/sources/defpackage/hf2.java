package defpackage;

import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hf2 extends ff2 {
    @Override // defpackage.ff2
    public final boolean b(String str) throws NoSuchAlgorithmException {
        String strD = j63.d(str, "MD5");
        ag2 ag2Var = (ag2) this.h.get();
        if (ag2Var != null && strD != null) {
            ag2Var.d1(strD, this);
        }
        gi2.i0("VideoStreamNoopCache is doing nothing.");
        m(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // defpackage.ff2
    public final void l() {
    }
}
