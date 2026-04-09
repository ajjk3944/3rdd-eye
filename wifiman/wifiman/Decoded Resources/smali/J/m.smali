.class public abstract LJ/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/m$a;
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;IZLI/o1;)I
    .locals 5

    if-eqz p2, :cond_0

    invoke-static {p0, p1}, LF/N;->a(Ljava/lang/String;I)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LF/N;->b(Ljava/lang/String;I)I

    move-result p0

    :goto_0
    const/4 v0, -0x1

    if-ne p0, v0, :cond_1

    return p1

    :cond_1
    invoke-virtual {p3, p0}, LI/o1;->n(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, LI/o1;->p(J)J

    move-result-wide v2

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v0, LI/G0;->Untransformed:LI/G0;

    goto :goto_1

    :cond_2
    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v4

    if-nez v4, :cond_3

    sget-object v0, LI/G0;->Replacement:LI/G0;

    goto :goto_1

    :cond_3
    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, LI/G0;->Insertion:LI/G0;

    goto :goto_1

    :cond_4
    sget-object v0, LI/G0;->Deletion:LI/G0;

    :goto_1
    sget-object v1, LJ/m$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_b

    const/4 v1, 0x2

    if-eq v0, v1, :cond_b

    const/4 v1, 0x3

    if-eq v0, v1, :cond_9

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    if-eqz p2, :cond_6

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p2

    if-ne p0, p2, :cond_5

    new-instance p1, LI/X0;

    sget-object p2, LI/p1;->Start:LI/p1;

    invoke-direct {p1, p2}, LI/X0;-><init>(LI/p1;)V

    invoke-virtual {p3, p1}, LI/o1;->A(LI/X0;)V

    return p0

    :cond_5
    new-instance p0, LI/X0;

    sget-object p2, LI/p1;->End:LI/p1;

    invoke-direct {p0, p2}, LI/X0;-><init>(LI/p1;)V

    invoke-virtual {p3, p0}, LI/o1;->A(LI/X0;)V

    goto :goto_2

    :cond_6
    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p2

    if-ne p0, p2, :cond_7

    new-instance p1, LI/X0;

    sget-object p2, LI/p1;->End:LI/p1;

    invoke-direct {p1, p2}, LI/X0;-><init>(LI/p1;)V

    invoke-virtual {p3, p1}, LI/o1;->A(LI/X0;)V

    return p0

    :cond_7
    new-instance p0, LI/X0;

    sget-object p2, LI/p1;->Start:LI/p1;

    invoke-direct {p0, p2}, LI/X0;-><init>(LI/p1;)V

    invoke-virtual {p3, p0}, LI/o1;->A(LI/X0;)V

    return p1

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    if-eqz p2, :cond_a

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p1

    goto :goto_2

    :cond_a
    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p1

    goto :goto_2

    :cond_b
    move p1, p0

    :goto_2
    return p1
.end method
