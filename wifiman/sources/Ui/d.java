package ui;

import Zg.AbstractC3671c;
import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f63074c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Object[] f63075a;

    /* renamed from: b, reason: collision with root package name */
    private int f63076b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC3671c {

        /* renamed from: c, reason: collision with root package name */
        private int f63077c = -1;

        b() {
        }

        @Override // Zg.AbstractC3671c
        protected void d() {
            do {
                int i10 = this.f63077c + 1;
                this.f63077c = i10;
                if (i10 >= d.this.f63075a.length) {
                    break;
                }
            } while (d.this.f63075a[this.f63077c] == null);
            if (this.f63077c >= d.this.f63075a.length) {
                e();
                return;
            }
            Object obj = d.this.f63075a[this.f63077c];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            f(obj);
        }
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f63075a = objArr;
        this.f63076b = i10;
    }

    private final void g(int i10) {
        Object[] objArr = this.f63075a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f63075a, length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        this.f63075a = objArrCopyOf;
    }

    @Override // ui.c
    public int b() {
        return this.f63076b;
    }

    @Override // ui.c
    public void e(int i10, Object value) {
        AbstractC6492s.i(value, "value");
        g(i10);
        if (this.f63075a[i10] == null) {
            this.f63076b = b() + 1;
        }
        this.f63075a[i10] = value;
    }

    @Override // ui.c
    public Object get(int i10) {
        return AbstractC3682n.i0(this.f63075a, i10);
    }

    @Override // ui.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    public d() {
        this(new Object[20], 0);
    }
}
