package v;

import C.C0632t;
import C.C0634v;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.core.impl.C1681c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import w.C5687a;
import w.C5704r;
import w.C5708v;

/* compiled from: Camera2CameraFactory.java */
/* renamed from: v.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5659n implements androidx.camera.core.impl.H {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46783a;

    /* renamed from: b, reason: collision with root package name */
    public final A.a f46784b;

    /* renamed from: c, reason: collision with root package name */
    public final C1681c f46785c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.N f46786d;

    /* renamed from: e, reason: collision with root package name */
    public final C5704r f46787e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f46788f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f46789g;

    /* renamed from: h, reason: collision with root package name */
    public final long f46790h;
    public final HashMap i = new HashMap();

    public C5659n(Context context, C1681c c1681c, C0632t c0632t, long j4) throws C.P, C5687a {
        String strA;
        this.f46783a = context;
        this.f46785c = c1681c;
        C5704r c5704rA = C5704r.a(context, c1681c.f15007b);
        this.f46787e = c5704rA;
        this.f46789g = c0.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            C5708v c5708v = c5704rA.f47151a;
            c5708v.getClass();
            try {
                List<String> listAsList = Arrays.asList(c5708v.f47157a.getCameraIdList());
                if (c0632t == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strA = Q.a(c5704rA, c0632t.b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strA = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strA)) {
                            arrayList2.add(e(str));
                        }
                    }
                    Iterator it2 = c0632t.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((androidx.camera.core.impl.I) ((C.r) it2.next())).d());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (str2.equals(CommonUrlParts.Values.FALSE_INTEGER) || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (P.a(str2, this.f46787e)) {
                        arrayList3.add(str2);
                    } else {
                        C.S.a("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                    }
                }
                this.f46788f = arrayList3;
                A.a aVar = new A.a(this.f46787e);
                this.f46784b = aVar;
                androidx.camera.core.impl.N n9 = new androidx.camera.core.impl.N(aVar);
                this.f46786d = n9;
                aVar.f0a.add(n9);
                this.f46790h = j4;
            } catch (CameraAccessException e4) {
                throw new C5687a(e4);
            }
        } catch (C0634v e10) {
            throw new C.P(e10);
        } catch (C5687a e11) {
            throw new C.P(new C0634v(e11));
        }
    }

    @Override // androidx.camera.core.impl.H
    public final LinkedHashSet a() {
        return new LinkedHashSet(this.f46788f);
    }

    @Override // androidx.camera.core.impl.H
    public final C5704r b() {
        return this.f46787e;
    }

    @Override // androidx.camera.core.impl.H
    public final C5664t c(String str) throws C0634v {
        if (!this.f46788f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        C5666v c5666vE = e(str);
        C1681c c1681c = this.f46785c;
        Executor executor = c1681c.f15006a;
        return new C5664t(this.f46783a, this.f46787e, str, c5666vE, this.f46784b, this.f46786d, executor, c1681c.f15007b, this.f46789g, this.f46790h);
    }

    @Override // androidx.camera.core.impl.H
    public final A.a d() {
        return this.f46784b;
    }

    public final C5666v e(String str) throws C0634v {
        HashMap map = this.i;
        try {
            C5666v c5666v = (C5666v) map.get(str);
            if (c5666v != null) {
                return c5666v;
            }
            C5666v c5666v2 = new C5666v(str, this.f46787e);
            map.put(str, c5666v2);
            return c5666v2;
        } catch (C5687a e4) {
            throw new C0634v(e4);
        }
    }
}
