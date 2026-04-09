package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wc3 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public /* synthetic */ wc3(int i) {
        this.a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        ou1.v = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            ou1.v = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                synchronized (wb4.b) {
                    wb4.c = false;
                    wb4.d = false;
                    gi2.i0("Ad debug logging enablement is out of date.");
                }
                ob1.u(context);
                return;
        }
    }
}
