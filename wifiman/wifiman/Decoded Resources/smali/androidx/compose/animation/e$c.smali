.class final Landroidx/compose/animation/e$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e;->b(ILr/H;Lmh/l;)Landroidx/compose/animation/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Landroidx/compose/animation/e;


# direct methods
.method constructor <init>(Lmh/l;Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$c;->a:Lmh/l;

    iput-object p2, p0, Landroidx/compose/animation/e$c;->b:Landroidx/compose/animation/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Integer;
    .locals 7

    iget-object v0, p0, Landroidx/compose/animation/e$c;->a:Lmh/l;

    iget-object v1, p0, Landroidx/compose/animation/e$c;->b:Landroidx/compose/animation/e;

    invoke-static {v1}, Landroidx/compose/animation/e;->i(Landroidx/compose/animation/e;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    iget-object v2, p0, Landroidx/compose/animation/e$c;->b:Landroidx/compose/animation/e;

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide v3

    iget-object p1, p0, Landroidx/compose/animation/e$c;->b:Landroidx/compose/animation/e;

    invoke-static {p1}, Landroidx/compose/animation/e;->i(Landroidx/compose/animation/e;)J

    move-result-wide v5

    invoke-static {v2, v3, v4, v5, v6}, Landroidx/compose/animation/e;->h(Landroidx/compose/animation/e;JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/n;->h(J)I

    move-result p1

    sub-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$c;->a(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
