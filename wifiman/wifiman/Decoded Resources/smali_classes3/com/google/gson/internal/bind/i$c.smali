.class public abstract Lcom/google/gson/internal/bind/i$c;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/google/gson/internal/bind/i$f;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/bind/i$f;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$c;->a:Lcom/google/gson/internal/bind/i$f;

    return-void
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/google/gson/internal/bind/i$c;->e()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/internal/bind/i$c;->a:Lcom/google/gson/internal/bind/i$f;

    iget-object v1, v1, Lcom/google/gson/internal/bind/i$f;->a:Ljava/util/Map;

    :try_start_0
    invoke-virtual {p1}, Lw5/a;->h()V

    :goto_0
    invoke-virtual {p1}, Lw5/a;->T()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lw5/a;->p0()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/internal/bind/i$d;

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lw5/a;->F0()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v0, p1, v2}, Lcom/google/gson/internal/bind/i$c;->g(Ljava/lang/Object;Lw5/a;Lcom/google/gson/internal/bind/i$d;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lw5/a;->y()V

    invoke-virtual {p0, v0}, Lcom/google/gson/internal/bind/i$c;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_1
    invoke-static {p1}, Lv5/a;->e(Ljava/lang/IllegalAccessException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :goto_2
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lw5/c;->j()Lw5/c;

    :try_start_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/i$c;->a:Lcom/google/gson/internal/bind/i$f;

    iget-object v0, v0, Lcom/google/gson/internal/bind/i$f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/internal/bind/i$d;

    invoke-virtual {v1, p1, p2}, Lcom/google/gson/internal/bind/i$d;->c(Lw5/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lw5/c;->v()Lw5/c;

    return-void

    :goto_1
    invoke-static {p1}, Lv5/a;->e(Ljava/lang/IllegalAccessException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method abstract e()Ljava/lang/Object;
.end method

.method abstract f(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method abstract g(Ljava/lang/Object;Lw5/a;Lcom/google/gson/internal/bind/i$d;)V
.end method
