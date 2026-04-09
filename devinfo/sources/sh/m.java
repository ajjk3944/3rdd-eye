package sh;

import android.widget.Toast;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements f.b, ig.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f33733a;

    public /* synthetic */ m(p pVar) {
        this.f33733a = pVar;
    }

    @Override // f.b
    public void k(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        p pVar = this.f33733a;
        if (zBooleanValue) {
            bi.d.a(new n(pVar, 0), 100L);
        } else {
            Toast.makeText(pVar.p(), pVar.u(R.string.permission_denied), 0).show();
        }
    }
}
