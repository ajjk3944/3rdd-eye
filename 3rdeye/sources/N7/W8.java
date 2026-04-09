package N7;

import A7.b;
import N7.X8;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRoundedRectangleShape.kt */
/* loaded from: classes.dex */
public final class W8 implements InterfaceC5868a {

    /* renamed from: g, reason: collision with root package name */
    public static final W4 f7617g = new W4(b.a.a(5L));

    /* renamed from: h, reason: collision with root package name */
    public static final W4 f7618h = new W4(b.a.a(10L));
    public static final W4 i = new W4(b.a.a(10L));

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f7619a;

    /* renamed from: b, reason: collision with root package name */
    public final W4 f7620b;

    /* renamed from: c, reason: collision with root package name */
    public final W4 f7621c;

    /* renamed from: d, reason: collision with root package name */
    public final W4 f7622d;

    /* renamed from: e, reason: collision with root package name */
    public final C1185ga f7623e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f7624f;

    public W8() {
        this(0);
    }

    public final boolean a(W8 w82, A7.d dVar, A7.d dVar2) {
        if (w82 != null) {
            A7.b<Integer> bVar = this.f7619a;
            Integer numA = bVar != null ? bVar.a(dVar) : null;
            A7.b<Integer> bVar2 = w82.f7619a;
            if (kotlin.jvm.internal.l.b(numA, bVar2 != null ? bVar2.a(dVar2) : null) && this.f7620b.a(w82.f7620b, dVar, dVar2) && this.f7621c.a(w82.f7621c, dVar, dVar2) && this.f7622d.a(w82.f7622d, dVar, dVar2)) {
                C1185ga c1185ga = w82.f7623e;
                C1185ga c1185ga2 = this.f7623e;
                if (c1185ga2 != null ? c1185ga2.a(c1185ga, dVar, dVar2) : c1185ga == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f7624f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(W8.class).hashCode();
        A7.b<Integer> bVar = this.f7619a;
        int iB = this.f7622d.b() + this.f7621c.b() + this.f7620b.b() + iHashCode + (bVar != null ? bVar.hashCode() : 0);
        C1185ga c1185ga = this.f7623e;
        int iB2 = iB + (c1185ga != null ? c1185ga.b() : 0);
        this.f7624f = Integer.valueOf(iB2);
        return iB2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((X8.a) D7.a.f1071b.f6879r6.getValue()).b(D7.a.f1070a, this);
    }

    public /* synthetic */ W8(int i10) {
        this(null, f7617g, f7618h, i, null);
    }

    public W8(A7.b<Integer> bVar, W4 cornerRadius, W4 itemHeight, W4 itemWidth, C1185ga c1185ga) {
        kotlin.jvm.internal.l.f(cornerRadius, "cornerRadius");
        kotlin.jvm.internal.l.f(itemHeight, "itemHeight");
        kotlin.jvm.internal.l.f(itemWidth, "itemWidth");
        this.f7619a = bVar;
        this.f7620b = cornerRadius;
        this.f7621c = itemHeight;
        this.f7622d = itemWidth;
        this.f7623e = c1185ga;
    }
}
