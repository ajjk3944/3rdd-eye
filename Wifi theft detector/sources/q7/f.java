package q7;

import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f {

    @NotNull
    private final String description;
    private final boolean errorIsTerminal;
    private final boolean isRetryCode;

    public f(@NotNull String description, boolean z10, boolean z11) {
        p.e(description, "description");
        this.description = description;
        this.errorIsTerminal = z10;
        this.isRetryCode = z11;
    }

    public static /* synthetic */ f copy$default(f fVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fVar.description;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.errorIsTerminal;
        }
        if ((i10 & 4) != 0) {
            z11 = fVar.isRetryCode;
        }
        return fVar.copy(str, z10, z11);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    public final boolean component2() {
        return this.errorIsTerminal;
    }

    public final boolean component3() {
        return this.isRetryCode;
    }

    @NotNull
    public final f copy(@NotNull String description, boolean z10, boolean z11) {
        p.e(description, "description");
        return new f(description, z10, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p.a(this.description, fVar.description) && this.errorIsTerminal == fVar.errorIsTerminal && this.isRetryCode == fVar.isRetryCode;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        boolean z10 = this.errorIsTerminal;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.isRetryCode;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isRetryCode() {
        return this.isRetryCode;
    }

    @NotNull
    public String toString() {
        return "ErrorInfo(description=" + this.description + ", errorIsTerminal=" + this.errorIsTerminal + ", isRetryCode=" + this.isRetryCode + ')';
    }

    public /* synthetic */ f(String str, boolean z10, boolean z11, int i10, kotlin.jvm.internal.i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
