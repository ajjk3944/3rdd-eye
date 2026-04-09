package B6;

import H6.C0675l;
import N7.C1439yb;

/* compiled from: Handler.kt */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1439yb f548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0675l f549d;

    public j(k kVar, C1439yb c1439yb, C0675l c0675l) {
        this.f547b = kVar;
        this.f548c = c1439yb;
        this.f549d = c0675l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f548c.f9981g;
        this.f547b.d(this.f549d, str);
    }
}
