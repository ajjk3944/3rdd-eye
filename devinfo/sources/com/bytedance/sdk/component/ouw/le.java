package com.bytedance.sdk.component.ouw;

import com.bytedance.sdk.component.ouw.lh;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class le {

    /* renamed from: le, reason: collision with root package name */
    final com.bytedance.sdk.component.ouw.ouw f7599le;
    final ra ouw;
    private final cf pno;
    final Map<String, vt> vt = new HashMap();

    /* renamed from: lh, reason: collision with root package name */
    final zih<String, vm> f7600lh = new zih<>();
    final Map<String, lh.vt> yu = new HashMap();
    private final List<jg> ra = new ArrayList();
    final Set<lh> fkw = new HashSet();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {
        boolean ouw;
        String vt;

        public /* synthetic */ ouw(boolean z3, String str, byte b10) {
            this(z3, str);
        }

        private ouw(boolean z3, String str) {
            this.ouw = z3;
            this.vt = str;
        }
    }

    public le(bly blyVar, com.bytedance.sdk.component.ouw.ouw ouwVar) {
        this.f7599le = ouwVar;
        this.ouw = blyVar.yu;
        this.pno = blyVar.pno;
    }

    public final ouw ouw(final jg jgVar, fkw fkwVar) throws Exception {
        vt vtVar = this.vt.get(jgVar.yu);
        String str = "";
        boolean z3 = false;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        if (vtVar != null) {
            try {
                if (vtVar instanceof yu) {
                    pno.ouw("Processing stateless call: ".concat(String.valueOf(jgVar)));
                    return ouw(jgVar, (yu) vtVar);
                }
            } catch (IllegalStateException e2) {
                pno.ouw("No remote permission config fetched, call pending: ".concat(String.valueOf(jgVar)), e2);
                this.ra.add(jgVar);
                return new ouw(b11 == true ? 1 : 0, str, b10 == true ? 1 : 0);
            }
        }
        yu yuVar = this.f7600lh.ouw.get(jgVar.yu);
        if (yuVar != null) {
            pno.ouw("Processing stateless call: ".concat(String.valueOf(jgVar)));
            return ouw(jgVar, yuVar);
        }
        lh.vt vtVar2 = this.yu.get(jgVar.yu);
        if (vtVar2 == null) {
            pno.vt("Received call: " + jgVar + ", but not registered.");
            return null;
        }
        final lh lhVarOuw = vtVar2.ouw();
        lhVarOuw.ouw = jgVar.yu;
        pno.ouw("Processing stateful call: ".concat(String.valueOf(jgVar)));
        this.fkw.add(lhVarOuw);
        lhVarOuw.ouw(ouw(jgVar.fkw, lhVarOuw), fkwVar, new lh.ouw() { // from class: com.bytedance.sdk.component.ouw.le.1
            @Override // com.bytedance.sdk.component.ouw.lh.ouw
            public final void ouw(Object obj) {
                le leVar = le.this;
                com.bytedance.sdk.component.ouw.ouw ouwVar = leVar.f7599le;
                if (ouwVar == null) {
                    return;
                }
                ouwVar.vt(th.ouw(leVar.ouw.ouw((ra) obj), lhVarOuw.vt), jgVar);
                le.this.fkw.remove(lhVarOuw);
            }

            @Override // com.bytedance.sdk.component.ouw.lh.ouw
            public final void ouw(Throwable th2) {
                com.bytedance.sdk.component.ouw.ouw ouwVar = le.this.f7599le;
                if (ouwVar == null) {
                    return;
                }
                ouwVar.vt(th.ouw(th2), jgVar);
                le.this.fkw.remove(lhVarOuw);
            }
        });
        return new ouw(z3, str, b12 == true ? 1 : 0);
    }

    public final void ouw() {
        Iterator<lh> it = this.fkw.iterator();
        while (it.hasNext()) {
            it.next().lh();
        }
        this.fkw.clear();
        this.vt.clear();
        this.yu.clear();
        this.f7600lh.ouw();
    }

    private ouw ouw(jg jgVar, yu yuVar) throws Exception {
        return new ouw(true, th.ouw(this.ouw.ouw((ra) yuVar.ouw(jgVar.yu, ouw(jgVar.fkw, yuVar))), yuVar.vt), (byte) 0);
    }

    private Object ouw(String str, vt vtVar) throws JSONException {
        return this.ouw.ouw(str, ouw(vtVar)[0]);
    }

    private static Type[] ouw(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
