package E5;

import h5.InterfaceC2373g;
import z5.i0;

/* loaded from: classes3.dex */
public final class w extends q5.j implements p5.p {

    /* renamed from: c, reason: collision with root package name */
    public static final w f1416c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f1417d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f1418e;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1419b;

    static {
        int i = 2;
        f1416c = new w(i, 0);
        f1417d = new w(i, 1);
        f1418e = new w(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i3) {
        super(i);
        this.f1419b = i3;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f1419b) {
            case 0:
                InterfaceC2373g interfaceC2373g = (InterfaceC2373g) obj2;
                if (!(interfaceC2373g instanceof i0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC2373g : Integer.valueOf(iIntValue + 1);
            case 1:
                i0 i0Var = (i0) obj;
                InterfaceC2373g interfaceC2373g2 = (InterfaceC2373g) obj2;
                if (i0Var != null) {
                    return i0Var;
                }
                if (interfaceC2373g2 instanceof i0) {
                    return (i0) interfaceC2373g2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
