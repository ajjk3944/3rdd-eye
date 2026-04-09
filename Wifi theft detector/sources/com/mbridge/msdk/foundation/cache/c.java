package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static int f14681i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f14682j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f14683k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static int f14684l = 2;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f14685a;

    /* renamed from: b, reason: collision with root package name */
    private String f14686b;

    /* renamed from: c, reason: collision with root package name */
    private int f14687c = 21;

    /* renamed from: d, reason: collision with root package name */
    private int f14688d = f14682j;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<String> f14689e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private List<String> f14690f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private List<String> f14691g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private List<String> f14692h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f14685a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f14692h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f14685a;
    }

    public String d() {
        List<String> list = this.f14691g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f14686b;
    }

    public String f() {
        List<String> list = this.f14690f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f14688d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f14689e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f14690f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f14691g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f14686b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f14689e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f14688d = i10;
    }
}
