.class final Landroidx/compose/animation/g$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->e(Lr/o0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LT/l;I)Lq/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/g$i$a;
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/graphics/f;

.field final synthetic b:Landroidx/compose/animation/i;

.field final synthetic c:Landroidx/compose/animation/k;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/f;Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$i;->a:Landroidx/compose/ui/graphics/f;

    iput-object p2, p0, Landroidx/compose/animation/g$i;->b:Landroidx/compose/animation/i;

    iput-object p3, p0, Landroidx/compose/animation/g$i;->c:Landroidx/compose/animation/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/k;)J
    .locals 2

    sget-object v0, Landroidx/compose/animation/g$i$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/g$i;->c:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p1}, Lq/t;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v1

    goto :goto_2

    :cond_0
    iget-object p1, p0, Landroidx/compose/animation/g$i;->b:Landroidx/compose/animation/i;

    invoke-virtual {p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Landroidx/compose/animation/g$i;->b:Landroidx/compose/animation/i;

    invoke-virtual {p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_3

    :goto_1
    invoke-virtual {p1}, Lq/t;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v1

    goto :goto_2

    :cond_3
    iget-object p1, p0, Landroidx/compose/animation/g$i;->c:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/g$i;->a:Landroidx/compose/ui/graphics/f;

    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    goto :goto_3

    :cond_6
    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    :goto_3
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lq/k;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$i;->a(Lq/k;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    return-object p1
.end method
