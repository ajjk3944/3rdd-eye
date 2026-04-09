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
public abstract class o1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private q1 f7091a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7092b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f7093c;

    /* renamed from: d, reason: collision with root package name */
    private Button f7094d;

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f7092b.y().a(this.f7091a));
        String strB = this.f7092b.y().b(this.f7091a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f7093c = textView;
        textView.setText(v2Var.toString());
        this.f7093c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f7091a.d() + " - " + this.f7091a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(android.R.id.content), this.f7092b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f7094d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ed
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5965a.a(view);
            }
        });
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
        this.f7092b.y().a(this.f7091a, (Context) this, false);
        return true;
    }

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.f7091a = q1Var;
        this.f7092b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f7092b.y().a(this.f7091a, (Context) this, true);
    }

    private boolean a() {
        return (this.f7091a == null || this.f7092b == null) ? false : true;
    }
}
