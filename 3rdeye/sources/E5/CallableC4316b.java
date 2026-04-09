package e5;

import android.util.Base64OutputStream;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.impl.C4961t0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC4316b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37719b;

    public /* synthetic */ CallableC4316b(Object obj, int i) {
        this.f37718a = i;
        this.f37719b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f37718a) {
            case 0:
                C4318d c4318d = (C4318d) this.f37719b;
                synchronized (c4318d) {
                    try {
                        h hVar = (h) c4318d.f37722a.get();
                        ArrayList arrayListC = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListC.size(); i++) {
                            i iVar = (i) arrayListC.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", iVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) iVar.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(Constants.ENCODING);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            default:
                return ((C4961t0) this.f37719b).p();
        }
    }
}
