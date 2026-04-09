package x2;

import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f47662b;

    public n(MainActivity mainActivity) {
        this.f47662b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f47662b.f22090h.dismiss();
    }
}
