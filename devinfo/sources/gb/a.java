package gb;

import android.net.Uri;
import android.os.RemoteException;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.jz;
import java.io.IOException;
import java.util.Map;
import va.l1;
import za.e;
import za.f;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public static a f24624c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24625a;

    /* renamed from: b, reason: collision with root package name */
    public String f24626b;

    public /* synthetic */ a(String str) {
        this.f24625a = 3;
        this.f24626b = str;
    }

    public String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f24626b).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // za.e
    public /* synthetic */ void i(JsonWriter jsonWriter) throws IOException {
        Object obj = f.f38143b;
        jsonWriter.name("params").beginObject();
        String str = this.f24626b;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.f24625a) {
            case 1:
                return this.f24626b;
            default:
                return super.toString();
        }
    }

    public a(int i4) {
        this.f24625a = i4;
        switch (i4) {
            case 2:
                break;
            default:
                this.f24626b = (String) jz.f12888k.u();
                break;
        }
    }

    public a(l1 l1Var) {
        String strC;
        this.f24625a = 1;
        try {
            strC = l1Var.c();
        } catch (RemoteException e2) {
            i.f("", e2);
            strC = null;
        }
        this.f24626b = strC;
    }
}
