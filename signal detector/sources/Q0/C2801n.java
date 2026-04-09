package q0;

import android.os.Bundle;
import c5.C0412i;

/* renamed from: q0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2801n extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q5.l f22998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f22999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f23000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f23001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2801n(q5.l lVar, z zVar, v vVar, Bundle bundle) {
        super(1);
        this.f22998b = lVar;
        this.f22999c = zVar;
        this.f23000d = vVar;
        this.f23001e = bundle;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        C2794g c2794g = (C2794g) obj;
        q5.i.e(c2794g, "it");
        this.f22998b.f23296a = true;
        this.f22999c.a(this.f23000d, this.f23001e, c2794g, d5.s.f19824a);
        return C0412i.f5929a;
    }
}
