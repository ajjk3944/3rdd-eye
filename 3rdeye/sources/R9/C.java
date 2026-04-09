package R9;

/* compiled from: JsonElement.kt */
@M9.h(with = D.class)
/* loaded from: classes3.dex */
public abstract class C extends i {
    public static final a Companion = new a();

    /* compiled from: JsonElement.kt */
    public static final class a {
        public final M9.b<C> serializer() {
            return D.f11778a;
        }
    }

    public abstract String c();

    public String toString() {
        return c();
    }
}
