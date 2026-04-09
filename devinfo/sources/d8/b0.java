package d8;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f21991e = new d0(10);

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f21992f = new e0(2);

    /* renamed from: d, reason: collision with root package name */
    public final i0.f f21996d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21993a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f21995c = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final d0 f21994b = f21991e;

    public b0(i0.f fVar) {
        this.f21996d = fVar;
    }

    public final synchronized void a(Class cls, Class cls2, w wVar) {
        a0 a0Var = new a0(cls, cls2, wVar);
        ArrayList arrayList = this.f21993a;
        arrayList.add(arrayList.size(), a0Var);
    }

    public final synchronized v b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f21993a;
            int size = arrayList2.size();
            boolean z3 = false;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                a0 a0Var = (a0) obj;
                if (this.f21995c.contains(a0Var)) {
                    z3 = true;
                } else if (a0Var.f21985a.isAssignableFrom(cls) && a0Var.f21986b.isAssignableFrom(cls2)) {
                    this.f21995c.add(a0Var);
                    arrayList.add(a0Var.f21987c.i(this));
                    this.f21995c.remove(a0Var);
                }
            }
            if (arrayList.size() > 1) {
                d0 d0Var = this.f21994b;
                i0.f fVar = this.f21996d;
                d0Var.getClass();
                return new b(2, arrayList, fVar);
            }
            if (arrayList.size() == 1) {
                return (v) arrayList.get(0);
            }
            if (z3) {
                return f21992f;
            }
            throw new com.bumptech.glide.j("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th2) {
            this.f21995c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = this.f21993a;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                a0 a0Var = (a0) obj;
                if (!this.f21995c.contains(a0Var) && a0Var.f21985a.isAssignableFrom(cls)) {
                    this.f21995c.add(a0Var);
                    arrayList.add(a0Var.f21987c.i(this));
                    this.f21995c.remove(a0Var);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = this.f21993a;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            a0 a0Var = (a0) obj;
            if (!arrayList.contains(a0Var.f21986b) && a0Var.f21985a.isAssignableFrom(cls)) {
                arrayList.add(a0Var.f21986b);
            }
        }
        return arrayList;
    }

    public final synchronized void e(Class cls, w wVar) {
        this.f21993a.add(0, new a0(cls, Drawable.class, wVar));
    }
}
