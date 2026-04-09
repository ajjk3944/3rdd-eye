package H0;

import H0.k;
import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1996d;

    public i(String str, Context context, f fVar, int i) {
        this.f1993a = str;
        this.f1994b = context;
        this.f1995c = fVar;
        this.f1996d = i;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() throws Exception {
        try {
            return k.a(this.f1993a, this.f1994b, this.f1995c, this.f1996d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
