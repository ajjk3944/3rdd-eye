package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import dh.InterfaceC5380e;
import i2.C6063b;
import i2.C6064c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31727a = new a(null);

    public static final class a {

        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C1114a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f31728a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1114a(Context context) {
                super(1);
                this.f31728a = context;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                AbstractC6492s.i(it, "it");
                return new d(this.f31728a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            AbstractC6492s.i(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C6063b c6063b = C6063b.f48796a;
            sb2.append(c6063b.a());
            Log.d("MeasurementManager", sb2.toString());
            if (c6063b.a() >= 5) {
                return new g(context);
            }
            if (c6063b.b() >= 9) {
                return (b) C6064c.f48799a.a(context, "MeasurementManager", new C1114a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, InterfaceC5380e interfaceC5380e);

    public abstract Object b(InterfaceC5380e interfaceC5380e);

    public abstract Object c(Uri uri, InputEvent inputEvent, InterfaceC5380e interfaceC5380e);

    public abstract Object d(m mVar, InterfaceC5380e interfaceC5380e);

    public abstract Object e(Uri uri, InterfaceC5380e interfaceC5380e);

    public abstract Object f(n nVar, InterfaceC5380e interfaceC5380e);

    public abstract Object g(o oVar, InterfaceC5380e interfaceC5380e);
}
