package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tb extends pb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pb
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.pb
    public final void c(View view, int i) {
        switch (this.a) {
            case 0:
                if (i == 5) {
                    ((vb) this.b).cancel();
                    break;
                }
                break;
            default:
                if (i == 5) {
                    ((y00) this.b).N(false, false);
                    break;
                }
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
