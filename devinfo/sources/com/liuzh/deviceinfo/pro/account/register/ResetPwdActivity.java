package com.liuzh.deviceinfo.pro.account.register;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b5.u0;
import b5.y0;
import bh.c;
import ca.b;
import com.liuzh.deviceinfo.R;
import e4.m0;
import e4.v0;
import hg.a;
import hh.k;
import hh.v;
import java.util.WeakHashMap;
import km.o;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ResetPwdActivity extends a implements y0 {
    public static final /* synthetic */ int C = 0;
    public final bh.a B = new bh.a(this, 4);

    @Override // b5.y0
    public final void d(Bundle bundle, String str) {
        if (!str.equals("VerifyEmailResult")) {
            if (str.equals("ConfirmPwdResult")) {
                a.B(this, R.string.change_password_successful);
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        u0 u0VarS = s();
        u0VarS.getClass();
        b5.a aVar = new b5.a(u0VarS);
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putInt("vtype", 2);
        aVar.k(k.class, bundle2, k.class.getSimpleName());
        aVar.g();
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_reset_pwd, (ViewGroup) null, false);
        int i4 = R.id.btn_back;
        ImageView imageView = (ImageView) e.s(R.id.btn_back, viewInflate);
        if (imageView != null) {
            i4 = R.id.content_container;
            FrameLayout frameLayout = (FrameLayout) e.s(R.id.content_container, viewInflate);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                o oVar = new o();
                oVar.f28445a = linearLayout;
                oVar.f28446b = frameLayout;
                setContentView(linearLayout);
                setTitle(getIntent().hasExtra("key.email") ? R.string.change_password : R.string.forgot_password);
                c.d(this.B);
                imageView.setOnClickListener(new com.applovin.mediation.nativeAds.a(8, this));
                if (bundle == null) {
                    u0 u0VarS = s();
                    u0VarS.getClass();
                    b5.a aVar = new b5.a(u0VarS);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("vtype", 2);
                    bundle2.putString("email", getIntent().getStringExtra("key.email"));
                    aVar.k(v.class, bundle2, v.class.getSimpleName());
                    aVar.e();
                }
                s().b0("VerifyEmailResult", this, this);
                s().b0("ConfirmPwdResult", this, this);
                b bVar = new b(18, oVar);
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(linearLayout, bVar);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.g(this.B);
    }
}
