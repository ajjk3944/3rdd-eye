package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class it3 implements bb4, ll3, ks2 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ it3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ll3
    public /* synthetic */ Object a() {
        return (mf2) this.g;
    }

    public void b(ok3 ok3Var) {
        zb1 zb1Var = (zb1) this.g;
        zb1Var.getClass();
        String str = ok3Var.b;
        int i = ok3Var.a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) tw1.e.c.a(mz1.mc)).booleanValue()) {
                zb1Var.g = str;
            }
        }
        switch (i) {
            case 8152:
                zb1Var.f("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                zb1Var.f("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                zb1Var.f("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                zb1Var.g = null;
                zb1Var.h = null;
                zb1Var.f = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i));
                zb1Var.f("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 3:
                int i2 = ya4.g0;
                boolean z = ((dc4) obj2).l;
                ((zt1) obj).g();
                break;
            default:
                ((bd4) obj).l((ph4) obj2);
                break;
        }
    }

    @Override // defpackage.bb4
    public void d(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        Object obj = wb4.b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.g;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = j63.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public void e(int i, Object obj, v64 v64Var) {
        g54 g54Var = (g54) this.g;
        s44 s44Var = (s44) obj;
        g54Var.I(i, 2);
        g54Var.X(s44Var.d(v64Var));
        v64Var.e(s44Var, this);
    }

    public /* synthetic */ it3(ad4 ad4Var, ph4 ph4Var, w34 w34Var) {
        this.f = 4;
        this.g = ph4Var;
    }

    public it3(g54 g54Var) {
        this.f = 1;
        Charset charset = y54.a;
        if (g54Var == null) {
            throw new NullPointerException("output");
        }
        this.g = g54Var;
        g54Var.s = this;
    }
}
