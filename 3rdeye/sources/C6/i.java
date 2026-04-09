package C6;

import android.graphics.Bitmap;
import android.graphics.drawable.PictureDrawable;

/* compiled from: ImageRepresentation.kt */
/* loaded from: classes.dex */
public interface i {

    /* compiled from: ImageRepresentation.kt */
    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f948a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.l.b(this.f948a, ((a) obj).f948a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f948a.hashCode();
        }

        public final String toString() {
            return "Bitmap(value=" + this.f948a + ')';
        }
    }

    /* compiled from: ImageRepresentation.kt */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public final PictureDrawable f949a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return kotlin.jvm.internal.l.b(this.f949a, ((b) obj).f949a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f949a.hashCode();
        }

        public final String toString() {
            return "PictureDrawable(value=" + this.f949a + ')';
        }
    }
}
