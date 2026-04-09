.class final LN/b$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 0

    iput-object p1, p0, LN/b$i;->a:LN/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 5

    iget-object v0, p0, LN/b$i;->a:LN/b;

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    iget-object v1, p0, LN/b$i;->a:LN/b;

    invoke-virtual {v1}, LN/b;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    iget-object v1, p0, LN/b$i;->a:LN/b;

    invoke-virtual {v1}, LN/b;->o()LN/D;

    move-result-object v1

    iget-object v2, p0, LN/b$i;->a:LN/b;

    invoke-virtual {v2}, LN/b;->q()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, LN/D;->e(Ljava/lang/Object;)F

    move-result v1

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-nez v3, :cond_2

    const v3, 0x358637bd    # 1.0E-6f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    iget-object v2, p0, LN/b$i;->a:LN/b;

    invoke-virtual {v2}, LN/b;->A()F

    move-result v2

    sub-float/2addr v2, v0

    div-float/2addr v2, v1

    cmpg-float v0, v2, v3

    if-gez v0, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const v0, 0x3f7fffef    # 0.999999f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    :cond_2
    :goto_0
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/b$i;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
