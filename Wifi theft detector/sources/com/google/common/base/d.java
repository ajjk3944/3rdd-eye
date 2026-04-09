package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f11581a;

    public class a extends d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, String str) {
            super(dVar, null);
            this.f11582b = str;
        }

        @Override // com.google.common.base.d
        public CharSequence f(Object obj) {
            return obj == null ? this.f11582b : d.this.f(obj);
        }

        @Override // com.google.common.base.d
        public d g(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public /* synthetic */ d(d dVar, a aVar) {
        this(dVar);
    }

    public static d e(String str) {
        return new d(str);
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        g.m(appendable);
        if (it.hasNext()) {
            appendable.append(f(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f11581a);
                appendable.append(f(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterator it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String c(Iterable iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator it) {
        return b(new StringBuilder(), it).toString();
    }

    public CharSequence f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public d g(String str) {
        g.m(str);
        return new a(this, str);
    }

    public d(String str) {
        this.f11581a = (String) g.m(str);
    }

    public d(d dVar) {
        this.f11581a = dVar.f11581a;
    }
}
