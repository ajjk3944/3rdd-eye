.class final Landroidx/compose/animation/h$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/h;-><init>(Lr/o0;Lr/o0$a;Lr/o0$a;Lr/o0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Lq/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/h;


# direct methods
.method constructor <init>(Landroidx/compose/animation/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h$j;->a:Landroidx/compose/animation/h;

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

    iget-object p1, p0, Landroidx/compose/animation/h$j;->a:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->E2()Landroidx/compose/animation/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->f()Lq/w;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lq/w;->a()Lr/H;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_0
    invoke-static {}, Landroidx/compose/animation/g;->c()Lr/h0;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lq/k;->PostExit:Lq/k;

    invoke-interface {p1, v1, v0}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/compose/animation/h$j;->a:Landroidx/compose/animation/h;

    invoke-virtual {p1}, Landroidx/compose/animation/h;->F2()Landroidx/compose/animation/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->f()Lq/w;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lq/w;->a()Lr/H;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_2
    invoke-static {}, Landroidx/compose/animation/g;->c()Lr/h0;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {}, Landroidx/compose/animation/g;->c()Lr/h0;

    move-result-object p1

    :cond_4
    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/o0$b;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/h$j;->a(Lr/o0$b;)Lr/H;

    move-result-object p1

    return-object p1
.end method
