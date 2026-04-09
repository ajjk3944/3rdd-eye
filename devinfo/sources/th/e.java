package th;

import android.app.Dialog;
import android.text.format.Formatter;
import android.widget.TextView;
import android.widget.Toast;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.appinfo.AppInfoActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements ti.l {

    /* renamed from: a, reason: collision with root package name */
    public String f34608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppInfoActivity.a f34609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f34610c;

    public e(AppInfoActivity.a aVar, f fVar) {
        this.f34609b = aVar;
        this.f34610c = fVar;
    }

    @Override // ti.l
    public final void a(long j, long j8) {
        if (this.f34608a == null) {
            this.f34608a = Formatter.formatFileSize(DeviceInfoApp.f21145f, j8);
        }
        String strE = d.h.E(Formatter.formatFileSize(DeviceInfoApp.f21145f, j), "/", this.f34608a);
        AppInfoActivity.a aVar = this.f34609b;
        Dialog dialog = aVar.f1867k0;
        if (dialog != null && dialog.isShowing()) {
            aVar.f21397p0 = strE;
            i.e eVar = (i.e) aVar.f1867k0;
            if (eVar != null && eVar.isShowing()) {
                String str = aVar.f21397p0;
                i.d dVar = eVar.g;
                dVar.f25256e = str;
                TextView textView = dVar.f25272w;
                if (textView != null) {
                    textView.setText(str);
                }
            }
        }
        if (j == j8) {
            Toast.makeText(this.f34610c.W(), R.string.save_successful, 0).show();
            if (aVar.B()) {
                return;
            }
            aVar.d0(false, false);
        }
    }

    @Override // ti.l
    public final void c() {
        AppInfoActivity.a aVar = this.f34609b;
        if (!aVar.B()) {
            aVar.d0(false, false);
        }
        Toast.makeText(DeviceInfoApp.f21145f, R.string.failed, 0).show();
    }

    @Override // ti.l
    public final boolean stop() {
        return this.f34609b.f21398q0 || this.f34610c.c0();
    }

    @Override // ti.l
    public final /* synthetic */ void success() {
    }
}
