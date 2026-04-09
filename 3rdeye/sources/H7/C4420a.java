package h7;

import android.os.Looper;
import java.util.Objects;

/* compiled from: Assert.java */
/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4420a {
    public static void a() {
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        if (mainLooper == looperMyLooper) {
            return;
        }
        "Code run not in main thread!".concat(" ");
        Objects.toString(mainLooper);
        Objects.toString(looperMyLooper);
    }
}
