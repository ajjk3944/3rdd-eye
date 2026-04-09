.class public abstract LF3/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)LF3/N;
    .locals 1

    new-instance v0, LF3/J;

    invoke-direct {v0}, LF3/J;-><init>()V

    invoke-virtual {v0, p0}, LF3/J;->d(Ljava/lang/String;)LF3/N;

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, LF3/N;->a(Z)LF3/N;

    invoke-virtual {v0, p0}, LF3/N;->b(I)LF3/N;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
