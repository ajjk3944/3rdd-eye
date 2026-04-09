package X4;

import android.view.View;
import com.bumptech.glide.d;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.speed.SpeedActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpeedActivity f4193b;

    public /* synthetic */ a(SpeedActivity speedActivity, int i) {
        this.f4192a = i;
        this.f4193b = speedActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4192a;
        SpeedActivity speedActivity = this.f4193b;
        switch (i) {
            case 0:
                int i3 = SpeedActivity.f19295f0;
                speedActivity.finish();
                break;
            case 1:
                int i6 = SpeedActivity.f19295f0;
                speedActivity.C("KM/H");
                break;
            case 2:
                int i7 = SpeedActivity.f19295f0;
                speedActivity.C("MPH");
                break;
            case 3:
                int i8 = SpeedActivity.f19295f0;
                speedActivity.C("KN");
                break;
            case 4:
                int i9 = SpeedActivity.f19295f0;
                speedActivity.f19309c0 = System.currentTimeMillis();
                speedActivity.f19310d0.a(speedActivity.f19297P);
                break;
            default:
                int i10 = SpeedActivity.f19295f0;
                speedActivity.startActivity(d.x(speedActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                MyApplication.f18812d = true;
                break;
        }
    }
}
