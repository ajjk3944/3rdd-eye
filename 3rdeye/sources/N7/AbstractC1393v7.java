package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPageTransformation.kt */
/* renamed from: N7.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1393v7 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9624a;

    /* compiled from: DivPageTransformation.kt */
    /* renamed from: N7.v7$a */
    public static final class a extends AbstractC1393v7 {

        /* renamed from: b, reason: collision with root package name */
        public final C1449z7 f9625b;

        public a(C1449z7 c1449z7) {
            this.f9625b = c1449z7;
        }
    }

    /* compiled from: DivPageTransformation.kt */
    /* renamed from: N7.v7$b */
    public static final class b extends AbstractC1393v7 {

        /* renamed from: b, reason: collision with root package name */
        public final C7 f9626b;

        public b(C7 c72) {
            this.f9626b = c72;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).f9626b;
        }
        if (this instanceof a) {
            return ((a) this).f9625b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1407w7) D7.a.f1071b.f6867q5.getValue()).b(D7.a.f1070a, this);
    }
}
