package l7;

/* compiled from: TypeHelpers.kt */
/* loaded from: classes.dex */
public interface j<T> {

    /* compiled from: TypeHelpers.kt */
    public static final class a {
        public static i a(Object obj, p9.l validator) {
            kotlin.jvm.internal.l.f(obj, "default");
            kotlin.jvm.internal.l.f(validator, "validator");
            return new i(obj, validator);
        }
    }

    T a();

    boolean b(Object obj);
}
