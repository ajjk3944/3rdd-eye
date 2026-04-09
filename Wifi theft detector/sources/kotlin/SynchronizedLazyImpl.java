package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ly8/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Ll9/a;Ljava/lang/Object;)V", "writeReplace", "()Ljava/lang/Object;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Z", "", "toString", "()Ljava/lang/String;", "Ll9/a;", "_value", "Ljava/lang/Object;", "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SynchronizedLazyImpl<T> implements h, Serializable {

    @Nullable
    private volatile Object _value;

    @Nullable
    private l9.a initializer;

    @NotNull
    private final Object lock;

    public SynchronizedLazyImpl(l9.a initializer, Object obj) {
        p.e(initializer, "initializer");
        this.initializer = initializer;
        this._value = y8.p.f25193a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public boolean d() {
        return this._value != y8.p.f25193a;
    }

    @Override // y8.h
    public Object getValue() {
        Object objInvoke;
        Object obj = this._value;
        y8.p pVar = y8.p.f25193a;
        if (obj != pVar) {
            return obj;
        }
        synchronized (this.lock) {
            objInvoke = this._value;
            if (objInvoke == pVar) {
                l9.a aVar = this.initializer;
                p.b(aVar);
                objInvoke = aVar.invoke();
                this._value = objInvoke;
                this.initializer = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(l9.a aVar, Object obj, int i10, i iVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
