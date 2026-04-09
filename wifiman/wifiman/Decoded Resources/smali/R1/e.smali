.class public abstract LR1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LR1/d;
    .locals 3

    new-instance v0, LR1/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2, v1}, LR1/a;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final varargs b([LR1/d$b;)LR1/a;
    .locals 4

    const-string v0, "pairs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR1/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, LR1/a;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    array-length v1, p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LR1/d$b;

    invoke-virtual {v0, p0}, LR1/a;->g([LR1/d$b;)V

    return-object v0
.end method
