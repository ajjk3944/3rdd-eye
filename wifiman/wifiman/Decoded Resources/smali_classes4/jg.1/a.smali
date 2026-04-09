.class public abstract Ljg/a;
.super Lgg/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract h2(Lkg/f;)V
.end method

.method public i2()Lgg/i;
    .locals 1

    new-instance v0, Lqg/c0;

    invoke-direct {v0, p0}, Lqg/c0;-><init>(Ljg/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final j2(IJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 8

    const-string v0, "subscriberCount"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const-string v0, "unit is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/c0;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lqg/c0;-><init>(Ljg/a;IJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final k2(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    const/4 v1, 0x1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Ljg/a;->j2(IJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public abstract l2()V
.end method
