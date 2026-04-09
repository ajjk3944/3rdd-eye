package com.google.ar.core;

/* renamed from: com.google.ar.core.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC5047j {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    STREETSCAPE_GEOMETRY(1095893251, StreetscapeGeometry.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);


    /* renamed from: k, reason: collision with root package name */
    final int f38296k;

    /* renamed from: l, reason: collision with root package name */
    private final Class f38297l;

    EnumC5047j(int i10, Class cls) {
        this.f38296k = i10;
        this.f38297l = cls;
    }

    public static EnumC5047j a(Class cls) {
        for (EnumC5047j enumC5047j : values()) {
            Class cls2 = enumC5047j.f38297l;
            if (cls2 != null && cls2.equals(cls)) {
                return enumC5047j;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
