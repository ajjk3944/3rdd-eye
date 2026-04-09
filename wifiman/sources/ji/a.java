package Ji;

import Ii.H0;
import Ni.q;
import android.os.Looper;
import java.util.List;

/* loaded from: classes4.dex */
public final class a implements q {
    @Override // Ni.q
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // Ni.q
    public H0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(i.d(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // Ni.q
    public int c() {
        return 1073741823;
    }
}
