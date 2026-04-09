package com.liuzh.deviceinfo.pro.account.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b5.o0;
import b5.u0;
import b5.y0;
import b5.z;
import bh.c;
import ca.b;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.AccountActivity;
import e4.m0;
import e4.v0;
import eg.d;
import hg.a;
import hh.k;
import hh.v;
import java.util.WeakHashMap;
import km.n;
import t7.m;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class RegisterActivity extends a implements y0 {
    public static final o0 B = new o0(7);

    @Override // b5.y0
    public final void d(Bundle bundle, String str) {
        if (!str.equals("VerifyEmailResult")) {
            if (str.equals("ConfirmPwdResult")) {
                a.B(this, R.string.register_successful);
                startActivity(new Intent(this, (Class<?>) AccountActivity.class));
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
        bundle2.putInt("vtype", 1);
        aVar.k(k.class, bundle2, k.class.getSimpleName());
        aVar.g();
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        z zVarC = s().C(R.id.content_container);
        if (!nk.k.a(zVarC != null ? zVarC.getClass() : null, k.class)) {
            finish();
            return;
        }
        m mVar = new m(this);
        mVar.y(R.string.exit_register);
        mVar.v(R.string.exit_register_msg);
        mVar.x(R.string.confirm, new d(3, this));
        mVar.w(R.string.cancel, null);
        mVar.A();
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = c.f2188a;
        if (c.c()) {
            finish();
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_register, (ViewGroup) null, false);
        int i4 = R.id.btn_back;
        ImageView imageView = (ImageView) e.s(R.id.btn_back, viewInflate);
        if (imageView != null) {
            i4 = R.id.content_container;
            FrameLayout frameLayout = (FrameLayout) e.s(R.id.content_container, viewInflate);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                n nVar = new n(linearLayout, imageView, frameLayout);
                setContentView(linearLayout);
                imageView.setOnClickListener(new com.applovin.mediation.nativeAds.a(7, this));
                if (bundle == null) {
                    u0 u0VarS = s();
                    u0VarS.getClass();
                    b5.a aVar = new b5.a(u0VarS);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("vtype", 1);
                    bundle2.putBoolean("key.show_login_entrance", getIntent().getBooleanExtra("key.show_login_entrance", true));
                    aVar.k(v.class, bundle2, v.class.getSimpleName());
                    aVar.g();
                }
                s().b0("VerifyEmailResult", this, this);
                s().b0("ConfirmPwdResult", this, this);
                b bVar = new b(17, nVar);
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(linearLayout, bVar);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
