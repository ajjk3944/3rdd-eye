package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o33 implements q53 {
    public final /* synthetic */ int a;
    public final pq3 b;
    public final Context c;

    public /* synthetic */ o33(Context context, pq3 pq3Var, int i) {
        this.a = i;
        this.c = context;
        this.b = pq3Var;
    }

    @Override // defpackage.q53
    public final n70 a() {
        switch (this.a) {
            case 0:
                if (!((Boolean) tw1.e.c.a(mz1.Id)).booleanValue()) {
                    return pu1.r(new p33(null, false, 0));
                }
                ContentResolver contentResolver = this.c.getContentResolver();
                if (contentResolver == null) {
                    return pu1.r(new p33(null, false, 0));
                }
                return ((ld2) this.b).c(new xs1(11, contentResolver));
            case 1:
                return ((ld2) this.b).c(new xs1(14, this));
            case 2:
                return ((ld2) this.b).c(new xs1(15, this));
            case 3:
                return ((ld2) this.b).c(new xs1(17, this));
            case 4:
                return ((ld2) this.b).c(new xs1(18, this));
            case 5:
                return ((ld2) this.b).c(new xs1(27, this));
            case 6:
                if (!((Boolean) m02.b.w()).booleanValue()) {
                    return pu1.r(new t53(-1, -1));
                }
                return ((ld2) this.b).c(new xs1(28, this));
            default:
                return ((ld2) this.b).c(new w53(0, this));
        }
    }

    public Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.Nb)).booleanValue();
        Context context = this.c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ o33(pq3 pq3Var, Context context, int i) {
        this.a = i;
        this.b = pq3Var;
        this.c = context;
    }
}
