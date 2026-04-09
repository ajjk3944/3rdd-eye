package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001aB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ly8/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Ll9/a;)V", "", "writeReplace", "()Ljava/lang/Object;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Z", "", "toString", "()Ljava/lang/String;", "Ll9/a;", "_value", "Ljava/lang/Object;", "final", "getFinal$annotations", "()V", "getValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SafePublicationLazyImpl<T> implements h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21918b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");

    @Nullable
    private volatile Object _value;

    @NotNull
    private final Object final;

    @Nullable
    private volatile l9.a initializer;

    public SafePublicationLazyImpl(l9.a initializer) {
        p.e(initializer, "initializer");
        this.initializer = initializer;
        y8.p pVar = y8.p.f25193a;
        this._value = pVar;
        this.final = pVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public boolean d() {
        return this._value != y8.p.f25193a;
    }

    @Override // y8.h
    public Object getValue() {
        Object obj = this._value;
        y8.p pVar = y8.p.f25193a;
        if (obj != pVar) {
            return obj;
        }
        l9.a aVar = this.initializer;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            if (t.a.a(f21918b, this, pVar, objInvoke)) {
                this.initializer = null;
                return objInvoke;
            }
        }
        return this._value;
    }

    public String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
