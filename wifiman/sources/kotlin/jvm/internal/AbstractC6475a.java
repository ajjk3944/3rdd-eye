package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6475a implements InterfaceC6488n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f51704a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f51705b;

    /* renamed from: c, reason: collision with root package name */
    private final String f51706c;

    /* renamed from: d, reason: collision with root package name */
    private final String f51707d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f51708e;

    /* renamed from: f, reason: collision with root package name */
    private final int f51709f;

    /* renamed from: g, reason: collision with root package name */
    private final int f51710g;

    public AbstractC6475a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f51704a = obj;
        this.f51705b = cls;
        this.f51706c = str;
        this.f51707d = str2;
        this.f51708e = (i11 & 1) == 1;
        this.f51709f = i10;
        this.f51710g = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6475a)) {
            return false;
        }
        AbstractC6475a abstractC6475a = (AbstractC6475a) obj;
        return this.f51708e == abstractC6475a.f51708e && this.f51709f == abstractC6475a.f51709f && this.f51710g == abstractC6475a.f51710g && AbstractC6492s.d(this.f51704a, abstractC6475a.f51704a) && AbstractC6492s.d(this.f51705b, abstractC6475a.f51705b) && this.f51706c.equals(abstractC6475a.f51706c) && this.f51707d.equals(abstractC6475a.f51707d);
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return this.f51709f;
    }

    public int hashCode() {
        Object obj = this.f51704a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f51705b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f51706c.hashCode()) * 31) + this.f51707d.hashCode()) * 31) + (this.f51708e ? 1231 : 1237)) * 31) + this.f51709f) * 31) + this.f51710g;
    }

    public String toString() {
        return O.j(this);
    }
}
