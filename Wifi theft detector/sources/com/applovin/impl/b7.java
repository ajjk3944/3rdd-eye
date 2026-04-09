package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class b7 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5608a;

    /* renamed from: b, reason: collision with root package name */
    private String f5609b;

    /* renamed from: c, reason: collision with root package name */
    private String f5610c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f5610c);
        intent.putExtra("android.intent.extra.TITLE", this.f5609b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f5609b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f5608a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.f5608a = kVar;
        this.f5609b = str;
        this.f5610c = str2;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f5609b);
        ((TextView) findViewById(R.id.textView)).setText(this.f5610c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
