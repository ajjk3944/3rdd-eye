.class final Landroidx/compose/animation/g$f;
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


# instance fields
.field final synthetic a:Landroidx/compose/animation/i;

.field final synthetic b:Landroidx/compose/animation/k;


# direct methods
.method constructor <init>(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$f;->a:Landroidx/compose/animation/i;

    iput-object p2, p0, Landroidx/compose/animation/g$f;->b:Landroidx/compose/animation/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/o0$b;)Lr/H;
    .locals 2

    sget-object v0, Lq/k;->PreEnter:Lq/k;

    sget-object v1, Lq/k;->Visible:Lq/k;

    invoke-interface {p1, v0, v1}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Landroidx/compose/animation/g$f;->a:Landroidx/compose/animation/i;

    invoke-virtual {p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq/t;->a()Lr/H;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_0
    invoke-static {}, Landroidx/compose/animation/g;->b()Lr/h0;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lq/k;->PostExit:Lq/k;

    invoke-interface {p1, v1, v0}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/compose/animation/g$f;->b:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->e()Lq/t;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lq/t;->a()Lr/H;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_2
    invoke-static {}, Landroidx/compose/animation/g;->b()Lr/h0;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, Landroidx/compose/animation/g;->b()Lr/h0;

    move-result-object p1

    :cond_4
    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$f;->a(Lr/o0$b;)Lr/H;

    move-result-object p1

    return-object p1
.end method
