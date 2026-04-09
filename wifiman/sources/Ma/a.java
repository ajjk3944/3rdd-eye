package Ma;

import Zg.d0;
import android.content.Context;
import i9.InterfaceC6137a;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.q;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static InterfaceC6137a f13070b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f13069a = new a();

    /* renamed from: c, reason: collision with root package name */
    private static Set f13071c = d0.i("0B:B2:49:1A:67:F9:C1:AE:9D:3A:28:CE:34:BF:3E:AB:86:B5:7E:74:9F:66:20:25:54:25:9E:2D:C7:8C:3C:F9", "34:A0:D9:5A:95:7A:B8:44:A3:D4:E2:CF:89:42:81:BD:D6:1D:7D:9D:E2:33:26:2F:B7:1A:CD:85:D5:68:DD:01", "80:44:78:34:E7:4D:A0:C4:E1:ED:AB:11:65:18:C1:05:8E:C5:52:C2:0C:40:5E:F3:EE:E5:B5:45:67:4B:08:F4", "96:04:09:50:7B:18:B3:94:4B:19:12:63:4F:F9:67:AC:DE:F2:A3:D1:CF:E0:2B:F9:B4:FB:27:D3:08:AF:53:67", "EB:BD:BD:02:90:34:16:4B:7A:3C:80:84:F4:AA:D2:2E:78:6C:C7:A9:4A:5B:A0:16:3F:85:73:7E:2F:1C:09:74", "35:C8:14:A4:98:1F:E3:A1:74:62:E7:7D:E0:E4:04:E0:27:3D:4B:90:21:CE:7B:9F:CC:E0:3D:23:CA:EE:9F:86", "6B:C4:F5:C6:B8:4D:F5:32:64:56:23:F2:7C:C8:9F:E6:D9:05:ED:91:D2:6E:6A:88:DF:EC:9D:8B:90:D8:60:4D", "82:73:0D:FE:71:A8:7F:BF:38:A1:E7:55:66:28:59:95:69:9B:ED:C3:DC:04:EC:69:45:60:90:38:82:EA:68:D6");

    /* renamed from: d, reason: collision with root package name */
    private static q f13072d = C0512a.f13073a;

    /* renamed from: Ma.a$a, reason: collision with other inner class name */
    static final class C0512a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final C0512a f13073a = new C0512a();

        C0512a() {
            super(3);
        }

        @Override // mh.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void s(Context context, String str, String str2) {
            AbstractC6492s.i(context, "<anonymous parameter 0>");
            throw new IllegalStateException("Login screen provider not set!");
        }
    }

    private a() {
    }

    public final Set a() {
        return f13071c;
    }

    public final InterfaceC6137a b() {
        return f13070b;
    }

    public final q c() {
        return f13072d;
    }

    public final void d(InterfaceC6137a interfaceC6137a) {
        f13070b = interfaceC6137a;
    }

    public final void e(q qVar) {
        AbstractC6492s.i(qVar, "<set-?>");
        f13072d = qVar;
    }
}
