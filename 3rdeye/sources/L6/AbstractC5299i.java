package l6;

import Z6.d;
import android.util.Log;
import android.util.Property;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: FloatProperty.kt */
/* renamed from: l6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5299i extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43871a = 1;

    public /* synthetic */ AbstractC5299i(Class cls, String str) {
        super(cls, str);
    }

    public abstract void a(int i, Object obj);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) throws Z6.f {
        switch (this.f43871a) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                d.e target = (d.e) obj;
                kotlin.jvm.internal.l.f(target, "target");
                Log.i("NumberValueProperty", "set variable value: " + fFloatValue);
                target.f(Double.valueOf((double) fFloatValue));
                break;
            default:
                a(((Number) obj2).intValue(), obj);
                break;
        }
    }

    public AbstractC5299i() {
        super(Integer.TYPE, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }
}
