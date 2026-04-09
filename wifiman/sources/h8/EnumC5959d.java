package h8;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5959d {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5959d[] $VALUES;
    public static final EnumC5959d CREATE = new EnumC5959d("CREATE", 0);
    public static final EnumC5959d VIEW_CREATED = new EnumC5959d("VIEW_CREATED", 1);
    public static final EnumC5959d START = new EnumC5959d("START", 2);
    public static final EnumC5959d RESUME = new EnumC5959d("RESUME", 3);
    public static final EnumC5959d USER_VISIBLE = new EnumC5959d("USER_VISIBLE", 4);
    public static final EnumC5959d USER_INVISIBLE = new EnumC5959d("USER_INVISIBLE", 5);
    public static final EnumC5959d PAUSE = new EnumC5959d("PAUSE", 6);
    public static final EnumC5959d STOP = new EnumC5959d("STOP", 7);
    public static final EnumC5959d VIEW_DESTROYED = new EnumC5959d("VIEW_DESTROYED", 8);
    public static final EnumC5959d DESTROY = new EnumC5959d("DESTROY", 9);

    private static final /* synthetic */ EnumC5959d[] $values() {
        return new EnumC5959d[]{CREATE, VIEW_CREATED, START, RESUME, USER_VISIBLE, USER_INVISIBLE, PAUSE, STOP, VIEW_DESTROYED, DESTROY};
    }

    static {
        EnumC5959d[] enumC5959dArr$values = $values();
        $VALUES = enumC5959dArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5959dArr$values);
    }

    private EnumC5959d(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5959d valueOf(String str) {
        return (EnumC5959d) Enum.valueOf(EnumC5959d.class, str);
    }

    public static EnumC5959d[] values() {
        return (EnumC5959d[]) $VALUES.clone();
    }
}
