package b6;

import U9.F;

/* compiled from: EmptyResponseConverter.kt */
/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1854b implements InterfaceC1853a<F, Void> {
    @Override // b6.InterfaceC1853a
    public Void convert(F f10) {
        if (f10 == null) {
            return null;
        }
        f10.close();
        return null;
    }
}
