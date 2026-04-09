.class public final Lpi/r0;
.super Lui/e;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/r0$a;
    }
.end annotation


# static fields
.field public static final b:Lpi/r0$a;

.field private static final c:Lpi/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/r0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/r0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/r0;->b:Lpi/r0$a;

    new-instance v0, Lpi/r0;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lpi/r0;-><init>(Ljava/util/List;)V

    sput-object v0, Lpi/r0;->c:Lpi/r0;

    return-void
.end method

.method private constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lui/e;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/p0;

    .line 4
    invoke-virtual {v0}, Lpi/p0;->b()Lth/d;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lui/a;->g(Lth/d;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lpi/r0;-><init>(Ljava/util/List;)V

    return-void
.end method

.method private constructor <init>(Lpi/p0;)V
    .locals 0

    .line 5
    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lpi/r0;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic i()Lpi/r0;
    .locals 1

    sget-object v0, Lpi/r0;->c:Lpi/r0;

    return-object v0
.end method


# virtual methods
.method protected e()Lui/z;
    .locals 1

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    return-object v0
.end method

.method public final j(Lpi/r0;)Lpi/r0;
    .locals 5

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lpi/r0;->b:Lpi/r0$a;

    invoke-static {v1}, Lpi/r0$a;->h(Lpi/r0$a;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, Lui/e;->b()Lui/c;

    move-result-object v3

    invoke-virtual {v3, v2}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/p0;

    invoke-virtual {p1}, Lui/e;->b()Lui/c;

    move-result-object v4

    invoke-virtual {v4, v2}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/p0;

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Lpi/p0;->a(Lpi/p0;)Lpi/p0;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, Lpi/p0;->a(Lpi/p0;)Lpi/p0;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1, v0}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final k(Lpi/p0;)Z
    .locals 1

    const-string v0, "attribute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1}, Lpi/p0;->b()Lth/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lui/z;->e(Lth/d;)I

    move-result p1

    invoke-virtual {p0}, Lui/e;->b()Lui/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final q(Lpi/r0;)Lpi/r0;
    .locals 5

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lpi/r0;->b:Lpi/r0$a;

    invoke-static {v1}, Lpi/r0$a;->h(Lpi/r0$a;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, Lui/e;->b()Lui/c;

    move-result-object v3

    invoke-virtual {v3, v2}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/p0;

    invoke-virtual {p1}, Lui/e;->b()Lui/c;

    move-result-object v4

    invoke-virtual {v4, v2}, Lui/c;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/p0;

    if-nez v3, :cond_2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Lpi/p0;->c(Lpi/p0;)Lpi/p0;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v2}, Lpi/p0;->c(Lpi/p0;)Lpi/p0;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1, v0}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final s(Lpi/p0;)Lpi/r0;
    .locals 1

    const-string v0, "attribute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lpi/r0;->k(Lpi/p0;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lpi/r0;

    invoke-direct {v0, p1}, Lpi/r0;-><init>(Lpi/p0;)V

    return-object v0

    :cond_1
    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, LZg/v;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0, p1}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lpi/p0;)Lpi/r0;
    .locals 4

    const-string v0, "attribute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lui/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lui/e;->b()Lui/c;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpi/p0;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0}, Lui/e;->b()Lui/c;

    move-result-object v0

    invoke-virtual {v0}, Lui/c;->b()I

    move-result v0

    if-ne p1, v0, :cond_3

    return-object p0

    :cond_3
    sget-object p1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1, v1}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    return-object p1
.end method
