.class public final Lcom/google/gson/internal/bind/h;
.super Lcom/google/gson/p;
.source "SourceFile"


# static fields
.field private static final c:Lcom/google/gson/q;


# instance fields
.field private final a:Lcom/google/gson/e;

.field private final b:Lcom/google/gson/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/gson/n;->DOUBLE:Lcom/google/gson/n;

    invoke-static {v0}, Lcom/google/gson/internal/bind/h;->f(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/h;->c:Lcom/google/gson/q;

    return-void
.end method

.method private constructor <init>(Lcom/google/gson/e;Lcom/google/gson/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/gson/internal/bind/h;->a:Lcom/google/gson/e;

    .line 4
    iput-object p2, p0, Lcom/google/gson/internal/bind/h;->b:Lcom/google/gson/o;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/gson/e;Lcom/google/gson/o;Lcom/google/gson/internal/bind/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/gson/internal/bind/h;-><init>(Lcom/google/gson/e;Lcom/google/gson/o;)V

    return-void
.end method

.method public static e(Lcom/google/gson/o;)Lcom/google/gson/q;
    .locals 1

    sget-object v0, Lcom/google/gson/n;->DOUBLE:Lcom/google/gson/n;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/google/gson/internal/bind/h;->c:Lcom/google/gson/q;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/gson/internal/bind/h;->f(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lcom/google/gson/o;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/h$a;

    invoke-direct {v0, p0}, Lcom/google/gson/internal/bind/h$a;-><init>(Lcom/google/gson/o;)V

    return-object v0
.end method

.method private g(Lw5/a;Lw5/b;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/google/gson/internal/bind/h$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unexpected token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lw5/a;->f0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p2, p0, Lcom/google/gson/internal/bind/h;->b:Lcom/google/gson/o;

    invoke-interface {p2, p1}, Lcom/google/gson/o;->readNumber(Lw5/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private h(Lw5/a;Lw5/b;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/h$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lw5/a;->h()V

    new-instance p1, Lt5/h;

    invoke-direct {p1}, Lt5/h;-><init>()V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lw5/a;->g()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/bind/h;->h(Lw5/a;Lw5/b;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/google/gson/internal/bind/h;->g(Lw5/a;Lw5/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lw5/a;->T()Z

    move-result v2

    if-eqz v2, :cond_6

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lw5/a;->p0()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/google/gson/internal/bind/h;->h(Lw5/a;Lw5/b;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_4

    invoke-direct {p0, p1, v3}, Lcom/google/gson/internal/bind/h;->g(Lw5/a;Lw5/b;)Ljava/lang/Object;

    move-result-object v4

    :cond_4
    instance-of v3, v1, Ljava/util/List;

    if-eqz v3, :cond_5

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    if-eqz v5, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_0

    :cond_6
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lw5/a;->v()V

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lw5/a;->y()V

    :goto_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    return-object v1

    :cond_8
    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/h;->a:Lcom/google/gson/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/e;->m(Ljava/lang/Class;)Lcom/google/gson/p;

    move-result-object v0

    instance-of v1, v0, Lcom/google/gson/internal/bind/h;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lw5/c;->j()Lw5/c;

    invoke-virtual {p1}, Lw5/c;->v()Lw5/c;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    return-void
.end method
