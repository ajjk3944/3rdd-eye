package X0;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24009a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            aVar.b(str, th2);
        }

        public final void a(String str, Throwable th2) {
            Log.e("PreviewLogger", str, th2);
        }

        public final void b(String str, Throwable th2) {
            Log.w("PreviewLogger", str, th2);
        }

        private a() {
        }
    }
}
