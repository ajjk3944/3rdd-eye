package o2;

import android.text.Layout;
import android.text.TextPaint;
import h2.j0;
import h2.r;
import h2.v;
import io.sentry.k;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import lq.l;
import n0.g2;

/* loaded from: classes.dex */
public final class d implements r {
    public final e B;
    public final CharSequence D;
    public final i2.d E;
    public k F;
    public final boolean G;
    public final int H;

    /* renamed from: a, reason: collision with root package name */
    public final String f18736a;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f18737d;

    /* renamed from: g, reason: collision with root package name */
    public final List f18738g;

    /* renamed from: r, reason: collision with root package name */
    public final List f18739r;

    /* renamed from: x, reason: collision with root package name */
    public final k2.g f18740x;

    /* renamed from: y, reason: collision with root package name */
    public final t2.c f18741y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x088a A[LOOP:7: B:427:0x0888->B:428:0x088a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x08c7  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o2.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v35, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(java.lang.String r39, h2.j0 r40, java.util.List r41, java.util.List r42, k2.g r43, t2.c r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.<init>(java.lang.String, h2.j0, java.util.List, java.util.List, k2.g, t2.c):void");
    }

    public final float a() {
        float f10;
        i2.d dVar = this.E;
        float f11 = dVar.f11162e;
        TextPaint textPaint = dVar.f11159b;
        if (!Float.isNaN(f11)) {
            return dVar.f11162e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = dVar.f11158a;
        lineInstance.setText(new i2.a(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new androidx.media3.exoplayer.trackselection.d(15));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new l(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                l lVar = (l) priorityQueue.peek();
                if (lVar != null && ((Number) lVar.f15572d).intValue() - ((Number) lVar.f15571a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new l(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            l lVar2 = (l) it.next();
            float desiredWidth = Layout.getDesiredWidth(dVar.b(), ((Number) lVar2.f15571a).intValue(), ((Number) lVar2.f15572d).intValue(), textPaint);
            while (it.hasNext()) {
                l lVar3 = (l) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(dVar.b(), ((Number) lVar3.f15571a).intValue(), ((Number) lVar3.f15572d).intValue(), textPaint));
            }
            f10 = desiredWidth;
        }
        dVar.f11162e = f10;
        return f10;
    }

    @Override // h2.r
    public final boolean d() {
        k kVar = this.F;
        if (kVar != null ? kVar.g0() : false) {
            return true;
        }
        if (!this.G) {
            v vVar = this.f18737d.f9842c;
            g gVar = i.f18756a;
            g gVar2 = i.f18756a;
            g2 g2VarC0 = (g2) gVar2.f18754d;
            if (g2VarC0 == null) {
                if (j4.h.c()) {
                    g2VarC0 = gVar2.c0();
                    gVar2.f18754d = g2VarC0;
                } else {
                    g2VarC0 = j.f18757a;
                }
            }
            if (((Boolean) g2VarC0.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // h2.r
    public final float g() {
        return this.E.c();
    }
}
