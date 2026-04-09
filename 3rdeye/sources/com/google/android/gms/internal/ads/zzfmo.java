package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfmo implements zzfml {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfml
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfmv.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfmv.zza(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zzb(View view, JSONObject jSONObject, zzfmk zzfmkVar, boolean z10, boolean z11) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    zzfmkVar.zza(viewGroup.getChildAt(i10), this, jSONObject, z11);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i12));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    i = i12 + 1;
                    if (i13 < size2) {
                        zzfmkVar.zza((View) arrayList3.get(i13), this, jSONObject, z11);
                        i13++;
                    }
                }
                i12 = i;
            }
        }
    }
}
