package U4;

import com.lefan.signal.ui.phone.PhoneFragment;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneFragment f3758b;

    public /* synthetic */ o(PhoneFragment phoneFragment, int i) {
        this.f3757a = i;
        this.f3758b = phoneFragment;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3757a) {
            case 0:
                this.f3758b.f19130l0.post(runnable);
                break;
            case 1:
                this.f3758b.f19130l0.post(runnable);
                break;
            default:
                this.f3758b.f19130l0.post(runnable);
                break;
        }
    }
}
