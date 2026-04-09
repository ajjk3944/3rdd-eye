package ss;

import ht.x;
import ur.q0;

/* loaded from: classes.dex */
public final class i extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final i f22238g;

    /* renamed from: r, reason: collision with root package name */
    public static final i f22239r;

    /* renamed from: x, reason: collision with root package name */
    public static final i f22240x;

    /* renamed from: y, reason: collision with root package name */
    public static final i f22241y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22242d;

    static {
        int i10 = 1;
        f22238g = new i(i10, 0);
        f22239r = new i(i10, 1);
        f22240x = new i(i10, 2);
        f22241y = new i(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, int i11) {
        super(i10);
        this.f22242d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f22242d) {
            case 0:
                return "";
            case 1:
                x xVar = (x) obj;
                br.l.e(xVar, "it");
                return xVar;
            case 2:
                br.l.e((q0) obj, "it");
                return "...";
            default:
                x xVar2 = (x) obj;
                br.l.e(xVar2, "it");
                return xVar2;
        }
    }
}
