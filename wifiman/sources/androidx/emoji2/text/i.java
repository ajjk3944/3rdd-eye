package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.j f31017a;

    /* renamed from: b, reason: collision with root package name */
    private final n f31018b;

    /* renamed from: c, reason: collision with root package name */
    private f.e f31019c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31020d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f31021e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public r f31022a;

        /* renamed from: b, reason: collision with root package name */
        private final f.j f31023b;

        b(r rVar, f.j jVar) {
            this.f31022a = rVar;
            this.f31023b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f31022a == null) {
                this.f31022a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f31022a.setSpan(this.f31023b.a(pVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public r a() {
            return this.f31022a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i10, int i11, p pVar);
    }

    private static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f31024a;

        /* renamed from: b, reason: collision with root package name */
        public int f31025b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f31026c = -1;

        d(int i10) {
            this.f31024a = i10;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            int i12 = this.f31024a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f31025b = i10;
            this.f31026c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    private static class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f31027a;

        e(String str) {
            this.f31027a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f31027a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }

    static final class f {

        /* renamed from: a, reason: collision with root package name */
        private int f31028a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final n.a f31029b;

        /* renamed from: c, reason: collision with root package name */
        private n.a f31030c;

        /* renamed from: d, reason: collision with root package name */
        private n.a f31031d;

        /* renamed from: e, reason: collision with root package name */
        private int f31032e;

        /* renamed from: f, reason: collision with root package name */
        private int f31033f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f31034g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f31035h;

        f(n.a aVar, boolean z10, int[] iArr) {
            this.f31029b = aVar;
            this.f31030c = aVar;
            this.f31034g = z10;
            this.f31035h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f31028a = 1;
            this.f31030c = this.f31029b;
            this.f31033f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f31030c.b().j() || d(this.f31032e)) {
                return true;
            }
            if (this.f31034g) {
                if (this.f31035h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f31035h, this.f31030c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a aVarA = this.f31030c.a(i10);
            int iG = 2;
            if (this.f31028a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f31028a = 2;
                    this.f31030c = aVarA;
                    this.f31033f = 1;
                }
            } else if (aVarA != null) {
                this.f31030c = aVarA;
                this.f31033f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f31030c.b() != null) {
                    iG = 3;
                    if (this.f31033f != 1 || h()) {
                        this.f31031d = this.f31030c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f31032e = i10;
            return iG;
        }

        p b() {
            return this.f31030c.b();
        }

        p c() {
            return this.f31031d.b();
        }

        boolean e() {
            return this.f31028a == 2 && this.f31030c.b() != null && (this.f31033f > 1 || h());
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set set) {
        this.f31017a = jVar;
        this.f31018b = nVar;
        this.f31019c = eVar;
        this.f31020d = z10;
        this.f31021e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f31019c.a(charSequence, i10, i11, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean g(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private Object k(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int iCharCount;
        f fVar = new f(this.f31018b.f(), this.f31020d, this.f31021e);
        int i13 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zB) {
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !f(charSequence, iCharCount, i10, fVar.c())) {
                        zB = cVar.b(charSequence, iCharCount, i10, fVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (fVar.e() && i13 < i12 && zB && (z10 || !f(charSequence, iCharCount, i10, fVar.b()))) {
            cVar.b(charSequence, iCharCount, i10, fVar.b());
        }
        return cVar.a();
    }

    int b(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanEnd(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), MPv3.MAX_MESSAGE_ID, true, new d(i10))).f31026c;
    }

    int c(CharSequence charSequence, int i10) {
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanStart(jVarArr[0]);
            }
        }
        return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), MPv3.MAX_MESSAGE_ID, true, new d(i10))).f31025b;
    }

    CharSequence j(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        r rVar;
        j[] jVarArr;
        boolean z11 = charSequence instanceof o;
        if (z11) {
            ((o) charSequence).a();
        }
        if (!z11) {
            try {
                rVar = charSequence instanceof Spannable ? new r((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, j.class) > i11) ? null : new r(charSequence);
            } finally {
                if (z11) {
                    ((o) charSequence).d();
                }
            }
        }
        if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i10, i11, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = rVar.getSpanStart(jVar);
                int spanEnd = rVar.getSpanEnd(jVar);
                if (spanStart != i11) {
                    rVar.removeSpan(jVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i13 = i11;
        if (i10 != i13 && i10 < charSequence.length()) {
            if (i12 != Integer.MAX_VALUE && rVar != null) {
                i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
            }
            r rVar2 = (r) k(charSequence, i10, i13, i12, z10, new b(rVar, this.f31017a));
            if (rVar2 == null) {
                if (z11) {
                    ((o) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = rVar2.b();
            if (z11) {
                ((o) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }
}
