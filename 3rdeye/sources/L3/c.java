package L3;

import android.util.Property;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes2.dex */
public final class c extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4040a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f10) {
        ViewGroup viewGroup2 = viewGroup;
        Float f11 = f10;
        float fFloatValue = f11.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
