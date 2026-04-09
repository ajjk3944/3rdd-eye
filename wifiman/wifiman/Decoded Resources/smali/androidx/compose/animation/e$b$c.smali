.class final Landroidx/compose/animation/e$b$c;
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


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$b$c;->a:Landroidx/compose/animation/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/e$b$c;->a:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->q()Lo/H;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LT/z1;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$c;->a(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    return-object p1
.end method
