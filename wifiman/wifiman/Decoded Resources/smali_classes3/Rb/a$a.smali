.class public abstract LRb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LRb/a;JIJ)V
    .locals 16

    move-wide/from16 v0, p1

    invoke-interface/range {p0 .. p0}, LRb/a;->getAll()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LRb/c;

    invoke-virtual {v6}, LRb/c;->d()J

    move-result-wide v8

    cmp-long v6, v8, v0

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move v5, v7

    :goto_1
    if-ne v5, v7, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Host "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " not found in the DB"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-interface {v2, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LRb/c;

    move/from16 v14, p3

    invoke-interface {v2, v14, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v9, v4

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v15, v9, 0x1

    if-gez v9, :cond_3

    invoke-static {}, LZg/v;->v()V

    :cond_3
    check-cast v5, LRb/c;

    invoke-virtual {v5}, LRb/c;->d()J

    move-result-wide v6

    cmp-long v6, v6, v0

    if-nez v6, :cond_4

    const/4 v12, 0x3

    const/4 v13, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move/from16 v9, p3

    move-wide/from16 v10, p4

    invoke-static/range {v5 .. v13}, LRb/c;->b(LRb/c;JLjava/lang/String;IJILjava/lang/Object;)LRb/c;

    move-result-object v5

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, LRb/c;->e()I

    move-result v6

    if-eq v6, v9, :cond_5

    const/16 v12, 0xb

    const/4 v13, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-static/range {v5 .. v13}, LRb/c;->b(LRb/c;JLjava/lang/String;IJILjava/lang/Object;)LRb/c;

    move-result-object v5

    :cond_5
    :goto_3
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v15

    goto :goto_2

    :cond_6
    new-array v0, v4, [LRb/c;

    invoke-interface {v3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRb/c;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRb/c;

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, LRb/a;->c([LRb/c;)V

    return-void
.end method
