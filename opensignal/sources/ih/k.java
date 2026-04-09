package ih;

import ch.n;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f11405a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final dh.b f11406b;

    /* renamed from: c, reason: collision with root package name */
    public String f11407c;

    /* renamed from: d, reason: collision with root package name */
    public String f11408d;

    public k(dh.b bVar) {
        this.f11406b = bVar;
    }

    public final float a() {
        Iterator it = this.f11405a.iterator();
        float f10 = 0.0f;
        long j = 0;
        while (it.hasNext()) {
            float fFloatValue = ((Float) it.next()).floatValue();
            if (fFloatValue > 0.0f) {
                f10 += fFloatValue;
                j++;
            }
        }
        float f11 = j == 0 ? -1.0f : f10 / j;
        Charset charset = zh.f.f27419a;
        return ((int) (f11 * 1000.0f)) / 1000.0f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LatencyTestResult{results=");
        sb2.append(this.f11405a);
        sb2.append(", endpoint=");
        sb2.append(this.f11406b);
        sb2.append(", ipAddress='");
        sb2.append(this.f11407c);
        sb2.append("', hostName='");
        return w.g.j(sb2, this.f11408d, "'}");
    }

    public k(String str, String str2, String str3, String str4, String str5) {
        this.f11406b = new dh.b(str, str2);
        this.f11408d = str3;
        this.f11407c = str4;
        try {
            JSONArray jSONArray = new JSONArray(str5);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f11405a.add(Float.valueOf((float) jSONArray.getDouble(i10)));
            }
        } catch (JSONException e4) {
            n.e("SpeedMeasurementResult", e4);
        }
    }
}
