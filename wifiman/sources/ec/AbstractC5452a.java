package ec;

import android.content.Context;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5452a {

    /* renamed from: ec.a$a, reason: collision with other inner class name */
    public static final class C1741a extends AbstractC5452a {

        /* renamed from: a, reason: collision with root package name */
        private final int f46370a;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f46371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1741a(int i10, Object... formatArgs) {
            super(null);
            AbstractC6492s.i(formatArgs, "formatArgs");
            this.f46370a = i10;
            this.f46371b = formatArgs.length == 0 ? null : formatArgs;
        }

        public final Object[] b() {
            return this.f46371b;
        }

        public final int c() {
            return this.f46370a;
        }

        @Override // ec.AbstractC5452a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(Context context) {
            String string;
            AbstractC6492s.i(context, "context");
            if (this.f46371b == null) {
                string = context.getString(this.f46370a);
            } else {
                String string2 = context.getString(this.f46370a);
                AbstractC6492s.h(string2, "getString(...)");
                Object[] objArr = this.f46371b;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                string = String.format(string2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                AbstractC6492s.h(string, "format(...)");
            }
            AbstractC6492s.f(string);
            return string;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1741a) || !super.equals(obj)) {
                return false;
            }
            C1741a c1741a = (C1741a) obj;
            if (this.f46370a != c1741a.f46370a) {
                return false;
            }
            Object[] objArr = this.f46371b;
            if (objArr != null) {
                Object[] objArr2 = c1741a.f46371b;
                if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                    return false;
                }
            } else if (c1741a.f46371b != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = ((super.hashCode() * 31) + this.f46370a) * 31;
            Object[] objArr = this.f46371b;
            return iHashCode + (objArr != null ? Arrays.hashCode(objArr) : 0);
        }
    }

    /* renamed from: ec.a$b */
    public static final class b extends AbstractC5452a {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f46372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f46372a = value;
        }

        @Override // ec.AbstractC5452a
        public CharSequence a(Context context) {
            AbstractC6492s.i(context, "context");
            return this.f46372a;
        }

        public final CharSequence b() {
            return this.f46372a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f46372a, ((b) obj).f46372a);
        }

        public int hashCode() {
            return this.f46372a.hashCode();
        }

        public String toString() {
            return "Str(value=" + ((Object) this.f46372a) + ")";
        }
    }

    public /* synthetic */ AbstractC5452a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CharSequence a(Context context);

    private AbstractC5452a() {
    }
}
