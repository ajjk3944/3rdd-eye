package com.survicate.surveys.infrastructure.network.ai;

import java.util.List;
import kotlin.Metadata;
import pq.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRepository;", "", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpDialog;", "dialogs", "", "language", "requestFollowUpQuestion", "(Ljava/util/List;Ljava/lang/String;Lpq/c;)Ljava/lang/Object;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FollowUpQuestionRepository {
    Object requestFollowUpQuestion(List<FollowUpDialog> list, String str, c cVar);
}
