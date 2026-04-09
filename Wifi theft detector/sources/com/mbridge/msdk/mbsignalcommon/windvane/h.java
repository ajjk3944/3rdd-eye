package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class h implements b, Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f16270a;

    /* renamed from: b, reason: collision with root package name */
    protected String f16271b;

    /* renamed from: d, reason: collision with root package name */
    protected Context f16273d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f16274e;

    /* renamed from: c, reason: collision with root package name */
    protected final int f16272c = 1;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f16275f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f16273d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f16274e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f16274e, str);
        if (aVarA != null) {
            aVarA.f16244b = this.f16274e;
            return aVarA;
        }
        Matcher matcher = this.f16270a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f16248f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f16246d = matcher.group(1);
                aVar.f16249g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f16247e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f16145k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f16247e = com.mbridge.msdk.mbsignalcommon.base.e.f16145k.get(aVar.f16247e);
                }
                aVar.f16244b = this.f16274e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f16271b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (message.what != 1) {
            return false;
        }
        Object obj = aVar.f16245c;
        b.C0289b c0289b = aVar.f16243a;
        if (c0289b != null && obj != null) {
            c0289b.a(obj, aVar, TextUtils.isEmpty(aVar.f16248f) ? JsonUtils.EMPTY_JSON : aVar.f16248f);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f16244b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f16246d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C0289b c0289bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f16273d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f16247e, Object.class, String.class);
            c0289bA.a();
            if (jsObject instanceof g) {
                aVar.f16243a = c0289bA;
                aVar.f16245c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f16275f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f16270a = pattern;
    }
}
