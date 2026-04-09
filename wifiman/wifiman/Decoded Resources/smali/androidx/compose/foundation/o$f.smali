.class final Landroidx/compose/foundation/o$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/o;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/o;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/o;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 5

    iget-object v0, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->m()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, p1

    iget-object v1, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    invoke-static {v1}, Landroidx/compose/foundation/o;->g(Landroidx/compose/foundation/o;)F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v1}, Landroidx/compose/foundation/o;->l()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lsh/m;->j(FFF)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v2}, Landroidx/compose/foundation/o;->m()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    invoke-virtual {v3}, Landroidx/compose/foundation/o;->m()I

    move-result v4

    add-int/2addr v4, v2

    invoke-static {v3, v4}, Landroidx/compose/foundation/o;->j(Landroidx/compose/foundation/o;I)V

    iget-object v3, p0, Landroidx/compose/foundation/o$f;->a:Landroidx/compose/foundation/o;

    int-to-float v2, v2

    sub-float v2, v1, v2

    invoke-static {v3, v2}, Landroidx/compose/foundation/o;->i(Landroidx/compose/foundation/o;F)V

    if-nez v0, :cond_1

    move p1, v1

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/o$f;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
