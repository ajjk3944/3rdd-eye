.class final Lcom/google/gson/internal/bind/b$a;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/gson/p;

.field private final b:Lt5/j;


# direct methods
.method public constructor <init>(Lcom/google/gson/e;Ljava/lang/reflect/Type;Lcom/google/gson/p;Lt5/j;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    new-instance v0, Lcom/google/gson/internal/bind/k;

    invoke-direct {v0, p1, p3, p2}, Lcom/google/gson/internal/bind/k;-><init>(Lcom/google/gson/e;Lcom/google/gson/p;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/gson/internal/bind/b$a;->a:Lcom/google/gson/p;

    iput-object p4, p0, Lcom/google/gson/internal/bind/b$a;->b:Lt5/j;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/b$a;->e(Lw5/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/b$a;->f(Lw5/c;Ljava/util/Collection;)V

    return-void
.end method

.method public e(Lw5/a;)Ljava/util/Collection;
    .locals 2

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lw5/b;->NULL:Lw5/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/b$a;->b:Lt5/j;

    invoke-interface {v0}, Lt5/j;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lw5/a;->g()V

    :goto_0
    invoke-virtual {p1}, Lw5/a;->T()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/gson/internal/bind/b$a;->a:Lcom/google/gson/p;

    invoke-virtual {v1, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lw5/a;->v()V

    return-object v0
.end method

.method public f(Lw5/c;Ljava/util/Collection;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lw5/c;->h()Lw5/c;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/internal/bind/b$a;->a:Lcom/google/gson/p;

    invoke-virtual {v1, p1, v0}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lw5/c;->s()Lw5/c;

    return-void
.end method
