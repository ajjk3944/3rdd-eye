package Y5;

import M9.n;
import Q9.C0;
import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G;
import Q9.H;
import Q9.x0;
import c9.C2097r;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.util.m;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: Revenue.kt */
@M9.h
/* loaded from: classes2.dex */
public final class h {
    public static final b Companion = new b(null);
    private Float earningsByPlacementUSD;
    private Boolean isUserAPurchaser;
    private Boolean isUserASubscriber;
    private Float last30DaysMeanSpendUSD;
    private Float last30DaysMedianSpendUSD;
    private Float last30DaysPlacementFillRate;
    private Float last30DaysTotalSpendUSD;
    private Float last30DaysUserLtvUSD;
    private Float last30DaysUserPltvUSD;
    private Float last7DaysMeanSpendUSD;
    private Float last7DaysMedianSpendUSD;
    private Float last7DaysPlacementFillRate;
    private Float last7DaysTotalSpendUSD;
    private Float last7DaysUserLtvUSD;
    private Float last7DaysUserPltvUSD;
    private List<String> topNAdomain;
    private Float totalEarningsUSD;

    /* compiled from: Revenue.kt */
    public static final class a implements H<h> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.fpd.Revenue", aVar, 17);
            c1547o0.k("total_earnings_usd", true);
            c1547o0.k("earnings_by_placement_usd", true);
            c1547o0.k("top_n_adomain", true);
            c1547o0.k("is_user_a_purchaser", true);
            c1547o0.k("is_user_a_subscriber", true);
            c1547o0.k("last_7_days_total_spend_usd", true);
            c1547o0.k("last_7_days_median_spend_usd", true);
            c1547o0.k("last_7_days_mean_spend_usd", true);
            c1547o0.k("last_30_days_total_spend_usd", true);
            c1547o0.k("last_30_days_median_spend_usd", true);
            c1547o0.k("last_30_days_mean_spend_usd", true);
            c1547o0.k("last_7_days_user_pltv_usd", true);
            c1547o0.k("last_7_days_user_ltv_usd", true);
            c1547o0.k("last_30_days_user_pltv_usd", true);
            c1547o0.k("last_30_days_user_ltv_usd", true);
            c1547o0.k("last_7_days_placement_fill_rate", true);
            c1547o0.k("last_30_days_placement_fill_rate", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            G g10 = G.f11421a;
            M9.b<?> bVarB = N9.a.b(g10);
            M9.b<?> bVarB2 = N9.a.b(g10);
            M9.b<?> bVarB3 = N9.a.b(new C1526e(C0.f11399a));
            C1532h c1532h = C1532h.f11487a;
            return new M9.b[]{bVarB, bVarB2, bVarB3, N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10), N9.a.b(g10)};
        }

        /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        @Override // M9.b
        public h deserialize(P9.d decoder) {
            Float f10;
            int i;
            Object obj;
            Float f11;
            Float fG;
            Float f12;
            Boolean boolG;
            l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            Object objG5 = null;
            Boolean bool = null;
            Float fG2 = null;
            Object objG6 = null;
            Object objG7 = null;
            Object objG8 = null;
            Object objG9 = null;
            Object objG10 = null;
            Object objG11 = null;
            Float f13 = null;
            Object objG12 = null;
            Object objG13 = null;
            Object objG14 = null;
            int i10 = 0;
            boolean z10 = true;
            while (z10) {
                Boolean bool2 = bool;
                int iX = bVarD.x(descriptor2);
                switch (iX) {
                    case -1:
                        obj = objG2;
                        f11 = fG2;
                        fG = f13;
                        z10 = false;
                        bool = bool2;
                        fG2 = f11;
                        f13 = fG;
                        objG2 = obj;
                    case 0:
                        obj = objG2;
                        f11 = fG2;
                        i10 |= 1;
                        objG12 = objG12;
                        fG = bVarD.G(descriptor2, 0, G.f11421a, f13);
                        bool = bool2;
                        fG2 = f11;
                        f13 = fG;
                        objG2 = obj;
                    case 1:
                        obj = objG2;
                        f12 = fG2;
                        objG12 = bVarD.G(descriptor2, 1, G.f11421a, objG12);
                        i10 |= 2;
                        objG13 = objG13;
                        boolG = bool2;
                        fG2 = f12;
                        bool = boolG;
                        objG2 = obj;
                    case 2:
                        obj = objG2;
                        f12 = fG2;
                        objG13 = bVarD.G(descriptor2, 2, new C1526e(C0.f11399a), objG13);
                        i10 |= 4;
                        boolG = bool2;
                        fG2 = f12;
                        bool = boolG;
                        objG2 = obj;
                    case 3:
                        obj = objG2;
                        f12 = fG2;
                        objG14 = bVarD.G(descriptor2, 3, C1532h.f11487a, objG14);
                        i10 |= 8;
                        boolG = bool2;
                        fG2 = f12;
                        bool = boolG;
                        objG2 = obj;
                    case 4:
                        obj = objG2;
                        f12 = fG2;
                        i10 |= 16;
                        boolG = bVarD.G(descriptor2, 4, C1532h.f11487a, bool2);
                        fG2 = f12;
                        bool = boolG;
                        objG2 = obj;
                    case 5:
                        obj = objG2;
                        i10 |= 32;
                        bool = bool2;
                        fG2 = bVarD.G(descriptor2, 5, G.f11421a, fG2);
                        objG2 = obj;
                    case 6:
                        f10 = fG2;
                        objG6 = bVarD.G(descriptor2, 6, G.f11421a, objG6);
                        i10 |= 64;
                        bool = bool2;
                        fG2 = f10;
                    case 7:
                        f10 = fG2;
                        objG7 = bVarD.G(descriptor2, 7, G.f11421a, objG7);
                        i10 |= 128;
                        bool = bool2;
                        fG2 = f10;
                    case 8:
                        f10 = fG2;
                        objG8 = bVarD.G(descriptor2, 8, G.f11421a, objG8);
                        i10 |= 256;
                        bool = bool2;
                        fG2 = f10;
                    case 9:
                        f10 = fG2;
                        objG9 = bVarD.G(descriptor2, 9, G.f11421a, objG9);
                        i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        bool = bool2;
                        fG2 = f10;
                    case 10:
                        f10 = fG2;
                        objG10 = bVarD.G(descriptor2, 10, G.f11421a, objG10);
                        i10 |= 1024;
                        bool = bool2;
                        fG2 = f10;
                    case 11:
                        f10 = fG2;
                        objG11 = bVarD.G(descriptor2, 11, G.f11421a, objG11);
                        i10 |= 2048;
                        bool = bool2;
                        fG2 = f10;
                    case 12:
                        f10 = fG2;
                        objG3 = bVarD.G(descriptor2, 12, G.f11421a, objG3);
                        i10 |= 4096;
                        bool = bool2;
                        fG2 = f10;
                    case 13:
                        f10 = fG2;
                        objG2 = bVarD.G(descriptor2, 13, G.f11421a, objG2);
                        i10 |= 8192;
                        bool = bool2;
                        fG2 = f10;
                    case 14:
                        f10 = fG2;
                        objG = bVarD.G(descriptor2, 14, G.f11421a, objG);
                        i10 |= 16384;
                        bool = bool2;
                        fG2 = f10;
                    case 15:
                        f10 = fG2;
                        objG4 = bVarD.G(descriptor2, 15, G.f11421a, objG4);
                        i = Constants.QUEUE_ELEMENT_MAX_SIZE;
                        i10 |= i;
                        bool = bool2;
                        fG2 = f10;
                    case 16:
                        f10 = fG2;
                        objG5 = bVarD.G(descriptor2, 16, G.f11421a, objG5);
                        i = 65536;
                        i10 |= i;
                        bool = bool2;
                        fG2 = f10;
                    default:
                        throw new n(iX);
                }
            }
            Object obj2 = objG2;
            Float f14 = f13;
            bVarD.b(descriptor2);
            return new h(i10, f14, (Float) objG12, (List) objG13, (Boolean) objG14, bool, fG2, (Float) objG6, (Float) objG7, (Float) objG8, (Float) objG9, (Float) objG10, (Float) objG11, (Float) objG3, (Float) obj2, (Float) objG, (Float) objG4, (Float) objG5, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, h value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            h.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: Revenue.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<h> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public h() {
    }

    public static final void write$Self(h self, P9.c output, O9.e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.totalEarningsUSD != null) {
            output.w(serialDesc, 0, G.f11421a, self.totalEarningsUSD);
        }
        if (output.F(serialDesc, 1) || self.earningsByPlacementUSD != null) {
            output.w(serialDesc, 1, G.f11421a, self.earningsByPlacementUSD);
        }
        if (output.F(serialDesc, 2) || self.topNAdomain != null) {
            output.w(serialDesc, 2, new C1526e(C0.f11399a), self.topNAdomain);
        }
        if (output.F(serialDesc, 3) || self.isUserAPurchaser != null) {
            output.w(serialDesc, 3, C1532h.f11487a, self.isUserAPurchaser);
        }
        if (output.F(serialDesc, 4) || self.isUserASubscriber != null) {
            output.w(serialDesc, 4, C1532h.f11487a, self.isUserASubscriber);
        }
        if (output.F(serialDesc, 5) || self.last7DaysTotalSpendUSD != null) {
            output.w(serialDesc, 5, G.f11421a, self.last7DaysTotalSpendUSD);
        }
        if (output.F(serialDesc, 6) || self.last7DaysMedianSpendUSD != null) {
            output.w(serialDesc, 6, G.f11421a, self.last7DaysMedianSpendUSD);
        }
        if (output.F(serialDesc, 7) || self.last7DaysMeanSpendUSD != null) {
            output.w(serialDesc, 7, G.f11421a, self.last7DaysMeanSpendUSD);
        }
        if (output.F(serialDesc, 8) || self.last30DaysTotalSpendUSD != null) {
            output.w(serialDesc, 8, G.f11421a, self.last30DaysTotalSpendUSD);
        }
        if (output.F(serialDesc, 9) || self.last30DaysMedianSpendUSD != null) {
            output.w(serialDesc, 9, G.f11421a, self.last30DaysMedianSpendUSD);
        }
        if (output.F(serialDesc, 10) || self.last30DaysMeanSpendUSD != null) {
            output.w(serialDesc, 10, G.f11421a, self.last30DaysMeanSpendUSD);
        }
        if (output.F(serialDesc, 11) || self.last7DaysUserPltvUSD != null) {
            output.w(serialDesc, 11, G.f11421a, self.last7DaysUserPltvUSD);
        }
        if (output.F(serialDesc, 12) || self.last7DaysUserLtvUSD != null) {
            output.w(serialDesc, 12, G.f11421a, self.last7DaysUserLtvUSD);
        }
        if (output.F(serialDesc, 13) || self.last30DaysUserPltvUSD != null) {
            output.w(serialDesc, 13, G.f11421a, self.last30DaysUserPltvUSD);
        }
        if (output.F(serialDesc, 14) || self.last30DaysUserLtvUSD != null) {
            output.w(serialDesc, 14, G.f11421a, self.last30DaysUserLtvUSD);
        }
        if (output.F(serialDesc, 15) || self.last7DaysPlacementFillRate != null) {
            output.w(serialDesc, 15, G.f11421a, self.last7DaysPlacementFillRate);
        }
        if (!output.F(serialDesc, 16) && self.last30DaysPlacementFillRate == null) {
            return;
        }
        output.w(serialDesc, 16, G.f11421a, self.last30DaysPlacementFillRate);
    }

    public final h setEarningsByPlacement(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.earningsByPlacementUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setIsUserAPurchaser(boolean z10) {
        this.isUserAPurchaser = Boolean.valueOf(z10);
        return this;
    }

    public final h setIsUserASubscriber(boolean z10) {
        this.isUserASubscriber = Boolean.valueOf(z10);
        return this;
    }

    public final h setLast30DaysMeanSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMeanSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast30DaysMedianSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysMedianSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast30DaysPlacementFillRate(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.last30DaysPlacementFillRate = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast30DaysTotalSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysTotalSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast30DaysUserLtvUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserLtvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast30DaysUserPltvUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last30DaysUserPltvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysMeanSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMeanSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysMedianSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysMedianSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysPlacementFillRate(float f10) {
        if (m.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.last7DaysPlacementFillRate = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysTotalSpendUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysTotalSpendUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysUserLtvUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserLtvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setLast7DaysUserPltvUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.last7DaysUserPltvUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final h setTopNAdomain(List<String> list) {
        this.topNAdomain = list != null ? C2097r.I0(list) : null;
        return this;
    }

    public final h setTotalEarningsUsd(float f10) {
        if (m.isInRange$default(m.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.totalEarningsUSD = Float.valueOf(f10);
        }
        return this;
    }

    public /* synthetic */ h(int i, Float f10, Float f11, List list, Boolean bool, Boolean bool2, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, Float f22, Float f23, x0 x0Var) {
        if ((i & 1) == 0) {
            this.totalEarningsUSD = null;
        } else {
            this.totalEarningsUSD = f10;
        }
        if ((i & 2) == 0) {
            this.earningsByPlacementUSD = null;
        } else {
            this.earningsByPlacementUSD = f11;
        }
        if ((i & 4) == 0) {
            this.topNAdomain = null;
        } else {
            this.topNAdomain = list;
        }
        if ((i & 8) == 0) {
            this.isUserAPurchaser = null;
        } else {
            this.isUserAPurchaser = bool;
        }
        if ((i & 16) == 0) {
            this.isUserASubscriber = null;
        } else {
            this.isUserASubscriber = bool2;
        }
        if ((i & 32) == 0) {
            this.last7DaysTotalSpendUSD = null;
        } else {
            this.last7DaysTotalSpendUSD = f12;
        }
        if ((i & 64) == 0) {
            this.last7DaysMedianSpendUSD = null;
        } else {
            this.last7DaysMedianSpendUSD = f13;
        }
        if ((i & 128) == 0) {
            this.last7DaysMeanSpendUSD = null;
        } else {
            this.last7DaysMeanSpendUSD = f14;
        }
        if ((i & 256) == 0) {
            this.last30DaysTotalSpendUSD = null;
        } else {
            this.last30DaysTotalSpendUSD = f15;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            this.last30DaysMedianSpendUSD = null;
        } else {
            this.last30DaysMedianSpendUSD = f16;
        }
        if ((i & 1024) == 0) {
            this.last30DaysMeanSpendUSD = null;
        } else {
            this.last30DaysMeanSpendUSD = f17;
        }
        if ((i & 2048) == 0) {
            this.last7DaysUserPltvUSD = null;
        } else {
            this.last7DaysUserPltvUSD = f18;
        }
        if ((i & 4096) == 0) {
            this.last7DaysUserLtvUSD = null;
        } else {
            this.last7DaysUserLtvUSD = f19;
        }
        if ((i & 8192) == 0) {
            this.last30DaysUserPltvUSD = null;
        } else {
            this.last30DaysUserPltvUSD = f20;
        }
        if ((i & 16384) == 0) {
            this.last30DaysUserLtvUSD = null;
        } else {
            this.last30DaysUserLtvUSD = f21;
        }
        if ((32768 & i) == 0) {
            this.last7DaysPlacementFillRate = null;
        } else {
            this.last7DaysPlacementFillRate = f22;
        }
        if ((i & 65536) == 0) {
            this.last30DaysPlacementFillRate = null;
        } else {
            this.last30DaysPlacementFillRate = f23;
        }
    }

    private static /* synthetic */ void getEarningsByPlacementUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysMeanSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysMedianSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysPlacementFillRate$annotations() {
    }

    private static /* synthetic */ void getLast30DaysTotalSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysUserLtvUSD$annotations() {
    }

    private static /* synthetic */ void getLast30DaysUserPltvUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysMeanSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysMedianSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysPlacementFillRate$annotations() {
    }

    private static /* synthetic */ void getLast7DaysTotalSpendUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysUserLtvUSD$annotations() {
    }

    private static /* synthetic */ void getLast7DaysUserPltvUSD$annotations() {
    }

    private static /* synthetic */ void getTopNAdomain$annotations() {
    }

    private static /* synthetic */ void getTotalEarningsUSD$annotations() {
    }

    private static /* synthetic */ void isUserAPurchaser$annotations() {
    }

    private static /* synthetic */ void isUserASubscriber$annotations() {
    }
}
