.class public abstract Lr8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8/a$a;
    }
.end annotation


# direct methods
.method public static final a(Lrd/b$a$a;)Ls9/a$b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr8/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, LCc/b$b$c;->c:LCc/b$b$c;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LCc/b$b$d;->c:LCc/b$b$d;

    goto :goto_0

    :cond_2
    sget-object p0, LCc/b$a$b;->b:LCc/b$a$b;

    goto :goto_0

    :cond_3
    sget-object p0, LCc/b$a$a;->b:LCc/b$a$a;

    :goto_0
    invoke-static {p0}, Lk8/b;->b(LCc/b;)Ls9/a$b;

    move-result-object p0

    return-object p0
.end method
