package H0;

import H0.k;
import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1990c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1991d;

    public g(String str, Context context, f fVar, int i) {
        this.f1988a = str;
        this.f1989b = context;
        this.f1990c = fVar;
        this.f1991d = i;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() throws Exception {
        return k.a(this.f1988a, this.f1989b, this.f1990c, this.f1991d);
    }
}
