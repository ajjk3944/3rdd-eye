.class final Lad/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/f;-><init>(Lad/a;LYc/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lad/f;


# direct methods
.method constructor <init>(Lad/f;)V
    .locals 0

    iput-object p1, p0, Lad/f$d;->a:Lad/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/LinkedList;)Ldd/i;
    .locals 10

    iget-object v0, p0, Lad/f$d;->a:Lad/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dns-lookup("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LWc/c;

    invoke-virtual {v4}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    move v2, v0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LWc/c;

    invoke-virtual {v6}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb8/b;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lb8/b;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_4
    if-eqz v7, :cond_3

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v7

    :goto_2
    if-eqz v2, :cond_7

    invoke-static {v2}, LZg/v;->e0(Ljava/lang/Iterable;)D

    move-result-wide v8

    sget-object v2, Lb8/b;->a:Lb8/b$b;

    invoke-static {v8, v9}, Loh/b;->d(D)I

    move-result v4

    invoke-virtual {v2, v4}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v2

    move-object v6, v2

    goto :goto_3

    :cond_7
    move-object v6, v7

    :goto_3
    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWc/c;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb8/b;

    move-object v8, v2

    goto :goto_4

    :cond_8
    move-object v8, v7

    :goto_4
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LWc/c;

    invoke-virtual {v9}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_9

    move v9, v0

    goto :goto_6

    :cond_9
    move v9, v1

    :goto_6
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_7

    :cond_b
    move-object v2, v7

    :goto_7
    if-eqz v2, :cond_c

    invoke-static {v2}, LZg/v;->e0(Ljava/lang/Iterable;)D

    move-result-wide v0

    sget-object v2, Lb8/d;->a:Lb8/d$b;

    double-to-float v0, v0

    invoke-virtual {v2, v0}, Lb8/d$b;->b(F)Lb8/d;

    move-result-object v0

    goto :goto_8

    :cond_c
    move-object v0, v7

    :goto_8
    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v9

    new-instance p1, Ldd/i;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v7, v8

    move-object v8, v0

    invoke-direct/range {v2 .. v9}, Ldd/i;-><init>(Ljava/lang/String;Linet/ipaddr/g;Ljava/lang/Boolean;Lb8/b;Lb8/b;Lb8/d;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/LinkedList;

    invoke-virtual {p0, p1}, Lad/f$d;->a(Ljava/util/LinkedList;)Ldd/i;

    move-result-object p1

    return-object p1
.end method
