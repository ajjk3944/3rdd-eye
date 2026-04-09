package qb;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import ca.y;
import com.squareup.picasso.c0;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static p f20804e;

    /* renamed from: a, reason: collision with root package name */
    public int f20805a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20806b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20807c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20808d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(InputStream inputStream, c0 c0Var) {
        this((Bitmap) null, inputStream, c0Var, 0);
        if (inputStream == null) {
            throw new NullPointerException("stream == null");
        }
    }

    public static void a(p pVar, int i10) {
        synchronized (pVar.f20808d) {
            try {
                if (pVar.f20805a == i10) {
                    return;
                }
                pVar.f20805a = i10;
                Iterator it = ((CopyOnWriteArrayList) pVar.f20807c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    pb.q qVar = (pb.q) weakReference.get();
                    if (qVar != null) {
                        qVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) pVar.f20807c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p(Bitmap bitmap, InputStream inputStream, c0 c0Var, int i10) {
        if ((inputStream != null) ^ (bitmap != null)) {
            this.f20807c = bitmap;
            this.f20808d = inputStream;
            if (c0Var != null) {
                this.f20806b = c0Var;
                this.f20805a = i10;
                return;
            }
            throw new NullPointerException("loadedFrom == null");
        }
        throw new AssertionError();
    }

    public p(Context context) {
        this.f20806b = new Handler(Looper.getMainLooper());
        this.f20807c = new CopyOnWriteArrayList();
        this.f20808d = new Object();
        this.f20805a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new a5.s(9, this), intentFilter);
    }

    public p(y yVar, byte[] bArr, a5.d[] dVarArr, int i10) {
        this.f20806b = yVar;
        this.f20807c = bArr;
        this.f20808d = dVarArr;
        this.f20805a = i10;
    }
}
