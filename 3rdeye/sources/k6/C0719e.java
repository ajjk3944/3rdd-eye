package K6;

import N7.B9;
import N7.C1175g0;
import android.net.Uri;
import h6.C4418a;
import h7.C4421b;
import java.util.LinkedHashMap;

/* compiled from: DivActionBeaconSender.kt */
/* renamed from: K6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719e {

    /* renamed from: a, reason: collision with root package name */
    public final O7.a<C4418a> f3435a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3437c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3438d;

    public C0719e(O7.a<C4418a> aVar, boolean z10, boolean z11, boolean z12) {
        this.f3435a = aVar;
        this.f3436b = z10;
        this.f3437c = z11;
        this.f3438d = z12;
    }

    public static boolean a(String str) {
        return kotlin.jvm.internal.l.b(str, "http") || kotlin.jvm.internal.l.b(str, "https");
    }

    public final void b(C1175g0 action, A7.d resolver) {
        Uri uriA;
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        A7.b<Uri> bVar = action.f8256d;
        if (bVar == null || (uriA = bVar.a(resolver)) == null) {
            return;
        }
        if (!a(uriA.getScheme())) {
            int i = C4421b.f38269a;
            C4421b.a(C7.a.WARNING);
        } else {
            if (!this.f3436b || this.f3435a.get() == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            A7.b<Uri> bVar2 = action.f8259g;
            if (bVar2 != null) {
                String string = bVar2.a(resolver).toString();
                kotlin.jvm.internal.l.e(string, "referer.evaluate(resolver).toString()");
                linkedHashMap.put("Referer", string);
            }
            throw null;
        }
    }

    public final void c(B9 b92, A7.d resolver) {
        Uri uriA;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        A7.b<Uri> url = b92.getUrl();
        if (url == null || (uriA = url.a(resolver)) == null) {
            return;
        }
        if (!a(uriA.getScheme())) {
            int i = C4421b.f38269a;
            C4421b.a(C7.a.WARNING);
        } else {
            if (!this.f3437c || this.f3435a.get() == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            A7.b<Uri> bVarE = b92.e();
            if (bVarE != null) {
                String string = bVarE.a(resolver).toString();
                kotlin.jvm.internal.l.e(string, "referer.evaluate(resolver).toString()");
                linkedHashMap.put("Referer", string);
            }
            throw null;
        }
    }
}
