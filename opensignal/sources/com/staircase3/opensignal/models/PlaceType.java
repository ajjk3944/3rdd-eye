package com.staircase3.opensignal.models;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import kotlin.Metadata;
import sm.h;
import sq.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\bj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/staircase3/opensignal/models/PlaceType;", "Landroid/os/Parcelable;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Llq/b0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getIntValue", "Companion", "sm/h", "INDOOR", "OUTDOOR", "UNKNOWN", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PlaceType[] $VALUES;
    public static final Parcelable.Creator<PlaceType> CREATOR;
    public static final h Companion;
    public static final PlaceType INDOOR = new PlaceType("INDOOR", 0, 0);
    public static final PlaceType OUTDOOR = new PlaceType("OUTDOOR", 1, 1);
    public static final PlaceType UNKNOWN = new PlaceType("UNKNOWN", 2, -1);
    private final int intValue;

    private static final /* synthetic */ PlaceType[] $values() {
        return new PlaceType[]{INDOOR, OUTDOOR, UNKNOWN};
    }

    static {
        PlaceType[] placeTypeArr$values = $values();
        $VALUES = placeTypeArr$values;
        $ENTRIES = a.a.j(placeTypeArr$values);
        Companion = new h();
        CREATOR = new i6.a(22);
    }

    private PlaceType(String str, int i10, int i11) {
        this.intValue = i11;
    }

    public static final PlaceType fromInt(int i10) {
        Companion.getClass();
        return h.a(i10);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PlaceType valueOf(String str) {
        return (PlaceType) Enum.valueOf(PlaceType.class, str);
    }

    public static PlaceType[] values() {
        return (PlaceType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        l.e(dest, "dest");
        dest.writeString(name());
    }
}
