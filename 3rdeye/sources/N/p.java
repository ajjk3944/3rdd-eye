package N;

import N.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.a f4423c;

    public /* synthetic */ p(s.a aVar, int i) {
        this.f4422b = i;
        this.f4423c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4422b) {
            case 0:
                this.f4423c.a();
                break;
            default:
                this.f4423c.b();
                break;
        }
    }
}
