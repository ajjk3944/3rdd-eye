package zc;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27043a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o2 f27044d;

    public n2(o2 o2Var, int i10) {
        this.f27043a = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(o2Var);
                this.f27044d = o2Var;
                break;
            default:
                Objects.requireNonNull(o2Var);
                this.f27044d = o2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27043a) {
            case 0:
                o2 o2Var = this.f27044d;
                o2Var.f27057y = o2Var.G;
                break;
            default:
                this.f27044d.G = null;
                break;
        }
    }
}
