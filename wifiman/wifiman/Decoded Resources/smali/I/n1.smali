.class public abstract LI/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/CharSequence;[CIII)V
    .locals 2

    instance-of v0, p0, LH/h;

    if-eqz v0, :cond_0

    check-cast p0, LH/h;

    invoke-virtual {p0, p1, p2, p3, p4}, LH/h;->i([CIII)V

    goto :goto_1

    :cond_0
    :goto_0
    if-ge p3, p4, :cond_1

    add-int/lit8 v0, p2, 0x1

    invoke-interface {p0, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    aput-char v1, p1, p2

    add-int/lit8 p3, p3, 0x1

    move p2, v0

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
