package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tz1 {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public tz1(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final rz1 d() {
        hg4.C.k.getClass();
        return new rz1(SystemClock.elapsedRealtime(), null, null);
    }

    public final void a(rz1 rz1Var, long j, String... strArr) {
        synchronized (this.c) {
            this.a.add(new rz1(j, strArr[0], rz1Var));
        }
    }

    public final sz1 b() {
        sz1 sz1Var;
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.c) {
            try {
                LinkedList<rz1> linkedList = this.a;
                for (rz1 rz1Var : linkedList) {
                    long j = rz1Var.a;
                    String str = rz1Var.b;
                    rz1 rz1Var2 = rz1Var.c;
                    if (rz1Var2 != null && j > 0) {
                        long j2 = j - rz1Var2.a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(rz1Var2.a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(rz1Var2.a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(rz1Var2.a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        hg4 hg4Var = hg4.C;
                        hg4Var.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        hg4Var.k.getClass();
                        sb3.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                sz1Var = new sz1(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return sz1Var;
    }

    public final void c(String str, String str2) {
        h2 h2VarA;
        if (TextUtils.isEmpty(str2) || (h2VarA = hg4.C.h.a()) == null) {
            return;
        }
        synchronized (this.c) {
            qz1 qz1Var = (qz1) ((HashMap) h2VarA.c).get(str);
            if (qz1Var == null) {
                qz1Var = qz1.b;
            }
            LinkedHashMap linkedHashMap = this.b;
            linkedHashMap.put(str, qz1Var.a((String) linkedHashMap.get(str), str2));
        }
    }
}
