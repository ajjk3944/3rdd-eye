package o2;

import H6.B;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5273f;
import l2.o;

/* compiled from: AnimatableIntegerValue.java */
/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5413d extends B {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5413d(List list, int i) {
        super(list);
        this.f44808c = i;
    }

    @Override // o2.InterfaceC5418i
    public final AbstractC5268a a() {
        switch (this.f44808c) {
            case 0:
                return new C5273f((List) this.f2034b);
            default:
                return new o((List) this.f2034b);
        }
    }
}
