package C2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.zipoapps.premiumhelper.e;
import e8.AbstractC4324a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f866c;

    public /* synthetic */ a(Object obj, int i) {
        this.f865b = i;
        this.f866c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.f866c;
        switch (this.f865b) {
            case 0:
                D2.c cVar = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.f22146y;
                com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a aVar = (com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a) obj;
                aVar.getClass();
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", aVar.getPackageName(), null));
                aVar.startActivityForResult(intent, 123);
                break;
            default:
                ((AbstractC4324a) obj).b();
                dialogInterface.dismiss();
                break;
        }
    }
}
