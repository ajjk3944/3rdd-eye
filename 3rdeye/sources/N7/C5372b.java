package n7;

import n7.AbstractC5371a;

/* compiled from: Field.kt */
/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5372b {
    public static final <T> AbstractC5371a<T> a(AbstractC5371a<T> abstractC5371a, boolean z10) {
        AbstractC5371a.b bVar = AbstractC5371a.b.f44401c;
        AbstractC5371a.C0502a c0502a = AbstractC5371a.C0502a.f44400c;
        if (abstractC5371a == null || abstractC5371a.equals(c0502a) || abstractC5371a.equals(bVar)) {
            return z10 ? bVar : c0502a;
        }
        if (abstractC5371a instanceof AbstractC5371a.d) {
            return new AbstractC5371a.d(((AbstractC5371a.d) abstractC5371a).f44403c, z10);
        }
        if (abstractC5371a instanceof AbstractC5371a.c) {
            return new AbstractC5371a.c(z10, ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
