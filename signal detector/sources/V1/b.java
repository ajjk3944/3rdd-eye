package V1;

import com.google.android.gms.internal.ads.C1649oh;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3842c;

    public /* synthetic */ b(Object obj, long j6, int i) {
        this.f3840a = i;
        this.f3842c = obj;
        this.f3841b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3840a) {
            case 0:
                e eVar = (e) this.f3842c;
                if (eVar.vk != null) {
                    eVar.vk.obtainMessage(106, Long.valueOf(this.f3841b)).sendToTarget();
                    break;
                }
                break;
            default:
                ((C1649oh) this.f3842c).f16008a.L0(this.f3841b, true);
                break;
        }
    }
}
