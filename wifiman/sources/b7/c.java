package b7;

import com.tickaroo.tikxml.TypeAdapterNotFoundException;
import d7.InterfaceC5304a;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f32966a = new HashMap();

    c() {
    }

    void a(Type type, InterfaceC5304a interfaceC5304a) {
        this.f32966a.put(type, interfaceC5304a);
    }

    public InterfaceC5304a b(Type type) throws TypeAdapterNotFoundException {
        String name;
        Type typeA = e.a(type);
        InterfaceC5304a interfaceC5304a = (InterfaceC5304a) this.f32966a.get(typeA);
        if (interfaceC5304a != null) {
            return interfaceC5304a;
        }
        if (!(typeA instanceof Class)) {
            throw new TypeAdapterNotFoundException("No generated nor manually added TypeAdapter has been found for " + typeA.toString());
        }
        Class cls = (Class) typeA;
        StringBuilder sb2 = new StringBuilder();
        try {
            Package r32 = cls.getPackage();
            if (r32 != null && (name = r32.getName()) != null && name.length() > 0) {
                sb2.append(r32.getName());
                sb2.append('.');
            }
            sb2.append(cls.getSimpleName());
            sb2.append("$$TypeAdapter");
            try {
                InterfaceC5304a interfaceC5304a2 = (InterfaceC5304a) Class.forName(sb2.toString()).newInstance();
                this.f32966a.put(cls, interfaceC5304a2);
                return interfaceC5304a2;
            } catch (ClassNotFoundException e10) {
                if (!cls.getSimpleName().matches("\\$*AutoValue_.+")) {
                    throw new TypeAdapterNotFoundException("No TypeAdapter for class " + cls.getCanonicalName() + " found. Expected name of the type adapter is " + sb2.toString(), e10);
                }
                Class superclass = cls.getSuperclass();
                if (superclass != null) {
                    InterfaceC5304a interfaceC5304aB = b(superclass);
                    this.f32966a.put(cls, interfaceC5304aB);
                    return interfaceC5304aB;
                }
                throw new TypeAdapterNotFoundException("No TypeAdapter for class " + cls.getCanonicalName() + " found. Expected name of the type adapter is " + sb2.toString(), e10);
            }
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new TypeAdapterNotFoundException("No TypeAdapter for class " + cls.getCanonicalName() + " found. Expected name of the type adapter is " + sb2.toString(), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new TypeAdapterNotFoundException("No TypeAdapter for class " + cls.getCanonicalName() + " found. Expected name of the type adapter is " + sb2.toString(), e);
        }
    }
}
