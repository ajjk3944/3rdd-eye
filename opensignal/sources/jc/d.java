package jc;

import android.os.IBinder;
import android.os.IInterface;
import cc.s;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class d extends mc.a implements b {

    /* renamed from: e, reason: collision with root package name */
    public final Object f13590e;

    public d(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f13590e = obj;
    }

    public static b U(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object V(b bVar) throws SecurityException {
        if (bVar instanceof d) {
            return ((d) bVar).f13590e;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(c7.a.l(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        s.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
