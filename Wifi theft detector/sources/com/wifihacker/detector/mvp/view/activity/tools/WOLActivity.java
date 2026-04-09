package com.wifihacker.detector.mvp.view.activity.tools;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.wifihacker.detector.common.wol.WakeOnLanClient;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.k;
import g8.m;
import g8.r;
import g8.s;
import java.io.IOException;
import l8.i0;
import l8.y0;
import s8.d;

/* loaded from: classes3.dex */
public class WOLActivity extends BaseActivity<i0> implements r8.c, d.a {

    /* renamed from: j, reason: collision with root package name */
    public d f20497j;

    /* renamed from: k, reason: collision with root package name */
    public q8.c f20498k;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20500a;

        public b(int i10) {
            this.f20500a = i10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            WOLActivity.this.f20498k.a(this.f20500a);
        }
    }

    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.b f20502a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f20503b;

        public c(androidx.appcompat.app.b bVar, y0 y0Var) {
            this.f20502a = bVar;
            this.f20503b = y0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WOLActivity.this.f0(this.f20502a, this.f20503b);
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.wake_on_lan);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((i0) this.f20418i).f23265y.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_wake_on_lan;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        p8.d dVar = new p8.d();
        this.f20498k = dVar;
        dVar.e(this);
        this.f20498k.g(this);
        this.f20498k.d();
        ((i0) this.f20418i).f23263w.setLayoutManager(new LinearLayoutManager(this));
        ViewDataBinding viewDataBinding = this.f20418i;
        ((i0) viewDataBinding).f23263w.setEmptyView(((i0) viewDataBinding).f23264x);
        d dVar2 = new d(this.f20498k.b(), this);
        this.f20497j = dVar2;
        ((i0) this.f20418i).f23263w.setAdapter(dVar2);
        s.d(this, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // s8.d.a
    public void a(View view, int i10) {
        e0(i10);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    @Override // r8.c
    public void c() {
        this.f20497j.notifyDataSetChanged();
    }

    public final void d0(y0 y0Var, int i10) {
        b.a aVarL = new b.a(this).o(R.string.wake_on_lan).q(y0Var.x()).l(R.string.wake, null);
        if (i10 >= 0 && i10 < this.f20498k.b().size()) {
            aVarL.h(R.string.delete, new b(i10));
        }
        androidx.appcompat.app.b bVarA = aVarL.j(R.string.cancel, null).a();
        bVarA.show();
        bVarA.i(-1).setOnClickListener(new c(bVarA, y0Var));
    }

    public final void e0(int i10) {
        y0 y0Var = (y0) g.d(LayoutInflater.from(this), R.layout.dialog_wake_on_lan, null, false);
        if (i10 < 0 || i10 >= this.f20498k.b().size()) {
            try {
                y0Var.f23362w.setText(m.a(this).getHostAddress());
            } catch (IOException e10) {
                k.c("WOLActivity showSettingDialog exception", e10);
                e10.printStackTrace();
            }
        } else {
            k8.c cVar = (k8.c) this.f20498k.b().get(i10);
            y0Var.f23363x.setText(cVar.b());
            y0Var.f23362w.setText(cVar.a());
            y0Var.f23364y.setText(cVar.c());
        }
        d0(y0Var, i10);
    }

    public final void f0(androidx.appcompat.app.b bVar, y0 y0Var) {
        String upperCase = y0Var.f23363x.getText().toString().toUpperCase();
        String string = y0Var.f23362w.getText().toString();
        String string2 = y0Var.f23364y.getText().toString();
        if (TextUtils.isEmpty(string2)) {
            y0Var.f23364y.setError(getString(R.string.can_not_empty));
            return;
        }
        if (TextUtils.isEmpty(string)) {
            y0Var.f23362w.setError(getString(R.string.can_not_empty));
        } else if (TextUtils.isEmpty(upperCase)) {
            y0Var.f23363x.setError(getString(R.string.mac_input_tip));
        } else {
            this.f20498k.f(bVar, upperCase, string, string2);
        }
    }

    @Override // r8.c
    public void l(WakeOnLanClient.WakeState wakeState, String str) {
        try {
            if (wakeState == WakeOnLanClient.WakeState.SUCCESS) {
                r.b(String.format(getString(R.string.wol_sent), str));
                return;
            }
            if (wakeState == WakeOnLanClient.WakeState.UNKNOWNHOST) {
                r.b(String.format(getString(R.string.wol_unknown_host), str));
            } else if (wakeState == WakeOnLanClient.WakeState.FAILED) {
                r.b(String.format(getString(R.string.wol_sent_failed), str));
            } else {
                r.b(String.format(getString(R.string.wol_sent_failed), str));
            }
        } catch (Exception e10) {
            k.c("toastMsg exception", e10);
        }
    }

    public void onAddClick(View view) {
        e0(-1);
    }
}
