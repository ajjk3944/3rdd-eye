.class public abstract LBh/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBh/u;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "visibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LBh/u;->b()LBh/w0;

    move-result-object v0

    invoke-virtual {p1}, LBh/u;->b()LBh/w0;

    move-result-object p1

    invoke-virtual {v0, p1}, LBh/w0;->a(LBh/w0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public abstract b()LBh/w0;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, LBh/u;->b()LBh/w0;

    move-result-object v0

    invoke-virtual {v0}, LBh/w0;->c()Z

    move-result v0

    return v0
.end method

.method public abstract e(Lji/g;LBh/q;LBh/m;Z)Z
.end method

.method public abstract f()LBh/u;
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LBh/u;->b()LBh/w0;

    move-result-object v0

    invoke-virtual {v0}, LBh/w0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
