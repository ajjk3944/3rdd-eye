package yg;

import ah.g;
import ah.h;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.R;
import t7.m;
import wg.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends hg.c {

    /* renamed from: p0, reason: collision with root package name */
    public zg.b f37614p0;

    @Override // b5.s, b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        f0(false);
        this.f37614p0 = zg.c.f(U(), this, new p(9));
    }

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        View viewInflate = q().inflate(R.layout.dialog_require_post_notifications, (ViewGroup) null, false);
        int i4 = R.id.btn_cancel;
        MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_cancel, viewInflate);
        if (materialButton != null) {
            i4 = R.id.btn_grant;
            MaterialButton materialButton2 = (MaterialButton) wb.e.s(R.id.btn_grant, viewInflate);
            if (materialButton2 != null) {
                m mVar = new m(W());
                mVar.y(R.string.post_notifications_permission);
                mVar.z((ScrollView) viewInflate);
                i.e eVarF = mVar.f();
                eVarF.setCancelable(false);
                eVarF.setOnShowListener(new b());
                materialButton.setOnClickListener(new h(eVarF, 2));
                materialButton2.setOnClickListener(new g(14, this, eVarF));
                return eVarF;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
