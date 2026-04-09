package defpackage;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kt0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ SearchView g;

    public /* synthetic */ kt0(SearchView searchView, int i) {
        this.f = i;
        this.g = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                this.g.s();
                break;
            default:
                bl blVar = this.g.U;
                if (blVar instanceof zy0) {
                    blVar.b(null);
                    break;
                }
                break;
        }
    }
}
