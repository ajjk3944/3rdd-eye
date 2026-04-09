package d9;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f22076c;

    public /* synthetic */ m(o oVar, boolean z3, int i4) {
        this.f22074a = i4;
        this.f22076c = oVar;
        this.f22075b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22074a) {
            case 0:
                boolean z3 = this.f22075b;
                o oVar = this.f22076c;
                if (!oVar.fkw && oVar.f22087th != null) {
                    try {
                        oVar.fvf = z3;
                        MediaPlayer mediaPlayer = ((k) oVar.f22087th).f22067i;
                        if (mediaPlayer != null) {
                            if (z3) {
                                mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                        break;
                    } catch (Throwable th2) {
                        pk.a.q("setQuietPlay error: ", th2);
                        return;
                    }
                }
                break;
            default:
                o oVar2 = this.f22076c;
                if (oVar2.f22087th != null) {
                    ((i) oVar2.f22087th).f22065h = this.f22075b;
                    break;
                }
                break;
        }
    }
}
