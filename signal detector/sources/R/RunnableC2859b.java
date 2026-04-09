package r;

import android.os.Bundle;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2859b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC2862e f23302b;

    public /* synthetic */ RunnableC2859b(BinderC2862e binderC2862e, Bundle bundle, int i) {
        this.f23301a = i;
        this.f23302b = binderC2862e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23301a) {
            case 0:
                this.f23302b.f23313b.getClass();
                break;
            case 1:
                this.f23302b.f23313b.getClass();
                break;
            case 2:
                this.f23302b.f23313b.getClass();
                break;
            default:
                this.f23302b.f23313b.getClass();
                break;
        }
    }

    public RunnableC2859b(BinderC2862e binderC2862e, int i, int i3, int i6, int i7, int i8, Bundle bundle) {
        this.f23301a = 2;
        this.f23302b = binderC2862e;
    }
}
