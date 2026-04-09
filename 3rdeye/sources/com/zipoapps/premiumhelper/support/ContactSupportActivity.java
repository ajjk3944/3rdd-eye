package com.zipoapps.premiumhelper.support;

import G2.j;
import H8.e;
import J8.C0690e;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import b9.C2001h;
import b9.p;
import c.C2012j;
import c9.C2089j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.e;
import h.AbstractC4397a;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: ContactSupportActivity.kt */
/* loaded from: classes3.dex */
public final class ContactSupportActivity extends AppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f37060f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final p f37061c = C2001h.b(new e(this, 5));

    /* renamed from: d, reason: collision with root package name */
    public final p f37062d = C2001h.b(new C2089j(this, 3));

    /* renamed from: e, reason: collision with root package name */
    public final p f37063e = C2001h.b(new j(this, 5));

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        K8.a aVar = null;
        C2012j.a(this, null, 3);
        super.onCreate(bundle);
        setContentView(R.layout.activity_contact_support);
        C0690e.a(this, null, 3);
        Object value = this.f37061c.getValue();
        l.e(value, "getValue(...)");
        setSupportActionBar((MaterialToolbar) value);
        AbstractC4397a supportActionBar = getSupportActionBar();
        boolean z10 = true;
        if (supportActionBar != null) {
            supportActionBar.m(true);
        }
        String stringExtra = getIntent().getStringExtra(Scopes.EMAIL);
        if (stringExtra == null) {
            throw new IllegalStateException("No email address!");
        }
        String stringExtra2 = getIntent().getStringExtra("email_vip");
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (!e.a.a().i.j() || (stringExtra2 == null && !q.b0(stringExtra, ".vip", true))) {
            z10 = false;
        }
        AbstractC4397a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.o(z10 ? getString(R.string.contact_vip_support_title) : getString(R.string.contact_support_title));
        }
        Object value2 = this.f37063e.getValue();
        l.e(value2, "getValue(...)");
        ((EditText) value2).addTextChangedListener(new a());
        Object value3 = this.f37062d.getValue();
        l.e(value3, "getValue(...)");
        ((View) value3).setOnClickListener(new E8.a(this, stringExtra, stringExtra2, 2));
        SharedPreferences sharedPreferences = getSharedPreferences("theme_prefs", 0);
        l.e(sharedPreferences, "getSharedPreferences(...)");
        Gson gson = new Gson();
        if ((getResources().getConfiguration().uiMode & 48) != 32 ? (string = sharedPreferences.getString("light_theme", null)) != null : (string = sharedPreferences.getString("dark_theme", null)) != null) {
            aVar = (K8.a) gson.b(K8.a.class, string);
        }
        if (aVar != null) {
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        l.f(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onResume() {
        super.onResume();
        Object value = this.f37063e.getValue();
        l.e(value, "getValue(...)");
        ((EditText) value).requestFocus();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
            CharSequence charSequenceW0;
            int i12 = ContactSupportActivity.f37060f;
            Object value = ContactSupportActivity.this.f37062d.getValue();
            l.e(value, "getValue(...)");
            ((View) value).setEnabled(((charSequence == null || (charSequenceW0 = q.w0(charSequence)) == null) ? 0 : charSequenceW0.length()) >= 20);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        }
    }
}
