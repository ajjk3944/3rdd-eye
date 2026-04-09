package B3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public M0.b f543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f545c;

    public /* synthetic */ c(int i, View view) {
        this.f544b = i;
        this.f545c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f544b) {
            case 0:
                d dVar = (d) this.f545c;
                dVar.setIndeterminate(false);
                dVar.d(dVar.f547b);
                break;
            case 1:
                d dVar2 = (d) this.f545c;
                if (!dVar2.f553h) {
                    dVar2.setVisibility(dVar2.i);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.f545c).f18218C;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f544b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f545c;
                ColorStateList colorStateList = materialCheckBox.f18218C;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f18222G, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
