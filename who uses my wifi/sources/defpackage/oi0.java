package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oi0 extends fc1 implements u10 {
    public final Object g;

    public oi0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.g = obj;
    }

    public static u10 X0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof u10 ? (u10) iInterfaceQueryLocalInterface : new nu1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object l1(u10 u10Var) throws SecurityException {
        if (u10Var instanceof oi0) {
            return ((oi0) u10Var).g;
        }
        IBinder iBinderAsBinder = u10Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(ex0.f("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        ou1.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
