package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum Uv {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other");


    /* renamed from: a, reason: collision with root package name */
    public final String f11834a;

    Uv(String str) {
        this.f11834a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11834a;
    }
}
