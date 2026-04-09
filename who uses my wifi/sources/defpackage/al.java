package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class al extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.f = true;
                zy0Var.notifyDataSetChanged();
                break;
            default:
                i70 i70Var = (i70) this.b;
                if (i70Var.E.isShowing()) {
                    i70Var.c();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.f = false;
                zy0Var.notifyDataSetInvalidated();
                break;
            default:
                ((i70) this.b).dismiss();
                break;
        }
    }
}
