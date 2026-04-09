package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.w0;
import o1.n;
import o1.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class MeasurementManagerFutures {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3573a = new a(null);

    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* renamed from: b, reason: collision with root package name */
        public final n f3574b;

        public Api33Ext5JavaImpl(n mMeasurementManager) {
            p.e(mMeasurementManager, "mMeasurementManager");
            this.f3574b = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a b() {
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            p.e(attributionSource, "attributionSource");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a e(@NotNull o1.a deletionRequest) {
            p.e(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3, null), null, 1, null);
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a f(@NotNull Uri trigger) {
            p.e(trigger, "trigger");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, trigger, null), 3, null), null, 1, null);
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a g(@NotNull o request) {
            p.e(request, "request");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, request, null), 3, null), null, 1, null);
        }

        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a h(@NotNull o1.p request) {
            p.e(request, "request");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.a()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final MeasurementManagerFutures a(Context context) {
            p.e(context, "context");
            n nVarA = n.f23572a.a(context);
            if (nVarA != null) {
                return new Api33Ext5JavaImpl(nVarA);
            }
            return null;
        }

        public a() {
        }
    }

    public static final MeasurementManagerFutures a(Context context) {
        return f3573a.a(context);
    }

    public abstract com.google.common.util.concurrent.a b();

    public abstract com.google.common.util.concurrent.a c(Uri uri, InputEvent inputEvent);
}
