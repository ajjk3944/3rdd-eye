package th;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class x implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name */
    public static final a f62653c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final x f62654d = new x(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Type f62655a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f62656b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x a() {
            return x.f62654d;
        }

        private a() {
        }
    }

    public x(Type type, Type type2) {
        this.f62655a = type;
        this.f62656b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f62656b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f62656b != null) {
            return "? super " + w.h(this.f62656b);
        }
        Type type = this.f62655a;
        if (type == null || AbstractC6492s.d(type, Object.class)) {
            return "?";
        }
        return "? extends " + w.h(this.f62655a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f62655a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
