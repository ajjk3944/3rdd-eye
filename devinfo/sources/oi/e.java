package oi;

import android.telephony.PhoneStateListener;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i4) {
        if (i4 == 2 || i4 == 0) {
            OverViewWidget4x2.c();
        }
    }
}
