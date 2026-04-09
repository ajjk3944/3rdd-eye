package a1;

import java.util.Map;
import kotlin.jvm.internal.l;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: Preferences.kt */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f14090a;

        public a(String str) {
            this.f14090a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return l.b(this.f14090a, ((a) obj).f14090a);
        }

        public final int hashCode() {
            return this.f14090a.hashCode();
        }

        public final String toString() {
            return this.f14090a;
        }
    }

    /* compiled from: Preferences.kt */
    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
