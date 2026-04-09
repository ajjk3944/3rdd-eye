package com.mbridge.msdk.config.component.pipeline;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.base.c;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a implements c {

    /* renamed from: b, reason: collision with root package name */
    private final String f13664b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f13665c;

    /* renamed from: e, reason: collision with root package name */
    private Handler f13667e;

    /* renamed from: g, reason: collision with root package name */
    private Handler f13669g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f13670h;

    /* renamed from: i, reason: collision with root package name */
    private d f13671i;

    /* renamed from: a, reason: collision with root package name */
    private final String f13663a = "PipMg";

    /* renamed from: d, reason: collision with root package name */
    private final HandlerThread f13666d = new HandlerThread("FilterPipelineThread");

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f13668f = new HandlerThread("ComponentThread");

    public a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.b("PipMg", "Pipeline can not be null");
        }
        this.f13670h = aVar;
        this.f13664b = com.mbridge.msdk.config.component.pipeline.util.a.a();
        this.f13671i = new d();
        this.f13665c = new e().a(str);
        a();
    }

    public void a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            q0.b("PipMg", "Pipeline can not be null");
        } else {
            this.f13665c.putAll(map);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(b bVar) {
        try {
            String strA = bVar.a();
            String strC = bVar.c();
            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strC) && this.f13665c != null) {
                String strD = bVar.d();
                if (!a(bVar, strD, strA)) {
                    a(bVar, (Map<String, Object>) this.f13665c.get(strD), strD);
                    return;
                }
                for (Map.Entry<String, Object> entry : this.f13665c.entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof Map) {
                        a(bVar, (Map<String, Object>) value, key);
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
    }

    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a c(b bVar) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
        aVar.a(com.mbridge.msdk.config.component.common.util.c.a("50"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.a("50")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("50")) : bVar.b());
        aVar.a(com.mbridge.msdk.config.component.common.util.c.a("51"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.a("51")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("51")) : new com.mbridge.msdk.config.dynamic.binddata.wrapper.a());
        aVar.a("g0", this.f13670h);
        aVar.a(com.mbridge.msdk.config.component.common.util.c.a("52"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.a("52")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("52")) : new HashMap());
        aVar.a(com.mbridge.msdk.config.component.common.util.c.a("sdk_context"), bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.a("sdk_context")) ? bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("sdk_context")) : new HashMap());
        return aVar;
    }

    private void a() {
        this.f13666d.start();
        this.f13667e = new Handler(this.f13666d.getLooper());
        this.f13668f.start();
        this.f13669g = new Handler(this.f13668f.getLooper());
    }

    private boolean a(b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || str2.equals("_")) {
            return true;
        }
        try {
            if (bVar.b().containsKey(com.mbridge.msdk.config.component.common.util.c.a("50"))) {
                Object obj = bVar.b().get(com.mbridge.msdk.config.component.common.util.c.a("50"));
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (map.containsKey(com.mbridge.msdk.config.component.common.util.c.a("18"))) {
                        Object obj2 = map.get(com.mbridge.msdk.config.component.common.util.c.a("18"));
                        if (obj2 instanceof String) {
                            return obj2.equals("1");
                        }
                        return (obj2 instanceof Integer) && ((Integer) obj2).intValue() == 1;
                    }
                }
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
        return false;
    }

    private void a(final b bVar, Map<String, Object> map, final String str) {
        Object obj = map.get(bVar.c());
        List<Map> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return;
        }
        final com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarC = c(bVar);
        String strValueOf = "";
        for (Map map2 : list) {
            Object obj2 = map2.get(com.mbridge.msdk.config.component.common.util.c.a("11"));
            Object obj3 = map2.get(com.mbridge.msdk.config.component.common.util.c.a("12"));
            boolean zEquals = true;
            if (obj2 != null) {
                strValueOf = String.valueOf(obj2);
                if (!TextUtils.isEmpty(strValueOf)) {
                    Object objA = this.f13671i.a(strValueOf, aVarC);
                    if (objA instanceof Integer) {
                        if (((Integer) objA).intValue() != 1) {
                            zEquals = false;
                        }
                    } else if (objA instanceof String) {
                        zEquals = String.valueOf(objA).equals("1");
                    }
                }
            }
            final String str2 = strValueOf;
            if (zEquals && obj3 != null && (obj3 instanceof List)) {
                List list2 = (List) obj3;
                if (!list2.isEmpty()) {
                    for (Object obj4 : list2) {
                        if (obj4 instanceof Map) {
                            final Map<?, ?> mapA = a((Map) obj4, aVarC);
                            int iA = com.mbridge.msdk.config.component.pipeline.util.a.a(String.valueOf(mapA.get(com.mbridge.msdk.config.component.common.util.c.a("14"))));
                            if (iA > 0) {
                                this.f13669g.postDelayed(new Runnable() { // from class: t6.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f24395a.b(bVar, mapA, aVarC, str2, str);
                                    }
                                }, iA * 1000);
                            } else {
                                this.f13669g.post(new Runnable() { // from class: t6.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f24401a.c(bVar, mapA, aVarC, str2, str);
                                    }
                                });
                            }
                        }
                    }
                }
            }
            strValueOf = str2;
        }
    }

    private Map<?, ?> a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA = (map == null || map.isEmpty()) ? null : com.mbridge.msdk.config.component.common.util.c.a((Map<String, Object>) map, aVar);
        return mapA == null ? new LinkedHashMap() : mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(b bVar, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.a("15")));
                String strConcat = this.f13664b.concat(".").concat(strValueOf.toLowerCase()).concat(".").concat(strValueOf).concat("Cpt");
                com.mbridge.msdk.config.component.base.a aVarA = a(strConcat, map, aVar);
                if (aVarA == null) {
                    aVarA = (com.mbridge.msdk.config.component.base.a) Class.forName(strConcat).getDeclaredConstructor(null).newInstance(null);
                    a(strConcat, aVarA, aVar);
                }
                aVarA.a(this);
                aVarA.a(map, aVar, str2);
                aVarA.d();
            } catch (Throwable th) {
                q0.b("PipMg", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.config.component.base.a a(String str, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map map2;
        Map map3;
        List<com.mbridge.msdk.config.component.base.a> list;
        try {
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty() && (map2 = (Map) aVar.b(com.mbridge.msdk.config.component.common.util.c.a("sdk_context"))) != null && !map2.isEmpty() && (map3 = (Map) map2.get(com.mbridge.msdk.config.component.common.util.c.a("component_cache"))) != null && !map3.isEmpty() && map3.containsKey(str) && (list = (List) map3.get(str)) != null && !list.isEmpty()) {
            for (com.mbridge.msdk.config.component.base.a aVar2 : list) {
                if ((aVar2 instanceof com.mbridge.msdk.config.component.base.d) && ((com.mbridge.msdk.config.component.base.d) aVar2).a(map)) {
                    return aVar2;
                }
            }
            return null;
        }
        return null;
    }

    private void a(String str, com.mbridge.msdk.config.component.base.a aVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2) {
        Map map;
        try {
            if ((aVar instanceof com.mbridge.msdk.config.component.base.d) && (map = (Map) aVar2.b(com.mbridge.msdk.config.component.common.util.c.a("sdk_context"))) != null && !map.isEmpty()) {
                Map map2 = (Map) map.get(com.mbridge.msdk.config.component.common.util.c.a("component_cache"));
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("component_cache"), map2);
                }
                if (map2.containsKey(str)) {
                    List list = (List) map2.get(str);
                    if (list != null) {
                        list.add(aVar);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    map2.put(str, arrayList);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aVar);
                map2.put(str, arrayList2);
            }
        } catch (Throwable th) {
            q0.b("PipMg", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.c
    public void a(final b bVar) {
        this.f13667e.post(new Runnable() { // from class: t6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f24393a.d(bVar);
            }
        });
    }
}
