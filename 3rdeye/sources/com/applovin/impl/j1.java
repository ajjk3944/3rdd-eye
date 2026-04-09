package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class j1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private l1 f19551a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f19552b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f19553c;

    /* renamed from: d, reason: collision with root package name */
    private Button f19554d;

    private void b() {
        n2 n2Var = new n2();
        n2Var.a(this.f19552b.z().a(this.f19551a));
        String strB = this.f19552b.z().b(this.f19551a.a());
        if (strB != null) {
            n2Var.a("\nBid Response Preview:\n");
            n2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f19553c = textView;
        textView.setText(n2Var.toString());
        this.f19553c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f19551a.c() + " - " + this.f19551a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        r7.a(findViewById(android.R.id.content), this.f19552b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f19554d = button;
        button.setOnClickListener(new D8.f(this, 2));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f19552b.z().a(this.f19551a, (Context) this, false);
        return true;
    }

    public void a(l1 l1Var, com.applovin.impl.sdk.k kVar) {
        this.f19551a = l1Var;
        this.f19552b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f19552b.z().a(this.f19551a, (Context) this, true);
    }

    private boolean a() {
        return (this.f19551a == null || this.f19552b == null) ? false : true;
    }
}
