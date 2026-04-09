package d9;

import com.bytedance.sdk.openadsdk.core.mwh.yu.lh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public long f22077a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lh f22079c;

    public n(lh lhVar) {
        this.f22079c = lhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentPosition;
        lh lhVar = this.f22079c;
        if (((o) lhVar).f22087th != null) {
            try {
                if (!this.f22078b) {
                    k kVar = (k) ((o) lhVar).f22087th;
                    kVar.getClass();
                    try {
                        currentPosition = kVar.f22067i.getCurrentPosition();
                    } catch (Throwable th2) {
                        pk.a.n("CSJ_VIDEO", "getCurrentPosition error: ", th2);
                        currentPosition = 0;
                    }
                    ((o) lhVar).vpp = Math.max(this.f22077a, currentPosition);
                }
                pk.a.p("[video] MediaPlayerProxy#start, OpStartTask:" + ((o) lhVar).vpp);
            } catch (Throwable th3) {
                pk.a.p("[video] MediaPlayerProxy#start  error: getCurrentPosition :".concat(String.valueOf(th3)));
            }
        }
        if (lhVar.ra != null) {
            lhVar.ra.sendEmptyMessageDelayed(100, 0L);
        }
        pk.a.p("[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
    }
}
