.class final Lq/d$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Lmh/l;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Landroidx/compose/animation/i;

.field final synthetic e:Landroidx/compose/animation/k;

.field final synthetic f:Lmh/q;

.field final synthetic g:I


# direct methods
.method constructor <init>(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;I)V
    .locals 0

    iput-object p1, p0, Lq/d$l;->a:Lr/o0;

    iput-object p2, p0, Lq/d$l;->b:Lmh/l;

    iput-object p3, p0, Lq/d$l;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lq/d$l;->d:Landroidx/compose/animation/i;

    iput-object p5, p0, Lq/d$l;->e:Landroidx/compose/animation/k;

    iput-object p6, p0, Lq/d$l;->f:Lmh/q;

    iput p7, p0, Lq/d$l;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, Lq/d$l;->a:Lr/o0;

    iget-object v1, p0, Lq/d$l;->b:Lmh/l;

    iget-object v2, p0, Lq/d$l;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lq/d$l;->d:Landroidx/compose/animation/i;

    iget-object v4, p0, Lq/d$l;->e:Landroidx/compose/animation/k;

    iget-object v5, p0, Lq/d$l;->f:Lmh/q;

    iget p2, p0, Lq/d$l;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Lq/d;->g(Lr/o0;Lmh/l;Landroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/q;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq/d$l;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
