package k0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0292n;
import g3.C2333b;
import java.util.ArrayList;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598b implements Parcelable {
    public static final Parcelable.Creator<C2598b> CREATOR = new C2333b(1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f21605a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21606b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f21607c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f21608d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21609e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21610f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21612h;
    public final CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21613j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f21614k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f21615l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f21616m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21617n;

    public C2598b(C2597a c2597a) {
        int size = c2597a.f21586a.size();
        this.f21605a = new int[size * 6];
        if (!c2597a.f21592g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f21606b = new ArrayList(size);
        this.f21607c = new int[size];
        this.f21608d = new int[size];
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Q q3 = (Q) c2597a.f21586a.get(i3);
            int i6 = i + 1;
            this.f21605a[i] = q3.f21561a;
            ArrayList arrayList = this.f21606b;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = q3.f21562b;
            arrayList.add(abstractComponentCallbacksC2617v != null ? abstractComponentCallbacksC2617v.f21710e : null);
            int[] iArr = this.f21605a;
            iArr[i6] = q3.f21563c ? 1 : 0;
            iArr[i + 2] = q3.f21564d;
            iArr[i + 3] = q3.f21565e;
            int i7 = i + 5;
            iArr[i + 4] = q3.f21566f;
            i += 6;
            iArr[i7] = q3.f21567g;
            this.f21607c[i3] = q3.f21568h.ordinal();
            this.f21608d[i3] = q3.i.ordinal();
        }
        this.f21609e = c2597a.f21591f;
        this.f21610f = c2597a.i;
        this.f21611g = c2597a.f21603s;
        this.f21612h = c2597a.f21594j;
        this.i = c2597a.f21595k;
        this.f21613j = c2597a.f21596l;
        this.f21614k = c2597a.f21597m;
        this.f21615l = c2597a.f21598n;
        this.f21616m = c2597a.f21599o;
        this.f21617n = c2597a.f21600p;
    }

    public final void a(C2597a c2597a) {
        int i = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f21605a;
            boolean z6 = true;
            if (i >= iArr.length) {
                c2597a.f21591f = this.f21609e;
                c2597a.i = this.f21610f;
                c2597a.f21592g = true;
                c2597a.f21594j = this.f21612h;
                c2597a.f21595k = this.i;
                c2597a.f21596l = this.f21613j;
                c2597a.f21597m = this.f21614k;
                c2597a.f21598n = this.f21615l;
                c2597a.f21599o = this.f21616m;
                c2597a.f21600p = this.f21617n;
                return;
            }
            Q q3 = new Q();
            int i6 = i + 1;
            q3.f21561a = iArr[i];
            if (K.H(2)) {
                Log.v("FragmentManager", "Instantiate " + c2597a + " op #" + i3 + " base fragment #" + iArr[i6]);
            }
            q3.f21568h = EnumC0292n.values()[this.f21607c[i3]];
            q3.i = EnumC0292n.values()[this.f21608d[i3]];
            int i7 = i + 2;
            if (iArr[i6] == 0) {
                z6 = false;
            }
            q3.f21563c = z6;
            int i8 = iArr[i7];
            q3.f21564d = i8;
            int i9 = iArr[i + 3];
            q3.f21565e = i9;
            int i10 = i + 5;
            int i11 = iArr[i + 4];
            q3.f21566f = i11;
            i += 6;
            int i12 = iArr[i10];
            q3.f21567g = i12;
            c2597a.f21587b = i8;
            c2597a.f21588c = i9;
            c2597a.f21589d = i11;
            c2597a.f21590e = i12;
            c2597a.b(q3);
            i3++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f21605a);
        parcel.writeStringList(this.f21606b);
        parcel.writeIntArray(this.f21607c);
        parcel.writeIntArray(this.f21608d);
        parcel.writeInt(this.f21609e);
        parcel.writeString(this.f21610f);
        parcel.writeInt(this.f21611g);
        parcel.writeInt(this.f21612h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.f21613j);
        TextUtils.writeToParcel(this.f21614k, parcel, 0);
        parcel.writeStringList(this.f21615l);
        parcel.writeStringList(this.f21616m);
        parcel.writeInt(this.f21617n ? 1 : 0);
    }

    public C2598b(Parcel parcel) {
        this.f21605a = parcel.createIntArray();
        this.f21606b = parcel.createStringArrayList();
        this.f21607c = parcel.createIntArray();
        this.f21608d = parcel.createIntArray();
        this.f21609e = parcel.readInt();
        this.f21610f = parcel.readString();
        this.f21611g = parcel.readInt();
        this.f21612h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.f21613j = parcel.readInt();
        this.f21614k = (CharSequence) creator.createFromParcel(parcel);
        this.f21615l = parcel.createStringArrayList();
        this.f21616m = parcel.createStringArrayList();
        this.f21617n = parcel.readInt() != 0;
    }
}
