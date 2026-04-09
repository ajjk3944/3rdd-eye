package com.google.android.libraries.vision.visionkit.pipeline;

import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.N1;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.X7;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;

/* loaded from: classes.dex */
class NativePipelineImpl {

    /* renamed from: a, reason: collision with root package name */
    private N1 f36952a;

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void closeFileDescriptor(int i10) {
        throw null;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j10) {
        throw null;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            s.C(bArr, this.f36952a);
            throw null;
        } catch (zzbew e10) {
            X7.f35660b.a(e10, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public int openFileDescriptor(String str) {
        throw null;
    }
}
