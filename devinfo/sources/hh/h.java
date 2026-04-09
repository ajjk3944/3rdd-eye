package hh;

import android.os.CountDownTimer;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.e f25085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(hg.e eVar, int i4) {
        super(60000L, 1000L);
        this.f25084a = i4;
        this.f25085b = eVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f25084a) {
            case 0:
                ((i) this.f25085b).f25091h.h(new r(hg.e.e(R.string.get_verification_code), true, false));
                break;
            case 1:
                ((i) this.f25085b).f25088d.h(new r(hg.e.e(R.string.get_verification_code), true, false));
                break;
            default:
                ((y) this.f25085b).f25144d.h(new r(hg.e.e(R.string.get_verification_code), true, false));
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f25084a) {
            case 0:
                ((i) this.f25085b).f25091h.h(new r((j / 1000) + "s", false, false));
                break;
            case 1:
                ((i) this.f25085b).f25088d.h(new r((j / 1000) + "s", false, false));
                break;
            default:
                ((y) this.f25085b).f25144d.h(new r((j / 1000) + "s", false, false));
                break;
        }
    }
}
