package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2730o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f22598a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f22598a = declaredField;
    }
}
