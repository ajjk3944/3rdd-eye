package z2;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import s2.h0;
import s2.o;
import u0.n2;
import w4.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f37841a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f37842b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37843c;

    /* renamed from: d, reason: collision with root package name */
    public final List f37844d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.d f37845e;

    /* renamed from: f, reason: collision with root package name */
    public final d3.c f37846f;
    public final d g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f37847h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.j f37848i;
    public m j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f37849k;

    /* renamed from: l, reason: collision with root package name */
    public final int f37850l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07d1  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r41, s2.h0 r42, java.util.List r43, java.util.List r44, v2.d r45, d3.c r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.<init>(java.lang.String, s2.h0, java.util.List, java.util.List, v2.d, d3.c):void");
    }

    @Override // s2.o
    public final boolean b() {
        m mVar = this.j;
        if (mVar != null ? mVar.d() : false) {
            return true;
        }
        if (!this.f37849k && i.a(this.f37842b)) {
            f fVar = h.f37863a;
            f fVar2 = h.f37863a;
            n2 n2VarA = (n2) fVar2.f37861a;
            if (n2VarA == null) {
                if (w4.i.c()) {
                    n2VarA = fVar2.a();
                    fVar2.f37861a = n2VarA;
                } else {
                    n2VarA = i.f37864a;
                }
            }
            if (((Boolean) n2VarA.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.o
    public final float k() {
        float f10;
        t2.j jVar = this.f37848i;
        float f11 = jVar.f34134e;
        TextPaint textPaint = jVar.f34131b;
        if (!Float.isNaN(f11)) {
            return jVar.f34134e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = jVar.f34130a;
        lineInstance.setText(new t2.g(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new b4.b(12));
        int i4 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new yj.i(Integer.valueOf(i4), Integer.valueOf(next)));
            } else {
                yj.i iVar = (yj.i) priorityQueue.peek();
                if (iVar != null && ((Number) iVar.f37639b).intValue() - ((Number) iVar.f37638a).intValue() < next - i4) {
                    priorityQueue.poll();
                    priorityQueue.add(new yj.i(Integer.valueOf(i4), Integer.valueOf(next)));
                }
            }
            i4 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            yj.i iVar2 = (yj.i) it.next();
            float desiredWidth = Layout.getDesiredWidth(jVar.b(), ((Number) iVar2.f37638a).intValue(), ((Number) iVar2.f37639b).intValue(), textPaint);
            while (it.hasNext()) {
                yj.i iVar3 = (yj.i) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(jVar.b(), ((Number) iVar3.f37638a).intValue(), ((Number) iVar3.f37639b).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        jVar.f34134e = f10;
        return f10;
    }

    @Override // s2.o
    public final float m() {
        return this.f37848i.c();
    }
}
