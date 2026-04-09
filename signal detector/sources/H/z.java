package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class z implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f20436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20437b;

    /* renamed from: c, reason: collision with root package name */
    public Method f20438c;

    /* renamed from: d, reason: collision with root package name */
    public Context f20439d;

    public z(View view, String str) {
        this.f20436a = view;
        this.f20437b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.f20438c == null) {
            View view2 = this.f20436a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f20437b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbQ = AbstractC1135f5.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbQ.append(view2.getClass());
                    sbQ.append(str);
                    throw new IllegalStateException(sbQ.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f20438c = method;
                        this.f20439d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f20438c.invoke(this.f20439d, view);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
