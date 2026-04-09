package v;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import w.C5698l;
import x.C5753a;

/* compiled from: DynamicRangeResolver.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C5698l f46689a;

    /* renamed from: b, reason: collision with root package name */
    public final x.b f46690b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46691c;

    /* compiled from: DynamicRangeResolver.java */
    public static final class a {
        public static C.C a(C5698l c5698l) {
            Long l5 = (Long) c5698l.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l5 != null) {
                return (C.C) C5753a.f47597a.get(l5);
            }
            return null;
        }
    }

    public d0(C5698l c5698l) {
        this.f46689a = c5698l;
        this.f46690b = x.b.a(c5698l);
        int[] iArr = (int[]) c5698l.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z10 = true;
                    break;
                }
                i++;
            }
        }
        this.f46691c = z10;
    }

    public static boolean a(C.C c10, C.C c11) {
        A2.l.q("Fully specified range is not actually fully specified.", c11.b());
        int i = c10.f621a;
        int i10 = c11.f621a;
        if (i == 2 && i10 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i10) {
            return false;
        }
        int i11 = c10.f622b;
        return i11 == 0 || i11 == c11.f622b;
    }

    public static boolean b(C.C c10, C.C c11, HashSet hashSet) {
        if (hashSet.contains(c11)) {
            return a(c10, c11);
        }
        C.S.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c10 + "\nCandidate dynamic range:\n  " + c11);
        return false;
    }

    public static C.C c(C.C c10, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (c10.f621a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C.C c11 = (C.C) it.next();
            A2.l.p(c11, "Fully specified DynamicRange cannot be null.");
            A2.l.q("Fully specified DynamicRange must have fully defined encoding.", c11.b());
            if (c11.f621a != 1 && b(c10, c11, hashSet)) {
                return c11;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, C.C c10, x.b bVar) {
        A2.l.q("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set<C.C> setC = bVar.f47599a.c(c10);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c10 + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
