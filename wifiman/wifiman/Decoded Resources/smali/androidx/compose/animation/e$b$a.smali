.class final Landroidx/compose/animation/e$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e$b;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/e;

.field final synthetic b:Landroidx/compose/ui/layout/t;

.field final synthetic c:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;Landroidx/compose/ui/layout/t;J)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b$a;->a:Landroidx/compose/animation/e;

    iput-object p2, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/t;

    iput-wide p3, p0, Landroidx/compose/animation/e$b$a;->c:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->a:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->n()Lf0/c;

    move-result-object v1

    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/t;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    iget-object v2, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-static {v0, v2}, LY0/s;->a(II)J

    move-result-wide v2

    iget-wide v4, p0, Landroidx/compose/animation/e$b$a;->c:J

    sget-object v6, LY0/t;->Ltr:LY0/t;

    invoke-interface/range {v1 .. v6}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v9

    iget-object v8, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/t;

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

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
