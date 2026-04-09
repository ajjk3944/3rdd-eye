.class final Landroidx/compose/foundation/selection/d$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/selection/d;-><init>(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/selection/d;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/selection/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/selection/d$b;->a:Landroidx/compose/foundation/selection/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/selection/d$b;->a:Landroidx/compose/foundation/selection/d;

    invoke-static {v0}, Landroidx/compose/foundation/selection/d;->e3(Landroidx/compose/foundation/selection/d;)Lmh/l;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/selection/d$b;->a:Landroidx/compose/foundation/selection/d;

    invoke-static {v1}, Landroidx/compose/foundation/selection/d;->f3(Landroidx/compose/foundation/selection/d;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/selection/d$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
