package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tb4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ vb4 g;
    public final /* synthetic */ Pair h;
    public final /* synthetic */ ch4 i;
    public final /* synthetic */ hh4 j;

    public /* synthetic */ tb4(vb4 vb4Var, Pair pair, ch4 ch4Var, hh4 hh4Var, int i) {
        this.f = i;
        this.g = vb4Var;
        this.h = pair;
        this.i = ch4Var;
        this.j = hh4Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                Pair pair = this.h;
                ((md4) this.g.g.n).r(((Integer) pair.first).intValue(), (kh4) pair.second, this.i, this.j);
                break;
            default:
                Pair pair2 = this.h;
                ((md4) this.g.g.n).j(((Integer) pair2.first).intValue(), (kh4) pair2.second, this.i, this.j);
                break;
        }
    }
}
