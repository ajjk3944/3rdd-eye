.class final LN/m0$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->i(Landroidx/compose/ui/e;LN/n0;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/m0$j$a;
    }
.end annotation


# instance fields
.field final synthetic a:LN/n0;


# direct methods
.method constructor <init>(LN/n0;)V
    .locals 0

    iput-object p1, p0, LN/m0$j;->a:LN/n0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JJ)LYg/s;
    .locals 1

    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result p3

    int-to-float p3, p3

    new-instance p4, LN/m0$j$b;

    iget-object v0, p0, LN/m0$j;->a:LN/n0;

    invoke-direct {p4, p3, v0, p1, p2}, LN/m0$j$b;-><init>(FLN/n0;J)V

    invoke-static {p4}, Landroidx/compose/material/a;->a(Lmh/l;)LN/D;

    move-result-object p1

    iget-object p2, p0, LN/m0$j;->a:LN/n0;

    invoke-virtual {p2}, LN/n0;->d()LN/b;

    move-result-object p2

    invoke-virtual {p2}, LN/b;->o()LN/D;

    move-result-object p2

    invoke-interface {p2}, LN/D;->a()I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object p4, p0, LN/m0$j;->a:LN/n0;

    invoke-virtual {p4}, LN/n0;->e()LN/o0;

    move-result-object p4

    if-nez p2, :cond_1

    invoke-interface {p1, p4}, LN/D;->f(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_3

    :cond_1
    iget-object p2, p0, LN/m0$j;->a:LN/n0;

    invoke-virtual {p2}, LN/n0;->g()LN/o0;

    move-result-object p2

    sget-object p4, LN/m0$j$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p4, p2

    if-eq p2, p3, :cond_6

    const/4 p3, 0x2

    if-eq p2, p3, :cond_3

    const/4 p3, 0x3

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    sget-object p2, LN/o0;->HalfExpanded:LN/o0;

    invoke-interface {p1, p2}, LN/D;->f(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    :goto_2
    move-object p4, p2

    goto :goto_3

    :cond_4
    sget-object p2, LN/o0;->Expanded:LN/o0;

    invoke-interface {p1, p2}, LN/D;->f(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_2

    :cond_5
    sget-object p2, LN/o0;->Hidden:LN/o0;

    goto :goto_2

    :cond_6
    sget-object p4, LN/o0;->Hidden:LN/o0;

    :goto_3
    invoke-static {p1, p4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, LN/m0$j;->a(JJ)LYg/s;

    move-result-object p1

    return-object p1
.end method
