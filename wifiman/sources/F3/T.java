package F3;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import s3.C7898m;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC2795k f5871k = AbstractC2795k.h("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f5872a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5873b;

    /* renamed from: c, reason: collision with root package name */
    private final M f5874c;

    /* renamed from: d, reason: collision with root package name */
    private final A5.k f5875d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f5876e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f5877f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5878g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5879h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f5880i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f5881j = new HashMap();

    public T(Context context, final A5.k kVar, M m10, String str) {
        this.f5872a = context.getPackageName();
        this.f5873b = A5.c.a(context);
        this.f5875d = kVar;
        this.f5874c = m10;
        j0.a();
        this.f5878g = str;
        this.f5876e = A5.g.a().b(new Callable() { // from class: F3.Q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5869a.a();
            }
        });
        A5.g gVarA = A5.g.a();
        Objects.requireNonNull(kVar);
        this.f5877f = gVarA.b(new Callable() { // from class: F3.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kVar.a();
            }
        });
        AbstractC2795k abstractC2795k = f5871k;
        this.f5879h = abstractC2795k.containsKey(str) ? DynamiteModule.c(context, (String) abstractC2795k.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C7898m.a().b(this.f5878g);
    }
}
