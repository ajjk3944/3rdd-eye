package D3;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import s3.C7898m;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2567h f2830i = AbstractC2567h.h("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f2831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2832b;

    /* renamed from: c, reason: collision with root package name */
    private final y f2833c;

    /* renamed from: d, reason: collision with root package name */
    private final A5.k f2834d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f2835e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f2836f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2837g;

    /* renamed from: h, reason: collision with root package name */
    private final int f2838h;

    public F(Context context, final A5.k kVar, y yVar, String str) {
        new HashMap();
        new HashMap();
        this.f2831a = context.getPackageName();
        this.f2832b = A5.c.a(context);
        this.f2834d = kVar;
        this.f2833c = yVar;
        O.a();
        this.f2837g = str;
        this.f2835e = A5.g.a().b(new Callable() { // from class: D3.D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2828a.a();
            }
        });
        A5.g gVarA = A5.g.a();
        Objects.requireNonNull(kVar);
        this.f2836f = gVarA.b(new Callable() { // from class: D3.E
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        });
        AbstractC2567h abstractC2567h = f2830i;
        this.f2838h = abstractC2567h.containsKey(str) ? DynamiteModule.c(context, (String) abstractC2567h.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C7898m.a().b(this.f2837g);
    }
}
