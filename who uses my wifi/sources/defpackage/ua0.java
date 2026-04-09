package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.TimerTask;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ua0 extends TimerTask {
    public final /* synthetic */ MainActivity f;

    public ua0(MainActivity mainActivity) {
        this.f = mainActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MainActivity mainActivity = this.f;
        mainActivity.runOnUiThread(new la0(mainActivity, 8));
    }
}
