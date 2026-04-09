package com.google.vr.dynamite.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f39141a;

    /* renamed from: b, reason: collision with root package name */
    private ILoadedInstanceCreator f39142b;

    /* renamed from: c, reason: collision with root package name */
    private final e f39143c;

    public c(e eVar) {
        this.f39143c = eVar;
    }

    private static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e11);
        } catch (InstantiationException e12) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e12);
        } catch (NoSuchMethodException e13) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e13);
        } catch (InvocationTargetException e14) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e14);
        }
    }

    public final synchronized ILoadedInstanceCreator a(Context context) {
        ILoadedInstanceCreator aVar;
        try {
            if (this.f39142b == null) {
                IBinder iBinderC = c(b(context).getClassLoader());
                if (iBinderC == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    aVar = iInterfaceQueryLocalInterface instanceof ILoadedInstanceCreator ? (ILoadedInstanceCreator) iInterfaceQueryLocalInterface : new a(iBinderC);
                }
                this.f39142b = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f39142b;
    }

    public final synchronized Context b(Context context) {
        if (this.f39141a == null) {
            try {
                this.f39141a = context.createPackageContext(this.f39143c.a(), 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new d();
            }
        }
        return this.f39141a;
    }
}
