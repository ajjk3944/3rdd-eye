package aj;

import android.text.TextUtils;
import d.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f406a;

    /* renamed from: b, reason: collision with root package name */
    public long f407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f409d;

    /* renamed from: e, reason: collision with root package name */
    public final String f410e;

    /* renamed from: f, reason: collision with root package name */
    public String f411f;
    public b g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f412h;

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f413i = new CopyOnWriteArrayList();

    public b(boolean z3, String str, b bVar) {
        this.f408c = 1;
        this.f409d = z3;
        this.f410e = str;
        this.g = bVar;
        if (z3) {
            this.f412h = new HashMap();
        }
        if (bVar != null) {
            HashMap map = bVar.f412h;
            if (map != null) {
                map.put(str, this);
                this.f408c = bVar.f408c + 1;
            } else {
                throw new IllegalStateException("parent's children must not be null! " + bVar.c());
            }
        }
    }

    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f413i;
        if (copyOnWriteArrayList.contains(aVar)) {
            return;
        }
        copyOnWriteArrayList.add(aVar);
    }

    public final void b(long j, boolean z3) {
        long j8 = this.f406a;
        if (j == j8) {
            return;
        }
        long j9 = j - j8;
        this.f406a = j;
        b bVar = this.g;
        if (bVar != null) {
            bVar.b(bVar.f406a + j9, false);
            if (z3) {
                bVar.f412h.remove(this.f410e);
            }
        }
        if (z3) {
            HashMap map = this.f412h;
            if (map != null) {
                map.clear();
            }
            this.g = null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f413i;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(j9, z3, this);
        }
        if (z3) {
            copyOnWriteArrayList.clear();
        }
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f411f)) {
            ArrayList arrayList = new ArrayList();
            b bVar = this;
            while (bVar != null && TextUtils.isEmpty(bVar.f411f)) {
                arrayList.add(bVar.f410e);
                bVar = bVar.g;
            }
            StringBuilder sb2 = new StringBuilder();
            if (bVar != null && !TextUtils.isEmpty(bVar.f411f)) {
                sb2.append(bVar.f411f);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                sb2.append(File.separator);
                sb2.append((String) arrayList.get(size));
            }
            this.f411f = sb2.toString();
        }
        return this.f411f;
    }

    public final long d() {
        if (this.f409d) {
            Iterator it = this.f412h.entrySet().iterator();
            long jD = 0;
            while (it.hasNext()) {
                jD += ((b) ((Map.Entry) it.next()).getValue()).d();
            }
            this.f406a = jD + 4096;
        }
        return this.f406a;
    }

    public final void e(a aVar) {
        this.f413i.remove(aVar);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AnalyzeFileNode{size=");
        sb2.append(this.f406a);
        sb2.append(", modifiedTime=");
        sb2.append(this.f407b);
        sb2.append(", level=");
        sb2.append(this.f408c);
        sb2.append(", isDirectory=");
        sb2.append(this.f409d);
        sb2.append(", nodeName='");
        sb2.append(this.f410e);
        sb2.append("', path='");
        sb2.append(this.f411f);
        sb2.append("', childCount='");
        HashMap map = this.f412h;
        if (map == null) {
            str = "null";
        } else {
            str = "" + map.size();
        }
        return h.w(sb2, str, "'}");
    }
}
