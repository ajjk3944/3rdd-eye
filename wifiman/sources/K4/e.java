package k4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class e extends AbstractBinderC6391b implements f {
    public static f c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder);
    }
}
