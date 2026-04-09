package e3;

import android.util.Property;
import android.view.ViewGroup;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19932a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f2 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f2 = (Float) obj2;
        float fFloatValue = f2.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f2);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
