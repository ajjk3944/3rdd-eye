.class final Landroidx/compose/ui/layout/h$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/h;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/h;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$e;->a:Landroidx/compose/ui/layout/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)Ljava/lang/Boolean;
    .locals 2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/layout/x$a;

    iget-object v1, p0, Landroidx/compose/ui/layout/h$e;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->d(Landroidx/compose/ui/layout/h;)LV/b;

    move-result-object v1

    invoke-virtual {v1, v0}, LV/b;->q(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/layout/h$e;->a:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->c(Landroidx/compose/ui/layout/h;)I

    move-result v1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Landroidx/compose/ui/layout/x$a;->dispose()V

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/h$e;->a(Ljava/util/Map$Entry;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
