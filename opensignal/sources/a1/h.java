package a1;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.telephony.CellIdentity;
import android.telephony.euicc.EuiccManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ ImageDecoder i(Object obj) {
        return (ImageDecoder) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable j(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ EuiccManager m(Object obj) {
        return (EuiccManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return CellIdentity.class;
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
