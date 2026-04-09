package R8;

import Z7.b;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r3.C7567e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0689a f19591a = new C0689a(null);

    /* renamed from: R8.a$a, reason: collision with other inner class name */
    public static final class C0689a {
        public /* synthetic */ C0689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) throws Resources.NotFoundException {
            AbstractC6492s.i(context, "context");
            try {
                L3.a.a(context);
            } catch (GooglePlayServicesNotAvailableException e10) {
                b.f(e10, null, 2, null);
            } catch (GooglePlayServicesRepairableException e11) {
                b.f(e11, null, 2, null);
                C7567e.n().p(context, e11.a());
            }
        }

        private C0689a() {
        }
    }
}
