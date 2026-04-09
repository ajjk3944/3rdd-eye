package r8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import u.j0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f21325c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f21326d;

    /* renamed from: e, reason: collision with root package name */
    public float f21327e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f21328f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f21329g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f21330h;

    /* renamed from: i, reason: collision with root package name */
    public u.o f21331i;
    public ArrayList j;
    public Rect k;

    /* renamed from: l, reason: collision with root package name */
    public float f21332l;

    /* renamed from: m, reason: collision with root package name */
    public float f21333m;

    /* renamed from: n, reason: collision with root package name */
    public float f21334n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21335o;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f21323a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21324b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f21336p = 0;

    public final void a(String str) {
        e9.c.b(str);
        this.f21324b.add(str);
    }

    public final float b() {
        return (long) (((this.f21333m - this.f21332l) / this.f21334n) * 1000.0f);
    }

    public final Map c() {
        float fC = e9.j.c();
        if (fC != this.f21327e) {
            for (Map.Entry entry : this.f21326d.entrySet()) {
                HashMap map = this.f21326d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f10 = this.f21327e / fC;
                int i10 = (int) (xVar.f21395a * f10);
                int i11 = (int) (xVar.f21396b * f10);
                x xVar2 = new x(i10, i11, xVar.f21397c, xVar.f21398d, xVar.f21399e);
                Bitmap bitmap = xVar.f21400f;
                if (bitmap != null) {
                    xVar2.f21400f = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                }
                map.put(str, xVar2);
            }
        }
        this.f21327e = fC;
        return this.f21326d;
    }

    public final x8.i d(String str) {
        int size = this.f21329g.size();
        for (int i10 = 0; i10 < size; i10++) {
            x8.i iVar = (x8.i) this.f21329g.get(i10);
            String str2 = iVar.f25096a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return iVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb2.append(((a9.h) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
