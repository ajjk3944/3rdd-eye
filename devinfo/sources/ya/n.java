package ya;

import android.content.Context;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.ka;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements ja, za.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37476a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37477b;

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f37476a = obj;
        this.f37477b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public void f(ka kaVar) {
        String str = (String) this.f37476a;
        String string = kaVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(string);
        za.i.h(sb2.toString());
        ((p) this.f37477b).b(null);
    }

    @Override // za.c
    public /* synthetic */ za.k g(String str) {
        new com.facebook.ads.internal.dynamicloading.a((za.d) this.f37476a, (Context) this.f37477b, str).start();
        return za.k.f38156a;
    }

    public n(r rVar, String str, p pVar) {
        this.f37476a = str;
        this.f37477b = pVar;
    }
}
