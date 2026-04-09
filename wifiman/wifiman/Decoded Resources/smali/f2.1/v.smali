.class public Lf2/v;
.super Lf2/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf2/D;"
    }
.end annotation

.annotation runtime Lf2/D$b;
    value = "navigation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lf2/v;",
        "Lf2/D;",
        "Lf2/t;",
        "Lf2/E;",
        "navigatorProvider",
        "<init>",
        "(Lf2/E;)V",
        "Lf2/k;",
        "entry",
        "Lf2/y;",
        "navOptions",
        "Lf2/D$a;",
        "navigatorExtras",
        "LYg/J;",
        "m",
        "(Lf2/k;Lf2/y;Lf2/D$a;)V",
        "l",
        "()Lf2/t;",
        "",
        "entries",
        "e",
        "(Ljava/util/List;Lf2/y;Lf2/D$a;)V",
        "c",
        "Lf2/E;",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:Lf2/E;


# direct methods
.method public constructor <init>(Lf2/E;)V
    .locals 1

    const-string v0, "navigatorProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf2/D;-><init>()V

    iput-object p1, p0, Lf2/v;->c:Lf2/E;

    return-void
.end method

.method private final m(Lf2/k;Lf2/y;Lf2/D$a;)V
    .locals 4

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lf2/t;

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-virtual {p1}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Lf2/t;->V()I

    move-result p1

    invoke-virtual {v0}, Lf2/t;->W()Ljava/lang/String;

    move-result-object v2

    if-nez p1, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "no start destination defined via app:startDestination for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lf2/t;->q()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, v2, p1}, Lf2/t;->Q(Ljava/lang/String;Z)Lf2/r;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lf2/t;->T()Lo/W;

    move-result-object v3

    invoke-virtual {v3, p1}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/r;

    :goto_1
    if-eqz p1, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1, v2}, Lf2/r;->A(Ljava/lang/String;)Lf2/r$b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lf2/r$b;->c()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroid/os/Bundle;

    if-eqz v3, :cond_4

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_4
    iput-object v2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_5
    invoke-virtual {p1}, Lf2/r;->k()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lf2/r;->k()Ljava/util/Map;

    move-result-object v0

    new-instance v2, Lf2/v$a;

    invoke-direct {v2, v1}, Lf2/v$a;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v0, v2}, Lf2/j;->a(Ljava/util/Map;Lmh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Cannot navigate to startDestination "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Missing required arguments ["

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_3
    iget-object v0, p0, Lf2/v;->c:Lf2/E;

    invoke-virtual {p1}, Lf2/r;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lf2/E;->e(Ljava/lang/String;)Lf2/D;

    move-result-object v0

    invoke-virtual {p0}, Lf2/D;->b()Lf2/F;

    move-result-object v2

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {p1, v1}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, p1, v1}, Lf2/F;->a(Lf2/r;Landroid/os/Bundle;)Lf2/k;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lf2/D;->e(Ljava/util/List;Lf2/y;Lf2/D$a;)V

    return-void

    :cond_8
    invoke-virtual {v0}, Lf2/t;->U()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "navigation destination "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not a direct child of this NavGraph"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public bridge synthetic a()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lf2/v;->l()Lf2/t;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;Lf2/y;Lf2/D$a;)V
    .locals 1

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/k;

    invoke-direct {p0, v0, p2, p3}, Lf2/v;->m(Lf2/k;Lf2/y;Lf2/D$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l()Lf2/t;
    .locals 1

    new-instance v0, Lf2/t;

    invoke-direct {v0, p0}, Lf2/t;-><init>(Lf2/D;)V

    return-object v0
.end method
