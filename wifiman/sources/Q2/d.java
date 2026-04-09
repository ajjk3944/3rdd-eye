package Q2;

import Q2.b;
import android.content.Context;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19124a;

    /* renamed from: b, reason: collision with root package name */
    final b.a f19125b;

    d(Context context, b.a aVar) {
        this.f19124a = context.getApplicationContext();
        this.f19125b = aVar;
    }

    private void c() {
        r.a(this.f19124a).d(this.f19125b);
    }

    private void m() {
        r.a(this.f19124a).e(this.f19125b);
    }

    @Override // Q2.l
    public void a() {
        m();
    }

    @Override // Q2.l
    public void b() {
        c();
    }

    @Override // Q2.l
    public void f() {
    }
}
