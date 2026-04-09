package L4;

import C0.t;
import android.database.Cursor;
import com.lefan.signal.db.MacDataBaseRoom_Impl;
import com.lefan.signal.db.MacVendorBean;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final MacDataBaseRoom_Impl f2613a;

    public g(MacDataBaseRoom_Impl macDataBaseRoom_Impl) {
        this.f2613a = macDataBaseRoom_Impl;
        new b(macDataBaseRoom_Impl, 2);
    }

    public final MacVendorBean a(String str) {
        t tVarA = t.a(1, "SELECT * FROM macvendor WHERE mac = ? Limit 1");
        tVarA.c(1, str);
        MacDataBaseRoom_Impl macDataBaseRoom_Impl = this.f2613a;
        macDataBaseRoom_Impl.b();
        Cursor cursorL = macDataBaseRoom_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "id");
            int iP2 = I5.b.p(cursorL, "brand");
            int iP3 = I5.b.p(cursorL, "mac");
            MacVendorBean macVendorBean = null;
            String string = null;
            if (cursorL.moveToFirst()) {
                MacVendorBean macVendorBean2 = new MacVendorBean();
                macVendorBean2.setId(cursorL.getInt(iP));
                macVendorBean2.setBrand(cursorL.isNull(iP2) ? null : cursorL.getString(iP2));
                if (!cursorL.isNull(iP3)) {
                    string = cursorL.getString(iP3);
                }
                macVendorBean2.setMac(string);
                macVendorBean = macVendorBean2;
            }
            return macVendorBean;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }
}
