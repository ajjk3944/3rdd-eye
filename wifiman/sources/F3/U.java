package F3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import s3.AbstractC7905u;
import s3.C7907w;
import s3.InterfaceC7906v;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7906v f5882a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f5883b = new AtomicLong(-1);

    U(Context context, String str) {
        this.f5882a = AbstractC7905u.b(context, C7907w.a().b("mlkit:vision").a());
    }

    public static U a(Context context) {
        return new U(context, "mlkit:vision");
    }
}
