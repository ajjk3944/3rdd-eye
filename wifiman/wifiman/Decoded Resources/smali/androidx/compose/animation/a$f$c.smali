.class final Landroidx/compose/animation/a$f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/k;


# direct methods
.method constructor <init>(Landroidx/compose/animation/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$c;->a:Landroidx/compose/animation/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/k;Lq/k;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Lq/k;->PostExit:Lq/k;

    if-ne p1, v0, :cond_0

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/a$f$c;->a:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->d()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/k;

    check-cast p2, Lq/k;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$f$c;->a(Lq/k;Lq/k;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
