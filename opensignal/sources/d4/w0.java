package d4;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class w0 extends FileObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6902b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f6903c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6904a;

    public w0(String str) {
        super(str, 128);
        this.f6904a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        Iterator it = this.f6904a.iterator();
        while (it.hasNext()) {
            ((ar.k) it.next()).a(str);
        }
    }
}
