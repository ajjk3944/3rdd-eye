package oh;

import android.os.CountDownTimer;

/* loaded from: classes.dex */
public final class s extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f19486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Runnable runnable, long j, int i10) {
        super(j, 1000L);
        this.f19485a = i10;
        this.f19486b = runnable;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f19485a) {
            case 0:
                t tVar = ((q) this.f19486b).f19483d;
                tVar.a("TIMEOUT_LOADING_PLAYER", null);
                tVar.f19489b0 = 1;
                tVar.e();
                tVar.o(1);
                break;
            case 1:
                t tVar2 = ((q) this.f19486b).f19483d;
                tVar2.a("TIMEOUT_BUFFERING", null);
                tVar2.f19489b0 = 2;
                tVar2.e();
                tVar2.o(2);
                break;
            default:
                t tVar3 = ((q) this.f19486b).f19483d;
                tVar3.a("TIMEOUT_GLOBAL_TEST", null);
                tVar3.f19489b0 = 4;
                tVar3.e();
                tVar3.o(4);
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f19485a) {
            case 0:
                ((q) this.f19486b).f19483d.f19498i0 = j;
                break;
            case 1:
                ((q) this.f19486b).f19483d.f19497h0 = j;
                break;
            default:
                ((q) this.f19486b).f19483d.f19499j0 = j;
                break;
        }
    }
}
