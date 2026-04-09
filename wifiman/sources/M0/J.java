package M0;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class J {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new C(charSequence, 0, charSequence.length()));
        PriorityQueue<Yg.s> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: M0.I
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return J.d((Yg.s) obj, (Yg.s) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Yg.s(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Yg.s sVar = (Yg.s) priorityQueue.peek();
                if (sVar != null && ((Number) sVar.j()).intValue() - ((Number) sVar.h()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Yg.s(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (Yg.s sVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) sVar2.a()).intValue(), ((Number) sVar2.c()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Yg.s sVar, Yg.s sVar2) {
        return (((Number) sVar.j()).intValue() - ((Number) sVar.h()).intValue()) - (((Number) sVar2.j()).intValue() - ((Number) sVar2.h()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!N.a(spanned, O0.f.class) && !N.a(spanned, O0.e.class)) {
                }
                return true;
            }
            if (textPaint.getLetterSpacing() != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
