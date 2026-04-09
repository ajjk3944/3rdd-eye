package o7;

import O6.C;
import android.view.View;

/* compiled from: Views.java */
/* loaded from: classes.dex */
public final class e {
    public static View a(C c10, int i) {
        View viewFindViewById = c10.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("View with id [" + c10.getResources().getResourceName(i) + "] doesn't exist");
    }
}
