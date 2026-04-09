.class public abstract LR1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR1/d$a;,
        LR1/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method

.method public abstract b(LR1/d$a;)Ljava/lang/Object;
.end method

.method public final c()LR1/a;
    .locals 3

    new-instance v0, LR1/a;

    invoke-virtual {p0}, LR1/d;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LR1/a;-><init>(Ljava/util/Map;Z)V

    return-object v0
.end method

.method public final d()LR1/d;
    .locals 3

    new-instance v0, LR1/a;

    invoke-virtual {p0}, LR1/d;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LR1/a;-><init>(Ljava/util/Map;Z)V

    return-object v0
.end method
