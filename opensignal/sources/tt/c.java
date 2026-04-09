package tt;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements st.j {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f22985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22986b;

    /* renamed from: c, reason: collision with root package name */
    public final ar.n f22987c;

    public c(CharSequence charSequence, int i10, ar.n nVar) {
        br.l.e(charSequence, "input");
        this.f22985a = charSequence;
        this.f22986b = i10;
        this.f22987c = nVar;
    }

    @Override // st.j
    public final Iterator iterator() {
        return new b(this);
    }
}
