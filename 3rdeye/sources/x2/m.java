package x2;

import android.content.Intent;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.CameraDetectorActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f47661b;

    public m(MainActivity mainActivity) {
        this.f47661b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity mainActivity = this.f47661b;
        mainActivity.f22090h.dismiss();
        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) CameraDetectorActivity.class));
    }
}
