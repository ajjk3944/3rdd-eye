package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: CaptureStage.java */
/* loaded from: classes.dex */
public interface T {

    /* compiled from: CaptureStage.java */
    public static final class a implements T {

        /* renamed from: a, reason: collision with root package name */
        public final S f14964a;

        public a() {
            HashSet hashSet = new HashSet();
            C1710q0 c1710q0K = C1710q0.K();
            ArrayList arrayList = new ArrayList();
            C1713s0 c1713s0A = C1713s0.a();
            ArrayList arrayList2 = new ArrayList(hashSet);
            C1717u0 c1717u0J = C1717u0.J(c1710q0K);
            ArrayList arrayList3 = new ArrayList(arrayList);
            P0 p02 = P0.f14934b;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = c1713s0A.f14935a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            this.f14964a = new S(arrayList2, c1717u0J, -1, false, arrayList3, false, new P0(arrayMap), null);
        }

        @Override // androidx.camera.core.impl.T
        public final S a() {
            return this.f14964a;
        }
    }

    S a();
}
