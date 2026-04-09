package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f11009a;

    /* renamed from: d, reason: collision with root package name */
    public final String f11010d;

    /* renamed from: g, reason: collision with root package name */
    public Method f11011g;

    /* renamed from: r, reason: collision with root package name */
    public Context f11012r;

    public c0(View view, String str) {
        this.f11009a = view;
        this.f11010d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f11011g == null) {
            View view2 = this.f11009a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f11010d;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbU = c7.a.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbU.append(view2.getClass());
                    sbU.append(str);
                    throw new IllegalStateException(sbU.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f11011g = method;
                        this.f11012r = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f11011g.invoke(this.f11012r, view);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
