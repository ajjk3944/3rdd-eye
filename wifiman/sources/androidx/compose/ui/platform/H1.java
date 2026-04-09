package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.H1;

/* loaded from: classes.dex */
public interface H1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29160a = a.f29161a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f29161a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final H1 f29162b = new H1() { // from class: androidx.compose.ui.platform.G1
            @Override // androidx.compose.ui.platform.H1
            public final T.N0 a(View view) {
                return H1.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final T.N0 b(View view) {
            return J1.c(view, null, null, 3, null);
        }

        public final H1 c() {
            return f29162b;
        }
    }

    T.N0 a(View view);
}
