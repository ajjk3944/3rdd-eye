package o1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23572a = new b(null);

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final n a(Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            n1.b bVar = n1.b.f23528a;
            sb.append(bVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public b() {
        }
    }

    public abstract Object a(o1.a aVar, c9.c cVar);

    public abstract Object b(c9.c cVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, c9.c cVar);

    public abstract Object d(Uri uri, c9.c cVar);

    public abstract Object e(o oVar, c9.c cVar);

    public abstract Object f(p pVar, c9.c cVar);

    public static final class a extends n {

        /* renamed from: b, reason: collision with root package name */
        public final MeasurementManager f23573b;

        public a(MeasurementManager mMeasurementManager) {
            kotlin.jvm.internal.p.e(mMeasurementManager, "mMeasurementManager");
            this.f23573b = mMeasurementManager;
        }

        @Override // o1.n
        @DoNotInline
        @Nullable
        public Object a(@NotNull o1.a aVar, @NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            this.f23573b.deleteRegistrations(k(aVar), new m(), androidx.core.os.a.a(pVar));
            Object objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        }

        @Override // o1.n
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        public Object b(@NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            this.f23573b.getMeasurementApiStatus(new m(), androidx.core.os.a.a(pVar));
            Object objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW;
        }

        @Override // o1.n
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            this.f23573b.registerSource(uri, inputEvent, new m(), androidx.core.os.a.a(pVar));
            Object objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        }

        @Override // o1.n
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        public Object d(@NotNull Uri uri, @NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            this.f23573b.registerTrigger(uri, new m(), androidx.core.os.a.a(pVar));
            Object objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        }

        @Override // o1.n
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        public Object e(@NotNull o oVar, @NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar.F();
            this.f23573b.registerWebSource(l(oVar), new m(), androidx.core.os.a.a(pVar));
            Object objW = pVar.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        }

        @Override // o1.n
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @Nullable
        public Object f(@NotNull p pVar, @NotNull c9.c cVar) {
            kotlinx.coroutines.p pVar2 = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            pVar2.F();
            this.f23573b.registerWebTrigger(m(pVar), new m(), androidx.core.os.a.a(pVar2));
            Object objW = pVar2.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                d9.e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        }

        public final DeletionRequest k(o1.a aVar) {
            k.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(o oVar) {
            l.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(p pVar) {
            c.a();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@NotNull Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            Object systemService = context.getSystemService((Class<Object>) f.a());
            kotlin.jvm.internal.p.d(systemService, "context.getSystemService…:class.java\n            )");
            this(g.a(systemService));
        }
    }
}
