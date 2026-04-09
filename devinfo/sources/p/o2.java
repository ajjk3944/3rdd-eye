package p;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30802b;

    public /* synthetic */ o2(int i4, Object obj) {
        this.f30801a = i4;
        this.f30802b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        switch (this.f30801a) {
            case 0:
                break;
            default:
                xg.h hVarK0 = ((xg.g) this.f30802b).k0();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                String str = string;
                hVarK0.getClass();
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                nk.k.d(deviceInfoApp, "instance");
                hVarK0.g(deviceInfoApp);
                Object objD = hVarK0.f37106b.d();
                nk.k.b(objD);
                hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, str, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262141, null));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        int i12 = this.f30801a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        switch (this.f30801a) {
            case 0:
                z2 z2Var = (z2) this.f30802b;
                Editable text = z2Var.f30931p.getText();
                z2Var.f30923b0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                z2Var.v(!zIsEmpty);
                int i12 = 8;
                if (z2Var.W && !z2Var.P && zIsEmpty) {
                    z2Var.f30936u.setVisibility(8);
                    i12 = 0;
                }
                z2Var.f30938w.setVisibility(i12);
                z2Var.r();
                z2Var.u();
                if (z2Var.K != null && !TextUtils.equals(charSequence, z2Var.f30922a0)) {
                    z2Var.K.i(charSequence.toString());
                }
                z2Var.f30922a0 = charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i4, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i4, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i4, int i10, int i11, CharSequence charSequence) {
    }
}
