package b1;

import C0.f;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.c;
import b1.i;
import c1.C2043a;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c.d f17059a;

    /* renamed from: b, reason: collision with root package name */
    public final i f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final b1.c f17061c;

    /* compiled from: EmojiProcessor.java */
    public static class a implements b<m> {

        /* renamed from: a, reason: collision with root package name */
        public m f17062a;

        /* renamed from: b, reason: collision with root package name */
        public final c.d f17063b;

        public a(m mVar, c.d dVar) {
            this.f17062a = mVar;
            this.f17063b = dVar;
        }

        @Override // b1.f.b
        public final m a() {
            return this.f17062a;
        }

        @Override // b1.f.b
        public final boolean b(CharSequence charSequence, int i, int i10, k kVar) {
            if ((kVar.f17088c & 4) > 0) {
                return true;
            }
            if (this.f17062a == null) {
                this.f17062a = new m(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f17063b.getClass();
            this.f17062a.setSpan(new l(kVar), i, i10, 33);
            return true;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public interface b<T> {
        T a();

        boolean b(CharSequence charSequence, int i, int i10, k kVar);
    }

    /* compiled from: EmojiProcessor.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public int f17065a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final i.a f17066b;

        /* renamed from: c, reason: collision with root package name */
        public i.a f17067c;

        /* renamed from: d, reason: collision with root package name */
        public i.a f17068d;

        /* renamed from: e, reason: collision with root package name */
        public int f17069e;

        /* renamed from: f, reason: collision with root package name */
        public int f17070f;

        public d(i.a aVar) {
            this.f17066b = aVar;
            this.f17067c = aVar;
        }

        public final void a() {
            this.f17065a = 1;
            this.f17067c = this.f17066b;
            this.f17070f = 0;
        }

        public final boolean b() {
            C2043a c2043aB = this.f17067c.f17080b.b();
            int iA = c2043aB.a(6);
            return !(iA == 0 || ((ByteBuffer) c2043aB.f4178d).get(iA + c2043aB.f4175a) == 0) || this.f17069e == 65039;
        }
    }

    public f(i iVar, c.d dVar, b1.c cVar, Set set) {
        this.f17059a = dVar;
        this.f17060b = iVar;
        this.f17061c = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new c(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        g[] gVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (gVarArr = (g[]) editable.getSpans(selectionStart, selectionEnd, g.class)) != null && gVarArr.length > 0) {
                for (g gVar : gVarArr) {
                    int spanStart = editable.getSpanStart(gVar);
                    int spanEnd = editable.getSpanEnd(gVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i10, k kVar) {
        if ((kVar.f17088c & 3) == 0) {
            b1.c cVar = this.f17061c;
            C2043a c2043aB = kVar.b();
            int iA = c2043aB.a(8);
            if (iA != 0) {
                ((ByteBuffer) c2043aB.f4178d).getShort(iA + c2043aB.f4175a);
            }
            cVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = b1.c.f17057b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i10) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar.f17058a;
            String string = sb.toString();
            int i11 = C0.f.f805a;
            boolean zA = f.a.a(textPaint, string);
            int i12 = kVar.f17088c & 4;
            kVar.f17088c = zA ? i12 | 2 : i12 | 1;
        }
        return (kVar.f17088c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i, int i10, int i11, boolean z10, b<T> bVar) {
        int i12;
        char c10;
        d dVar = new d(this.f17060b.f17077c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zB = true;
        int i13 = 0;
        int iCharCount = i;
        loop0: while (true) {
            i12 = iCharCount;
            while (iCharCount < i10 && i13 < i11 && zB) {
                SparseArray<i.a> sparseArray = dVar.f17067c.f17079a;
                i.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (dVar.f17065a == 2) {
                    if (aVar != null) {
                        dVar.f17067c = aVar;
                        dVar.f17070f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dVar.a();
                        } else if (iCodePointAt != 65039) {
                            i.a aVar2 = dVar.f17067c;
                            if (aVar2.f17080b != null) {
                                if (dVar.f17070f != 1) {
                                    dVar.f17068d = aVar2;
                                    dVar.a();
                                } else if (dVar.b()) {
                                    dVar.f17068d = dVar.f17067c;
                                    dVar.a();
                                } else {
                                    dVar.a();
                                }
                                c10 = 3;
                            } else {
                                dVar.a();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                } else if (aVar == null) {
                    dVar.a();
                    c10 = 1;
                } else {
                    dVar.f17065a = 2;
                    dVar.f17067c = aVar;
                    dVar.f17070f = 1;
                    c10 = 2;
                }
                dVar.f17069e = iCodePointAt;
                if (c10 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (iCharCount < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c10 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c10 == 3) {
                    if (z10 || !b(charSequence, i12, iCharCount, dVar.f17068d.f17080b)) {
                        zB = bVar.b(charSequence, i12, iCharCount, dVar.f17068d.f17080b);
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (dVar.f17065a == 2 && dVar.f17067c.f17080b != null && ((dVar.f17070f > 1 || dVar.b()) && i13 < i11 && zB && (z10 || !b(charSequence, i12, iCharCount, dVar.f17067c.f17080b)))) {
            bVar.b(charSequence, i12, iCharCount, dVar.f17067c.f17080b);
        }
        return bVar.a();
    }

    /* compiled from: EmojiProcessor.java */
    public static class c implements b<c> {

        /* renamed from: a, reason: collision with root package name */
        public final String f17064a;

        public c(String str) {
            this.f17064a = str;
        }

        @Override // b1.f.b
        public final boolean b(CharSequence charSequence, int i, int i10, k kVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i10), this.f17064a)) {
                return true;
            }
            kVar.f17088c = (kVar.f17088c & 3) | 4;
            return false;
        }

        @Override // b1.f.b
        public final c a() {
            return this;
        }
    }
}
