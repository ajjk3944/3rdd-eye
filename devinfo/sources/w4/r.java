package w4;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f36457a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36458b;

    public r(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f36458b = new ArrayList();
        pk.a.e(cls, "watcherClass cannot be null");
        this.f36457a = cls;
    }

    public final void a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f36458b;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i4)).f36456b.incrementAndGet();
            i4++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f36458b;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i4)).onTextChanged(this, 0, length(), length());
            i4++;
        }
    }

    public final q c(Object obj) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f36458b;
            if (i4 >= arrayList.size()) {
                return null;
            }
            q qVar = (q) arrayList.get(i4);
            if (qVar.f36455a == obj) {
                return qVar;
            }
            i4++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f36457a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i4, int i10) {
        super.delete(i4, i10);
        return this;
    }

    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f36458b;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((q) arrayList.get(i4)).f36456b.decrementAndGet();
            i4++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        q qVarC;
        if (d(obj) && (qVarC = c(obj)) != null) {
            obj = qVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i4, int i10, Class cls) {
        if (this.f36457a != cls) {
            return super.getSpans(i4, i10, cls);
        }
        q[] qVarArr = (q[]) super.getSpans(i4, i10, q.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, qVarArr.length);
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            objArr[i11] = qVarArr[i11].f36455a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i4, int i10, Class cls) {
        if (cls == null || this.f36457a == cls) {
            cls = q.class;
        }
        return super.nextSpanTransition(i4, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        q qVarC;
        if (d(obj)) {
            qVarC = c(obj);
            if (qVarC != null) {
                obj = qVarC;
            }
        } else {
            qVarC = null;
        }
        super.removeSpan(obj);
        if (qVarC != null) {
            this.f36458b.remove(qVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i10, CharSequence charSequence) {
        replace(i4, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i4, int i10, int i11) {
        if (d(obj)) {
            q qVar = new q(obj);
            this.f36458b.add(qVar);
            obj = qVar;
        }
        super.setSpan(obj, i4, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i10) {
        return new r(this.f36457a, this, i4, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i4, int i10) {
        super.delete(i4, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i4, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i4, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i4, CharSequence charSequence, int i10, int i11) {
        super.insert(i4, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i10, CharSequence charSequence) {
        a();
        super.replace(i4, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i4, CharSequence charSequence, int i10, int i11) {
        super.insert(i4, charSequence, i10, i11);
        return this;
    }

    public r(Class cls, r rVar, int i4, int i10) {
        super(rVar, i4, i10);
        this.f36458b = new ArrayList();
        pk.a.e(cls, "watcherClass cannot be null");
        this.f36457a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i4, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i4, int i10) {
        super.append(charSequence, i4, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i4, int i10) {
        super.append(charSequence, i4, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i4, int i10) {
        super.append(charSequence, i4, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
