package androidx.camera.core.impl;

import N7.C1154e9;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: UseCaseAttachState.java */
/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14956a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14957b = new LinkedHashMap();

    /* compiled from: UseCaseAttachState.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final H0 f14958a;

        /* renamed from: b, reason: collision with root package name */
        public final T0<?> f14959b;

        /* renamed from: c, reason: collision with root package name */
        public final L0 f14960c;

        /* renamed from: d, reason: collision with root package name */
        public final List<U0.b> f14961d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14962e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f14963f = false;

        public a(H0 h02, T0<?> t02, L0 l02, List<U0.b> list) {
            this.f14958a = h02;
            this.f14959b = t02;
            this.f14960c = l02;
            this.f14961d = list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb.append(this.f14958a);
            sb.append(", mUseCaseConfig=");
            sb.append(this.f14959b);
            sb.append(", mStreamSpec=");
            sb.append(this.f14960c);
            sb.append(", mCaptureTypes=");
            sb.append(this.f14961d);
            sb.append(", mAttached=");
            sb.append(this.f14962e);
            sb.append(", mActive=");
            return C1154e9.k(sb, this.f14963f, '}');
        }
    }

    public S0(String str) {
        this.f14956a = str;
    }

    public final H0.h a() {
        H0.h hVar = new H0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14957b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f14962e) {
                hVar.a(aVar.f14958a);
                arrayList.add((String) entry.getKey());
            }
        }
        C.S.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f14956a);
        return hVar;
    }

    public final Collection<H0> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14957b.entrySet()) {
            if (((a) entry.getValue()).f14962e) {
                arrayList.add(((a) entry.getValue()).f14958a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection<T0<?>> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f14957b.entrySet()) {
            if (((a) entry.getValue()).f14962e) {
                arrayList.add(((a) entry.getValue()).f14959b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean d(String str) {
        LinkedHashMap linkedHashMap = this.f14957b;
        if (linkedHashMap.containsKey(str)) {
            return ((a) linkedHashMap.get(str)).f14962e;
        }
        return false;
    }

    public final void e(String str, H0 h02, T0<?> t02, L0 l02, List<U0.b> list) {
        LinkedHashMap linkedHashMap = this.f14957b;
        if (linkedHashMap.containsKey(str)) {
            a aVar = new a(h02, t02, l02, list);
            a aVar2 = (a) linkedHashMap.get(str);
            aVar.f14962e = aVar2.f14962e;
            aVar.f14963f = aVar2.f14963f;
            linkedHashMap.put(str, aVar);
        }
    }
}
