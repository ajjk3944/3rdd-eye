package f2;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC4013k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5513l implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f46750a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46751b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f46752c;

    /* renamed from: d, reason: collision with root package name */
    private final Bundle f46753d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f46749e = new b(null);
    public static final Parcelable.Creator<C5513l> CREATOR = new a();

    /* renamed from: f2.l$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5513l createFromParcel(Parcel inParcel) {
            AbstractC6492s.i(inParcel, "inParcel");
            return new C5513l(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5513l[] newArray(int i10) {
            return new C5513l[i10];
        }
    }

    /* renamed from: f2.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C5513l(C5512k entry) {
        AbstractC6492s.i(entry, "entry");
        this.f46750a = entry.i();
        this.f46751b = entry.f().s();
        this.f46752c = entry.d();
        Bundle bundle = new Bundle();
        this.f46753d = bundle;
        entry.m(bundle);
    }

    public final int a() {
        return this.f46751b;
    }

    public final String b() {
        return this.f46750a;
    }

    public final C5512k c(Context context, r destination, AbstractC4013k.b hostLifecycleState, o oVar) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(destination, "destination");
        AbstractC6492s.i(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f46752c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C5512k.f46731o.a(context, destination, bundle, hostLifecycleState, oVar, this.f46750a, this.f46753d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC6492s.i(parcel, "parcel");
        parcel.writeString(this.f46750a);
        parcel.writeInt(this.f46751b);
        parcel.writeBundle(this.f46752c);
        parcel.writeBundle(this.f46753d);
    }

    public C5513l(Parcel inParcel) {
        AbstractC6492s.i(inParcel, "inParcel");
        String string = inParcel.readString();
        AbstractC6492s.f(string);
        this.f46750a = string;
        this.f46751b = inParcel.readInt();
        this.f46752c = inParcel.readBundle(C5513l.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(C5513l.class.getClassLoader());
        AbstractC6492s.f(bundle);
        this.f46753d = bundle;
    }
}
