package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivInputMaskTemplate.kt */
/* renamed from: N7.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1309p6 implements InterfaceC5868a, z7.b<AbstractC1239k6> {

    /* compiled from: DivInputMaskTemplate.kt */
    /* renamed from: N7.p6$a */
    public static final class a extends AbstractC1309p6 {

        /* renamed from: a, reason: collision with root package name */
        public final Q3 f8898a;

        public a(Q3 q32) {
            this.f8898a = q32;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    /* renamed from: N7.p6$b */
    public static final class b extends AbstractC1309p6 {

        /* renamed from: a, reason: collision with root package name */
        public final V4 f8899a;

        public b(V4 v42) {
            this.f8899a = v42;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    /* renamed from: N7.p6$c */
    public static final class c extends AbstractC1309p6 {

        /* renamed from: a, reason: collision with root package name */
        public final C1123c8 f8900a;

        public c(C1123c8 c1123c8) {
            this.f8900a = c1123c8;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).f8899a;
        }
        if (this instanceof a) {
            return ((a) this).f8898a;
        }
        if (this instanceof c) {
            return ((c) this).f8900a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1281n6) D7.a.f1071b.f6866q4.getValue()).b(D7.a.f1070a, this);
    }
}
