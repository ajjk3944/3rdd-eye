.class final Lcom/google/gson/internal/bind/i$e;
.super Lcom/google/gson/internal/bind/i$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final b:Lt5/j;


# direct methods
.method constructor <init>(Lt5/j;Lcom/google/gson/internal/bind/i$f;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/internal/bind/i$c;-><init>(Lcom/google/gson/internal/bind/i$f;)V

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$e;->b:Lt5/j;

    return-void
.end method


# virtual methods
.method e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/i$e;->b:Lt5/j;

    invoke-interface {v0}, Lt5/j;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method g(Ljava/lang/Object;Lw5/a;Lcom/google/gson/internal/bind/i$d;)V
    .locals 0

    invoke-virtual {p3, p2, p1}, Lcom/google/gson/internal/bind/i$d;->b(Lw5/a;Ljava/lang/Object;)V

    return-void
.end method
