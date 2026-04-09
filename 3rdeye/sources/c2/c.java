package C2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.BackgroundPermissions;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f870c;

    public /* synthetic */ c(Object obj, int i) {
        this.f869b = i;
        this.f870c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f870c;
        switch (this.f869b) {
            case 0:
                D2.c cVar = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.f22146y;
                ((com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a) obj).requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
                break;
            case 1:
                int i10 = BackgroundPermissions.f22184k;
                BackgroundPermissions backgroundPermissions = (BackgroundPermissions) obj;
                backgroundPermissions.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", backgroundPermissions.getPackageName(), null));
                intent.addFlags(268435456);
                backgroundPermissions.startActivityForResult(intent, 101);
                break;
            default:
                com.vungle.ads.internal.presenter.h.m96showGdpr$lambda8((com.vungle.ads.internal.presenter.h) obj, dialogInterface, i);
                break;
        }
    }
}
