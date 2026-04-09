package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f25393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25394b;

    /* renamed from: c, reason: collision with root package name */
    public Method f25395c;

    /* renamed from: d, reason: collision with root package name */
    public Context f25396d;

    public z(View view, String str) {
        this.f25393a = view;
        this.f25394b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f25395c == null) {
            View view2 = this.f25393a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f25394b;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbA = d.h.A("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbA.append(view2.getClass());
                    sbA.append(str);
                    throw new IllegalStateException(sbA.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f25395c = method;
                        this.f25396d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f25395c.invoke(this.f25396d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
