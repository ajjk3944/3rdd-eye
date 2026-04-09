package t7;

import com.google.android.gms.internal.play_billing.a0;
import com.google.android.gms.internal.play_billing.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f34435a;

    /* renamed from: b, reason: collision with root package name */
    public int f34436b;

    /* renamed from: c, reason: collision with root package name */
    public String f34437c;

    public static n3.f a() {
        n3.f fVar = new n3.f();
        fVar.f29627b = 0;
        fVar.f29628c = "";
        return fVar;
    }

    public final String toString() {
        int i4 = this.f34435a;
        int i10 = u.f20232a;
        a0 a0Var = com.google.android.gms.internal.play_billing.j.f20153c;
        Integer numValueOf = Integer.valueOf(i4);
        return je.u.u("Response Code: ", (!a0Var.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.j) a0Var.get(numValueOf)).toString(), ", Debug Message: ", this.f34437c);
    }
}
