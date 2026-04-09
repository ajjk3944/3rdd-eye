package u4;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5633b implements InterfaceC5634c {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f46565d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC5634c f46566b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f46567c;

    public static InterfaceC5634c a(InterfaceC5634c interfaceC5634c) {
        if (interfaceC5634c instanceof C5633b) {
            return interfaceC5634c;
        }
        C5633b c5633b = new C5633b();
        c5633b.f46567c = f46565d;
        c5633b.f46566b = interfaceC5634c;
        return c5633b;
    }

    @Override // u4.InterfaceC5634c
    public final Object zza() {
        Object objZza;
        Object obj = this.f46567c;
        Object obj2 = f46565d;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f46567c;
                if (objZza == obj2) {
                    objZza = this.f46566b.zza();
                    Object obj3 = this.f46567c;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f46567c = objZza;
                    this.f46566b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
