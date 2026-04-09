package al;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.b4;
import p.l;
import qk.h;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f844a;

    public /* synthetic */ f(Toolbar toolbar) {
        this.f844a = toolbar;
    }

    public static f a(View view) {
        int i10 = h.logo;
        if (((ImageView) b4.A(view, i10)) != null) {
            Toolbar toolbar = (Toolbar) view;
            int i11 = h.toolbarTitle;
            if (((TextView) b4.A(view, i11)) != null) {
                return new f(toolbar);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
