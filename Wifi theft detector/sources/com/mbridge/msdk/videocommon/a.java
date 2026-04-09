package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19583a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19584b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19585c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19586d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19587e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19588f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19589g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19590h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19591i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0347a> f19592j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0347a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f19593a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19594b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f19593a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f19593a;
        }

        public boolean c() {
            return this.f19594b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f19593a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f19593a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f19594b = z10;
        }
    }

    public static void a(String str, C0347a c0347a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f19590h.put(str, c0347a);
                return;
            } else {
                f19589g.put(str, c0347a);
                return;
            }
        }
        if (z11) {
            f19592j.put(str, c0347a);
        } else {
            f19591i.put(str, c0347a);
        }
    }

    public static C0347a b(String str) {
        if (f19589g.containsKey(str)) {
            return f19589g.get(str);
        }
        if (f19590h.containsKey(str)) {
            return f19590h.get(str);
        }
        if (f19591i.containsKey(str)) {
            return f19591i.get(str);
        }
        if (f19592j.containsKey(str)) {
            return f19592j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0347a> entry : f19589g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f19589g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0347a> entry : f19590h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f19590h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f19589g.containsKey(str)) {
            f19589g.remove(str);
        }
        if (f19591i.containsKey(str)) {
            f19591i.remove(str);
        }
        if (f19590h.containsKey(str)) {
            f19590h.remove(str);
        }
        if (f19592j.containsKey(str)) {
            f19592j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f19589g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f19589g.remove(str2);
                }
            }
        } else {
            f19589g.clear();
        }
        f19590h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0347a> concurrentHashMap = f19584b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0347a> concurrentHashMap2 = f19587e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0347a> concurrentHashMap3 = f19583a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0347a> concurrentHashMap4 = f19586d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0347a> concurrentHashMap5 = f19585c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0347a> concurrentHashMap6 = f19588f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f19591i.clear();
        f19592j.clear();
    }

    public static C0347a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0347a> concurrentHashMap = f19583a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f19583a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0347a> concurrentHashMap2 = f19586d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f19586d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0347a> concurrentHashMap3 = f19585c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f19585c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0347a> concurrentHashMap4 = f19588f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f19588f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0347a> concurrentHashMap5 = f19584b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f19584b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0347a> concurrentHashMap6 = f19587e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f19587e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0347a c0347a) {
        try {
            if (i10 == 94) {
                if (f19587e == null) {
                    f19587e = new ConcurrentHashMap<>();
                }
                f19587e.put(str, c0347a);
            } else if (i10 == 287) {
                if (f19588f == null) {
                    f19588f = new ConcurrentHashMap<>();
                }
                f19588f.put(str, c0347a);
            } else if (i10 != 288) {
                if (f19583a == null) {
                    f19583a = new ConcurrentHashMap<>();
                }
                f19583a.put(str, c0347a);
            } else {
                if (f19586d == null) {
                    f19586d = new ConcurrentHashMap<>();
                }
                f19586d.put(str, c0347a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0347a c0347a) {
        try {
            if (i10 == 94) {
                if (f19584b == null) {
                    f19584b = new ConcurrentHashMap<>();
                }
                f19584b.put(str, c0347a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f19585c == null) {
                    f19585c = new ConcurrentHashMap<>();
                }
                f19585c.put(str, c0347a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
