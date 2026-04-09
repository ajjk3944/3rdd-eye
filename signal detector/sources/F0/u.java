package f0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f20020a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20021b;

    public u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f20021b = new ArrayList();
        a4.t.e(cls, "watcherClass cannot be null");
        this.f20020a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20021b;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).f20019b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20021b;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final t c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20021b;
            if (i >= arrayList.size()) {
                return null;
            }
            t tVar = (t) arrayList.get(i);
            if (tVar.f20018a == obj) {
                return tVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f20020a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i3) {
        super.delete(i, i3);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f20021b;
            if (i >= arrayList.size()) {
                return;
            }
            ((t) arrayList.get(i)).f20019b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        t tVarC;
        if (d(obj) && (tVarC = c(obj)) != null) {
            obj = tVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i3, Class cls) {
        if (this.f20020a != cls) {
            return super.getSpans(i, i3, cls);
        }
        t[] tVarArr = (t[]) super.getSpans(i, i3, t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, tVarArr.length);
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            objArr[i6] = tVarArr[i6].f20018a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i3, Class cls) {
        if (cls == null || this.f20020a == cls) {
            cls = t.class;
        }
        return super.nextSpanTransition(i, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        t tVarC;
        if (d(obj)) {
            tVarC = c(obj);
            if (tVarC != null) {
                obj = tVarC;
            }
        } else {
            tVarC = null;
        }
        super.removeSpan(obj);
        if (tVarC != null) {
            this.f20021b.remove(tVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i3, CharSequence charSequence) {
        replace(i, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i3, int i6) {
        if (d(obj)) {
            t tVar = new t(obj);
            this.f20021b.add(tVar);
            obj = tVar;
        }
        super.setSpan(obj, i, i3, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return new u(this.f20020a, this, i, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i3) {
        super.delete(i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i3, CharSequence charSequence, int i6, int i7) {
        replace(i, i3, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i3, int i6) {
        super.insert(i, charSequence, i3, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i3, CharSequence charSequence) {
        a();
        super.replace(i, i3, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i3, int i6) {
        super.insert(i, charSequence, i3, i6);
        return this;
    }

    public u(Class cls, u uVar, int i, int i3) {
        super(uVar, i, i3);
        this.f20021b = new ArrayList();
        a4.t.e(cls, "watcherClass cannot be null");
        this.f20020a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i3, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i, i3, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i3) {
        super.append(charSequence, i, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
