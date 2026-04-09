package so;

import android.content.SharedPreferences;
import br.l;
import java.text.ParseException;
import lq.q;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: b, reason: collision with root package name */
    public final q f22177b;

    public c() {
        super(3);
        this.f22177b = kc.f.F(b.f22176d);
    }

    @Override // so.f
    public final void a(SharedPreferences sharedPreferences) throws JSONException, ParseException {
        l.e(sharedPreferences, "sharedPrefs");
        b(sharedPreferences, "firstPresentationTimesKey");
        b(sharedPreferences, "lastPresentationTimesKey");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.SharedPreferences r9, java.lang.String r10) throws org.json.JSONException, java.text.ParseException {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = r9.getString(r10, r0)     // Catch: java.lang.ClassCastException -> L6
            goto L12
        L6:
            android.content.SharedPreferences$Editor r1 = r9.edit()
            android.content.SharedPreferences$Editor r1 = r1.remove(r10)
            r1.apply()
            r1 = r0
        L12:
            if (r1 != 0) goto L15
            return
        L15:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7e
            r2.<init>(r1)     // Catch: org.json.JSONException -> L7e
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r3 = r2.keys()
            java.lang.String r4 = "keys(...)"
            br.l.d(r3, r4)
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            br.l.b(r4)
            boolean r5 = r2.isNull(r4)
            if (r5 == 0) goto L3f
        L3d:
            r5 = r0
            goto L63
        L3f:
            java.lang.String r5 = r2.getString(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "getString(...)"
            br.l.d(r5, r6)     // Catch: java.lang.Throwable -> L3d
            lq.q r6 = r8.f22177b     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L3d
            java.text.SimpleDateFormat r6 = (java.text.SimpleDateFormat) r6     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = "<this>"
            br.l.e(r6, r7)     // Catch: java.lang.Throwable -> L3d
            java.util.Date r5 = r6.parse(r5)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3d
            long r5 = r5.getTime()     // Catch: java.lang.Throwable -> L3d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L3d
        L63:
            if (r5 == 0) goto L28
            r1.put(r4, r5)
            goto L28
        L69:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r9 = r9.putString(r10, r0)
            r9.apply()
            return
        L7e:
            android.content.SharedPreferences$Editor r9 = r9.edit()
            android.content.SharedPreferences$Editor r9 = r9.remove(r10)
            r9.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so.c.b(android.content.SharedPreferences, java.lang.String):void");
    }
}
