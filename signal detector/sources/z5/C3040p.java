package z5;

import h5.InterfaceC2373g;
import h5.InterfaceC2375i;

/* renamed from: z5.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3040p extends q5.j implements p5.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C3040p f24547c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3040p f24548d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24549b;

    static {
        int i = 2;
        f24547c = new C3040p(i, 0);
        f24548d = new C3040p(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3040p(int i, int i3) {
        super(i);
        this.f24549b = i3;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f24549b) {
            case 0:
                return ((InterfaceC2375i) obj).m((InterfaceC2373g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC2375i) obj).m((InterfaceC2373g) obj2);
        }
    }
}
