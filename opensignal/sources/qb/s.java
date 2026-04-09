package qb;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Message f20821a;

    public final void a() {
        this.f20821a = null;
        ArrayList arrayList = t.f20822b;
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
        Message message = this.f20821a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
