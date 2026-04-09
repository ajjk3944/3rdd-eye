package defpackage;

import com.phuongpn.whousemywifi.networkscanner.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ro {
    public static final ro h;
    public static final ro i;
    public static final ro j;
    public static final ro k;
    public static final ro l;
    public static final ro m;
    public static final ro n;
    public static final ro o;
    public static final ro p;
    public static final ro q;
    public static final /* synthetic */ ro[] r;
    public static final /* synthetic */ zs s;
    public final int f;
    public final int g;

    static {
        ro roVar = new ro(0, R.drawable.ic_baseline_router_24, R.string.txt_router, "ROUTER");
        h = roVar;
        ro roVar2 = new ro(1, R.drawable.ic_access_point_24, R.string.txt_access_point, "ACCESS_POINT");
        i = roVar2;
        ro roVar3 = new ro(2, R.drawable.ic_baseline_host, R.string.txt_generic, "GENERIC");
        j = roVar3;
        ro roVar4 = new ro(3, R.drawable.ic_baseline_phone_android_24, R.string.txt_android, "ANDROID_PHONE");
        k = roVar4;
        ro roVar5 = new ro(4, R.drawable.ic_baseline_apple_24, R.string.txt_apple, "APPLE_PHONE");
        l = roVar5;
        ro roVar6 = new ro(5, R.drawable.ic_baseline_laptop_windows_24, R.string.txt_windows, "WINDOWS");
        m = roVar6;
        ro roVar7 = new ro(6, R.drawable.ic_device_ip_camera, R.string.txt_camera, "CAMERA");
        n = roVar7;
        ro roVar8 = new ro(7, R.drawable.ic_outline_print_24, R.string.txt_printer, "PRINTER");
        o = roVar8;
        ro roVar9 = new ro(8, R.drawable.ic_device_refrigerator, R.string.txt_refrigerator, "REFRIGERATOR");
        ro roVar10 = new ro(9, R.drawable.ic_device_robot_vacuum_cleaner, R.string.txt_robot_vacuum_cleaner, "ROBOT_VACUUM_CLEANER");
        p = roVar10;
        ro roVar11 = new ro(10, R.drawable.ic_device_dishwasher_24, R.string.txt_dishwasher, "DISHWASHER");
        q = roVar11;
        ro[] roVarArr = {roVar, roVar2, roVar3, roVar4, roVar5, roVar6, roVar7, roVar8, roVar9, roVar10, roVar11, new ro(11, R.drawable.ic_outline_device_unknown_24, R.string.txt_info_unknown, "UNKNOWN")};
        r = roVarArr;
        s = new zs(roVarArr);
    }

    public ro(int i2, int i3, int i4, String str) {
        this.f = i3;
        this.g = i4;
    }

    public static ro valueOf(String str) {
        return (ro) Enum.valueOf(ro.class, str);
    }

    public static ro[] values() {
        return (ro[]) r.clone();
    }
}
