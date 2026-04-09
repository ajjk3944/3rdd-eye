package g0;

import I4.t;
import a9.InterfaceC1676a;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.N0;
import androidx.camera.view.PreviewView;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.impl.C4933ro;
import io.appmetrica.analytics.impl.InterfaceC4587ee;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.to;
import j3.i;
import j6.u;
import java.util.ArrayList;
import m6.InterfaceC5328a;
import org.json.JSONObject;
import org.xml.sax.Attributes;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4356c implements InterfaceC4587ee, to, InterfaceC1676a, l7.l, InterfaceC5328a, C5670z.f.a, I4.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37903b;

    public /* synthetic */ C4356c(int i) {
        this.f37903b = i;
    }

    public static int c(int i, int i10, int i11, int i12) {
        return ((i - i10) / i11) + i12;
    }

    public static int d(Attributes attributes, int i) {
        return i.g.fromString(attributes.getLocalName(i)).ordinal();
    }

    public static M0 f(N0.b bVar, N0.a aVar, M0 m02, ArrayList arrayList, M0 m03) {
        m02.a(N0.a(bVar, aVar));
        arrayList.add(m03);
        return new M0();
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(int i, String str, String str2) {
        return str + i + str2;
    }

    public static StringBuilder j(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4587ee
    public Xk a(B0 b02) {
        return Vd.b(b02);
    }

    @Override // m6.InterfaceC5328a
    public w6.e b() {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }

    @Override // l7.l
    public boolean e(Object obj) {
        return ((String) obj).length() > 0;
    }

    @Override // I4.d
    public Object g(t tVar) {
        switch (this.f37903b) {
            case 14:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(tVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$5(tVar);
        }
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return u.f43061a;
    }

    public /* synthetic */ C4356c(PreviewView previewView) {
        this.f37903b = 0;
    }

    @Override // io.appmetrica.analytics.impl.to
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return C4933ro.a(jSONObject, jSONObject2);
    }

    @Override // v.C5670z.f.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.f37903b) {
            case 10:
                return C5670z.b(totalCaptureResult, false);
            default:
                return C5670z.b(totalCaptureResult, true);
        }
    }
}
