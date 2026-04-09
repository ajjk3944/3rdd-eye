package com.wifihacker.detector.mvp.view.activity.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.activity.n;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity implements Toolbar.h {

    /* renamed from: h, reason: collision with root package name */
    public x8.a f20417h = null;

    /* renamed from: i, reason: collision with root package name */
    public ViewDataBinding f20418i;

    public class a extends n {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.n
        public void d() {
            BaseActivity.this.Y();
        }
    }

    public boolean S() {
        return true;
    }

    public abstract String T();

    public abstract Toolbar U();

    public abstract int V();

    public abstract void W(Bundle bundle);

    public final void X() {
        Toolbar toolbarU = U();
        if (toolbarU != null) {
            String strT = T();
            if (TextUtils.isEmpty(strT)) {
                toolbarU.setTitle(R.string.app_name);
            } else {
                toolbarU.setTitle(strT);
            }
            P(toolbarU);
            G().r(true);
            toolbarU.setOnMenuItemClickListener(this);
        }
    }

    public void Y() {
        finish();
    }

    public abstract void Z();

    public abstract void a0();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (S()) {
            setRequestedOrientation(1);
        }
        getOnBackPressedDispatcher().h(this, new a(true));
        int iV = V();
        if (iV != -1) {
            this.f20418i = g.f(this, iV);
            X();
            Z();
            W(bundle);
            a0();
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        Y();
        return true;
    }
}
