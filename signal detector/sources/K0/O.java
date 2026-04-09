package k0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0292n;
import g3.C2333b;

/* loaded from: classes.dex */
public final class O implements Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new C2333b(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f21543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21544b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21546d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21547e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21548f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21549g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21550h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f21551j;

    /* renamed from: k, reason: collision with root package name */
    public final int f21552k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21553l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21554m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21555n;

    public O(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        this.f21543a = abstractComponentCallbacksC2617v.getClass().getName();
        this.f21544b = abstractComponentCallbacksC2617v.f21710e;
        this.f21545c = abstractComponentCallbacksC2617v.f21723n;
        this.f21546d = abstractComponentCallbacksC2617v.f21688K;
        this.f21547e = abstractComponentCallbacksC2617v.f21689L;
        this.f21548f = abstractComponentCallbacksC2617v.M;
        this.f21549g = abstractComponentCallbacksC2617v.f21692P;
        this.f21550h = abstractComponentCallbacksC2617v.f21721l;
        this.i = abstractComponentCallbacksC2617v.f21691O;
        this.f21551j = abstractComponentCallbacksC2617v.f21690N;
        this.f21552k = abstractComponentCallbacksC2617v.f21704a0.ordinal();
        this.f21553l = abstractComponentCallbacksC2617v.f21716h;
        this.f21554m = abstractComponentCallbacksC2617v.i;
        this.f21555n = abstractComponentCallbacksC2617v.f21698V;
    }

    public final AbstractComponentCallbacksC2617v a(E e6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vA = e6.a(this.f21543a);
        abstractComponentCallbacksC2617vA.f21710e = this.f21544b;
        abstractComponentCallbacksC2617vA.f21723n = this.f21545c;
        abstractComponentCallbacksC2617vA.f21681D = true;
        abstractComponentCallbacksC2617vA.f21688K = this.f21546d;
        abstractComponentCallbacksC2617vA.f21689L = this.f21547e;
        abstractComponentCallbacksC2617vA.M = this.f21548f;
        abstractComponentCallbacksC2617vA.f21692P = this.f21549g;
        abstractComponentCallbacksC2617vA.f21721l = this.f21550h;
        abstractComponentCallbacksC2617vA.f21691O = this.i;
        abstractComponentCallbacksC2617vA.f21690N = this.f21551j;
        abstractComponentCallbacksC2617vA.f21704a0 = EnumC0292n.values()[this.f21552k];
        abstractComponentCallbacksC2617vA.f21716h = this.f21553l;
        abstractComponentCallbacksC2617vA.i = this.f21554m;
        abstractComponentCallbacksC2617vA.f21698V = this.f21555n;
        return abstractComponentCallbacksC2617vA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f21543a);
        sb.append(" (");
        sb.append(this.f21544b);
        sb.append(")}:");
        if (this.f21545c) {
            sb.append(" fromLayout");
        }
        int i = this.f21547e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f21548f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f21549g) {
            sb.append(" retainInstance");
        }
        if (this.f21550h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f21551j) {
            sb.append(" hidden");
        }
        String str2 = this.f21553l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f21554m);
        }
        if (this.f21555n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21543a);
        parcel.writeString(this.f21544b);
        parcel.writeInt(this.f21545c ? 1 : 0);
        parcel.writeInt(this.f21546d);
        parcel.writeInt(this.f21547e);
        parcel.writeString(this.f21548f);
        parcel.writeInt(this.f21549g ? 1 : 0);
        parcel.writeInt(this.f21550h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f21551j ? 1 : 0);
        parcel.writeInt(this.f21552k);
        parcel.writeString(this.f21553l);
        parcel.writeInt(this.f21554m);
        parcel.writeInt(this.f21555n ? 1 : 0);
    }

    public O(Parcel parcel) {
        this.f21543a = parcel.readString();
        this.f21544b = parcel.readString();
        this.f21545c = parcel.readInt() != 0;
        this.f21546d = parcel.readInt();
        this.f21547e = parcel.readInt();
        this.f21548f = parcel.readString();
        this.f21549g = parcel.readInt() != 0;
        this.f21550h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f21551j = parcel.readInt() != 0;
        this.f21552k = parcel.readInt();
        this.f21553l = parcel.readString();
        this.f21554m = parcel.readInt();
        this.f21555n = parcel.readInt() != 0;
    }
}
