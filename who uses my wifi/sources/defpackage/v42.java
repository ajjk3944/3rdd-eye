package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v42 implements u9, rd2, iq3 {
    public final /* synthetic */ pd2 f;

    public /* synthetic */ v42(pd2 pd2Var) {
        this.f = pd2Var;
    }

    @Override // defpackage.u9
    public void U(rh rhVar) {
        this.f.b(new RuntimeException("Connection failed."));
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public void mo8a() {
        this.f.b(new e62("Cannot get Javascript Engine"));
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        ag2 ag2Var = (ag2) obj;
        pd2 pd2Var = this.f;
        if (ag2Var == null) {
            pd2Var.b(new r13("Missing webview from video view future.", 1));
            return;
        }
        ag2Var.v0("/video", new k32(7, new of3(19, pd2Var)));
        ag2Var.P();
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        gi2.Z("Failed to load media data due to video view load failure.");
        this.f.b(th);
    }

    public v42(ij ijVar, pd2 pd2Var) {
        this.f = pd2Var;
    }

    public v42(ft2 ft2Var, pd2 pd2Var) {
        this.f = pd2Var;
        Objects.requireNonNull(ft2Var);
    }
}
