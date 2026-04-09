package com.wifihacker.detector.mvp.view.activity.tools;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.databinding.g;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import java.io.IOException;
import l8.s;
import l8.w0;

/* loaded from: classes3.dex */
public class PingActivity extends BaseActivity<s> implements r8.b, TextWatcher {

    /* renamed from: j, reason: collision with root package name */
    public q8.b f20486j;

    /* renamed from: k, reason: collision with root package name */
    public f8.a f20487k;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w0 f20489a;

        public b(w0 w0Var) {
            this.f20489a = w0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            PingActivity.this.f20486j.h(this.f20489a);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w0 f20491a;

        public c(w0 w0Var) {
            this.f20491a = w0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            PingActivity.this.f20486j.g(this.f20491a);
        }
    }

    public class d extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f20493a;

        public class a implements m8.b {
            public a() {
            }

            @Override // m8.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                d.this.publishProgress(str);
            }
        }

        public d(String str) {
            this.f20493a = str;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) throws IOException {
            PingActivity pingActivity = PingActivity.this;
            pingActivity.f20487k = pingActivity.f20486j.i(this.f20493a);
            PingActivity.this.f20487k.b(new a());
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r22) {
            super.onPostExecute(r22);
            ((s) PingActivity.this.f20418i).A.setVisibility(8);
            ((s) PingActivity.this.f20418i).f23322w.setText(R.string.ping);
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
            super.onProgressUpdate(strArr);
            PingActivity.this.f20486j.f(this.f20493a, strArr[0]);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((s) PingActivity.this.f20418i).B.fullScroll(130);
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.ping);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((s) this.f20418i).D.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_ping;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        p8.c cVar = new p8.c();
        this.f20486j = cVar;
        cVar.e(this);
        this.f20486j.j(this);
        g8.s.d(this, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
        ((s) this.f20418i).f23323x.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void h0() {
        String string = ((s) this.f20418i).f23323x.getText().toString();
        if (TextUtils.isEmpty(string)) {
            ((s) this.f20418i).f23323x.setError(getString(R.string.ping_null_tip));
            return;
        }
        String strReplace = string.replace(" ", "");
        ((s) this.f20418i).C.setVisibility(8);
        ((s) this.f20418i).B.setVisibility(0);
        ((s) this.f20418i).A.setVisibility(0);
        g8.s.l(this, ((s) this.f20418i).f23323x, false);
        ((s) this.f20418i).f23324y.removeAllViews();
        ((s) this.f20418i).f23322w.setText(R.string.stop);
        i0(strReplace);
    }

    public final void i0(String str) {
        new d(str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // r8.b
    public void j(String str, String str2, String str3) {
        com.wifihacker.detector.mvp.view.widget.a aVar = new com.wifihacker.detector.mvp.view.widget.a(this);
        aVar.b(str, str2, str3);
        View view = new View(this);
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.text_light_grey));
        ((s) this.f20418i).f23324y.addView(aVar);
        ((s) this.f20418i).f23324y.addView(view, new LinearLayout.LayoutParams(-1, g8.s.g(this, 0.5f)));
    }

    public final void j0() {
        w0 w0Var = (w0) g.d(LayoutInflater.from(this), R.layout.dialog_ping_setting, null, false);
        this.f20486j.k(w0Var);
        new b.a(this).o(R.string.settings).q(w0Var.x()).l(R.string.save, new c(w0Var)).h(R.string.reset, new b(w0Var)).j(R.string.cancel, null).a().show();
    }

    @Override // r8.b
    public void n() {
        ((s) this.f20418i).B.post(new e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ping_menu, menu);
        return true;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity, androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_setting) {
            return super.onMenuItemClick(menuItem);
        }
        j0();
        return true;
    }

    public void onPingClick(View view) throws IOException {
        if (((s) this.f20418i).A.getVisibility() == 8) {
            h0();
            return;
        }
        f8.a aVar = this.f20487k;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((s) this.f20418i).B.setVisibility(8);
        ((s) this.f20418i).C.setVisibility(0);
    }
}
