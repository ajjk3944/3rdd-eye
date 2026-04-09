.class final LN/m0$j$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0$j;->a(JJ)LYg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:LN/n0;

.field final synthetic c:J


# direct methods
.method constructor <init>(FLN/n0;J)V
    .locals 0

    iput p1, p0, LN/m0$j$b;->a:F

    iput-object p2, p0, LN/m0$j$b;->b:LN/n0;

    iput-wide p3, p0, LN/m0$j$b;->c:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/E;)V
    .locals 4

    sget-object v0, LN/o0;->Hidden:LN/o0;

    iget v1, p0, LN/m0$j$b;->a:F

    invoke-virtual {p1, v0, v1}, LN/E;->a(Ljava/lang/Object;F)V

    iget v0, p0, LN/m0$j$b;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v1, p0, LN/m0$j$b;->b:LN/n0;

    invoke-virtual {v1}, LN/n0;->j()Z

    move-result v1

    if-nez v1, :cond_0

    iget-wide v1, p0, LN/m0$j$b;->c:J

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result v1

    int-to-float v1, v1

    cmpl-float v1, v1, v0

    if-lez v1, :cond_0

    sget-object v1, LN/o0;->HalfExpanded:LN/o0;

    invoke-virtual {p1, v1, v0}, LN/E;->a(Ljava/lang/Object;F)V

    :cond_0
    iget-wide v0, p0, LN/m0$j$b;->c:J

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LN/o0;->Expanded:LN/o0;

    iget v1, p0, LN/m0$j$b;->a:F

    iget-wide v2, p0, LN/m0$j$b;->c:J

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-virtual {p1, v0, v1}, LN/E;->a(Ljava/lang/Object;F)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LN/m0$j$b;->a(LN/E;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
