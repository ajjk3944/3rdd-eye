package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1730h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class S {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC1730h.e eVar = AbstractC1730h.f15603c;
            sb.append(A2.l.u(new AbstractC1730h.e(((String) obj).getBytes(C1746y.f15707a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1730h) {
            sb.append(": \"");
            sb.append(A2.l.u((AbstractC1730h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1744w) {
            sb.append(" {");
            c((AbstractC1744w) obj, sb, i + 2);
            sb.append("\n");
            while (i10 < i) {
                sb.append(' ');
                i10++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i + 2;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        while (i10 < i) {
            sb.append(' ');
            i10++;
        }
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC1744w r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.c(androidx.datastore.preferences.protobuf.w, java.lang.StringBuilder, int):void");
    }
}
