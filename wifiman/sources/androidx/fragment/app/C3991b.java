package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC4013k;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3991b implements Parcelable {
    public static final Parcelable.Creator<C3991b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f31360a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f31361b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f31362c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f31363d;

    /* renamed from: e, reason: collision with root package name */
    final int f31364e;

    /* renamed from: f, reason: collision with root package name */
    final String f31365f;

    /* renamed from: g, reason: collision with root package name */
    final int f31366g;

    /* renamed from: h, reason: collision with root package name */
    final int f31367h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f31368i;

    /* renamed from: j, reason: collision with root package name */
    final int f31369j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f31370k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f31371l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList f31372m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f31373n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3991b createFromParcel(Parcel parcel) {
            return new C3991b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3991b[] newArray(int i10) {
            return new C3991b[i10];
        }
    }

    C3991b(C3990a c3990a) {
        int size = c3990a.f31193c.size();
        this.f31360a = new int[size * 6];
        if (!c3990a.f31199i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f31361b = new ArrayList(size);
        this.f31362c = new int[size];
        this.f31363d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            E.a aVar = (E.a) c3990a.f31193c.get(i11);
            int i12 = i10 + 1;
            this.f31360a[i10] = aVar.f31210a;
            ArrayList arrayList = this.f31361b;
            Fragment fragment = aVar.f31211b;
            arrayList.add(fragment != null ? fragment.f31241f : null);
            int[] iArr = this.f31360a;
            iArr[i12] = aVar.f31212c ? 1 : 0;
            iArr[i10 + 2] = aVar.f31213d;
            iArr[i10 + 3] = aVar.f31214e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f31215f;
            i10 += 6;
            iArr[i13] = aVar.f31216g;
            this.f31362c[i11] = aVar.f31217h.ordinal();
            this.f31363d[i11] = aVar.f31218i.ordinal();
        }
        this.f31364e = c3990a.f31198h;
        this.f31365f = c3990a.f31201k;
        this.f31366g = c3990a.f31358v;
        this.f31367h = c3990a.f31202l;
        this.f31368i = c3990a.f31203m;
        this.f31369j = c3990a.f31204n;
        this.f31370k = c3990a.f31205o;
        this.f31371l = c3990a.f31206p;
        this.f31372m = c3990a.f31207q;
        this.f31373n = c3990a.f31208r;
    }

    private void a(C3990a c3990a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f31360a.length) {
                c3990a.f31198h = this.f31364e;
                c3990a.f31201k = this.f31365f;
                c3990a.f31199i = true;
                c3990a.f31202l = this.f31367h;
                c3990a.f31203m = this.f31368i;
                c3990a.f31204n = this.f31369j;
                c3990a.f31205o = this.f31370k;
                c3990a.f31206p = this.f31371l;
                c3990a.f31207q = this.f31372m;
                c3990a.f31208r = this.f31373n;
                return;
            }
            E.a aVar = new E.a();
            int i12 = i10 + 1;
            aVar.f31210a = this.f31360a[i10];
            if (w.E0(2)) {
                Log.v("FragmentManager", "Instantiate " + c3990a + " op #" + i11 + " base fragment #" + this.f31360a[i12]);
            }
            aVar.f31217h = AbstractC4013k.b.values()[this.f31362c[i11]];
            aVar.f31218i = AbstractC4013k.b.values()[this.f31363d[i11]];
            int[] iArr = this.f31360a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f31212c = z10;
            int i14 = iArr[i13];
            aVar.f31213d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f31214e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f31215f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f31216g = i18;
            c3990a.f31194d = i14;
            c3990a.f31195e = i15;
            c3990a.f31196f = i17;
            c3990a.f31197g = i18;
            c3990a.f(aVar);
            i11++;
        }
    }

    public C3990a b(w wVar) {
        C3990a c3990a = new C3990a(wVar);
        a(c3990a);
        c3990a.f31358v = this.f31366g;
        for (int i10 = 0; i10 < this.f31361b.size(); i10++) {
            String str = (String) this.f31361b.get(i10);
            if (str != null) {
                ((E.a) c3990a.f31193c.get(i10)).f31211b = wVar.c0(str);
            }
        }
        c3990a.q(1);
        return c3990a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f31360a);
        parcel.writeStringList(this.f31361b);
        parcel.writeIntArray(this.f31362c);
        parcel.writeIntArray(this.f31363d);
        parcel.writeInt(this.f31364e);
        parcel.writeString(this.f31365f);
        parcel.writeInt(this.f31366g);
        parcel.writeInt(this.f31367h);
        TextUtils.writeToParcel(this.f31368i, parcel, 0);
        parcel.writeInt(this.f31369j);
        TextUtils.writeToParcel(this.f31370k, parcel, 0);
        parcel.writeStringList(this.f31371l);
        parcel.writeStringList(this.f31372m);
        parcel.writeInt(this.f31373n ? 1 : 0);
    }

    C3991b(Parcel parcel) {
        this.f31360a = parcel.createIntArray();
        this.f31361b = parcel.createStringArrayList();
        this.f31362c = parcel.createIntArray();
        this.f31363d = parcel.createIntArray();
        this.f31364e = parcel.readInt();
        this.f31365f = parcel.readString();
        this.f31366g = parcel.readInt();
        this.f31367h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f31368i = (CharSequence) creator.createFromParcel(parcel);
        this.f31369j = parcel.readInt();
        this.f31370k = (CharSequence) creator.createFromParcel(parcel);
        this.f31371l = parcel.createStringArrayList();
        this.f31372m = parcel.createStringArrayList();
        this.f31373n = parcel.readInt() != 0;
    }
}
