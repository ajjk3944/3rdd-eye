package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivInputMask.kt */
/* renamed from: N7.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1239k6 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8631a;

    /* compiled from: DivInputMask.kt */
    /* renamed from: N7.k6$a */
    public static final class a extends AbstractC1239k6 {

        /* renamed from: b, reason: collision with root package name */
        public final M3 f8632b;

        public a(M3 m32) {
            this.f8632b = m32;
        }
    }

    /* compiled from: DivInputMask.kt */
    /* renamed from: N7.k6$b */
    public static final class b extends AbstractC1239k6 {

        /* renamed from: b, reason: collision with root package name */
        public final S4 f8633b;

        public b(S4 s42) {
            this.f8633b = s42;
        }
    }

    /* compiled from: DivInputMask.kt */
    /* renamed from: N7.k6$c */
    public static final class c extends AbstractC1239k6 {

        /* renamed from: b, reason: collision with root package name */
        public final Y7 f8634b;

        public c(Y7 y72) {
            this.f8634b = y72;
        }
    }

    public final InterfaceC1253l6 a() {
        if (this instanceof b) {
            return ((b) this).f8633b;
        }
        if (this instanceof a) {
            return ((a) this).f8632b;
        }
        if (this instanceof c) {
            return ((c) this).f8634b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1267m6) D7.a.f1071b.f6855p4.getValue()).b(D7.a.f1070a, this);
    }
}
