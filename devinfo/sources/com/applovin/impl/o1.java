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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private q1 f4930a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f4931b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f4932c;

    /* renamed from: d, reason: collision with root package name */
    private Button f4933d;

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f4931b.y().a(this.f4930a));
        String strB = this.f4931b.y().b(this.f4930a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f4932c = textView;
        textView.setText(v2Var.toString());
        this.f4932c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f4930a.d() + " - " + this.f4930a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(android.R.id.content), this.f4931b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f4933d = button;
        button.setOnClickListener(new e9(1, this));
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
        this.f4931b.y().a(this.f4930a, (Context) this, false);
        return true;
    }

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.f4930a = q1Var;
        this.f4931b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f4931b.y().a(this.f4930a, (Context) this, true);
    }

    private boolean a() {
        return (this.f4930a == null || this.f4931b == null) ? false : true;
    }
}
