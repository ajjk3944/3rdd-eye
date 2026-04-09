package C;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.camera.core.impl.U0;
import java.util.concurrent.Executor;
import o0.b;

/* compiled from: CameraX.java */
/* renamed from: C.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638z {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f786l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final SparseArray<Integer> f787m = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.M f788a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f789b;

    /* renamed from: c, reason: collision with root package name */
    public final A f790c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f791d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f792e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.H f793f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.G f794g;

    /* renamed from: h, reason: collision with root package name */
    public U0 f795h;
    public final Z i;

    /* renamed from: j, reason: collision with root package name */
    public final b.d f796j;

    /* renamed from: k, reason: collision with root package name */
    public a f797k;

    /* compiled from: CameraX.java */
    /* renamed from: C.z$a */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C0638z() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0638z(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C0638z.<init>(android.content.Context):void");
    }

    public final b.d a(Context context) {
        b.d dVarA;
        synchronized (this.f789b) {
            A2.l.q("CameraX.initInternal() should only be called once per instance", this.f797k == a.UNINITIALIZED);
            this.f797k = a.INITIALIZING;
            dVarA = o0.b.a(new C0635w(0, this, context));
        }
        return dVarA;
    }

    public final void b() {
        synchronized (this.f789b) {
            this.f797k = a.INITIALIZED;
        }
    }
}
