.class public abstract Lqh/a;
.super Lqh/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqh/c;-><init>()V

    return-void
.end method


# virtual methods
.method public c()F
    .locals 1

    invoke-virtual {p0}, Lqh/a;->h()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    invoke-virtual {p0}, Lqh/a;->h()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public g(I)I
    .locals 1

    invoke-virtual {p0}, Lqh/a;->h()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    return p1
.end method

.method public abstract h()Ljava/util/Random;
.end method
