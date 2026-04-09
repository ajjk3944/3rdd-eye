.class final Landroidx/compose/foundation/layout/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/e;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:LC0/B;

.field final synthetic c:Landroidx/compose/ui/layout/m;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Landroidx/compose/foundation/layout/e;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;LC0/B;Landroidx/compose/ui/layout/m;IILandroidx/compose/foundation/layout/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/e$b;->a:Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/foundation/layout/e$b;->b:LC0/B;

    iput-object p3, p0, Landroidx/compose/foundation/layout/e$b;->c:Landroidx/compose/ui/layout/m;

    iput p4, p0, Landroidx/compose/foundation/layout/e$b;->d:I

    iput p5, p0, Landroidx/compose/foundation/layout/e$b;->e:I

    iput-object p6, p0, Landroidx/compose/foundation/layout/e$b;->f:Landroidx/compose/foundation/layout/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/e$b;->a:Landroidx/compose/ui/layout/t;

    iget-object v2, p0, Landroidx/compose/foundation/layout/e$b;->b:LC0/B;

    iget-object v0, p0, Landroidx/compose/foundation/layout/e$b;->c:Landroidx/compose/ui/layout/m;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v3

    iget v4, p0, Landroidx/compose/foundation/layout/e$b;->d:I

    iget v5, p0, Landroidx/compose/foundation/layout/e$b;->e:I

    iget-object v0, p0, Landroidx/compose/foundation/layout/e$b;->f:Landroidx/compose/foundation/layout/e;

    invoke-static {v0}, Landroidx/compose/foundation/layout/e;->a(Landroidx/compose/foundation/layout/e;)Lf0/c;

    move-result-object v6

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/d;->c(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;LC0/B;LY0/t;IILf0/c;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/e$b;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
