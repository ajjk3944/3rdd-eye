package V1;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f3845c;

    public /* synthetic */ c(e eVar, boolean z6, int i) {
        this.f3843a = i;
        this.f3845c = eVar;
        this.f3844b = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3843a) {
            case 0:
                boolean z6 = this.f3844b;
                e eVar = this.f3845c;
                if (!eVar.msw() && eVar.ru != null) {
                    try {
                        eVar.dr = z6;
                        MediaPlayer mediaPlayer = ((o) eVar.ru).i;
                        if (mediaPlayer != null) {
                            if (z6) {
                                mediaPlayer.setVolume(0.0f, 0.0f);
                            } else {
                                mediaPlayer.setVolume(1.0f, 1.0f);
                            }
                        }
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            default:
                e eVar2 = this.f3845c;
                if (eVar2.ru != null) {
                    ((o) eVar2.ru).f3857h = this.f3844b;
                    break;
                }
                break;
        }
    }
}
