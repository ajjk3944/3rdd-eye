package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f12292h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12293a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12294b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f12295c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    public a f12296d = null;

    /* renamed from: e, reason: collision with root package name */
    public a f12297e = null;

    /* renamed from: f, reason: collision with root package name */
    public a f12298f = null;

    /* renamed from: g, reason: collision with root package name */
    public l3 f12299g = null;

    static {
        HashMap map = new HashMap();
        f12292h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final void a() {
        q qVarA = this.f12295c.a();
        try {
            Iterator it = this.f12293a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final Object b(Class cls, String str) {
        q qVarA = this.f12295c.a();
        try {
            Object obj = this.f12293a.get(str);
            if (cls.isInstance(obj)) {
                qVarA.close();
                return obj;
            }
            Class cls2 = (Class) f12292h.get(cls.getCanonicalName());
            if (obj != null && cls.isPrimitive() && cls2 != null) {
                if (cls2.isInstance(obj)) {
                    qVarA.close();
                    return obj;
                }
            }
            qVarA.close();
            return null;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c(Object obj, String str) {
        q qVarA = this.f12295c.a();
        try {
            this.f12293a.put(str, obj);
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
