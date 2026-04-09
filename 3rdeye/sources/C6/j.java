package C6;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import w6.C5738b;
import w6.EnumC5737a;

/* compiled from: ImageUtils.kt */
/* loaded from: classes.dex */
public final class j {
    public static C5738b a(PictureDrawable pictureDrawable, Uri imageUrl) {
        kotlin.jvm.internal.l.f(imageUrl, "imageUrl");
        return new C5738b(D0.b.a(pictureDrawable), imageUrl, EnumC5737a.MEMORY);
    }
}
