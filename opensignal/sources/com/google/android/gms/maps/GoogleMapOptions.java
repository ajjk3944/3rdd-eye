package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import lf.t1;
import tc.c;
import uc.e;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new c(14);
    public static final Integer Q = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean B;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public Boolean M;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f5330a;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f5331d;

    /* renamed from: r, reason: collision with root package name */
    public CameraPosition f5333r;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f5334x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f5335y;

    /* renamed from: g, reason: collision with root package name */
    public int f5332g = -1;
    public Float J = null;
    public Float K = null;
    public LatLngBounds L = null;
    public Integer N = null;
    public String O = null;

    public static GoogleMapOptions d(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, e.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_mapType)) {
            googleMapOptions.f5332g = typedArrayObtainAttributes.getInt(e.MapAttrs_mapType, -1);
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_zOrderOnTop)) {
            googleMapOptions.f5330a = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_useViewLifecycle)) {
            googleMapOptions.f5331d = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiCompass)) {
            googleMapOptions.f5335y = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiRotateGestures)) {
            googleMapOptions.F = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.M = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiScrollGestures)) {
            googleMapOptions.B = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiTiltGestures)) {
            googleMapOptions.E = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiZoomGestures)) {
            googleMapOptions.D = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiZoomControls)) {
            googleMapOptions.f5334x = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_liteMode)) {
            googleMapOptions.G = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_uiMapToolbar)) {
            googleMapOptions.H = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_ambientEnabled)) {
            googleMapOptions.I = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(e.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.J = Float.valueOf(typedArrayObtainAttributes.getFloat(e.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.K = Float.valueOf(typedArrayObtainAttributes.getFloat(e.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_backgroundColor)) {
            googleMapOptions.N = Integer.valueOf(typedArrayObtainAttributes.getColor(e.MapAttrs_backgroundColor, Q.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_mapId) && (string = typedArrayObtainAttributes.getString(e.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.O = string;
        }
        if (typedArrayObtainAttributes.hasValue(e.MapAttrs_mapColorScheme)) {
            googleMapOptions.P = typedArrayObtainAttributes.getInt(e.MapAttrs_mapColorScheme, 0);
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, e.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(e.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(e.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(e.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(e.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(e.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(e.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(e.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(e.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.L = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, e.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(e.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes3.getFloat(e.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(e.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes3.getFloat(e.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        float f10 = typedArrayObtainAttributes3.hasValue(e.MapAttrs_cameraZoom) ? typedArrayObtainAttributes3.getFloat(e.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f11 = typedArrayObtainAttributes3.hasValue(e.MapAttrs_cameraBearing) ? typedArrayObtainAttributes3.getFloat(e.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        float f12 = typedArrayObtainAttributes3.hasValue(e.MapAttrs_cameraTilt) ? typedArrayObtainAttributes3.getFloat(e.MapAttrs_cameraTilt, 0.0f) : 0.0f;
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.f5333r = new CameraPosition(latLng, f10, f12, f11);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        bm.e eVar = new bm.e(9, this);
        eVar.d(Integer.valueOf(this.f5332g), "MapType");
        eVar.d(this.G, "LiteMode");
        eVar.d(this.f5333r, "Camera");
        eVar.d(this.f5335y, "CompassEnabled");
        eVar.d(this.f5334x, "ZoomControlsEnabled");
        eVar.d(this.B, "ScrollGesturesEnabled");
        eVar.d(this.D, "ZoomGesturesEnabled");
        eVar.d(this.E, "TiltGesturesEnabled");
        eVar.d(this.F, "RotateGesturesEnabled");
        eVar.d(this.M, "ScrollGesturesEnabledDuringRotateOrZoom");
        eVar.d(this.H, "MapToolbarEnabled");
        eVar.d(this.I, "AmbientEnabled");
        eVar.d(this.J, "MinZoomPreference");
        eVar.d(this.K, "MaxZoomPreference");
        eVar.d(this.N, "BackgroundColor");
        eVar.d(this.L, "LatLngBoundsForCameraTarget");
        eVar.d(this.f5330a, "ZOrderOnTop");
        eVar.d(this.f5331d, "UseViewLifecycleInFragment");
        eVar.d(Integer.valueOf(this.P), "mapColorScheme");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        byte bK = t1.K(this.f5330a);
        i4.S(parcel, 2, 4);
        parcel.writeInt(bK);
        byte bK2 = t1.K(this.f5331d);
        i4.S(parcel, 3, 4);
        parcel.writeInt(bK2);
        int i11 = this.f5332g;
        i4.S(parcel, 4, 4);
        parcel.writeInt(i11);
        i4.O(parcel, 5, this.f5333r, i10);
        byte bK3 = t1.K(this.f5334x);
        i4.S(parcel, 6, 4);
        parcel.writeInt(bK3);
        byte bK4 = t1.K(this.f5335y);
        i4.S(parcel, 7, 4);
        parcel.writeInt(bK4);
        byte bK5 = t1.K(this.B);
        i4.S(parcel, 8, 4);
        parcel.writeInt(bK5);
        byte bK6 = t1.K(this.D);
        i4.S(parcel, 9, 4);
        parcel.writeInt(bK6);
        byte bK7 = t1.K(this.E);
        i4.S(parcel, 10, 4);
        parcel.writeInt(bK7);
        byte bK8 = t1.K(this.F);
        i4.S(parcel, 11, 4);
        parcel.writeInt(bK8);
        byte bK9 = t1.K(this.G);
        i4.S(parcel, 12, 4);
        parcel.writeInt(bK9);
        byte bK10 = t1.K(this.H);
        i4.S(parcel, 14, 4);
        parcel.writeInt(bK10);
        byte bK11 = t1.K(this.I);
        i4.S(parcel, 15, 4);
        parcel.writeInt(bK11);
        i4.M(parcel, 16, this.J);
        i4.M(parcel, 17, this.K);
        i4.O(parcel, 18, this.L, i10);
        byte bK12 = t1.K(this.M);
        i4.S(parcel, 19, 4);
        parcel.writeInt(bK12);
        Integer num = this.N;
        if (num != null) {
            i4.S(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        i4.P(parcel, 21, this.O);
        int i12 = this.P;
        i4.S(parcel, 23, 4);
        parcel.writeInt(i12);
        i4.W(parcel, iU);
    }
}
