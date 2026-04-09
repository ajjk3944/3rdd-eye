package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes.dex */
final class Y3 implements Comparator {
    Y3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        V3 v32 = (V3) obj;
        V3 v33 = (V3) obj2;
        InterfaceC4320c4 interfaceC4320c4 = (InterfaceC4320c4) v32.iterator();
        InterfaceC4320c4 interfaceC4320c42 = (InterfaceC4320c4) v33.iterator();
        while (interfaceC4320c4.hasNext() && interfaceC4320c42.hasNext()) {
            int iCompare = Integer.compare(V3.m(interfaceC4320c4.zza()), V3.m(interfaceC4320c42.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(v32.S(), v33.S());
    }
}
