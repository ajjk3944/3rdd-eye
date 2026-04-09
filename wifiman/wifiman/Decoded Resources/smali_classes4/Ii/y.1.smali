.class final LIi/y;
.super LIi/D0;
.source "SourceFile"

# interfaces
.implements LIi/x;


# direct methods
.method public constructor <init>(LIi/y0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LIi/D0;-><init>(Z)V

    invoke-virtual {p0, p1}, LIi/D0;->g0(LIi/y0;)V

    return-void
.end method


# virtual methods
.method public S(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->m0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, LIi/C;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LIi/C;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v0}, LIi/D0;->m0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public await(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->x(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    return-object p1
.end method

.method public getCompleted()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIi/D0;->O()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getOnAwait()LSi/c;
    .locals 2

    invoke-virtual {p0}, LIi/D0;->U()LSi/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
