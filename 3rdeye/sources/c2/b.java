package C2;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.io.File;
import java.util.ArrayList;
import y2.C5799a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f868c;

    public /* synthetic */ b(View.OnClickListener onClickListener, int i) {
        this.f867b = i;
        this.f868c = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        View.OnClickListener onClickListener = this.f868c;
        switch (this.f867b) {
            case 0:
                D2.c cVar = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.f22146y;
                ((com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a) onClickListener).finish();
                break;
            default:
                C5799a.ViewOnClickListenerC0556a viewOnClickListenerC0556a = (C5799a.ViewOnClickListenerC0556a) onClickListener;
                C5799a c5799a = viewOnClickListenerC0556a.f48013o;
                ArrayList arrayList = c5799a.f48008k;
                File file = (File) arrayList.get(viewOnClickListenerC0556a.getAdapterPosition());
                c5799a.f48009l = file;
                if (file.delete()) {
                    Toast.makeText(c5799a.f48007j, R.string.video_deleted, 0).show();
                }
                arrayList.remove(viewOnClickListenerC0556a.getAdapterPosition());
                c5799a.notifyDataSetChanged();
                break;
        }
    }
}
