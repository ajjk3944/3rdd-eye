.class public LIi/z0;
.super LIi/D0;
.source "SourceFile"

# interfaces
.implements LIi/A;


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(LIi/y0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LIi/D0;-><init>(Z)V

    invoke-virtual {p0, p1}, LIi/D0;->g0(LIi/y0;)V

    invoke-direct {p0}, LIi/z0;->N0()Z

    move-result p1

    iput-boolean p1, p0, LIi/z0;->c:Z

    return-void
.end method

.method private final N0()Z
    .locals 4

    invoke-virtual {p0}, LIi/D0;->X()LIi/u;

    move-result-object v0

    instance-of v1, v0, LIi/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LIi/v;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, LIi/D0;->R()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, LIi/D0;->X()LIi/u;

    move-result-object v0

    instance-of v3, v0, LIi/v;

    if-eqz v3, :cond_3

    check-cast v0, LIi/v;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public R()Z
    .locals 1

    iget-boolean v0, p0, LIi/z0;->c:Z

    return v0
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
