package bf;

import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.e0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2711b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f2710a = i10;
        this.f2711b = obj;
    }

    @Override // eg.b
    public final Object get() throws ClassNotFoundException {
        switch (this.f2710a) {
            case 0:
                String str = (String) this.f2711b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new p("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    e0.p("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e4) {
                    throw new p(h0.b.o("Could not instantiate ", str, "."), e4);
                } catch (InstantiationException e10) {
                    throw new p(h0.b.o("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new p(c7.a.p("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new p(c7.a.p("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f2711b;
            default:
                return new gg.c((se.f) this.f2711b);
        }
    }
}
