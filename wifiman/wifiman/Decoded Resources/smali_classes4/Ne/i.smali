.class public abstract LNe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/i$a;
    }
.end annotation


# direct methods
.method public static final a(LS8/d;)Ls9/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LNe/i$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->C4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$b;

    sget v1, Lm8/c;->t4:I

    invoke-virtual {p0}, LS8/d;->getWidth()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
