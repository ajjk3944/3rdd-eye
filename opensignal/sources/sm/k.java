package sm;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final i f22135h = new i(1);

    /* renamed from: a, reason: collision with root package name */
    public int f22136a;

    /* renamed from: b, reason: collision with root package name */
    public int f22137b;

    /* renamed from: c, reason: collision with root package name */
    public int f22138c;

    /* renamed from: d, reason: collision with root package name */
    public double f22139d;

    /* renamed from: e, reason: collision with root package name */
    public double f22140e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22141f;

    /* renamed from: g, reason: collision with root package name */
    public float f22142g = -1.0f;

    public k() {
    }

    public static int a(Cursor cursor, l lVar) {
        return cursor.getColumnIndex(lVar.name());
    }

    public k(Cursor cursor) {
        this.f22136a = cursor.getInt(a(cursor, l.KEY_OPENSIGNAL_ID));
        cursor.getInt(a(cursor, l.KEY_NETWORK_ID));
        this.f22137b = cursor.getInt(a(cursor, l.KEY_CID));
        this.f22138c = cursor.getInt(a(cursor, l.KEY_LAC));
        cursor.getInt(a(cursor, l.KEY_PSC));
        this.f22139d = cursor.getDouble(a(cursor, l.KEY_EST_LAT));
        this.f22140e = cursor.getDouble(a(cursor, l.KEY_EST_LNG));
        cursor.getDouble(a(cursor, l.KEY_EST_ACC));
        cursor.getDouble(a(cursor, l.KEY_CONFIDENCE));
        cursor.getInt(a(cursor, l.KEY_IS_2G));
        cursor.getInt(a(cursor, l.KEY_IS_3G));
        cursor.getInt(a(cursor, l.KEY_IS_4G));
    }
}
