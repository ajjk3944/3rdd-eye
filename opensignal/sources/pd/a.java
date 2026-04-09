package pd;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import u7.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f20461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.checkbox.b f20462b;

    public a(com.google.android.material.checkbox.b bVar) {
        this.f20462b = bVar;
    }

    public final void a(Drawable drawable) {
        ColorStateList colorStateList = this.f20462b.K;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public final void b(Drawable drawable) {
        com.google.android.material.checkbox.b bVar = this.f20462b;
        ColorStateList colorStateList = bVar.K;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(bVar.O, colorStateList.getDefaultColor()));
        }
    }
}
