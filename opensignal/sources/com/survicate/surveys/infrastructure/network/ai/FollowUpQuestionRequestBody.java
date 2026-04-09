package com.survicate.surveys.infrastructure.network.ai;

import br.g;
import br.l;
import gu.a;
import iu.e;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.c1;
import ku.p0;
import ku.y0;
import mu.y;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ6\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001a¨\u00060"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpDialog;", "dialogs", "", "language", "workspaceKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;Lju/b;Liu/e;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDialogs", "getDialogs$annotations", "()V", "Ljava/lang/String;", "getLanguage", "getLanguage$annotations", "getWorkspaceKey", "getWorkspaceKey$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FollowUpQuestionRequestBody {
    private final List<FollowUpDialog> dialogs;
    private final String language;
    private final String workspaceKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {new c(FollowUpDialog$$serializer.INSTANCE), null, null};

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody$Companion;", "", "<init>", "()V", "", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpDialog;", "dialogs", "", "language", "workspaceKey", "Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "from", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/infrastructure/network/ai/FollowUpQuestionRequestBody;", "Lgu/a;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final FollowUpQuestionRequestBody from(List<FollowUpDialog> dialogs, String language, String workspaceKey) {
            l.e(dialogs, "dialogs");
            l.e(workspaceKey, "workspaceKey");
            return new FollowUpQuestionRequestBody(dialogs, language, workspaceKey);
        }

        public final a serializer() {
            return FollowUpQuestionRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lq.c
    public /* synthetic */ FollowUpQuestionRequestBody(int i10, List list, String str, String str2, y0 y0Var) {
        if (7 != (i10 & 7)) {
            p0.f(i10, 7, FollowUpQuestionRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.dialogs = list;
        this.language = str;
        this.workspaceKey = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowUpQuestionRequestBody copy$default(FollowUpQuestionRequestBody followUpQuestionRequestBody, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = followUpQuestionRequestBody.dialogs;
        }
        if ((i10 & 2) != 0) {
            str = followUpQuestionRequestBody.language;
        }
        if ((i10 & 4) != 0) {
            str2 = followUpQuestionRequestBody.workspaceKey;
        }
        return followUpQuestionRequestBody.copy(list, str, str2);
    }

    public static /* synthetic */ void getDialogs$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getWorkspaceKey$annotations() {
    }

    public static final /* synthetic */ void write$Self(FollowUpQuestionRequestBody self, b output, e serialDesc) {
        y yVar = (y) output;
        yVar.w(serialDesc, 0, $childSerializers[0], self.dialogs);
        yVar.i(serialDesc, 1, c1.f14534a, self.language);
        yVar.x(serialDesc, 2, self.workspaceKey);
    }

    public final List<FollowUpDialog> component1() {
        return this.dialogs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWorkspaceKey() {
        return this.workspaceKey;
    }

    public final FollowUpQuestionRequestBody copy(List<FollowUpDialog> dialogs, String language, String workspaceKey) {
        l.e(dialogs, "dialogs");
        l.e(workspaceKey, "workspaceKey");
        return new FollowUpQuestionRequestBody(dialogs, language, workspaceKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowUpQuestionRequestBody)) {
            return false;
        }
        FollowUpQuestionRequestBody followUpQuestionRequestBody = (FollowUpQuestionRequestBody) other;
        return l.a(this.dialogs, followUpQuestionRequestBody.dialogs) && l.a(this.language, followUpQuestionRequestBody.language) && l.a(this.workspaceKey, followUpQuestionRequestBody.workspaceKey);
    }

    public final List<FollowUpDialog> getDialogs() {
        return this.dialogs;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getWorkspaceKey() {
        return this.workspaceKey;
    }

    public int hashCode() {
        int iHashCode = this.dialogs.hashCode() * 31;
        String str = this.language;
        return this.workspaceKey.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FollowUpQuestionRequestBody(dialogs=");
        sb2.append(this.dialogs);
        sb2.append(", language=");
        sb2.append(this.language);
        sb2.append(", workspaceKey=");
        return h0.b.r(sb2, this.workspaceKey, ')');
    }

    public FollowUpQuestionRequestBody(List<FollowUpDialog> list, String str, String str2) {
        l.e(list, "dialogs");
        l.e(str2, "workspaceKey");
        this.dialogs = list;
        this.language = str;
        this.workspaceKey = str2;
    }
}
