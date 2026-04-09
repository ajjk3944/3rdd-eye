package y9;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class p implements x9.g<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f48383a;

    public p(String str) {
        this.f48383a = str;
    }

    @Override // x9.g
    public final Iterator<String> iterator() {
        return new C5821c(this.f48383a);
    }
}
