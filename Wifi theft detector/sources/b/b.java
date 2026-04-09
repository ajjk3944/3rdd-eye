package b;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import b.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import q9.e;
import z8.h0;
import z8.o;
import z8.z;

/* loaded from: classes.dex */
public final class b extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4541a = new a(null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Intent a(String[] input) {
            p.e(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            p.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public a() {
        }
    }

    @Override // b.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        p.e(context, "context");
        p.e(input, "input");
        return f4541a.a(input);
    }

    @Override // b.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0056a b(Context context, String[] input) {
        p.e(context, "context");
        p.e(input, "input");
        if (input.length == 0) {
            return new a.C0056a(kotlin.collections.a.h());
        }
        for (String str : input) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.b(h0.e(input.length), 16));
        for (String str2 : input) {
            Pair pairA = y8.i.a(str2, Boolean.TRUE);
            linkedHashMap.put(pairA.h(), pairA.i());
        }
        return new a.C0056a(linkedHashMap);
    }

    @Override // b.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return kotlin.collections.a.h();
        }
        if (intent == null) {
            return kotlin.collections.a.h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return kotlin.collections.a.h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return kotlin.collections.a.s(z.j0(o.y(stringArrayExtra), arrayList));
    }
}
