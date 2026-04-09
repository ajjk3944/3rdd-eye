package u6;

import android.graphics.Typeface;
import android.os.Build;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: DivTypefaceProvider.java */
/* loaded from: classes.dex */
public interface a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0538a f46598b = new C0538a();

    /* compiled from: DivTypefaceProvider.java */
    /* renamed from: u6.a$a, reason: collision with other inner class name */
    public class C0538a implements a {
        @Override // u6.a
        public final Typeface getBold() {
            return null;
        }

        @Override // u6.a
        public final Typeface getLight() {
            return null;
        }

        @Override // u6.a
        public final Typeface getMedium() {
            return null;
        }

        @Override // u6.a
        public final Typeface getRegular() {
            return null;
        }

        @Override // u6.a
        public final Typeface getTypefaceFor(int i) {
            if (Build.VERSION.SDK_INT < 28) {
                return Oo.b(i, this);
            }
            Typeface typeface = Typeface.DEFAULT;
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
    }

    Typeface getBold();

    Typeface getLight();

    Typeface getMedium();

    Typeface getRegular();

    Typeface getTypefaceFor(int i);
}
