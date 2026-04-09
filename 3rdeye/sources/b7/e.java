package B7;

import A9.C0583j;
import C.S;
import H6.I;
import U9.z;
import W.Y;
import a7.u;
import a8.AbstractC1669a;
import a8.C1671c;
import a8.C1673e;
import a8.HandlerThreadC1675g;
import a9.InterfaceC1676a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.view.View;
import b9.C1999f;
import b9.C2001h;
import b9.n;
import b9.p;
import c8.C2075b;
import com.google.gson.internal.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import m0.C5308a;
import org.json.JSONObject;
import p7.InterfaceC5474f;
import p7.InterfaceC5475g;
import p9.InterfaceC5480a;
import sa.i;
import sa.k;
import t4.j;
import u4.InterfaceC5634c;

/* compiled from: TemplateProvider.kt */
/* loaded from: classes.dex */
public final class e implements f, I.c, g, InterfaceC1676a, InterfaceC5475g, u, sa.d, InterfaceC5634c {

    /* renamed from: d, reason: collision with root package name */
    public static e f581d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f582b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f583c;

    public /* synthetic */ e(Object obj, int i) {
        this.f582b = i;
        this.f583c = obj;
    }

    @Override // sa.d
    public void c(sa.b call, sa.u uVar) {
        l.g(call, "call");
        boolean zD = uVar.f46333a.d();
        C0583j c0583j = (C0583j) this.f583c;
        if (!zD) {
            c0583j.resumeWith(n.a(new i(uVar)));
            return;
        }
        Object obj = uVar.f46334b;
        if (obj != null) {
            c0583j.resumeWith(obj);
            return;
        }
        z zVarA = call.A();
        zVarA.getClass();
        Object objCast = k.class.cast(zVarA.f12799e.get(k.class));
        if (objCast == null) {
            C1999f c1999f = new C1999f();
            l.j(c1999f, l.class.getName());
            throw c1999f;
        }
        StringBuilder sb = new StringBuilder("Response from ");
        Method method = ((k) objCast).f46217a;
        Class<?> declaringClass = method.getDeclaringClass();
        if (declaringClass == null) {
            IllegalStateException illegalStateException = new IllegalStateException("method.declaringClass".concat(" must not be null"));
            l.j(illegalStateException, l.class.getName());
            throw illegalStateException;
        }
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        c0583j.resumeWith(n.a(new C1999f(sb.toString())));
    }

    @Override // p7.InterfaceC5475g
    public View d(String tag) {
        l.f(tag, "tag");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f583c;
        l.f(concurrentHashMap, "<this>");
        Object obj = concurrentHashMap.get(tag);
        if (obj != null) {
            return ((InterfaceC5474f) obj).a();
        }
        throw new NoSuchElementException((String) null);
    }

    @Override // B7.f
    public /* synthetic */ Z6.b f(String str, JSONObject jSONObject) {
        return c.a(this, str, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // a7.u
    /* renamed from: get, reason: collision with other method in class */
    public Object mo0get(String name) {
        l.f(name, "name");
        return this.f583c.get(name);
    }

    @Override // sa.d
    public void i(sa.b call, Throwable th) {
        l.g(call, "call");
        ((C0583j) this.f583c).resumeWith(n.a(th));
    }

    @Override // p7.InterfaceC5475g
    public void m(String str, InterfaceC5474f interfaceC5474f, int i) {
        ((ConcurrentHashMap) this.f583c).put(str, interfaceC5474f);
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        Constructor constructor = (Constructor) this.f583c;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e11.getTargetException());
        }
    }

    @Override // I.c
    public void onFailure(Throwable th) {
        S.h("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        ((Y) this.f583c).b();
    }

    @Override // I.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public void p(Object obj, String str) {
        C1671c c1671c = (C1671c) this.f583c;
        C1673e c1673e = c1671c.f14241c;
        c1673e.getClass();
        c1673e.f14248a.edit().putString("blytics_user.".concat(str), String.valueOf(obj)).apply();
        Iterator<AbstractC1669a> it = c1671c.f14244f.iterator();
        while (it.hasNext()) {
            it.next().e(str, String.valueOf(obj));
        }
    }

    public void q(C2075b c2075b) {
        C1671c c1671c = (C1671c) this.f583c;
        if (c1671c.f14243e == null) {
            c1671c.f14243e = new HandlerThreadC1675g(c1671c);
        }
        HandlerThreadC1675g handlerThreadC1675g = c1671c.f14243e;
        C2075b c2075b2 = new C2075b(c2075b);
        synchronized (handlerThreadC1675g) {
            try {
                Message message = new Message();
                message.what = 1;
                message.obj = c2075b2;
                HandlerThreadC1675g.a aVar = handlerThreadC1675g.f14251c;
                if (aVar != null) {
                    aVar.sendMessage(message);
                } else {
                    handlerThreadC1675g.f14252d.add(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u4.InterfaceC5634c
    public Object zza() {
        switch (this.f582b) {
            case 10:
                t4.f fVar = (t4.f) ((InterfaceC5634c) this.f583c).zza();
                if (fVar != null) {
                    return fVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new j((Context) ((A3.c) ((I) this.f583c).f2053c).f36c);
        }
    }

    public e(InterfaceC5480a init) {
        this.f582b = 6;
        l.f(init, "init");
        this.f583c = C2001h.b(init);
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return ((p) this.f583c).getValue();
    }

    @Override // B7.f
    public Z6.b get(String str) {
        return (Z6.b) ((C5308a) this.f583c).get(str);
    }

    public e(int i) {
        this.f582b = i;
        switch (i) {
            case 2:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                l.f(timeUnit, "timeUnit");
                this.f583c = new Y9.j(X9.d.f13679h);
                break;
            case 7:
                this.f583c = new ConcurrentHashMap();
                break;
            default:
                this.f583c = new Rect();
                break;
        }
    }

    public e(com.zipoapps.premiumhelper.d dVar) {
        this.f582b = 4;
        this.f583c = new C1671c(dVar);
    }

    @Override // p7.InterfaceC5475g
    public void j(int i, String str) {
    }
}
