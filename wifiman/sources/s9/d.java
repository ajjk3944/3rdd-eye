package s9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.q;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f61429a;

        /* renamed from: b, reason: collision with root package name */
        private final q f61430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2, q factory) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(factory, "factory");
            this.f61429a = id2;
            this.f61430b = factory;
        }

        public final q b() {
            return this.f61430b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(((a) obj).f61429a, this.f61429a);
        }

        public int hashCode() {
            return this.f61429a.hashCode();
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f61433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f61433a = value;
        }

        public final CharSequence b() {
            return this.f61433a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f61433a, ((c) obj).f61433a);
        }

        public int hashCode() {
            return this.f61433a.hashCode();
        }

        public String toString() {
            return "Str(value=" + ((Object) this.f61433a) + ")";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
        CharSequence charSequenceB;
        AbstractC6492s.i(context, "context");
        interfaceC3540l.U(-1392949825);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1392949825, i10, -1, "com.ui.core.ui.common.CommonString.toCharSequence (CommonString.kt:11)");
        }
        if (this instanceof c) {
            charSequenceB = ((c) this).b();
        } else if (this instanceof b) {
            charSequenceB = ((b) this).b(context);
        } else {
            if (!(this instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            charSequenceB = (CharSequence) ((a) this).b().s(context, interfaceC3540l, Integer.valueOf(i10 & 14));
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return charSequenceB;
    }

    private d() {
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final int f61431a;

        /* renamed from: b, reason: collision with root package name */
        private final List f61432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, List params) {
            super(null);
            AbstractC6492s.i(params, "params");
            this.f61431a = i10;
            this.f61432b = params;
        }

        public final String b(Context context) {
            AbstractC6492s.i(context, "context");
            if (this.f61432b.isEmpty()) {
                String string = context.getString(this.f61431a);
                AbstractC6492s.f(string);
                return string;
            }
            int i10 = this.f61431a;
            Object[] array = this.f61432b.toArray(new Object[0]);
            String string2 = context.getString(i10, Arrays.copyOf(array, array.length));
            AbstractC6492s.f(string2);
            return string2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f61431a == bVar.f61431a && AbstractC6492s.d(this.f61432b, bVar.f61432b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f61431a) * 31) + this.f61432b.hashCode();
        }

        public String toString() {
            return "Res(resource=" + this.f61431a + ", params=" + this.f61432b + ")";
        }

        public b(int i10) {
            this(i10, AbstractC3689v.l());
        }
    }
}
