package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OssLicensesActivity extends androidx.appcompat.app.c {

    /* renamed from: D, reason: collision with root package name */
    private G3.e f36917D;

    /* renamed from: E, reason: collision with root package name */
    private String f36918E = "";

    /* renamed from: F, reason: collision with root package name */
    private ScrollView f36919F = null;

    /* renamed from: G, reason: collision with root package name */
    private TextView f36920G = null;

    /* renamed from: H, reason: collision with root package name */
    private int f36921H = 0;

    /* renamed from: I, reason: collision with root package name */
    private Task f36922I;

    /* renamed from: J, reason: collision with root package name */
    private Task f36923J;

    /* renamed from: N, reason: collision with root package name */
    private b f36924N;

    /* renamed from: X, reason: collision with root package name */
    a f36925X;

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(K3.b.f10271a);
        this.f36924N = b.b(this);
        this.f36917D = (G3.e) getIntent().getParcelableExtra("license");
        if (H0() != null) {
            H0().w(this.f36917D.c());
            H0().t(true);
            H0().s(true);
            H0().u(null);
        }
        ArrayList arrayList = new ArrayList();
        j jVarC = this.f36924N.c();
        Task taskG = jVarC.g(new h(jVarC, this.f36917D));
        this.f36922I = taskG;
        arrayList.add(taskG);
        j jVarC2 = this.f36924N.c();
        Task taskG2 = jVarC2.g(new f(jVarC2, getPackageName()));
        this.f36923J = taskG2;
        arrayList.add(taskG2);
        Tasks.whenAll(arrayList).addOnCompleteListener(new d(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f36921H = bundle.getInt("scroll_pos");
    }

    @Override // c.AbstractActivityC4155j, s1.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.f36920G;
        if (textView == null || this.f36919F == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.f36920G.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.f36919F.getScrollY())));
    }
}
