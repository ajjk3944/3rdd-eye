package o7;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55567a = a.f55568a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f55568a = new a();

        private a() {
        }

        public final q a(Context context) {
            AbstractC6492s.i(context, "context");
            return new r(context);
        }
    }

    boolean a();

    String b();

    int c();
}
