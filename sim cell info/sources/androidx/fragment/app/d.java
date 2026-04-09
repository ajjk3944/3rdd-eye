package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public abstract class d {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.M(context, str, bundle);
    }

    public abstract View f(int i2);

    public abstract boolean g();
}
