package v;

import android.os.Build;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u.C5616a;

/* compiled from: StreamUseCaseUtil.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1683d f46780a = U.a.a(Long.TYPE, "camera2.streamSpec.streamUseCase");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f46781b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f46782c;

    static {
        HashMap map = new HashMap();
        f46781b = map;
        HashMap map2 = new HashMap();
        f46782c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            U0.b bVar = U0.b.PREVIEW;
            hashSet.add(bVar);
            U0.b bVar2 = U0.b.METERING_REPEATING;
            hashSet.add(bVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(U0.b.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            U0.b bVar3 = U0.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            U0.b bVar4 = U0.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static C5616a a(androidx.camera.core.impl.U u8, long j4) {
        C1683d c1683d = f46780a;
        if (u8.f(c1683d) && ((Long) u8.b(c1683d)).longValue() == j4) {
            return null;
        }
        C1710q0 c1710q0L = C1710q0.L(u8);
        c1710q0L.N(c1683d, Long.valueOf(j4));
        return new C5616a(c1710q0L);
    }

    public static boolean b(U0.b bVar, long j4, List<U0.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != U0.b.STREAM_SHARING) {
            HashMap map = f46781b;
            return map.containsKey(Long.valueOf(j4)) && ((Set) map.get(Long.valueOf(j4))).contains(bVar);
        }
        HashMap map2 = f46782c;
        if (!map2.containsKey(Long.valueOf(j4))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j4));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<U0.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(androidx.camera.core.impl.U u8, U0.b bVar) {
        if (((Boolean) u8.o(T0.f14966B, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C1683d c1683d = C1692h0.f15042H;
        if (u8.f(c1683d)) {
            return t0.f46920a[bVar.ordinal()] == 1 && ((Integer) u8.b(c1683d)).intValue() == 2;
        }
        return false;
    }
}
