package w0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import f4.InterfaceFutureC2326a;
import q5.i;
import u0.C2942a;
import y0.AbstractC3007a;
import y0.AbstractC3009c;
import y0.AbstractC3010d;
import y0.C3008b;
import z5.AbstractC3046w;
import z5.D;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2968d {

    /* renamed from: a, reason: collision with root package name */
    public final C3008b f23940a;

    public C2968d(C3008b c3008b) {
        this.f23940a = c3008b;
    }

    public static final C2968d b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C2942a c2942a = C2942a.f23710a;
        sb.append(i >= 30 ? c2942a.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        C3008b c3008b = (i >= 30 ? c2942a.a() : 0) >= 5 ? new C3008b(context) : null;
        if (c3008b != null) {
            return new C2968d(c3008b);
        }
        return null;
    }

    public InterfaceFutureC2326a a(AbstractC3007a abstractC3007a) {
        i.e(abstractC3007a, "deletionRequest");
        throw null;
    }

    public InterfaceFutureC2326a c() {
        return com.bumptech.glide.d.f(AbstractC3046w.c(AbstractC3046w.a(D.f24485a), new C2965a(this, null)));
    }

    public InterfaceFutureC2326a d(Uri uri, InputEvent inputEvent) {
        i.e(uri, "attributionSource");
        return com.bumptech.glide.d.f(AbstractC3046w.c(AbstractC3046w.a(D.f24485a), new C2966b(this, uri, inputEvent, null)));
    }

    public InterfaceFutureC2326a e(Uri uri) {
        i.e(uri, "trigger");
        return com.bumptech.glide.d.f(AbstractC3046w.c(AbstractC3046w.a(D.f24485a), new C2967c(this, uri, null)));
    }

    public InterfaceFutureC2326a f(AbstractC3009c abstractC3009c) {
        i.e(abstractC3009c, "request");
        throw null;
    }

    public InterfaceFutureC2326a g(AbstractC3010d abstractC3010d) {
        i.e(abstractC3010d, "request");
        throw null;
    }
}
