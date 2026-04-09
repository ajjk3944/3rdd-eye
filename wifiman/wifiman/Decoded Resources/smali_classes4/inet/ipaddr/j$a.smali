.class Linet/ipaddr/j$a;
.super Lag/d$a;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/m$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final t:Ljava/util/function/Predicate;


# direct methods
.method constructor <init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 7

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 3
    invoke-direct/range {v0 .. v6}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    .line 4
    iput-object p2, p0, Linet/ipaddr/j$a;->t:Ljava/util/function/Predicate;

    return-void
.end method

.method constructor <init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;Ljava/util/function/ToLongFunction;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v6, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;Ljava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    .line 2
    iput-object p2, p0, Linet/ipaddr/j$a;->t:Ljava/util/function/Predicate;

    return-void
.end method

.method constructor <init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V
    .locals 9

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    .line 5
    invoke-direct/range {v0 .. v8}, Lag/d$a;-><init>(Lag/a;Ljava/util/function/Predicate;Lag/d$d;ZZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    move-object v1, p2

    .line 6
    iput-object v1, v0, Linet/ipaddr/j$a;->t:Ljava/util/function/Predicate;

    return-void
.end method


# virtual methods
.method protected bridge synthetic g(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Lag/d$a;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Linet/ipaddr/j$a;->q(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Linet/ipaddr/j$a;

    move-result-object p1

    return-object p1
.end method

.method protected n()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/j$a;->t:Ljava/util/function/Predicate;

    invoke-interface {v0, p0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected q(Lag/a;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)Linet/ipaddr/j$a;
    .locals 9

    new-instance v8, Linet/ipaddr/j$a;

    iget-object v2, p0, Linet/ipaddr/j$a;->t:Ljava/util/function/Predicate;

    iget-object v0, p0, Lag/d$a;->k:Lag/d$d;

    move-object v3, v0

    check-cast v3, Linet/ipaddr/j$f;

    move-object v0, v8

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Linet/ipaddr/j$a;-><init>(Lag/a;Ljava/util/function/Predicate;Linet/ipaddr/j$f;ZLjava/util/function/Function;Ljava/util/function/Predicate;Ljava/util/function/ToLongFunction;)V

    return-object v8
.end method
