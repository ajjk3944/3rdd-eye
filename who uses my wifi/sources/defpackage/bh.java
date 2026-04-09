package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bh {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public bh(i5 i5Var) {
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        p2 p2Var = (p2) this.e.get(str);
        if ((p2Var != null ? p2Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                p2Var.a.f(p2Var.b.n(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new l2(intent, i2));
        return true;
    }

    public final vq2 b(String str, yb ybVar, m2 m2Var) {
        Object parcelable;
        i30.m(str, "key");
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            o2 o2Var = new o2();
            Iterator it = new vh(new fo(1, new m(2, o2Var), o2Var)).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer numValueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(numValueOf)) {
                    int iIntValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new p2(m2Var, ybVar));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            m2Var.f(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i >= 34) {
            parcelable = ic.a(bundle, str, l2.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!l2.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        l2 l2Var = (l2) parcelable;
        if (l2Var != null) {
            bundle.remove(str);
            m2Var.f(ybVar.n(l2Var.g, l2Var.f));
        }
        return new vq2(this, str, ybVar);
    }
}
