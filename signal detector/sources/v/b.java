package V;

import android.database.DataSetObserver;
import o.A0;
import o.V0;

/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3788b;

    public /* synthetic */ b(int i, Object obj) {
        this.f3787a = i;
        this.f3788b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f3787a) {
            case 0:
                V0 v0 = (V0) this.f3788b;
                v0.f3789a = true;
                v0.notifyDataSetChanged();
                break;
            default:
                A0 a02 = (A0) this.f3788b;
                if (a02.f22347N.isShowing()) {
                    a02.g();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f3787a) {
            case 0:
                V0 v0 = (V0) this.f3788b;
                v0.f3789a = false;
                v0.notifyDataSetInvalidated();
                break;
            default:
                ((A0) this.f3788b).dismiss();
                break;
        }
    }
}
