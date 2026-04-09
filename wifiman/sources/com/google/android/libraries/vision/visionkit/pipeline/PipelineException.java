package com.google.android.libraries.vision.visionkit.pipeline;

import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.N1;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.V9;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.ba;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.ha;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Keep
@UsedByNative("pipeline_jni.cc")
/* loaded from: classes.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final p statusCode;
    private final String statusMessage;
    private final G visionkitStatus;

    public PipelineException(int i10, String str) {
        super(p.values()[i10].zza() + ": " + str);
        this.statusCode = p.values()[i10];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List<C5014c> getComponentStatuses() {
        G g10 = this.visionkitStatus;
        return g10 != null ? g10.E() : ha.v();
    }

    public V9 getRootCauseMessage() {
        Object next;
        Object obj;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return V9.a();
        }
        List listB = ba.a(ROOT_CAUSE_DELIMITER).b(this.statusMessage);
        if (listB instanceof List) {
            List list = listB;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else {
            Iterator it = listB.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return V9.c((String) obj);
    }

    public p getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(G g10) {
        super(p.values()[g10.A()].zza() + ": " + g10.D());
        this.statusCode = p.values()[g10.A()];
        this.statusMessage = g10.D();
        this.visionkitStatus = g10;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    PipelineException(byte[] bArr) throws zzbew {
        this(G.C(bArr, N1.a()));
    }
}
