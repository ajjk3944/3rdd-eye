package y3;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(NestedScrollView nestedScrollView, float f10) {
        try {
            nestedScrollView.setFrameContentVelocity(f10);
        } catch (LinkageError unused) {
        }
    }
}
