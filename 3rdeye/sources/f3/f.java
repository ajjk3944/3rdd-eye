package F3;

import D9.J;
import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import p3.C5450c;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes.dex */
public final class f implements A3.b, M4.a, com.google.gson.internal.g, MediaViewListener {

    /* renamed from: b, reason: collision with root package name */
    public Object f1607b;

    public /* synthetic */ f(Object obj) {
        this.f1607b = obj;
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            b5.d dVar = (b5.d) this.f1607b;
            b5.e eVar = new b5.e(stringWriter, dVar.f17187a, dVar.f17188b, dVar.f17189c, dVar.f17190d);
            eVar.g(obj);
            eVar.i();
            eVar.f17193b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public Boolean b() {
        Bundle bundle = (Bundle) this.f1607b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void c(Set tableIds) {
        J j4;
        Object value;
        int[] iArr;
        kotlin.jvm.internal.l.f(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            j4 = (J) this.f1607b;
            value = j4.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = tableIds.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
        } while (!j4.a(value, iArr));
    }

    @Override // M4.a
    public void d(Bundle bundle) {
        ((F4.a) this.f1607b).d("clx", "_ae", bundle);
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        String packageName = ((Context) ((A3.c) this.f1607b).f36c).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        Type type = (Type) this.f1607b;
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.h("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new com.google.gson.h("Invalid EnumSet type: " + type.toString());
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onComplete(MediaView mediaView) {
        MediationNativeAdCallback mediationNativeAdCallback = ((C5450c) this.f1607b).f45114e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    public f(int i, boolean z10) {
        switch (i) {
            case 11:
                this.f1607b = new LinkedHashMap();
                break;
            default:
                this.f1607b = new WeakHashMap();
                break;
        }
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onEnterFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onExitFullscreen(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenBackground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onFullscreenForeground(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPause(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onPlay(MediaView mediaView) {
    }

    @Override // com.facebook.ads.MediaViewListener
    public void onVolumeChange(MediaView mediaView, float f10) {
    }
}
