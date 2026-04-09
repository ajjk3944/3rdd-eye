package T;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: T.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3564x0 extends m1 implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f21276d = new b(null);
    public static final Parcelable.Creator<C3564x0> CREATOR = new a();

    /* renamed from: T.x0$a */
    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3564x0 createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3564x0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            n1 n1VarJ;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                n1VarJ = o1.j();
            } else if (i10 == 1) {
                n1VarJ = o1.p();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
                }
                n1VarJ = o1.m();
            }
            return new C3564x0(value, n1VarJ);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C3564x0[] newArray(int i10) {
            return new C3564x0[i10];
        }
    }

    /* renamed from: T.x0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C3564x0(Object obj, n1 n1Var) {
        super(obj, n1Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        n1 n1VarD = d();
        if (AbstractC6492s.d(n1VarD, o1.j())) {
            i11 = 0;
        } else if (AbstractC6492s.d(n1VarD, o1.p())) {
            i11 = 1;
        } else {
            if (!AbstractC6492s.d(n1VarD, o1.m())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
