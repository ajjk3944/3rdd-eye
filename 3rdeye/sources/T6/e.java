package T6;

import N7.Z;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c9.C2097r;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.l;

/* compiled from: ReusableTokenList.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, LinkedList<a>> f12317a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12318b = new LinkedHashMap();

    public final View a(Z div) {
        a aVar;
        l.f(div, "div");
        int iC = div.c();
        LinkedHashMap linkedHashMap = this.f12318b;
        Integer numValueOf = Integer.valueOf(iC);
        Object obj = linkedHashMap.get(numValueOf);
        if (obj == null) {
            obj = 0;
            linkedHashMap.put(numValueOf, obj);
        }
        int iIntValue = ((Number) obj).intValue();
        LinkedList<a> linkedList = this.f12317a.get(Integer.valueOf(iC));
        if (linkedList == null || (aVar = (a) C2097r.r0(iIntValue, linkedList)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(iC), Integer.valueOf(iIntValue + 1));
        View view = aVar.f12297e;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        return view;
    }

    public final a b(Z div) {
        l.f(div, "div");
        int iC = div.c();
        HashMap<Integer, LinkedList<a>> map = this.f12317a;
        LinkedList<a> linkedList = map.get(Integer.valueOf(iC));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        a aVarPop = linkedList.pop();
        LinkedList<a> linkedList2 = map.get(Integer.valueOf(iC));
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            return aVarPop;
        }
        map.remove(Integer.valueOf(iC));
        return aVarPop;
    }
}
