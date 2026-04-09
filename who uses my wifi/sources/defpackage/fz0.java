package defpackage;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fz0 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] i = {MenuItem.class};
    public final /* synthetic */ int f = 0;
    public Object g;
    public Object h;

    public /* synthetic */ fz0() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f) {
            case 0:
                Object obj = this.g;
                Method method = (Method) this.h;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.g).onMenuItemClick(((wd0) this.h).h(menuItem));
        }
    }

    public fz0(wd0 wd0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.h = wd0Var;
        this.g = onMenuItemClickListener;
    }
}
