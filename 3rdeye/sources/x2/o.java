package x2;

import android.content.Intent;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.DetectInfraredActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;
import t4.C5606d;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f47663b;

    public o(MainActivity mainActivity) {
        this.f47663b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.f47663b;
        if (!e8.f.a(mainActivity, "android.permission.CAMERA")) {
            C5606d.B(mainActivity, mainActivity.f22097p, new H8.e(this, 8));
        } else {
            mainActivity.startActivity(new Intent(mainActivity, (Class<?>) DetectInfraredActivity.class));
            mainActivity.f22089g.dismiss();
        }
    }
}
