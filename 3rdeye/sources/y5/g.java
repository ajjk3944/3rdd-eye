package Y5;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: Demographic.kt */
/* loaded from: classes2.dex */
public enum g {
    UNDER_500(0, new v9.g(RecyclerView.UNDEFINED_DURATION, 500, 1)),
    FROM_500_TO_1000(1, new v9.g(501, 1000, 1)),
    FROM_1000_TO_1500(2, new v9.g(1001, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 1)),
    FROM_1500_TO_2000(3, new v9.g(1501, 2000, 1)),
    FROM_2000_TO_2500(4, new v9.g(2001, 2500, 1)),
    FROM_2500_TO_3000(5, new v9.g(2501, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 1)),
    FROM_3000_TO_3500(6, new v9.g(3001, 3500, 1)),
    FROM_3500_TO_4000(7, new v9.g(3501, 4000, 1)),
    FROM_4000_TO_4500(8, new v9.g(4001, 4500, 1)),
    OVER_4500(9, new v9.g(4501, Integer.MAX_VALUE, 1));

    public static final a Companion = new a(null);
    private final int id;
    private final v9.g range;

    /* compiled from: Demographic.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final g fromCost$vungle_ads_release(int i) {
            g gVar;
            g[] gVarArrValues = g.values();
            int length = gVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i10];
                v9.g range = gVar.getRange();
                int i11 = range.f47096b;
                if (i <= range.f47097c && i11 <= i) {
                    break;
                }
                i10++;
            }
            return gVar == null ? g.UNDER_500 : gVar;
        }

        private a() {
        }
    }

    g(int i, v9.g gVar) {
        this.id = i;
        this.range = gVar;
    }

    public final int getId() {
        return this.id;
    }

    public final v9.g getRange() {
        return this.range;
    }
}
