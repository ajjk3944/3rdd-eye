package j4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l4.AbstractC2649c;
import o4.C2764c;

/* renamed from: j4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2585q {

    /* renamed from: a, reason: collision with root package name */
    public final String f21440a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f21441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f21443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.z f21444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.z f21445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f21447h;

    public C2585q(String str, Field field, Method method, g4.z zVar, g4.z zVar2, boolean z6, boolean z7) {
        this.f21443d = method;
        this.f21444e = zVar;
        this.f21445f = zVar2;
        this.f21446g = z6;
        this.f21447h = z7;
        this.f21440a = str;
        this.f21441b = field;
        this.f21442c = field.getName();
    }

    public final void a(C2764c c2764c, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Method method = this.f21443d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new g4.p(A.f.m("Accessor ", AbstractC2649c.d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            objInvoke = this.f21441b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c2764c.m(this.f21440a);
        this.f21444e.c(c2764c, objInvoke);
    }
}
