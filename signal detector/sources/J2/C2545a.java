package j2;

import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2852x0;
import t2.AbstractC2907C;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2545a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21320a;

    /* renamed from: b, reason: collision with root package name */
    public int f21321b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21322c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21323d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f21324e;

    public C2545a() {
        this.f21320a = 2;
        this.f21322c = null;
        this.f21323d = null;
        this.f21321b = 0;
        this.f21324e = new Object();
    }

    public Looper a() {
        Looper looper;
        Object obj = this.f21324e;
        synchronized (obj) {
            try {
                if (this.f21321b != 0) {
                    M2.u.f((HandlerThread) this.f21322c, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f21322c) == null) {
                    AbstractC2907C.m("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f21322c = handlerThread;
                    handlerThread.start();
                    this.f21323d = new W2.e(((HandlerThread) this.f21322c).getLooper(), 3);
                    AbstractC2907C.m("Looper thread started.");
                } else {
                    AbstractC2907C.m("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f21321b++;
                looper = ((HandlerThread) this.f21322c).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public C2852x0 b() {
        C2852x0 c2852x0;
        C2545a c2545a = (C2545a) this.f21324e;
        if (c2545a == null) {
            c2852x0 = null;
        } else {
            c2852x0 = new C2852x0(c2545a.f21321b, (String) c2545a.f21322c, (String) c2545a.f21323d, null, null);
        }
        return new C2852x0(this.f21321b, (String) this.f21322c, (String) this.f21323d, c2852x0, null);
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f21321b);
        jSONObject.put("Message", (String) this.f21322c);
        jSONObject.put("Domain", (String) this.f21323d);
        C2545a c2545a = (C2545a) this.f21324e;
        if (c2545a == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c2545a.c());
        return jSONObject;
    }

    public String toString() {
        switch (this.f21320a) {
            case 0:
                try {
                    return c().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public C2545a(int i, String str, String str2, C2545a c2545a) {
        this.f21320a = 0;
        this.f21321b = i;
        this.f21322c = str;
        this.f21323d = str2;
        this.f21324e = c2545a;
    }

    public C2545a(InterfaceC0828Yg interfaceC0828Yg) throws s2.g {
        this.f21320a = 1;
        this.f21322c = interfaceC0828Yg.getLayoutParams();
        ViewParent parent = interfaceC0828Yg.getParent();
        this.f21324e = interfaceC0828Yg.i0();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f21323d = viewGroup;
            this.f21321b = viewGroup.indexOfChild(interfaceC0828Yg.b0());
            viewGroup.removeView(interfaceC0828Yg.b0());
            interfaceC0828Yg.h1(true);
            return;
        }
        throw new s2.g("Could not get the parent of the WebView for an overlay.");
    }
}
