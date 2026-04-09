package wj;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final vj.b f36778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36779b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f36780c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f36781d;

    public g(Context context, int i4) {
        this.f36780c = new ArrayList();
        this.f36778a = null;
        this.f36781d = context;
        this.f36779b = i4;
    }

    public final int a(int i4) throws Resources.NotFoundException {
        int[] intArray = this.f36781d.getResources().getIntArray(R.array.appa_apps_analyze_pie_colors);
        if (i4 < 0 || i4 >= intArray.length) {
            i4 = new Random().nextInt(intArray.length - 1);
        }
        return intArray[i4];
    }

    public g(Context context, vj.b bVar) throws PackageManager.NameNotFoundException {
        ArrayList arrayList = new ArrayList();
        this.f36780c = arrayList;
        this.f36781d = context;
        this.f36778a = bVar;
        if (bVar instanceof vj.i) {
            this.f36779b = 1;
            ArrayList arrayList2 = ((vj.i) bVar).f36266a;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                vj.h hVar = (vj.h) arrayList2.get(i4);
                n nVar = new n();
                int i10 = hVar.f36264a;
                nVar.f36808a = context.getDrawable(pd.b.c(i10));
                nVar.f36809b = u.r(i10, "API ");
                nVar.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(hVar.f36265b.size()));
                nVar.f36811d = pd.b.b(i10, context);
                arrayList.add(nVar);
                if (arrayList.size() >= 2) {
                    return;
                }
            }
            return;
        }
        if (bVar instanceof vj.f) {
            this.f36779b = 2;
            ArrayList arrayList3 = ((vj.f) bVar).f36262a;
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                vj.e eVar = (vj.e) arrayList3.get(i11);
                n nVar2 = new n();
                int i12 = eVar.f36260a;
                nVar2.f36808a = context.getDrawable(pd.b.c(i12));
                nVar2.f36809b = u.r(i12, "API ");
                nVar2.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(eVar.f36261b.size()));
                nVar2.f36811d = pd.b.b(i12, context);
                arrayList.add(nVar2);
                if (arrayList.size() >= 2) {
                    return;
                }
            }
            return;
        }
        if (bVar instanceof vj.d) {
            this.f36779b = 4;
            HashMap map = ((vj.d) bVar).f36259a;
            for (String str : map.keySet()) {
                List list = (List) map.get(str);
                if (list != null) {
                    n nVar3 = new n();
                    if (!"system".equalsIgnoreCase(str) && !TextUtils.isEmpty(str)) {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                            nVar3.f36808a = packageInfo.applicationInfo.loadIcon(packageManager);
                            nVar3.f36809b = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                            nVar3.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(list.size()));
                            nVar3.f36811d = str;
                            if (nVar3.f36808a == null) {
                                nVar3.f36808a = context.getDrawable(android.R.mipmap.sym_def_app_icon);
                            }
                            arrayList.add(nVar3);
                            if (arrayList.size() >= 2) {
                                return;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            continue;
                        }
                    }
                }
            }
            return;
        }
        if (bVar instanceof vj.c) {
            this.f36779b = 5;
            HashMap map2 = ((vj.c) bVar).f36258a;
            for (Integer num : map2.keySet()) {
                List list2 = (List) map2.get(num);
                if (list2 != null) {
                    n nVar4 = new n();
                    if (num.intValue() == 0) {
                        nVar4.f36809b = context.getString(R.string.appa_install_loc_auto);
                    } else if (num.intValue() == 1) {
                        nVar4.f36809b = context.getString(R.string.appa_install_loc_internal_only);
                    } else if (num.intValue() == 2) {
                        nVar4.f36809b = context.getString(R.string.appa_install_loc_prefer_external);
                    } else {
                        continue;
                    }
                    nVar4.f36808a = context.getDrawable(R.drawable.appa_ic_phone_android);
                    nVar4.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(list2.size()));
                    arrayList.add(nVar4);
                    if (arrayList.size() >= 2) {
                        return;
                    }
                }
            }
            return;
        }
        if (bVar instanceof vj.g) {
            this.f36779b = 6;
            HashMap map3 = ((vj.g) bVar).f36263a;
            for (String str2 : map3.keySet()) {
                List list3 = (List) map3.get(str2);
                if (list3 != null) {
                    n nVar5 = new n();
                    nVar5.f36809b = str2;
                    nVar5.f36808a = context.getDrawable(R.drawable.appa_ic_signature);
                    nVar5.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(list3.size()));
                    arrayList.add(nVar5);
                    if (arrayList.size() >= 2) {
                        return;
                    }
                }
            }
            return;
        }
        if (bVar instanceof vj.a) {
            this.f36779b = 3;
            HashMap map4 = ((vj.a) bVar).f36257a;
            List list4 = (List) map4.get(1);
            n nVar6 = new n();
            nVar6.f36809b = "64 bit";
            nVar6.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf(list4 == null ? 0 : list4.size()));
            Drawable drawable = context.getDrawable(R.drawable.appa_ic_cpu_bit_64);
            nVar6.f36808a = drawable;
            if (drawable != null) {
                nVar6.f36808a = wb.e.M(drawable, cm.g.l(R.attr.colorPrimary, context));
            }
            arrayList.add(nVar6);
            List list5 = (List) map4.get(2);
            List list6 = (List) map4.get(3);
            n nVar7 = new n();
            nVar7.f36809b = "32 bit";
            Drawable drawable2 = context.getDrawable(R.drawable.appa_ic_cpu_bit_32);
            nVar7.f36808a = drawable2;
            if (drawable2 != null) {
                nVar7.f36808a = wb.e.M(drawable2, cm.g.l(R.attr.colorPrimary, context));
            }
            nVar7.f36810c = context.getString(R.string.appa_item_count_template, Integer.valueOf((list5 == null ? 0 : list5.size()) + (list6 == null ? 0 : list6.size())));
            arrayList.add(nVar7);
            return;
        }
        throw new IllegalArgumentException("result item 类型非法，".concat(bVar.getClass().getName()));
    }
}
