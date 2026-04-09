package o;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f22416b;

    public /* synthetic */ M0(SearchView searchView, int i) {
        this.f22415a = i;
        this.f22416b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22415a) {
            case 0:
                this.f22416b.s();
                break;
            default:
                V.c cVar = this.f22416b.f4924h0;
                if (cVar instanceof V0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
