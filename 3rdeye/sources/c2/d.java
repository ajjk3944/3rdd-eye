package C2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import b9.C1992A;
import b9.n;
import com.applovin.impl.C2139p0;
import com.applovin.impl.c2;
import com.zipoapps.premiumhelper.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f872c;

    public /* synthetic */ d(Object obj, int i) {
        this.f871b = i;
        this.f872c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f872c;
        switch (this.f871b) {
            case 0:
                D2.c cVar = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.f22146y;
                ((com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a) obj).finish();
                break;
            case 1:
                ((c2) obj).a(dialogInterface, i);
                break;
            case 2:
                C2139p0.b((Uri) obj, dialogInterface, i);
                break;
            default:
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f37015d.getClass();
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    context.startActivity(intent);
                    e.a.a().f();
                    C1992A c1992a = C1992A.f18074a;
                    break;
                } catch (Throwable th) {
                    n.a(th);
                }
        }
    }
}
