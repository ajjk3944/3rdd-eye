.class Lag/j;
.super Lag/d$a;
.source "SourceFile"

# interfaces
.implements Ldg/b;


# direct methods
.method constructor <init>(LZf/b;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-void
.end method

.method constructor <init>(LZf/b;Ljava/util/function/Predicate;Lag/d$d;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 9

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    .line 2
    invoke-direct/range {v0 .. v8}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;ZZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic g(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/d$a;
    .locals 0

    check-cast p1, LZf/b;

    invoke-virtual/range {p0 .. p5}, Lag/j;->q(LZf/b;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o()Lag/d$a;
    .locals 1

    invoke-virtual {p0}, Lag/j;->r()Lag/j;

    move-result-object v0

    return-object v0
.end method

.method protected q(LZf/b;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/j;
    .locals 9

    new-instance v8, Lag/j;

    iget-object v2, p0, Lag/d$a;->s:Ljava/util/function/Predicate;

    iget-object v3, p0, Lag/d$a;->k:Lag/d$d;

    move-object v0, v8

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lag/j;-><init>(LZf/b;Ljava/util/function/Predicate;Lag/d$d;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-object v8
.end method

.method public r()Lag/j;
    .locals 1

    invoke-super {p0}, Lag/d$a;->o()Lag/d$a;

    move-result-object v0

    check-cast v0, Lag/j;

    return-object v0
.end method

.method public bridge synthetic trySplit()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lag/j;->r()Lag/j;

    move-result-object v0

    return-object v0
.end method
