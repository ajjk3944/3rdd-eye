package androidx.work;

import android.content.Context;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17049a = m.g("WorkerFactory");

    public final l a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f17049a;
        l lVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(l.class);
        } catch (Throwable th) {
            m.e().d(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                lVar = (l) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                m.e().d(str2, "Could not instantiate " + str, th2);
            }
        }
        if (lVar == null || !lVar.isUsed()) {
            return lVar;
        }
        throw new IllegalStateException(Oo.h("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
