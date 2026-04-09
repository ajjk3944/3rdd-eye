.class public final LM8/t;
.super Lk8/m;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, LM8/s;

    invoke-direct {v0}, LM8/s;-><init>()V

    invoke-direct {p0, v0}, Lk8/m;-><init>(Lmh/p;)V

    return-void
.end method

.method public static synthetic h(Lle/f;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, LM8/t;->i(Lle/f;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final i(Lle/f;Ljava/lang/String;)Z
    .locals 6

    const-string/jumbo v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object v0

    invoke-virtual {v0}, Lle/i;->r()Lke/c;

    move-result-object v0

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {v0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_7

    invoke-virtual {p0}, Lle/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    move v0, v1

    goto :goto_3

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lle/i;

    invoke-virtual {v3}, Lle/i;->e()Lh9/a;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v3}, Lle/i;->e()Lh9/a;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v1

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v2

    :goto_2
    if-eqz v3, :cond_3

    move v0, v2

    :goto_3
    if-nez v0, :cond_7

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-virtual {p0}, Lle/i;->u()Lcom/ui/wifiman/model/vendor/d;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0, p1, v2}, Lkotlin/text/t;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    goto :goto_4

    :cond_6
    move p0, v1

    :goto_4
    if-eqz p0, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    return v1
.end method
