package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ul {
    private static int emc;
    private static final LinkedHashMap<String, SoftReference<emc>> ypw = new LinkedHashMap<String, SoftReference<emc>>(emc, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.utils.ul.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<emc>> entry) {
            emc emcVar;
            com.bytedance.sdk.component.zz.ycc yccVar;
            if (size() <= ul.emc) {
                return false;
            }
            SoftReference<emc> value = entry.getValue();
            if (value == null || (emcVar = value.get()) == null || (yccVar = emcVar.emc) == null) {
                return true;
            }
            try {
                com.bytedance.sdk.component.utils.dr.emc(yccVar);
                return true;
            } catch (Throwable unused) {
                entry.getKey();
                return true;
            }
        }
    };

    public static class emc {
        com.bytedance.sdk.component.zz.ycc emc;
        Bundle ypw;

        public emc(com.bytedance.sdk.component.zz.ycc yccVar, Bundle bundle) {
            this.emc = yccVar;
            this.ypw = bundle;
        }
    }

    private static void ypw() {
        emc emcVar;
        com.bytedance.sdk.component.zz.ycc yccVar;
        synchronized (ypw) {
            while (true) {
                LinkedHashMap<String, SoftReference<emc>> linkedHashMap = ypw;
                if (linkedHashMap.size() > emc) {
                    SoftReference<emc> softReferenceRemove = linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    if (softReferenceRemove != null && (emcVar = softReferenceRemove.get()) != null && (yccVar = emcVar.emc) != null) {
                        try {
                            com.bytedance.sdk.component.utils.dr.emc(yccVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            emc = 0;
        } else {
            emc = Math.max(0, rieVar.uym());
        }
        ypw();
    }

    public static void emc(String str, com.bytedance.sdk.component.zz.ycc yccVar, Bundle bundle) {
        if (emc <= 0 || TextUtils.isEmpty(str) || yccVar == null) {
            return;
        }
        LinkedHashMap<String, SoftReference<emc>> linkedHashMap = ypw;
        synchronized (linkedHashMap) {
            try {
                emc(yccVar.getWebView());
                emc(yccVar, yccVar.getContext());
                synchronized (linkedHashMap) {
                    linkedHashMap.put(str, new SoftReference<>(new emc(yccVar, bundle)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        linkedHashMap.size();
    }

    public static com.bytedance.sdk.component.zz.ycc emc(Context context, String str) {
        com.bytedance.sdk.component.zz.ycc yccVar;
        if (emc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<emc>> linkedHashMap = ypw;
        synchronized (linkedHashMap) {
            try {
                SoftReference<emc> softReferenceRemove = linkedHashMap.remove(str);
                if (softReferenceRemove == null) {
                    return null;
                }
                emc emcVar = softReferenceRemove.get();
                if (emcVar != null && (yccVar = emcVar.emc) != null) {
                    emc(yccVar, context);
                    return emcVar.emc;
                }
                return null;
            } finally {
            }
        }
    }

    public static Bundle emc(String str) {
        if (emc <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap<String, SoftReference<emc>> linkedHashMap = ypw;
        synchronized (linkedHashMap) {
            try {
                SoftReference<emc> softReference = linkedHashMap.get(str);
                if (softReference == null) {
                    return null;
                }
                emc emcVar = softReference.get();
                return emcVar != null ? emcVar.ypw : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void emc(com.bytedance.sdk.component.zz.ycc yccVar, Context context) {
        try {
            if (yccVar.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) yccVar.getContext()).setBaseContext(context.getApplicationContext());
            }
        } catch (ClassCastException unused) {
        }
        ViewGroup viewGroup = (ViewGroup) yccVar.getParent();
        if (viewGroup != null) {
            try {
                viewGroup.removeView(yccVar);
            } catch (Throwable unused2) {
            }
        }
    }

    private static void emc(WebView webView) {
        if (webView != null && emc > 0) {
            try {
                webView.evaluateJavascript("[].forEach.call(document.querySelectorAll('audio,video'), function(audio) { try { audio.pause(); } catch(e) {} })", null);
            } catch (Throwable unused) {
            }
        }
    }
}
