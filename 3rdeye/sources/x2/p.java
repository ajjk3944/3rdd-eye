package x2;

import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public final class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f47664b;

    public p(MainActivity mainActivity) {
        this.f47664b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f47664b.f22089g.dismiss();
    }
}
