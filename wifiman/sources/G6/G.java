package G6;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class G {

    public enum a {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY
    }

    public static G a(Context context) {
        return A.a().b(context.getApplicationContext()).a().a();
    }

    public abstract O b(String str);

    public abstract a c();

    public abstract gg.s d();

    public abstract gg.s e(Q6.g gVar, Q6.d... dVarArr);
}
