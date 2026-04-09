package s6;

import H6.C0680q;
import android.os.Handler;
import android.os.Looper;
import b9.C1992A;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: DivVariableController.kt */
/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5581b {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, Z6.d> f46085a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<InterfaceC5580a> f46086b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f46087c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<p9.l<String, C1992A>> f46088d;

    /* renamed from: e, reason: collision with root package name */
    public final e f46089e;

    public C5581b() {
        this(0);
    }

    public C5581b(int i) {
        new Handler(Looper.getMainLooper());
        this.f46085a = new ConcurrentHashMap<>();
        this.f46086b = new ConcurrentLinkedQueue<>();
        new LinkedHashMap();
        this.f46087c = new LinkedHashSet();
        new LinkedHashSet();
        this.f46088d = new ConcurrentLinkedQueue<>();
        this.f46089e = new e(this, new C0680q(this, 9));
    }
}
