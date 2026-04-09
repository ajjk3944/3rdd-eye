package y1;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class g {
    public static g a(ViewGroup viewGroup) {
        androidx.appcompat.app.z.a(viewGroup.getTag(e.transition_current_scene));
        return null;
    }

    public static void b(ViewGroup viewGroup, g gVar) {
        viewGroup.setTag(e.transition_current_scene, gVar);
    }
}
