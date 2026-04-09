.class final Landroidx/compose/animation/g$m;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->h(Lr/H;Lf0/c$b;ZLmh/l;)Landroidx/compose/animation/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$m;->a:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/g$m;->a:Lmh/l;

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1, p2}, LY0/r;->f(J)I

    move-result p1

    invoke-static {v0, p1}, LY0/s;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/animation/g$m;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    return-object p1
.end method
