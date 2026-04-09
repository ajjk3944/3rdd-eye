package G2;

import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.BackgroundPermissions;

/* compiled from: BackgroundPermissions.java */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackgroundPermissions f1894b;

    public f(BackgroundPermissions backgroundPermissions) {
        this.f1894b = backgroundPermissions;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1894b.f22189j.dismiss();
    }
}
