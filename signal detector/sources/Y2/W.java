package Y2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import b4.C0344i;
import d1.C2264b;
import e4.InterfaceC2304a;
import g1.C2330a;
import h0.C2351a;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4295a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4300f;

    public /* synthetic */ W(C0200b c0200b, Activity activity, C0344i c0344i, e4.b bVar, InterfaceC2304a interfaceC2304a) {
        this.f4296b = c0200b;
        this.f4297c = activity;
        this.f4298d = c0344i;
        this.f4299e = bVar;
        this.f4300f = interfaceC2304a;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String str;
        switch (this.f4295a) {
            case 0:
                C0200b c0200b = (C0200b) this.f4296b;
                Handler handler = (Handler) c0200b.f4304c;
                Activity activity = (Activity) this.f4297c;
                C0344i c0344i = (C0344i) this.f4298d;
                e4.b bVar = (e4.b) this.f4299e;
                final InterfaceC2304a interfaceC2304a = (InterfaceC2304a) this.f4300f;
                try {
                    c0344i.getClass();
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + AbstractC0218u.a((Application) c0200b.f4303b) + "\") to set this as a debug device.");
                    C0217t c0217tD = c0200b.d(((C2351a) c0200b.f4308g).S(activity, c0344i));
                    V2.e eVar = (V2.e) c0200b.f4309h;
                    M3.o oVar = new M3.o();
                    oVar.f2870a = 0;
                    oVar.f2871b = 1;
                    oVar.f2872c = eVar;
                    oVar.f2873d = c0217tD;
                    C.g gVarA = oVar.a();
                    C0204f c0204f = (C0204f) c0200b.f4306e;
                    c0204f.f4323b.edit().putInt("consent_status", gVarA.f890a).commit();
                    int i = gVarA.f891b;
                    SharedPreferences.Editor editorEdit = c0204f.f4323b.edit();
                    if (i == 1) {
                        str = "UNKNOWN";
                    } else if (i == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    editorEdit.putString("privacy_options_requirement_status", str).commit();
                    ((C0209k) c0200b.f4307f).f4344c.set((C0210l) gVarA.f892c);
                    ((P) c0200b.i).f4278a.execute(new A2.C(c0200b, bVar, gVarA, 11));
                    return;
                } catch (Q e6) {
                    final int i3 = 0;
                    handler.post(new Runnable() { // from class: Y2.V
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    e6.a();
                                    interfaceC2304a.i();
                                    break;
                                default:
                                    e6.a();
                                    interfaceC2304a.i();
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e7) {
                    final int i6 = 1;
                    final Q q3 = new Q(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e7))));
                    handler.post(new Runnable() { // from class: Y2.V
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    q3.a();
                                    interfaceC2304a.i();
                                    break;
                                default:
                                    q3.a();
                                    interfaceC2304a.i();
                                    break;
                            }
                        }
                    });
                    return;
                }
            default:
                try {
                    if (!(((g1.k) this.f4296b).f20163a instanceof C2330a)) {
                        String string = ((UUID) this.f4297c).toString();
                        int iE = ((f1.o) this.f4300f).f20072c.e(string);
                        if (iE == 0 || A.f.b(iE)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((W0.b) ((f1.o) this.f4300f).f20071b).g(string, (V0.g) this.f4298d);
                        ((Context) this.f4299e).startService(C2264b.b((Context) this.f4299e, string, (V0.g) this.f4298d));
                    }
                    ((g1.k) this.f4296b).i(null);
                    return;
                } catch (Throwable th) {
                    ((g1.k) this.f4296b).j(th);
                    return;
                }
        }
    }

    public W(f1.o oVar, g1.k kVar, UUID uuid, V0.g gVar, Context context) {
        this.f4300f = oVar;
        this.f4296b = kVar;
        this.f4297c = uuid;
        this.f4298d = gVar;
        this.f4299e = context;
    }
}
