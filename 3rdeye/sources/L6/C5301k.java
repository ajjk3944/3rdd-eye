package l6;

import Z6.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: VariableProperties.kt */
/* renamed from: l6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5301k extends AbstractC5299i {

    /* renamed from: b, reason: collision with root package name */
    public static final C5301k f43873b = new C5301k(Float.TYPE, AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // android.util.Property
    public final Object get(Object obj) {
        d.e target = (d.e) obj;
        kotlin.jvm.internal.l.f(target, "target");
        Object objB = target.b();
        kotlin.jvm.internal.l.d(objB, "null cannot be cast to non-null type kotlin.Double");
        return Float.valueOf((float) ((Double) objB).doubleValue());
    }
}
