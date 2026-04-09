package x3;

import android.os.IBinder;
import java.lang.reflect.Field;
import s3.AbstractC7901p;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class b extends InterfaceC8420a.AbstractBinderC2309a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f65329a;

    private b(Object obj) {
        this.f65329a = obj;
    }

    public static Object f(InterfaceC8420a interfaceC8420a) throws SecurityException {
        if (interfaceC8420a instanceof b) {
            return ((b) interfaceC8420a).f65329a;
        }
        IBinder iBinderAsBinder = interfaceC8420a.asBinder();
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
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC7901p.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static InterfaceC8420a n0(Object obj) {
        return new b(obj);
    }
}
