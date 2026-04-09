.class public abstract LBg/a;
.super Lgg/s;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    return-void
.end method


# virtual methods
.method public i1(I)Lgg/s;
    .locals 1

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LBg/a;->j1(ILkg/f;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public j1(ILkg/f;)Lgg/s;
    .locals 1

    const-string v0, "connection is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-gtz p1, :cond_0

    invoke-virtual {p0, p2}, LBg/a;->k1(Lkg/f;)V

    invoke-static {p0}, LEg/a;->m(LBg/a;)LBg/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ltg/c;

    invoke-direct {v0, p0, p1, p2}, Ltg/c;-><init>(LBg/a;ILkg/f;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public abstract k1(Lkg/f;)V
.end method

.method public l1()Lgg/s;
    .locals 1

    new-instance v0, Ltg/U;

    invoke-direct {v0, p0}, Ltg/U;-><init>(LBg/a;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final m1(IJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;
    .locals 8

    const-string v0, "observerCount"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const-string v0, "unit is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ltg/U;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Ltg/U;-><init>(LBg/a;IJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public final n1(JLjava/util/concurrent/TimeUnit;)Lgg/s;
    .locals 6

    const/4 v1, 0x1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, LBg/a;->m1(IJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public abstract o1()V
.end method
