package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class K2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35953a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35954b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f35955c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f35956d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Object f35957e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ L2 f35958f;

    K2(L2 l22, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f35953a = i10;
        this.f35954b = str;
        this.f35955c = obj;
        this.f35956d = obj2;
        this.f35957e = obj3;
        this.f35958f = l22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2 x2C = this.f35958f.f36331a.C();
        if (!x2C.o()) {
            this.f35958f.u(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f35958f.f35978c == 0) {
            if (this.f35958f.a().q()) {
                this.f35958f.f35978c = 'C';
            } else {
                this.f35958f.f35978c = 'c';
            }
        }
        if (this.f35958f.f35979d < 0) {
            this.f35958f.f35979d = 118003L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f35953a) + this.f35958f.f35978c + this.f35958f.f35979d + ":" + L2.t(true, this.f35954b, this.f35955c, this.f35956d, this.f35957e);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f35954b.substring(0, 1024);
        }
        C4811b3 c4811b3 = x2C.f36266f;
        if (c4811b3 != null) {
            c4811b3.b(strSubstring, 1L);
        }
    }
}
