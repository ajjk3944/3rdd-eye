.class public abstract Lcom/google/gson/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/gson/p;
    .locals 1

    new-instance v0, Lcom/google/gson/p$a;

    invoke-direct {v0, p0}, Lcom/google/gson/p$a;-><init>(Lcom/google/gson/p;)V

    return-object v0
.end method

.method public abstract b(Lw5/a;)Ljava/lang/Object;
.end method

.method public final c(Ljava/lang/Object;)Lcom/google/gson/g;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/google/gson/internal/bind/e;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/e;-><init>()V

    invoke-virtual {p0, v0, p1}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/gson/internal/bind/e;->A0()Lcom/google/gson/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/gson/JsonIOException;

    invoke-direct {v0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract d(Lw5/c;Ljava/lang/Object;)V
.end method
