.class public final LEe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEe/g$a;,
        LEe/g$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/g;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(ZZ)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, LEe/g;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    check-cast v5, LEe/g$a;

    instance-of v7, v5, LEe/g$a$a;

    const/4 v8, 0x1

    if-eqz v7, :cond_b

    iget-object v7, v0, LEe/g;->a:Ljava/util/List;

    add-int/lit8 v9, v4, -0x1

    invoke-static {v7, v9}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LEe/g$a;

    if-eqz v7, :cond_1

    instance-of v7, v7, LEe/g$a$a;

    if-ne v7, v8, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    if-nez v4, :cond_2

    :goto_1
    new-instance v7, LEe/f$b;

    move-object v9, v5

    check-cast v9, LEe/g$a$a;

    invoke-virtual {v9}, LEe/g$a$a;->a()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v9}, LEe/f$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object v7, v5

    check-cast v7, LEe/g$a$a;

    invoke-virtual {v7}, LEe/g$a$a;->d()Ls9/d;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v9, LEe/f$c;

    invoke-virtual {v7}, LEe/g$a$a;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, LEe/g$a$a;->d()Ls9/d;

    move-result-object v11

    invoke-virtual {v7}, LEe/g$a$a;->b()LEe/g$a$a$a;

    move-result-object v12

    instance-of v13, v12, LEe/g$a$a$a$b;

    if-eqz v13, :cond_3

    new-instance v12, LEe/f$c$a$b;

    invoke-virtual {v7}, LEe/g$a$a;->b()LEe/g$a$a$a;

    move-result-object v13

    check-cast v13, LEe/g$a$a$a$b;

    invoke-virtual {v13}, LEe/g$a$a$a$b;->a()Ls9/d;

    move-result-object v13

    invoke-direct {v12, v13}, LEe/f$c$a$b;-><init>(Ls9/d;)V

    goto :goto_2

    :cond_3
    instance-of v13, v12, LEe/g$a$a$a$a;

    if-eqz v13, :cond_4

    new-instance v12, LEe/f$c$a$a;

    invoke-virtual {v7}, LEe/g$a$a;->b()LEe/g$a$a$a;

    move-result-object v13

    check-cast v13, LEe/g$a$a$a$a;

    invoke-virtual {v13}, LEe/g$a$a$a$a;->a()Ls9/b;

    move-result-object v13

    invoke-direct {v12, v13}, LEe/f$c$a$a;-><init>(Ls9/b;)V

    goto :goto_2

    :cond_4
    if-nez v12, :cond_5

    const/4 v12, 0x0

    :goto_2
    invoke-direct {v9, v10, v11, v12}, LEe/f$c;-><init>(Ljava/lang/String;Ls9/d;LEe/f$c$a;)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    :goto_3
    invoke-virtual {v7}, LEe/g$a$a;->c()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v10, 0x1

    if-gez v10, :cond_7

    invoke-static {}, LZg/v;->v()V

    :cond_7
    check-cast v11, LEe/g$b;

    if-eqz v10, :cond_8

    new-instance v13, LEe/f$a;

    invoke-virtual {v7}, LEe/g$a$a;->a()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14, v11}, LEe/f$a;-><init>(Ljava/lang/String;LEe/g$b;)V

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    new-instance v13, LEe/f$d$a;

    invoke-virtual {v7}, LEe/g$a$a;->a()Ljava/lang/String;

    move-result-object v14

    if-nez v10, :cond_9

    move v15, v8

    goto :goto_5

    :cond_9
    const/4 v15, 0x0

    :goto_5
    invoke-virtual {v7}, LEe/g$a$a;->c()Ljava/util/List;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v16

    add-int/lit8 v3, v16, -0x1

    if-ne v10, v3, :cond_a

    move v3, v8

    goto :goto_6

    :cond_a
    const/4 v3, 0x0

    :goto_6
    invoke-direct {v13, v14, v15, v3, v11}, LEe/f$d$a;-><init>(Ljava/lang/String;ZZLEe/g$b;)V

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v10, v12

    goto :goto_4

    :cond_b
    instance-of v3, v5, LEe/g$a$b;

    if-eqz v3, :cond_e

    new-instance v3, LEe/f$d$b;

    move-object v7, v5

    check-cast v7, LEe/g$a$b;

    invoke-virtual {v7}, LEe/g$a$b;->b()LEe/g$b;

    move-result-object v7

    invoke-direct {v3, v7}, LEe/f$d$b;-><init>(LEe/g$b;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    if-eqz p2, :cond_d

    iget-object v3, v0, LEe/g;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v8

    if-ne v4, v3, :cond_d

    new-instance v3, LEe/f$b;

    invoke-virtual {v5}, LEe/g$a;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "bottom"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, LEe/f$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    move v4, v6

    goto/16 :goto_0

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LEe/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LEe/g;

    iget-object v1, p0, LEe/g;->a:Ljava/util/List;

    iget-object p1, p1, LEe/g;->a:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LEe/g;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LEe/g;->a:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LazyCards(items="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
