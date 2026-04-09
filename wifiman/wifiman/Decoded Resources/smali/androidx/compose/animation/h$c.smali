.class final Landroidx/compose/animation/h$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/h;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lmh/l;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;JJLmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h$c;->a:Landroidx/compose/ui/layout/t;

    iput-wide p2, p0, Landroidx/compose/animation/h$c;->b:J

    iput-wide p4, p0, Landroidx/compose/animation/h$c;->c:J

    iput-object p6, p0, Landroidx/compose/animation/h$c;->d:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 6

    iget-object v1, p0, Landroidx/compose/animation/h$c;->a:Landroidx/compose/ui/layout/t;

    iget-wide v2, p0, Landroidx/compose/animation/h$c;->b:J

    invoke-static {v2, v3}, LY0/n;->h(J)I

    move-result v0

    iget-wide v2, p0, Landroidx/compose/animation/h$c;->c:J

    invoke-static {v2, v3}, LY0/n;->h(J)I

    move-result v2

    add-int/2addr v2, v0

    iget-wide v3, p0, Landroidx/compose/animation/h$c;->b:J

    invoke-static {v3, v4}, LY0/n;->i(J)I

    move-result v0

    iget-wide v3, p0, Landroidx/compose/animation/h$c;->c:J

    invoke-static {v3, v4}, LY0/n;->i(J)I

    move-result v3

    add-int/2addr v3, v0

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/compose/animation/h$c;->d:Lmh/l;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/layout/t$a;->u(Landroidx/compose/ui/layout/t;IIFLmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/h$c;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
