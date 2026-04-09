package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/c;", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6\n*L\n1#1,328:1\n*E\n"})
/* loaded from: classes4.dex */
public final class FlowKt__ZipKt$combineTransform$6 extends SuspendLambda implements l9.p {
    final /* synthetic */ b[] $flows;
    final /* synthetic */ l9.q $transform;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Ly8/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/c;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$2\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements l9.q {
        final /* synthetic */ l9.q $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l9.q qVar, c9.c cVar) {
            super(3, cVar);
            this.$transform = qVar;
        }

        @Override // l9.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, Object[] objArr, c9.c cVar2) {
            kotlin.jvm.internal.p.i();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, cVar2);
            anonymousClass2.L$0 = cVar;
            anonymousClass2.L$1 = objArr;
            return anonymousClass2.invokeSuspend(y8.s.f25199a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = kotlin.coroutines.intrinsics.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                c cVar = (c) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                l9.q qVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke(cVar, objArr, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return y8.s.f25199a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$6(b[] bVarArr, l9.q qVar, c9.c cVar) {
        super(2, cVar);
        this.$flows = bVarArr;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.$flows, this.$transform, cVar);
        flowKt__ZipKt$combineTransform$6.L$0 = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            c cVar = (c) this.L$0;
            b[] bVarArr = this.$flows;
            kotlin.jvm.internal.p.i();
            final b[] bVarArr2 = this.$flows;
            l9.a aVar = new l9.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object[] invoke() {
                    int length = bVarArr2.length;
                    kotlin.jvm.internal.p.j(0, "T?");
                    return new Object[length];
                }
            };
            kotlin.jvm.internal.p.i();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transform, null);
            this.label = 1;
            if (CombineKt.a(cVar, bVarArr, aVar, anonymousClass2, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return y8.s.f25199a;
    }

    @Override // l9.p
    public final Object invoke(c cVar, c9.c cVar2) {
        return ((FlowKt__ZipKt$combineTransform$6) create(cVar, cVar2)).invokeSuspend(y8.s.f25199a);
    }
}
