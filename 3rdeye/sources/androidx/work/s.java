package androidx.work;

import a9.InterfaceC1676a;
import android.graphics.Color;
import com.applovin.impl.h3;
import com.applovin.impl.j3;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.impl.B6;
import io.appmetrica.analytics.impl.C4756l2;
import io.appmetrica.analytics.impl.C4908qo;
import io.appmetrica.analytics.impl.InterfaceC4587ee;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.to;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements h3.a, e7.k, InterfaceC4587ee, B6, to, InterfaceC1676a, Continuation, I4.d, v3.j {
    public static int c(int i, int i10, int i11) {
        return zzjl.zzA(i) + i10 + i11;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, char c10) {
        return str + str2 + c10;
    }

    public static String f(StringBuilder sb, long j4, char c10) {
        sb.append(j4);
        sb.append(c10);
        return sb.toString();
    }

    public static String h(StringBuilder sb, boolean z10, String str) {
        sb.append(z10);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder i(String str, int i, String str2, int i10, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i10);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder j(String str, String str2, long j4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j4);
        sb.append(str2);
        return sb;
    }

    public static Map k(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void l(int i, int i10, int i11, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i10, i11)));
    }

    public static void m(zzfy zzfyVar, String str) {
        zzfyVar.zzay().zzk().zza(str);
    }

    public static /* synthetic */ boolean n(Object obj) {
        return obj != null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4587ee
    public Xk a(B0 b02) {
        return Vd.a(b02);
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        return FirebaseSessionsRegistrar.getComponents$lambda$4(tVar);
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return e7.j.f37745a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return -1;
    }

    @Override // com.applovin.impl.h3.a
    public Object a(Object obj) {
        return j3.a((Long) obj);
    }

    @Override // io.appmetrica.analytics.impl.to
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return C4908qo.a(jSONObject, jSONObject2);
    }

    @Override // io.appmetrica.analytics.impl.B6
    public boolean a(Throwable th) {
        return C4756l2.a(th);
    }

    @Override // e7.k
    public boolean a() {
        return false;
    }

    @Override // v3.j
    public void b(Exception exc) {
    }
}
