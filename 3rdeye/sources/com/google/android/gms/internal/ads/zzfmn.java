package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfmn implements zzfml {
    private final zzfml zza;

    public zzfmn(zzfml zzfmlVar) {
        this.zza = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZza = zzfmv.zza(0, 0, 0, 0);
        int iZzb = zzfmy.zzb();
        int i = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i == 0);
            return jSONObjectZza;
        } catch (JSONException e4) {
            zzfmw.zza("Error with setting output device status", e4);
            return jSONObjectZza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zzb(View view, JSONObject jSONObject, zzfmk zzfmkVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzflz zzflzVarZza = zzflz.zza();
        if (zzflzVarZza != null) {
            Collection collectionZzb = zzflzVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzflh) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            zzfmkVar.zza((View) arrayList.get(i10), this.zza, jSONObject, z11);
        }
    }
}
