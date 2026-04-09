.class final Landroidx/compose/foundation/lazy/layout/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/g;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/g;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g$a;->a:Landroidx/compose/foundation/lazy/layout/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g$a;->a:Landroidx/compose/foundation/lazy/layout/g;

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/g;->E2(Landroidx/compose/foundation/lazy/layout/g;)LB/F;

    move-result-object v0

    invoke-interface {v0}, LB/F;->a()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/g$a;->a:Landroidx/compose/foundation/lazy/layout/g;

    invoke-static {v1}, Landroidx/compose/foundation/lazy/layout/g;->E2(Landroidx/compose/foundation/lazy/layout/g;)LB/F;

    move-result-object v1

    invoke-interface {v1}, LB/F;->c()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/g$a;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
