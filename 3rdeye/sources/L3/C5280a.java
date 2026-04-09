package l3;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import k3.c;
import kotlin.jvm.internal.l;

/* compiled from: Section.kt */
/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5280a implements Parcelable {
    public static final C0490a CREATOR = new C0490a();

    /* renamed from: b, reason: collision with root package name */
    public c f43748b;

    /* renamed from: c, reason: collision with root package name */
    public float f43749c;

    /* renamed from: d, reason: collision with root package name */
    public float f43750d;

    /* renamed from: e, reason: collision with root package name */
    public final float f43751e;

    /* renamed from: f, reason: collision with root package name */
    public final float f43752f;

    /* renamed from: g, reason: collision with root package name */
    public final int f43753g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC5281b f43754h;

    /* compiled from: Section.kt */
    /* renamed from: l3.a$a, reason: collision with other inner class name */
    public static final class C0490a implements Parcelable.Creator<C5280a> {
        @Override // android.os.Parcelable.Creator
        public final C5280a createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            float f10 = parcel.readFloat();
            float f11 = parcel.readFloat();
            int i = parcel.readInt();
            float f12 = parcel.readFloat();
            Serializable serializable = parcel.readSerializable();
            if (serializable == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.github.anastr.speedviewlib.components.Style");
            }
            C5280a c5280a = new C5280a(f10, f11, i, f12, (EnumC5281b) serializable);
            c5280a.f43750d = parcel.readFloat();
            c cVar = c5280a.f43748b;
            if (cVar == null) {
                return c5280a;
            }
            cVar.l();
            return c5280a;
        }

        @Override // android.os.Parcelable.Creator
        public final C5280a[] newArray(int i) {
            return new C5280a[i];
        }
    }

    public C5280a(float f10, float f11, int i, float f12, EnumC5281b style) {
        l.f(style, "style");
        this.f43749c = f12;
        this.f43751e = f10;
        this.f43752f = f11;
        this.f43753g = i;
        this.f43754h = style;
    }

    public final void a(c cVar) {
        if (this.f43748b != null) {
            throw new IllegalArgumentException("This instance of Section is already attached to a Gauge.");
        }
        this.f43748b = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        l.f(parcel, "parcel");
        parcel.writeFloat(this.f43751e);
        parcel.writeFloat(this.f43752f);
        parcel.writeInt(this.f43753g);
        parcel.writeFloat(this.f43749c);
        parcel.writeSerializable(Integer.valueOf(this.f43754h.ordinal()));
        parcel.writeFloat(this.f43750d);
    }

    public /* synthetic */ C5280a(float f10, float f11, float f12, int i) {
        this(f10, f11, i, f12, EnumC5281b.BUTT);
    }
}
