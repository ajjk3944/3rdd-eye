package fb;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.sk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f23953a;

    /* renamed from: b, reason: collision with root package name */
    public String f23954b;

    /* renamed from: d, reason: collision with root package name */
    public final iu f23956d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f23957e;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23959h;

    /* renamed from: c, reason: collision with root package name */
    public String f23955c = null;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f23958f = new Bundle();

    public o(JsonReader jsonReader, iu iuVar) throws IOException {
        Bundle bundle;
        this.g = -1L;
        this.f23959h = -1L;
        this.f23956d = iuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.g = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f23959h = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f23953a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f23958f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.B2)).booleanValue() || iuVar == null || (bundle = iuVar.f12483m) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.g);
        bundle.putLong("get-signals-sdkcore-end", this.f23959h);
    }
}
