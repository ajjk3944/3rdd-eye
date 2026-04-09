package q0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0292n;
import g3.C2333b;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2795h implements Parcelable {
    public static final Parcelable.Creator<C2795h> CREATOR = new C2333b(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f22974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22975b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f22976c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f22977d;

    public C2795h(C2794g c2794g) {
        q5.i.e(c2794g, "entry");
        this.f22974a = c2794g.f22969f;
        this.f22975b = c2794g.f22965b.f23043h;
        this.f22976c = c2794g.a();
        Bundle bundle = new Bundle();
        this.f22977d = bundle;
        c2794g.i.f(bundle);
    }

    public final C2794g a(Context context, v vVar, EnumC0292n enumC0292n, o oVar) {
        q5.i.e(enumC0292n, "hostLifecycleState");
        Bundle bundle = this.f22976c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f22974a;
        q5.i.e(str, "id");
        return new C2794g(context, vVar, bundle2, enumC0292n, oVar, str, this.f22977d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q5.i.e(parcel, "parcel");
        parcel.writeString(this.f22974a);
        parcel.writeInt(this.f22975b);
        parcel.writeBundle(this.f22976c);
        parcel.writeBundle(this.f22977d);
    }

    public C2795h(Parcel parcel) {
        String string = parcel.readString();
        q5.i.b(string);
        this.f22974a = string;
        this.f22975b = parcel.readInt();
        this.f22976c = parcel.readBundle(C2795h.class.getClassLoader());
        Bundle bundle = parcel.readBundle(C2795h.class.getClassLoader());
        q5.i.b(bundle);
        this.f22977d = bundle;
    }
}
