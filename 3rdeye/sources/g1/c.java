package G1;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import java.lang.reflect.Method;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1861b;

    /* JADX WARN: Type inference failed for: r0v2, types: [b9.g, java.lang.Object] */
    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        Class<?> returnType;
        switch (this.f1861b) {
            case 0:
                try {
                    Method method = (Method) d.f1864e.getValue();
                    if (method != null && (returnType = method.getReturnType()) != null) {
                        Class<?> cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused) {
                }
                return null;
            case 1:
                return C1992A.f18074a;
            default:
                e.a aVar = com.zipoapps.premiumhelper.e.f37006D;
                return 5L;
        }
    }
}
