package ah;

import android.view.View;
import com.liuzh.deviceinfo.DeviceInfoApp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.e f388b;

    public /* synthetic */ h(i.e eVar, int i4) {
        this.f387a = i4;
        this.f388b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f387a;
        i.e eVar = this.f388b;
        switch (i4) {
            case 0:
                DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                try {
                    eVar.dismiss();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 1:
                eVar.dismiss();
                break;
            default:
                eVar.dismiss();
                break;
        }
    }
}
