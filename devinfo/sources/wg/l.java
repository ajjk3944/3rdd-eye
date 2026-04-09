package wg;

import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements com.liuzh.deviceinfo.utilities.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f36684a;

    public l(m mVar) {
        this.f36684a = mVar;
    }

    @Override // com.liuzh.deviceinfo.utilities.i
    public final void a(int i4) {
        TextView textView;
        m mVar = this.f36684a;
        if (mVar.f36640a || (textView = mVar.f36687d) == null) {
            return;
        }
        textView.setText(i4 + " fps");
    }
}
