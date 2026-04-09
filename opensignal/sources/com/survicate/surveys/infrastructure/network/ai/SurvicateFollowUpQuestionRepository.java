package com.survicate.surveys.infrastructure.network.ai;

import br.l;
import kotlin.Metadata;
import no.b;
import sm.f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/SurvicateFollowUpQuestionRepository;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRepository;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionApi;", "followUpQuestionApi", "Lpo/b;", "workspaceKeyProvider", "Lno/b;", "logger", "<init>", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionApi;Lpo/b;Lno/b;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Llq/b0;", "logFollowUpSendingError", "(Ljava/lang/Exception;)V", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpDialog;", "dialogs", "", "language", "requestFollowUpQuestion", "(Ljava/util/List;Ljava/lang/String;Lpq/c;)Ljava/lang/Object;", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionApi;", "Lpo/b;", "Lno/b;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateFollowUpQuestionRepository implements FollowUpQuestionRepository {
    private final FollowUpQuestionApi followUpQuestionApi;
    private final b logger;
    private final po.b workspaceKeyProvider;

    public SurvicateFollowUpQuestionRepository(FollowUpQuestionApi followUpQuestionApi, po.b bVar, b bVar2) {
        l.e(followUpQuestionApi, "followUpQuestionApi");
        l.e(bVar, "workspaceKeyProvider");
        l.e(bVar2, "logger");
        this.followUpQuestionApi = followUpQuestionApi;
        this.workspaceKeyProvider = bVar;
        this.logger = bVar2;
    }

    private final void logFollowUpSendingError(Exception exception) {
        ((f) this.logger).N(exception, "Error sending follow-up question");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestFollowUpQuestion(java.util.List<com.survicate.surveys.infrastructure.network.ai.FollowUpDialog> r7, java.lang.String r8, pq.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof qo.a
            if (r0 == 0) goto L13
            r0 = r9
            qo.a r0 = (qo.a) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            qo.a r0 = new qo.a
            r0.<init>(r6, r9)
        L18:
            pq.h r9 = r0.f21666d
            java.lang.Object r1 = r0.f20947x
            qq.a r2 = qq.a.COROUTINE_SUSPENDED
            int r3 = r0.B
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L30
            com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRepository r7 = r0.f20946r
            lf.t1.G(r1)     // Catch: java.lang.Exception -> L2c com.survicate.surveys.infrastructure.network.HttpException -> L2e
            goto L56
        L2c:
            r8 = move-exception
            goto L6d
        L2e:
            r8 = move-exception
            goto L77
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            lf.t1.G(r1)
            com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRequestBody r1 = new com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRequestBody     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            po.b r3 = r6.workspaceKeyProvider     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            g4.a r3 = (g4.a) r3     // Catch: java.lang.Exception -> L67 com.survicate.surveys.infrastructure.network.HttpException -> L6a
            java.lang.String r3 = r3.a()     // Catch: java.lang.Exception -> L67 com.survicate.surveys.infrastructure.network.HttpException -> L6a
            r1.<init>(r7, r8, r3)     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionApi r7 = r6.followUpQuestionApi     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            r0.f20946r = r6     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            r0.B = r5     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            java.lang.Object r1 = r7.requestFollowUpQuestion(r1, r0)     // Catch: java.lang.Exception -> L61 com.survicate.surveys.infrastructure.network.HttpException -> L64
            if (r1 != r2) goto L55
            return r2
        L55:
            r7 = r6
        L56:
            com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionResponse r1 = (com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionResponse) r1     // Catch: java.lang.Exception -> L2c com.survicate.surveys.infrastructure.network.HttpException -> L2e
            com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionResponseData r8 = r1.getData()     // Catch: java.lang.Exception -> L2c com.survicate.surveys.infrastructure.network.HttpException -> L2e
            java.lang.String r7 = r8.getQuestion()     // Catch: java.lang.Exception -> L2c com.survicate.surveys.infrastructure.network.HttpException -> L2e
            return r7
        L61:
            r8 = move-exception
        L62:
            r7 = r6
            goto L6d
        L64:
            r8 = move-exception
        L65:
            r7 = r6
            goto L77
        L67:
            r7 = move-exception
            r8 = r7
            goto L62
        L6a:
            r7 = move-exception
            r8 = r7
            goto L65
        L6d:
            br.l.b(r9)
            wt.w.i(r9)
            r7.logFollowUpSendingError(r8)
            return r4
        L77:
            br.l.b(r9)
            wt.w.i(r9)
            r7.logFollowUpSendingError(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRepository.requestFollowUpQuestion(java.util.List, java.lang.String, pq.c):java.lang.Object");
    }
}
