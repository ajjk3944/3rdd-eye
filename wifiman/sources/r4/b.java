package R4;

import N4.F;
import O4.j;
import a3.C3754b;
import a3.InterfaceC3759g;
import a3.i;
import android.content.Context;
import c3.C4220u;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.D;
import com.google.firebase.crashlytics.internal.common.Q;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f19557c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f19558d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f19559e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC3759g f19560f = new InterfaceC3759g() { // from class: R4.a
        @Override // a3.InterfaceC3759g
        public final Object apply(Object obj) {
            return b.d((F) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final e f19561a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3759g f19562b;

    b(e eVar, InterfaceC3759g interfaceC3759g) {
        this.f19561a = eVar;
        this.f19562b = interfaceC3759g;
    }

    public static b b(Context context, S4.j jVar, Q q10) {
        C4220u.f(context);
        i iVarG = C4220u.c().g(new com.google.android.datatransport.cct.a(f19558d, f19559e));
        C3754b c3754bB = C3754b.b("json");
        InterfaceC3759g interfaceC3759g = f19560f;
        return new b(new e(iVarG.a("FIREBASE_CRASHLYTICS_REPORT", F.class, c3754bB, interfaceC3759g), jVar.b(), q10), interfaceC3759g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(F f10) {
        return f19557c.M(f10).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public Task c(D d10, boolean z10) {
        return this.f19561a.i(d10, z10).getTask();
    }
}
