.class public abstract LY6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY6/h$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LY6/h;
    .locals 1

    new-instance v0, LY6/h$c;

    invoke-direct {v0, p0, p0}, LY6/h$c;-><init>(LY6/h;LY6/h;)V

    return-object v0
.end method

.method public abstract b(LY6/k;)Ljava/lang/Object;
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-virtual {v0, p1}, Lej/e;->S0(Ljava/lang/String;)Lej/e;

    move-result-object p1

    invoke-static {p1}, LY6/k;->b0(Lej/g;)LY6/k;

    move-result-object p1

    invoke-virtual {p0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LY6/h;->d()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, LY6/k;->d0()LY6/k$c;

    move-result-object p1

    sget-object v1, LY6/k$c;->END_DOCUMENT:LY6/k$c;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    const-string/jumbo v0, "JSON document was not fully consumed."

    invoke-direct {p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()LY6/h;
    .locals 1

    new-instance v0, LY6/h$b;

    invoke-direct {v0, p0, p0}, LY6/h$b;-><init>(LY6/h;LY6/h;)V

    return-object v0
.end method

.method public final f()LY6/h;
    .locals 1

    instance-of v0, p0, La7/a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, La7/a;

    invoke-direct {v0, p0}, La7/a;-><init>(LY6/h;)V

    return-object v0
.end method

.method public final g()LY6/h;
    .locals 1

    instance-of v0, p0, La7/b;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, La7/b;

    invoke-direct {v0, p0}, La7/b;-><init>(LY6/h;)V

    return-object v0
.end method

.method public final h()LY6/h;
    .locals 1

    new-instance v0, LY6/h$a;

    invoke-direct {v0, p0, p0}, LY6/h$a;-><init>(LY6/h;LY6/h;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0, p1}, LY6/h;->k(Lej/f;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lej/e;->z0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract j(LY6/o;Ljava/lang/Object;)V
.end method

.method public final k(Lej/f;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, LY6/o;->S(Lej/f;)LY6/o;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    return-void
.end method
