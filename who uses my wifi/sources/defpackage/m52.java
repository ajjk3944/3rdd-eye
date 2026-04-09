package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface m52 extends r52, l52 {
    @Override // defpackage.l52
    default void a(String str, Map map) {
        try {
            c("openIntentAsync", sv1.f.a.i(map));
        } catch (JSONException unused) {
            gi2.i0("Could not convert parameters to JSON.");
        }
    }

    @Override // defpackage.l52
    default void c(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',");
        sb.append(string);
        sb.append(");");
        gi2.U("Dispatching AFMA event: ".concat(sb.toString()));
        l(sb.toString());
    }

    @Override // defpackage.r52
    void l(String str);

    @Override // defpackage.r52
    default void s(String str, String str2) {
        l(ex0.m(new StringBuilder(ga1.i(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }
}
