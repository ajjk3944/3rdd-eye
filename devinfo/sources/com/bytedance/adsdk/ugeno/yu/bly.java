package com.bytedance.adsdk.ugeno.yu;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly implements cf {
    private boolean bly;
    private com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.core.vt.ouw f7007le;

    /* renamed from: lh, reason: collision with root package name */
    private ouw f7008lh;
    public com.bytedance.adsdk.ugeno.core.fkw ouw;
    private boolean pno;
    private boolean ra;
    public mwh vt;
    private Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> ouw;
        public Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> vt;

        public ouw(Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map, Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map2) {
            this.ouw = map;
            this.vt = map2;
        }
    }

    private bly(com.bytedance.adsdk.ugeno.vt.lh lhVar, ouw ouwVar) {
        this.fkw = lhVar;
        this.f7008lh = ouwVar;
        if (ouwVar != null) {
            this.yu = ouwVar.ouw;
        }
        if (lhVar != null && lhVar.eay && this.f7007le == null) {
            this.f7007le = new com.bytedance.adsdk.ugeno.core.vt.ouw();
        }
    }

    public final void lh() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> value;
        ouw ouwVar = this.f7008lh;
        if (ouwVar == null) {
            return;
        }
        for (Map.Entry<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> entry : ouwVar.ouw.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : value) {
                    if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.yu) {
                        lhVar.ouw = this;
                        lhVar.ouw(new Object[0]);
                    }
                }
            }
        }
    }

    public final void ouw() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("shake");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public final void vt() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("twist");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public final void yu() {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("animateState");
        if (listOuw == null || listOuw.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
            if (lhVar != null) {
                lhVar.ouw = this;
                lhVar.ouw(new Object[0]);
            }
        }
    }

    public final boolean ouw(MotionEvent motionEvent) {
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw = ouw("touchStart");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar : listOuw) {
                if (lhVar instanceof com.bytedance.adsdk.ugeno.yu.yu.ryl) {
                    lhVar.ouw = this;
                    lhVar.ouw(motionEvent);
                }
            }
        }
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw2 = ouw("touchEnd");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw3 = ouw("tap");
        List<com.bytedance.adsdk.ugeno.yu.yu.lh> listOuw4 = ouw("slide");
        if (listOuw != null && !listOuw.isEmpty()) {
            for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar2 : listOuw2) {
                if (lhVar2 instanceof com.bytedance.adsdk.ugeno.yu.yu.cf) {
                    lhVar2.ouw = this;
                    this.bly = lhVar2.ouw(motionEvent);
                }
            }
        }
        if ((listOuw3 != null && !listOuw3.isEmpty()) || (listOuw4 != null && !listOuw4.isEmpty())) {
            if (this.bly && motionEvent.getAction() == 1) {
                return true;
            }
            com.bytedance.adsdk.ugeno.core.vt.ouw ouwVar = this.f7007le;
            if (ouwVar != null) {
                if (ouwVar.ouw(motionEvent)) {
                    Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                    return false;
                }
                this.f7007le.ouw(this.fkw, motionEvent);
            }
            if (listOuw3 != null && !listOuw3.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar3 : listOuw3) {
                    if (lhVar3 instanceof com.bytedance.adsdk.ugeno.yu.yu.bly) {
                        ((com.bytedance.adsdk.ugeno.yu.yu.bly) lhVar3).f7013cf = this.vt;
                        lhVar3.ouw = this;
                        this.ra = lhVar3.ouw(motionEvent);
                    }
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && this.ra) {
                return true;
            }
            if (listOuw4 != null && !listOuw4.isEmpty()) {
                for (com.bytedance.adsdk.ugeno.yu.yu.lh lhVar4 : listOuw4) {
                    if (lhVar4 instanceof com.bytedance.adsdk.ugeno.yu.yu.fkw) {
                        lhVar4.ouw = this;
                        this.pno = lhVar4.ouw(motionEvent);
                    }
                }
            }
            if ((action == 1 || action == 3) && !this.ra && !this.pno && this.f7007le != null) {
                Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
                this.f7007le.ouw(this.fkw);
            }
            return this.ra || this.pno;
        }
        return this.bly;
    }

    public final com.bytedance.adsdk.ugeno.yu.yu.lh vt(String str) {
        Map<String, com.bytedance.adsdk.ugeno.yu.yu.lh> map;
        if (this.f7008lh == null || TextUtils.isEmpty(str) || (map = this.f7008lh.vt) == null) {
            return null;
        }
        return map.get(str);
    }

    public final List<com.bytedance.adsdk.ugeno.yu.yu.lh> ouw(String str) {
        Map<String, List<com.bytedance.adsdk.ugeno.yu.yu.lh>> map = this.yu;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.yu.get(str);
    }

    public final void ouw(String str, Object... objArr) {
        com.bytedance.adsdk.ugeno.yu.yu.lh lhVarVt = vt(str);
        if (lhVarVt != null) {
            lhVarVt.ouw = this;
            lhVarVt.ouw(objArr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yu.cf
    public final void ouw(String str, List<le.ouw> list) {
        com.bytedance.adsdk.ugeno.yu.vt.ouw ouwVarOuw;
        com.bytedance.adsdk.ugeno.core.fkw fkwVar = this.ouw;
        if (fkwVar != null) {
            fkwVar.ouw(str);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<le.ouw> it = list.iterator();
        while (it.hasNext()) {
            le.ouw next = it.next();
            if (next != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = this.fkw;
                vt vtVarOuw = yu.ouw(next.yu);
                if (vtVarOuw == null || (ouwVarOuw = vtVarOuw.ouw(lhVar, str, next)) == null) {
                    ouwVarOuw = new com.bytedance.adsdk.ugeno.yu.vt.lh(lhVar, str, next);
                }
                ouwVarOuw.ouw();
                ouwVarOuw.vt();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[Catch: JSONException -> 0x005c, TryCatch #0 {JSONException -> 0x005c, blocks: (B:5:0x0008, B:8:0x0014, B:9:0x0024, B:11:0x002a, B:13:0x0030, B:35:0x008b, B:37:0x0095, B:39:0x00a1, B:42:0x00c4, B:40:0x00b1, B:41:0x00b5, B:16:0x0040, B:19:0x0045, B:21:0x004f, B:24:0x005f, B:26:0x0065, B:29:0x006e, B:33:0x007e, B:30:0x0075, B:43:0x00cd, B:44:0x00d1), top: B:48:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.adsdk.ugeno.yu.bly ouw(com.bytedance.adsdk.ugeno.vt.lh r8, java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L5c
            r0.<init>(r9)     // Catch: org.json.JSONException -> L5c
            int r9 = r0.length()     // Catch: org.json.JSONException -> L5c
            if (r9 > 0) goto L14
            return r1
        L14:
            java.util.HashMap r9 = new java.util.HashMap     // Catch: org.json.JSONException -> L5c
            r9.<init>()     // Catch: org.json.JSONException -> L5c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: org.json.JSONException -> L5c
            r2.<init>()     // Catch: org.json.JSONException -> L5c
            com.bytedance.adsdk.ugeno.yu.bly$ouw r3 = new com.bytedance.adsdk.ugeno.yu.bly$ouw     // Catch: org.json.JSONException -> L5c
            r3.<init>(r9, r2)     // Catch: org.json.JSONException -> L5c
            r9 = 0
        L24:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L5c
            if (r9 >= r2) goto Ld1
            org.json.JSONObject r2 = r0.optJSONObject(r9)     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto Lcd
            T extends android.view.View r4 = r8.fkw     // Catch: org.json.JSONException -> L5c
            android.content.Context r4 = r4.getContext()     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r5 = r8.yu     // Catch: org.json.JSONException -> L5c
            com.bytedance.adsdk.ugeno.yu.le r2 = com.bytedance.adsdk.ugeno.yu.le.ouw(r2, r5)     // Catch: org.json.JSONException -> L5c
            if (r2 != 0) goto L40
        L3e:
            r5 = r1
            goto L89
        L40:
            com.bytedance.adsdk.ugeno.yu.le$ouw r5 = r2.ouw     // Catch: org.json.JSONException -> L5c
            if (r5 != 0) goto L45
            goto L3e
        L45:
            java.lang.String r6 = r5.f7010lh     // Catch: org.json.JSONException -> L5c
            java.lang.String r7 = "custom"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: org.json.JSONException -> L5c
            if (r7 == 0) goto L5f
            com.bytedance.adsdk.ugeno.yu.yu.yu r5 = new com.bytedance.adsdk.ugeno.yu.yu.yu     // Catch: org.json.JSONException -> L5c
            r5.<init>(r4)     // Catch: org.json.JSONException -> L5c
            r5.vt = r8     // Catch: org.json.JSONException -> L5c
            r5.f7019lh = r2     // Catch: org.json.JSONException -> L5c
            r5.lh()     // Catch: org.json.JSONException -> L5c
            goto L89
        L5c:
            r8 = move-exception
            goto Ld7
        L5f:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L5c
            if (r7 != 0) goto L75
            java.lang.String r7 = "global"
            boolean r6 = android.text.TextUtils.equals(r6, r7)     // Catch: org.json.JSONException -> L5c
            if (r6 == 0) goto L6e
            goto L75
        L6e:
            java.lang.String r5 = r5.vt     // Catch: org.json.JSONException -> L5c
            com.bytedance.adsdk.ugeno.yu.ra r5 = com.bytedance.adsdk.ugeno.yu.tlj.ouw(r5)     // Catch: org.json.JSONException -> L5c
            goto L7b
        L75:
            java.lang.String r5 = r5.yu     // Catch: org.json.JSONException -> L5c
            com.bytedance.adsdk.ugeno.yu.ra r5 = com.bytedance.adsdk.ugeno.yu.tlj.ouw(r5)     // Catch: org.json.JSONException -> L5c
        L7b:
            if (r5 != 0) goto L7e
            goto L3e
        L7e:
            com.bytedance.adsdk.ugeno.yu.yu.lh r5 = r5.ouw(r4)     // Catch: org.json.JSONException -> L5c
            r5.vt = r8     // Catch: org.json.JSONException -> L5c
            r5.f7019lh = r2     // Catch: org.json.JSONException -> L5c
            r5.lh()     // Catch: org.json.JSONException -> L5c
        L89:
            if (r5 == 0) goto Lcd
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.yu.yu.lh>> r2 = r3.ouw     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = r5.f7018le     // Catch: org.json.JSONException -> L5c
            boolean r2 = r2.containsKey(r4)     // Catch: org.json.JSONException -> L5c
            if (r2 == 0) goto Lb5
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.yu.yu.lh>> r2 = r3.ouw     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = r5.f7018le     // Catch: org.json.JSONException -> L5c
            java.lang.Object r2 = r2.get(r4)     // Catch: org.json.JSONException -> L5c
            java.util.List r2 = (java.util.List) r2     // Catch: org.json.JSONException -> L5c
            if (r2 != 0) goto Lb1
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L5c
            r2.<init>()     // Catch: org.json.JSONException -> L5c
            r2.add(r5)     // Catch: org.json.JSONException -> L5c
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.yu.yu.lh>> r4 = r3.ouw     // Catch: org.json.JSONException -> L5c
            java.lang.String r6 = r5.f7018le     // Catch: org.json.JSONException -> L5c
            r4.put(r6, r2)     // Catch: org.json.JSONException -> L5c
            goto Lc4
        Lb1:
            r2.add(r5)     // Catch: org.json.JSONException -> L5c
            goto Lc4
        Lb5:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L5c
            r2.<init>()     // Catch: org.json.JSONException -> L5c
            r2.add(r5)     // Catch: org.json.JSONException -> L5c
            java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.ugeno.yu.yu.lh>> r4 = r3.ouw     // Catch: org.json.JSONException -> L5c
            java.lang.String r6 = r5.f7018le     // Catch: org.json.JSONException -> L5c
            r4.put(r6, r2)     // Catch: org.json.JSONException -> L5c
        Lc4:
            java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.yu.yu.lh> r2 = r3.vt     // Catch: org.json.JSONException -> L5c
            java.lang.String r4 = r5.yu()     // Catch: org.json.JSONException -> L5c
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L5c
        Lcd:
            int r9 = r9 + 1
            goto L24
        Ld1:
            com.bytedance.adsdk.ugeno.yu.bly r9 = new com.bytedance.adsdk.ugeno.yu.bly     // Catch: org.json.JSONException -> L5c
            r9.<init>(r8, r3)     // Catch: org.json.JSONException -> L5c
            return r9
        Ld7:
            r8.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.yu.bly.ouw(com.bytedance.adsdk.ugeno.vt.lh, java.lang.String):com.bytedance.adsdk.ugeno.yu.bly");
    }
}
