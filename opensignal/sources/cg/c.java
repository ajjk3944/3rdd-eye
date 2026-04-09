package cg;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import lf.t1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3746b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f3745a = i10;
        this.f3746b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f3745a) {
            case 0:
                d dVar = this.f3746b;
                synchronized (dVar) {
                    try {
                        l lVar = (l) dVar.f3747a.get();
                        ArrayList arrayListA = lVar.a();
                        synchronized (lVar) {
                            lVar.f3763a.a(new j(0, lVar));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                            a aVar = (a) arrayListA.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f3741a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f3742b));
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
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            default:
                d dVar2 = this.f3746b;
                synchronized (dVar2) {
                    final l lVar2 = (l) dVar2.f3747a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((ng.b) dVar2.f3749c.get()).a();
                    synchronized (lVar2) {
                        final String strB = lVar2.b(jCurrentTimeMillis);
                        final h4.e eVarF = t1.F(strA);
                        lVar2.f3763a.a(new ar.k() { // from class: cg.i
                            @Override // ar.k
                            public final Object a(Object obj) {
                                Object obj2;
                                l lVar3 = lVar2;
                                String str = strB;
                                String str2 = strA;
                                h4.e eVar = eVarF;
                                h4.b bVar = (h4.b) obj;
                                Object obj3 = null;
                                if (((String) xu.l.x(bVar, l.f3762d, "")).equals(str)) {
                                    h4.e eVarC = lVar3.c(bVar, str);
                                    if (eVarC == null || eVarC.f9895a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (lVar3) {
                                        lVar3.d(bVar, str);
                                        HashSet hashSet = new HashSet((Collection) xu.l.x(bVar, eVar, new HashSet()));
                                        hashSet.add(str);
                                        bVar.e(eVar, hashSet);
                                    }
                                    return null;
                                }
                                h4.e eVar2 = l.f3761c;
                                long jLongValue = ((Long) xu.l.x(bVar, eVar2, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (lVar3) {
                                        try {
                                            long jLongValue2 = ((Long) xu.l.x(bVar, eVar2, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : bVar.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((h4.e) entry.getKey()).f9895a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            bVar.e(t1.F(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            bVar.d(l.f3761c, Long.valueOf(jLongValue));
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) xu.l.x(bVar, eVar, new HashSet()));
                                hashSet4.add(str);
                                bVar.e(eVar, hashSet4);
                                bVar.d(l.f3761c, Long.valueOf(jLongValue + 1));
                                bVar.d(l.f3762d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
