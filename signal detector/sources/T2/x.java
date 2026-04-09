package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C1726q3;

/* loaded from: classes.dex */
public final class x extends G.m {

    /* renamed from: b, reason: collision with root package name */
    public final u2.n f23659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23660c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.h f23661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, String str, String str2, d4.h hVar) {
        super(4);
        String strF = p2.j.f22785C.f22790c.F(context, str);
        this.f23659b = new u2.n(context, strF);
        this.f23660c = str2;
        this.f23661d = hVar;
    }

    @Override // G.m
    public final void j() {
        String str = this.f23660c;
        d4.h hVar = this.f23661d;
        if (hVar == null) {
            this.f23659b.a(null, str);
            return;
        }
        new C1726q3((u2.j) hVar.f19807b, this.f23659b, AbstractC0640Nf.f10009e, null, null, 9).b(str);
    }
}
