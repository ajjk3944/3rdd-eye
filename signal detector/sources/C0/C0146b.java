package C0;

import A2.C0117e;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o4.AbstractC2763b;

/* renamed from: C0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1030a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1031b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.a f1032c;

    /* renamed from: d, reason: collision with root package name */
    public final C0117e f1033d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1034e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1035f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1036g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1037h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1038j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1039k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f1040l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1041m;

    public C0146b(Context context, String str, G0.a aVar, C0117e c0117e, ArrayList arrayList, boolean z6, int i, Executor executor, Executor executor2, boolean z7, boolean z8, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        q5.i.e(context, "context");
        q5.i.e(c0117e, "migrationContainer");
        AbstractC2763b.g(i, "journalMode");
        q5.i.e(executor, "queryExecutor");
        q5.i.e(executor2, "transactionExecutor");
        q5.i.e(arrayList2, "typeConverters");
        q5.i.e(arrayList3, "autoMigrationSpecs");
        this.f1030a = context;
        this.f1031b = str;
        this.f1032c = aVar;
        this.f1033d = c0117e;
        this.f1034e = arrayList;
        this.f1035f = z6;
        this.f1036g = i;
        this.f1037h = executor;
        this.i = executor2;
        this.f1038j = z7;
        this.f1039k = z8;
        this.f1040l = linkedHashSet;
        this.f1041m = false;
    }

    public final boolean a(int i, int i3) {
        if ((i > i3 && this.f1039k) || !this.f1038j) {
            return false;
        }
        Set set = this.f1040l;
        return set == null || !set.contains(Integer.valueOf(i));
    }
}
