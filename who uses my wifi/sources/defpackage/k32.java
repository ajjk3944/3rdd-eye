package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k32 implements y32 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ k32(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public static final Bundle a(Map map) throws JSONException {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                hg4.C.h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e);
            }
        }
        return bundle;
    }

    public static final ArrayList b(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            hg4.C.h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x050f  */
    @Override // defpackage.y32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r12, java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k32.c(java.lang.Object, java.util.Map):void");
    }
}
