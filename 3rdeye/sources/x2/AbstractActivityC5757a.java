package x2;

import android.R;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* compiled from: BaseActivity.java */
/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5757a extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC5757a f47639c;

    /* renamed from: d, reason: collision with root package name */
    public I2.m f47640d;

    public abstract int k();

    public abstract void l();

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        I2.a.c(this);
        this.f47639c = this;
        super.onCreate(bundle);
        setContentView(k());
        l();
        this.f47640d = new I2.m(this);
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public void onResume() {
        super.onResume();
        I2.a.c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
