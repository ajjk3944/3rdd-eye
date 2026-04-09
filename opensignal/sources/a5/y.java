package a5;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public Message f171a;

    public final void a() {
        this.f171a = null;
        ArrayList arrayList = z.f172b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f171a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
