package de;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements cf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22196b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f22195a = i4;
        this.f22196b = obj;
    }

    @Override // cf.b
    public final Object get() throws ClassNotFoundException {
        switch (this.f22195a) {
            case 0:
                String str = (String) this.f22196b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new l(d.h.t("Could not instantiate ", str, "."), e2);
                } catch (InstantiationException e10) {
                    throw new l(d.h.t("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new l(u.t("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new l(u.t("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.f22196b;
            default:
                return new ef.c((wd.f) this.f22196b);
        }
    }
}
