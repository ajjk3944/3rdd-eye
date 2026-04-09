package m9;

import android.content.Context;
import io.sentry.transport.p;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile p f16370e;

    /* renamed from: a, reason: collision with root package name */
    public final v9.a f16371a;

    /* renamed from: b, reason: collision with root package name */
    public final v9.a f16372b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.b f16373c;

    /* renamed from: d, reason: collision with root package name */
    public final al.b f16374d;

    public o(v9.a aVar, v9.a aVar2, r9.b bVar, al.b bVar2, js.e eVar) {
        this.f16371a = aVar;
        this.f16372b = aVar2;
        this.f16373c = bVar;
        this.f16374d = bVar2;
        ((Executor) eVar.f13798g).execute(new j4.o(16, eVar));
    }

    public static o a() {
        p pVar = f16370e;
        if (pVar != null) {
            return (o) ((kq.a) pVar.B).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f16370e == null) {
            synchronized (o.class) {
                try {
                    if (f16370e == null) {
                        com.google.android.exoplayer2.m mVar = new com.google.android.exoplayer2.m();
                        context.getClass();
                        mVar.f4233a = context;
                        f16370e = mVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final n c(j jVar) {
        byte[] bytes;
        Set setUnmodifiableSet = jVar != null ? Collections.unmodifiableSet(k9.a.f14212d) : Collections.singleton(new j9.c("proto"));
        io.sentry.k kVarA = i.a();
        jVar.getClass();
        kVarA.f12397d = "cct";
        k9.a aVar = (k9.a) jVar;
        String str = aVar.f14215a;
        String str2 = aVar.f14216b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        kVarA.f12398g = bytes;
        return new n(setUnmodifiableSet, kVarA.n(), this);
    }
}
