package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Map;
import o4.j0;

/* loaded from: classes.dex */
public final class c implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1435b;

    public /* synthetic */ c(j0 j0Var, int i10) {
        this.f1434a = i10;
        this.f1435b = j0Var;
    }

    @Override // f.a
    public final void a(Object obj) {
        switch (this.f1434a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                d dVar = this.f1435b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) dVar.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    e0.p("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f1391a;
                    if (dVar.f1438c.S(str) == null) {
                        e0.p("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                d dVar2 = this.f1435b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) dVar2.F.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    e0.p("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f1391a;
                    int i11 = fragmentManager$LaunchedFragmentInfo2.f1392d;
                    b bVarS = dVar2.f1438c.S(str2);
                    if (bVarS == null) {
                        e0.p("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        bVarS.A(i11, activityResult.f917a, activityResult.f918d);
                        break;
                    }
                }
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                d dVar3 = this.f1435b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) dVar3.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    e0.p("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f1391a;
                    int i12 = fragmentManager$LaunchedFragmentInfo3.f1392d;
                    b bVarS2 = dVar3.f1438c.S(str3);
                    if (bVarS2 == null) {
                        e0.p("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        bVarS2.A(i12, activityResult2.f917a, activityResult2.f918d);
                        break;
                    }
                }
        }
    }
}
