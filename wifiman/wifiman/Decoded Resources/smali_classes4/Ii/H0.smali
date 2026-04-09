.class public abstract LIi/H0;
.super LIi/J;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/J;-><init>()V

    return-void
.end method


# virtual methods
.method public n0(ILjava/lang/String;)LIi/J;
    .locals 0

    invoke-static {p1}, LNi/k;->a(I)V

    invoke-static {p0, p2}, LNi/k;->b(LIi/J;Ljava/lang/String;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public abstract p0()LIi/H0;
.end method

.method protected final q0()Ljava/lang/String;
    .locals 2

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    return-object v0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, LIi/H0;->p0()LIi/H0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    return-object v0

    :cond_1
    return-object v1
.end method
