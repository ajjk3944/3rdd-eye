.class final LN/R0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/R0;-><init>(Ljava/lang/Object;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/R0;


# direct methods
.method constructor <init>(LN/R0;)V
    .locals 0

    iput-object p1, p0, LN/R0$d;->a:LN/R0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 4

    iget-object v0, p0, LN/R0$d;->a:LN/R0;

    invoke-static {v0}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object v0

    invoke-interface {v0}, LT/m0;->c()F

    move-result v0

    add-float/2addr v0, p1

    iget-object p1, p0, LN/R0$d;->a:LN/R0;

    invoke-virtual {p1}, LN/R0;->r()F

    move-result p1

    iget-object v1, p0, LN/R0$d;->a:LN/R0;

    invoke-virtual {v1}, LN/R0;->q()F

    move-result v1

    invoke-static {v0, p1, v1}, Lsh/m;->j(FFF)F

    move-result p1

    sub-float v1, v0, p1

    iget-object v2, p0, LN/R0$d;->a:LN/R0;

    invoke-virtual {v2}, LN/R0;->t()LN/x0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, LN/x0;->a(F)F

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LN/R0$d;->a:LN/R0;

    invoke-static {v3}, LN/R0;->d(LN/R0;)LT/m0;

    move-result-object v3

    add-float/2addr p1, v2

    invoke-interface {v3, p1}, LT/m0;->k(F)V

    iget-object p1, p0, LN/R0$d;->a:LN/R0;

    invoke-static {p1}, LN/R0;->e(LN/R0;)LT/m0;

    move-result-object p1

    invoke-interface {p1, v1}, LT/m0;->k(F)V

    iget-object p1, p0, LN/R0$d;->a:LN/R0;

    invoke-static {p1}, LN/R0;->b(LN/R0;)LT/m0;

    move-result-object p1

    invoke-interface {p1, v0}, LT/m0;->k(F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LN/R0$d;->a(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
