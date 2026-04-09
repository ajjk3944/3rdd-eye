package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b7 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f3779a;

    /* renamed from: b, reason: collision with root package name */
    private String f3780b;

    /* renamed from: c, reason: collision with root package name */
    private String f3781c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f3781c);
        intent.putExtra("android.intent.extra.TITLE", this.f3780b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f3780b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f3779a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.f3779a = kVar;
        this.f3780b = str;
        this.f3781c = str2;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f3780b);
        ((TextView) findViewById(R.id.textView)).setText(this.f3781c);
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
