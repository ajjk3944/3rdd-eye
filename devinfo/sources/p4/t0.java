package p4;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 extends FileObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f31314b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f31315c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f31316a;

    public t0(String str) {
        super(str, 128);
        this.f31316a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i4, String str) {
        Iterator it = this.f31316a.iterator();
        while (it.hasNext()) {
            ((mk.c) it.next()).invoke(str);
        }
    }
}
