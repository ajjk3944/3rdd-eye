package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class dn1 implements zk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dn1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                cr1 cr1Var = (cr1) this.b;
                List<Uri> list = (List) this.c;
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (!cr1.F3(uri, cr1Var.E, cr1Var.F) || TextUtils.isEmpty(str)) {
                        arrayList.add(uri);
                    } else {
                        arrayList.add(cr1.I3(uri, "nas", str));
                    }
                }
                return arrayList;
            case 1:
                c62 c62Var = (c62) obj;
                c62Var.h((String) this.b, (y32) this.c);
                return c62Var;
            default:
                ft2 ft2Var = (ft2) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                List list2 = (List) obj;
                ft2Var.getClass();
                if (list2 == null || list2.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = ft2.c("bg_color", jSONObject);
                Integer numC2 = ft2.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new n12(strOptString, list2, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, ft2Var.h.j);
        }
    }
}
