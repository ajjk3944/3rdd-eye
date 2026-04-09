package z4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import k4.h;
import r0.i;

/* loaded from: classes2.dex */
public abstract class b implements com.google.android.material.floatingactionbutton.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25328a;

    /* renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f25329b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25330c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final z4.a f25331d;

    /* renamed from: e, reason: collision with root package name */
    public h f25332e;

    /* renamed from: f, reason: collision with root package name */
    public h f25333f;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(k4.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f10509b0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f25329b.f10509b0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f10) {
            int colorForState = extendedFloatingActionButton.f10509b0.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f25329b.f10509b0.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (k4.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.M(extendedFloatingActionButton.f10509b0);
            } else {
                extendedFloatingActionButton.M(colorStateListValueOf);
            }
        }
    }

    public b(ExtendedFloatingActionButton extendedFloatingActionButton, z4.a aVar) {
        this.f25329b = extendedFloatingActionButton;
        this.f25328a = extendedFloatingActionButton.getContext();
        this.f25331d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public h b() {
        return this.f25333f;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void d() {
        this.f25331d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void f() {
        this.f25331d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public AnimatorSet g() {
        return l(m());
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final List h() {
        return this.f25330c;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void i(h hVar) {
        this.f25333f = hVar;
    }

    public AnimatorSet l(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.j("opacity")) {
            arrayList.add(hVar.f("opacity", this.f25329b, View.ALPHA));
        }
        if (hVar.j("scale")) {
            arrayList.add(hVar.f("scale", this.f25329b, View.SCALE_Y));
            arrayList.add(hVar.f("scale", this.f25329b, View.SCALE_X));
        }
        if (hVar.j("width")) {
            arrayList.add(hVar.f("width", this.f25329b, ExtendedFloatingActionButton.f10504g0));
        }
        if (hVar.j("height")) {
            arrayList.add(hVar.f("height", this.f25329b, ExtendedFloatingActionButton.f10505h0));
        }
        if (hVar.j("paddingStart")) {
            arrayList.add(hVar.f("paddingStart", this.f25329b, ExtendedFloatingActionButton.f10506i0));
        }
        if (hVar.j("paddingEnd")) {
            arrayList.add(hVar.f("paddingEnd", this.f25329b, ExtendedFloatingActionButton.f10507j0));
        }
        if (hVar.j("labelOpacity")) {
            arrayList.add(hVar.f("labelOpacity", this.f25329b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        k4.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final h m() {
        h hVar = this.f25333f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f25332e == null) {
            this.f25332e = h.d(this.f25328a, e());
        }
        return (h) i.g(this.f25332e);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void onAnimationStart(Animator animator) {
        this.f25331d.c(animator);
    }
}
