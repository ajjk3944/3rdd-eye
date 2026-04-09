package g;

import Yg.s;
import Yg.z;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.U;
import android.content.Context;
import android.content.Intent;
import g.AbstractC5837a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import t1.AbstractC8021a;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5838b extends AbstractC5837a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f47363a = new a(null);

    /* renamed from: g.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] input) {
            AbstractC6492s.i(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC6492s.h(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        private a() {
        }
    }

    @Override // g.AbstractC5837a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(input, "input");
        return f47363a.a(input);
    }

    @Override // g.AbstractC5837a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC5837a.C1765a b(Context context, String[] input) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(input, "input");
        if (input.length == 0) {
            return new AbstractC5837a.C1765a(U.h());
        }
        for (String str : input) {
            if (AbstractC8021a.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(input.length), 16));
        for (String str2 : input) {
            s sVarA = z.a(str2, Boolean.TRUE);
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        return new AbstractC5837a.C1765a(linkedHashMap);
    }

    @Override // g.AbstractC5837a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return U.h();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return U.r(AbstractC3689v.s1(AbstractC3682n.X(stringArrayExtra), arrayList));
        }
        return U.h();
    }
}
