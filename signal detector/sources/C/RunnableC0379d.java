package c;

import h.AbstractActivityC2349g;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0379d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5823b;

    public /* synthetic */ RunnableC0379d(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f5822a = i;
        this.f5823b = abstractActivityC2349g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5822a) {
            case 0:
                this.f5823b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!q5.i.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!q5.i.a(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
        }
    }
}
