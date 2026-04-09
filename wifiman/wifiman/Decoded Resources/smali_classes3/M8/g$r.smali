.class final LM8/g$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/g$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$r;

    invoke-direct {v0}, LM8/g$r;-><init>()V

    sput-object v0, LM8/g$r;->a:LM8/g$r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, LM8/g$r;->b(Ll9/a;Ljava/util/Set;Ll9/a;)LAf/B;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ljava/util/Set;Ll9/a;)LAf/B;
    .locals 9

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "supportedBands"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/c;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lle/f;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v3, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object v3, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance p2, Ll9/a;

    invoke-direct {p2, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x0

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lle/f;->a()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_0

    :cond_3
    move v3, v1

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    new-instance v3, Ll9/a;

    invoke-direct {v3, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lle/f;->a()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lle/i;

    invoke-virtual {v6}, Lle/i;->f()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    sget-object v7, LS8/c;->GHZ_2_4:LS8/c;

    if-ne v6, v7, :cond_4

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_2

    :cond_6
    move v2, v1

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    new-instance v3, Ll9/a;

    sget-object v4, LS8/c;->GHZ_5:LS8/c;

    invoke-direct {v3, v4}, Ll9/a;-><init>(Ljava/lang/Object;)V

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lle/f;->a()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_9

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lle/i;

    invoke-virtual {v7}, Lle/i;->f()LS8/e;

    move-result-object v7

    invoke-virtual {v7}, LS8/e;->a()LS8/c;

    move-result-object v7

    sget-object v8, LS8/c;->GHZ_5:LS8/c;

    if-ne v7, v8, :cond_7

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    goto :goto_4

    :cond_9
    move v4, v1

    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    new-instance v4, Ll9/a;

    sget-object v5, LS8/c;->GHZ_6:LS8/c;

    invoke-direct {v4, v5}, Ll9/a;-><init>(Ljava/lang/Object;)V

    if-eqz p3, :cond_c

    invoke-virtual {p3}, Lle/f;->a()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_c

    check-cast p3, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_a
    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lle/i;

    invoke-virtual {v6}, Lle/i;->f()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    sget-object v7, LS8/c;->GHZ_6:LS8/c;

    if-ne v6, v7, :cond_a

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :cond_c
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v4, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p3

    filled-new-array {p2, v2, v3, p3}, [LYg/s;

    move-result-object p2

    invoke-static {p2}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p2

    new-instance p3, LAf/B;

    invoke-direct {p3, p1, v0, p2}, LAf/B;-><init>(LS8/c;Ljava/util/List;Ljava/util/Map;)V

    return-object p3
.end method
