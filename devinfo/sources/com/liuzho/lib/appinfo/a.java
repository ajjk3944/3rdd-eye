package com.liuzho.lib.appinfo;

import android.app.Dialog;
import android.widget.TextView;
import android.widget.Toast;
import com.liuzh.deviceinfo.R;
import com.liuzho.lib.appinfo.AppInfoActivity;
import i.d;
import i.e;
import t6.i0;
import ti.l;
import wi.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public String f21399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppInfoActivity.a f21400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppInfoActivity f21401c;

    public a(AppInfoActivity appInfoActivity, AppInfoActivity.a aVar, String str) {
        this.f21401c = appInfoActivity;
        this.f21400b = aVar;
    }

    @Override // ti.l
    public final void a(long j, long j8) {
        if (i0.l(this.f21401c)) {
            return;
        }
        AppInfoActivity.a aVar = this.f21400b;
        if (aVar.B()) {
            return;
        }
        if (this.f21399a == null) {
            this.f21399a = c.e(j8);
        }
        String str = c.e(j) + "/" + this.f21399a;
        Dialog dialog = aVar.f1867k0;
        if (dialog == null || !dialog.isShowing() || aVar.B()) {
            return;
        }
        aVar.f21397p0 = str;
        e eVar = (e) aVar.f1867k0;
        if (eVar == null || !eVar.isShowing()) {
            return;
        }
        String str2 = aVar.f21397p0;
        d dVar = eVar.g;
        dVar.f25256e = str2;
        TextView textView = dVar.f25272w;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    @Override // ti.l
    public final void c() {
        AppInfoActivity appInfoActivity = this.f21401c;
        if (i0.l(appInfoActivity)) {
            return;
        }
        AppInfoActivity.a aVar = this.f21400b;
        if (aVar.B()) {
            return;
        }
        aVar.d0(false, false);
        Toast.makeText(appInfoActivity, R.string.appi_failed, 0).show();
    }

    @Override // ti.l
    public final boolean stop() {
        return this.f21400b.f21398q0 || i0.l(this.f21401c);
    }

    @Override // ti.l
    public final void success() {
        AppInfoActivity appInfoActivity = this.f21401c;
        if (i0.l(appInfoActivity)) {
            return;
        }
        AppInfoActivity.a aVar = this.f21400b;
        if (aVar.B()) {
            return;
        }
        appInfoActivity.F.getClass();
        Toast.makeText(appInfoActivity, R.string.appi_export_successful, 0).show();
        aVar.d0(false, false);
    }
}
