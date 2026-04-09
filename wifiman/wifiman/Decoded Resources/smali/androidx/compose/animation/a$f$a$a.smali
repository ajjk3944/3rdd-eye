.class final Landroidx/compose/animation/a$f$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$a;->a(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:Lq/i;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;Lq/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$a$a;->a:Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/animation/a$f$a$a;->b:Lq/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/a$f$a$a;->a:Landroidx/compose/ui/layout/t;

    iget-object v1, p0, Landroidx/compose/animation/a$f$a$a;->b:Lq/i;

    invoke-virtual {v1}, Lq/i;->d()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroidx/compose/ui/layout/t$a;->g(Landroidx/compose/ui/layout/t;IIF)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$f$a$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
