package o;

import android.content.Context;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f44569a;

    /* renamed from: b, reason: collision with root package name */
    public final View f44570b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.view.menu.i f44571c;

    public M(Context context, View view, int i) {
        this.f44570b = view;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.f44569a = fVar;
        fVar.f14435e = new K(this);
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(R.attr.popupMenuStyle, context, view, fVar, false);
        this.f44571c = iVar;
        iVar.f14491f = i;
        iVar.f14494j = new L(this);
    }
}
