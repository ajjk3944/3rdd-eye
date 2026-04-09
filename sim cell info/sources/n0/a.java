package n0;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends PreferenceActivity {

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.d f3013b;

    private androidx.appcompat.app.d a() {
        if (this.f3013b == null) {
            this.f3013b = androidx.appcompat.app.d.e(this, null);
        }
        return this.f3013b;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public androidx.appcompat.app.a b() {
        return a().k();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return a().j();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        a().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().p(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        a().l();
        a().q(bundle);
        super.onCreate(bundle);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a().r();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().s(bundle);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        a().t();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        a().D(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        a().z(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a().A(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().B(view, layoutParams);
    }
}
