package sh;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j0 extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33699b;

    public /* synthetic */ j0(int i4, Object obj) {
        this.f33698a = i4;
        this.f33699b = obj;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        switch (this.f33698a) {
            case 0:
                k0.h0((k0) this.f33699b, signalStrength);
                break;
            default:
                wg.x xVar = (wg.x) this.f33699b;
                if (!xVar.f36640a) {
                    wg.x.f(xVar);
                    wg.x.g(xVar, signalStrength);
                    break;
                }
                break;
        }
    }
}
