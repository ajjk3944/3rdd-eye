package I4;

import N7.C1154e9;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import g5.InterfaceC4392b;
import java.lang.reflect.InvocationTargetException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC4392b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2448b;

    public /* synthetic */ c(Object obj, int i) {
        this.f2447a = i;
        this.f2448b = obj;
    }

    @Override // g5.InterfaceC4392b
    public final Object get() throws ClassNotFoundException {
        switch (this.f2447a) {
            case 0:
                String str = (String) this.f2448b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e4) {
                    throw new m(C1154e9.i("Could not instantiate ", str, "."), e4);
                } catch (InstantiationException e10) {
                    throw new m(C1154e9.i("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new m(androidx.work.s.d("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new m(androidx.work.s.d("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f2448b;
            default:
                return new j5.b((B4.e) this.f2448b);
        }
    }
}
