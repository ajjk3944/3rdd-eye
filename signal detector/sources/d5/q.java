package d5;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19821a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19822b;

    public /* synthetic */ q(int i, Object obj) {
        this.f19821a = i;
        this.f19822b = obj;
    }

    @Override // x5.g
    public final Iterator iterator() {
        switch (this.f19821a) {
            case 0:
                return ((Iterable) this.f19822b).iterator();
            case 1:
                return new n5.b(this);
            default:
                return (Iterator) this.f19822b;
        }
    }
}
