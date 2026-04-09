package k3;

import android.content.Context;
import e3.AbstractC5419d;
import e3.InterfaceC5417b;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6374h implements InterfaceC5417b {

    /* renamed from: a, reason: collision with root package name */
    private final Jg.a f51173a;

    public C6374h(Jg.a aVar) {
        this.f51173a = aVar;
    }

    public static C6374h a(Jg.a aVar) {
        return new C6374h(aVar);
    }

    public static String c(Context context) {
        return (String) AbstractC5419d.d(AbstractC6372f.b(context));
    }

    @Override // Jg.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f51173a.get());
    }
}
