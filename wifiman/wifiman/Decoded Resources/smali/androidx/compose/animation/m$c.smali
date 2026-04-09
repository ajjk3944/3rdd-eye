.class final Landroidx/compose/animation/m$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/m;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/m;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Landroidx/compose/ui/layout/m;

.field final synthetic f:Landroidx/compose/ui/layout/t;


# direct methods
.method constructor <init>(Landroidx/compose/animation/m;JIILandroidx/compose/ui/layout/m;Landroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/m$c;->a:Landroidx/compose/animation/m;

    iput-wide p2, p0, Landroidx/compose/animation/m$c;->b:J

    iput p4, p0, Landroidx/compose/animation/m$c;->c:I

    iput p5, p0, Landroidx/compose/animation/m$c;->d:I

    iput-object p6, p0, Landroidx/compose/animation/m$c;->e:Landroidx/compose/ui/layout/m;

    iput-object p7, p0, Landroidx/compose/animation/m$c;->f:Landroidx/compose/ui/layout/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget-object v0, p0, Landroidx/compose/animation/m$c;->a:Landroidx/compose/animation/m;

    invoke-virtual {v0}, Landroidx/compose/animation/m;->E2()Lf0/c;

    move-result-object v1

    iget-wide v2, p0, Landroidx/compose/animation/m$c;->b:J

    iget v0, p0, Landroidx/compose/animation/m$c;->c:I

    iget v4, p0, Landroidx/compose/animation/m$c;->d:I

    invoke-static {v0, v4}, LY0/s;->a(II)J

    move-result-wide v4

    iget-object v0, p0, Landroidx/compose/animation/m$c;->e:Landroidx/compose/ui/layout/m;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v9

    iget-object v8, p0, Landroidx/compose/animation/m$c;->f:Landroidx/compose/ui/layout/t;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/m$c;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
