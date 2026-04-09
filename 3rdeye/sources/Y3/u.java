package y3;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.impl.Oo;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import v3.C5677c;
import w3.C5719a;
import y3.j;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f48101e;

    /* renamed from: a, reason: collision with root package name */
    public final H3.a f48102a;

    /* renamed from: b, reason: collision with root package name */
    public final H3.a f48103b;

    /* renamed from: c, reason: collision with root package name */
    public final D3.e f48104c;

    /* renamed from: d, reason: collision with root package name */
    public final E3.j f48105d;

    public u(H3.a aVar, H3.a aVar2, D3.e eVar, E3.j jVar, E3.l lVar) {
        this.f48102a = aVar;
        this.f48103b = aVar2;
        this.f48104c = eVar;
        this.f48105d = jVar;
        lVar.getClass();
        lVar.f1412a.execute(new C8.a(lVar, 1));
    }

    public static u a() {
        k kVar = f48101e;
        if (kVar != null) {
            return kVar.f48086g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f48101e == null) {
            synchronized (u.class) {
                try {
                    if (f48101e == null) {
                        P2.d dVar = new P2.d();
                        context.getClass();
                        dVar.f10571a = context;
                        f48101e = dVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final s c(C5719a c5719a) {
        Set setSingleton;
        byte[] bytes;
        if (c5719a != null) {
            c5719a.getClass();
            setSingleton = Collections.unmodifiableSet(C5719a.f47324d);
        } else {
            setSingleton = Collections.singleton(new C5677c("proto"));
        }
        j.a aVarA = r.a();
        c5719a.getClass();
        aVarA.f48078a = "cct";
        String str = c5719a.f47327a;
        String str2 = c5719a.f47328b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = Oo.f("1$", str, "\\", str2).getBytes(Charset.forName(Constants.ENCODING));
        }
        aVarA.f48079b = bytes;
        return new s(setSingleton, aVarA.a(), this);
    }
}
