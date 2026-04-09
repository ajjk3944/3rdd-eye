package p4;

import br.l;

/* loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.b f20250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.b bVar, String str) {
        super(str);
        l.e(bVar, "fragment");
        this.f20250a = bVar;
    }
}
