package j4;

import h4.InterfaceC2366b;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2577i extends g4.z {

    /* renamed from: d, reason: collision with root package name */
    public static final C2576h f21421d = new C2576h();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21422a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21423b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21424c = new HashMap();

    public C2577i(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC2366b interfaceC2366b = (InterfaceC2366b) field2.getAnnotation(InterfaceC2366b.class);
                if (interfaceC2366b != null) {
                    strName = interfaceC2366b.value();
                    for (String str : interfaceC2366b.alternate()) {
                        this.f21422a.put(str, r42);
                    }
                }
                this.f21422a.put(strName, r42);
                this.f21423b.put(string, r42);
                this.f21424c.put(r42, strName);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        if (c2762a.B() == 9) {
            c2762a.x();
            return null;
        }
        String strZ = c2762a.z();
        Enum r02 = (Enum) this.f21422a.get(strZ);
        return r02 == null ? (Enum) this.f21423b.get(strZ) : r02;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c2764c.w(r32 == null ? null : (String) this.f21424c.get(r32));
    }
}
