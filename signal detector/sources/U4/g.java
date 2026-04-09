package U4;

import com.lefan.signal.ui.noise.NoiseActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3713b;

    public /* synthetic */ g(int i, Object obj) {
        this.f3712a = i;
        this.f3713b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3712a) {
            case 0:
                ((l) this.f3713b).f3737n0.post(runnable);
                break;
            case 1:
                ((l) this.f3713b).f3737n0.post(runnable);
                break;
            case 2:
                ((l) this.f3713b).f3737n0.post(runnable);
                break;
            default:
                ((NoiseActivity) this.f3713b).f18978Z.post(runnable);
                break;
        }
    }
}
