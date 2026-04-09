package hg;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import d.m;
import i.g;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a extends g {
    public boolean A;

    public static void B(a aVar, int i4) {
        String string = aVar.getString(i4);
        k.d(string, "getString(...)");
        Toast.makeText(aVar, string, 0).show();
    }

    public static void C(a aVar, String str) {
        aVar.getClass();
        k.e(str, "msg");
        Toast.makeText(aVar, str, 0).show();
    }

    public final void A() {
        wd.b bVarR = r();
        if (bVarR != null) {
            bVarR.Q(true);
        }
    }

    @Override // i.g, d.j, r3.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.a(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        k.e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        o().f21584c.a();
        return true;
    }

    @Override // i.g, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A = true;
    }

    @Override // i.g, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A = false;
    }
}
