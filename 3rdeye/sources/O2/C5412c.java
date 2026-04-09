package o2;

import H6.B;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5272e;
import l2.C5279l;

/* compiled from: AnimatableGradientColorValue.java */
/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5412c extends B {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5412c(List list, int i) {
        super(list);
        this.f44807c = i;
    }

    @Override // o2.InterfaceC5418i
    public final AbstractC5268a a() {
        switch (this.f44807c) {
            case 0:
                return new C5272e((List) this.f2034b, 0);
            default:
                return new C5279l((List) this.f2034b);
        }
    }
}
