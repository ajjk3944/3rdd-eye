package j4;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import l4.AbstractC2649c;
import o4.C2762a;

/* renamed from: j4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2588u extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f21453e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f21454b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f21455c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21456d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f21453e = map;
    }

    public C2588u(Class cls, C2587t c2587t) throws SecurityException {
        super(c2587t);
        this.f21456d = new HashMap();
        R3.b bVar = AbstractC2649c.f21863a;
        Constructor constructorL = bVar.l(cls);
        this.f21454b = constructorL;
        AbstractC2649c.f(constructorL);
        String[] strArrO = bVar.o(cls);
        for (int i = 0; i < strArrO.length; i++) {
            this.f21456d.put(strArrO[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f21454b.getParameterTypes();
        this.f21455c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f21455c[i3] = f21453e.get(parameterTypes[i3]);
        }
    }

    @Override // j4.r
    public final Object d() {
        return (Object[]) this.f21455c.clone();
    }

    @Override // j4.r
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f21454b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            R3.b bVar = AbstractC2649c.f21863a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC2649c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC2649c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC2649c.b(constructor) + "' with args " + Arrays.toString(objArr), e9.getCause());
        }
    }

    @Override // j4.r
    public final void f(Object obj, C2762a c2762a, C2585q c2585q) {
        Object[] objArr = (Object[]) obj;
        String str = c2585q.f21442c;
        Integer num = (Integer) this.f21456d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC2649c.b(this.f21454b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = c2585q.f21445f.b(c2762a);
        if (objB != null || !c2585q.f21446g) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbQ = AbstractC1135f5.q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbQ.append(c2762a.n(false));
            throw new J0.c(sbQ.toString());
        }
    }
}
