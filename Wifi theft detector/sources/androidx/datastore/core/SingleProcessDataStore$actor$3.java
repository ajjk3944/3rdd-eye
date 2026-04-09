package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.datastore.core.SingleProcessDataStore;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l9.p;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/SingleProcessDataStore$b;", NotificationCompat.CATEGORY_MESSAGE, "Ly8/s;", "<anonymous>", "(Landroidx/datastore/core/SingleProcessDataStore$b;)V"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SingleProcessDataStore$actor$3 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore singleProcessDataStore, c9.c cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    @Override // l9.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(SingleProcessDataStore.b bVar, c9.c cVar) {
        return ((SingleProcessDataStore$actor$3) create(bVar, cVar)).invokeSuspend(s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, cVar);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r4.this$0.r((androidx.datastore.core.SingleProcessDataStore.b.a) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4.this$0.s((androidx.datastore.core.SingleProcessDataStore.b.C0026b) r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.c.b(r5)
            goto L44
        L1b:
            kotlin.c.b(r5)
            java.lang.Object r5 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore$b r5 = (androidx.datastore.core.SingleProcessDataStore.b) r5
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.b.a
            if (r1 == 0) goto L33
            androidx.datastore.core.SingleProcessDataStore r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$b$a r5 = (androidx.datastore.core.SingleProcessDataStore.b.a) r5
            r4.label = r3
            java.lang.Object r5 = androidx.datastore.core.SingleProcessDataStore.h(r1, r5, r4)
            if (r5 != r0) goto L44
            goto L43
        L33:
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.b.C0026b
            if (r1 == 0) goto L44
            androidx.datastore.core.SingleProcessDataStore r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$b$b r5 = (androidx.datastore.core.SingleProcessDataStore.b.C0026b) r5
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.core.SingleProcessDataStore.i(r1, r5, r4)
            if (r5 != r0) goto L44
        L43:
            return r0
        L44:
            y8.s r5 = y8.s.f25199a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$actor$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
