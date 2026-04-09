package cb;

import Ab.g;
import Gb.f;
import Yg.m;
import Yg.n;
import android.content.Context;
import db.C5339a;
import eb.InterfaceC5443g;
import fb.k;
import fb.o;
import jb.InterfaceC6263a;
import jb.i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.C6569c;
import mh.InterfaceC6824a;
import okhttp3.logging.HttpLoggingInterceptor;
import org.conscrypt.PSKKeyManager;
import org.webrtc.EglBase;
import qb.C7447b;
import tb.N;
import ub.d;
import ub.e;
import wb.InterfaceC8291a;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final HttpLoggingInterceptor.Level f33909a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33910b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6263a f33911c;

    /* renamed from: d, reason: collision with root package name */
    private final Ab.a f33912d;

    /* renamed from: e, reason: collision with root package name */
    private final f f33913e;

    /* renamed from: f, reason: collision with root package name */
    private final C5339a f33914f;

    /* renamed from: g, reason: collision with root package name */
    private final d f33915g;

    /* renamed from: h, reason: collision with root package name */
    private final i f33916h;

    /* renamed from: i, reason: collision with root package name */
    private final Cb.a f33917i;

    /* renamed from: j, reason: collision with root package name */
    private final m f33918j;

    public c(Context context, Gb.d storage, EnumC4235a environment, EglBase eglBase, Ab.b bVar, final String clientName, final String clientVersion, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level httpLogLevel, boolean z10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientVersion, "clientVersion");
        AbstractC6492s.i(httpLogLevel, "httpLogLevel");
        this.f33909a = httpLogLevel;
        i(context, eglBase);
        Gb.i iVar = new Gb.i(storage);
        this.f33913e = iVar;
        this.f33910b = clientVersion;
        C5339a c5339a = new C5339a(environment);
        this.f33914f = c5339a;
        Cb.b bVar2 = new Cb.b(iVar, z10, ub.f.a(context));
        this.f33917i = bVar2;
        g gVar = new g(environment.getSsoConfig(), iVar, bVar, clientName, clientVersion, interfaceC8291a, bVar2, httpLogLevel, null, null, 768, null);
        this.f33912d = gVar;
        jb.m mVar = new jb.m(c5339a, iVar);
        this.f33916h = mVar;
        this.f33911c = new jb.b(environment, gVar, clientName, clientVersion, iVar, mVar, interfaceC8291a, httpLogLevel, bVar2);
        this.f33915g = new e(iVar, new C7447b(environment));
        this.f33918j = n.b(new InterfaceC6824a() { // from class: cb.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return c.b(clientVersion, clientName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6569c b(String str, String str2) {
        return new C6569c(str, str2, null, 4, null);
    }

    private final C6569c d() {
        return (C6569c) this.f33918j.getValue();
    }

    private final k f(String str, String str2, String str3, o oVar) {
        return new k(str2, str, str3, d(), oVar, this.f33913e, this.f33912d, null, this.f33909a, this.f33917i);
    }

    public static /* synthetic */ InterfaceC5443g h(c cVar, String str, boolean z10, InterfaceC5443g.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        return cVar.g(str, z10, bVar);
    }

    private final void i(Context context, EglBase eglBase) {
        N.f61932B.a(context, eglBase);
    }

    public final InterfaceC6263a c() {
        return this.f33911c;
    }

    public final InterfaceC5443g e(String deviceId, String host, String macAddress, String ncaToken) {
        AbstractC6492s.i(deviceId, "deviceId");
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(macAddress, "macAddress");
        AbstractC6492s.i(ncaToken, "ncaToken");
        return f(deviceId, host, macAddress, new o.a(ncaToken));
    }

    public final InterfaceC5443g g(String deviceId, boolean z10, InterfaceC5443g.b bVar) {
        AbstractC6492s.i(deviceId, "deviceId");
        return new hb.c(this.f33910b, deviceId, z10, this.f33913e, d(), this.f33911c, this.f33916h, bVar);
    }

    public /* synthetic */ c(Context context, Gb.d dVar, EnumC4235a enumC4235a, EglBase eglBase, Ab.b bVar, String str, String str2, InterfaceC8291a interfaceC8291a, HttpLoggingInterceptor.Level level, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, (i10 & 4) != 0 ? EnumC4235a.PRODUCTION : enumC4235a, (i10 & 8) != 0 ? null : eglBase, (i10 & 16) != 0 ? null : bVar, str, str2, (i10 & 128) != 0 ? null : interfaceC8291a, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? HttpLoggingInterceptor.Level.BASIC : level, (i10 & 512) != 0 ? false : z10);
    }
}
