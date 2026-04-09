package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* compiled from: InputConfigurationCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f47603a;

    /* compiled from: InputConfigurationCompat.java */
    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputConfiguration f47604a;

        public a(Object obj) {
            this.f47604a = (InputConfiguration) obj;
        }

        @Override // x.e.c
        public final InputConfiguration a() {
            return this.f47604a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f47604a, ((c) obj).a());
        }

        public final int hashCode() {
            return this.f47604a.hashCode();
        }

        public final String toString() {
            return this.f47604a.toString();
        }
    }

    /* compiled from: InputConfigurationCompat.java */
    public static final class b extends a {
    }

    /* compiled from: InputConfigurationCompat.java */
    public interface c {
        InputConfiguration a();
    }

    public e(a aVar) {
        this.f47603a = aVar;
    }

    public static e a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new e(new b(obj)) : new e(new a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f47603a.equals(((e) obj).f47603a);
    }

    public final int hashCode() {
        return this.f47603a.f47604a.hashCode();
    }

    public final String toString() {
        return this.f47603a.f47604a.toString();
    }
}
