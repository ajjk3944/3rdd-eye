.class public Lc3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/t;


# static fields
.field private static volatile e:Lc3/v;


# instance fields
.field private final a:Lm3/a;

.field private final b:Lm3/a;

.field private final c:Li3/e;

.field private final d:Lj3/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lm3/a;Lm3/a;Li3/e;Lj3/r;Lj3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/u;->a:Lm3/a;

    iput-object p2, p0, Lc3/u;->b:Lm3/a;

    iput-object p3, p0, Lc3/u;->c:Li3/e;

    iput-object p4, p0, Lc3/u;->d:Lj3/r;

    invoke-virtual {p5}, Lj3/v;->c()V

    return-void
.end method

.method private b(Lc3/o;)Lc3/i;
    .locals 4

    invoke-static {}, Lc3/i;->a()Lc3/i$a;

    move-result-object v0

    iget-object v1, p0, Lc3/u;->a:Lm3/a;

    invoke-interface {v1}, Lm3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc3/i$a;->i(J)Lc3/i$a;

    move-result-object v0

    iget-object v1, p0, Lc3/u;->b:Lm3/a;

    invoke-interface {v1}, Lm3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lc3/i$a;->o(J)Lc3/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lc3/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc3/i$a;->n(Ljava/lang/String;)Lc3/i$a;

    move-result-object v0

    new-instance v1, Lc3/h;

    invoke-virtual {p1}, Lc3/o;->b()La3/b;

    move-result-object v2

    invoke-virtual {p1}, Lc3/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lc3/h;-><init>(La3/b;[B)V

    invoke-virtual {v0, v1}, Lc3/i$a;->h(Lc3/h;)Lc3/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lc3/o;->c()La3/c;

    move-result-object v1

    invoke-virtual {v1}, La3/c;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc3/i$a;->g(Ljava/lang/Integer;)Lc3/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lc3/o;->c()La3/c;

    move-result-object v1

    invoke-virtual {v1}, La3/c;->e()La3/f;

    invoke-virtual {p1}, Lc3/o;->c()La3/c;

    move-result-object p1

    invoke-virtual {p1}, La3/c;->b()La3/d;

    invoke-virtual {v0}, Lc3/i$a;->d()Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()Lc3/u;
    .locals 2

    sget-object v0, Lc3/u;->e:Lc3/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc3/v;->g()Lc3/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(Lc3/f;)Ljava/util/Set;
    .locals 1

    instance-of v0, p0, Lc3/g;

    if-eqz v0, :cond_0

    check-cast p0, Lc3/g;

    invoke-interface {p0}, Lc3/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, La3/b;->b(Ljava/lang/String;)La3/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lc3/u;->e:Lc3/v;

    if-nez v0, :cond_1

    const-class v0, Lc3/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc3/u;->e:Lc3/v;

    if-nez v1, :cond_0

    invoke-static {}, Lc3/e;->a()Lc3/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lc3/v$a;->b(Landroid/content/Context;)Lc3/v$a;

    move-result-object p0

    invoke-interface {p0}, Lc3/v$a;->a()Lc3/v;

    move-result-object p0

    sput-object p0, Lc3/u;->e:Lc3/v;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Lc3/o;La3/j;)V
    .locals 3

    iget-object v0, p0, Lc3/u;->c:Li3/e;

    invoke-virtual {p1}, Lc3/o;->f()Lc3/p;

    move-result-object v1

    invoke-virtual {p1}, Lc3/o;->c()La3/c;

    move-result-object v2

    invoke-virtual {v2}, La3/c;->d()La3/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc3/p;->f(La3/e;)Lc3/p;

    move-result-object v1

    invoke-direct {p0, p1}, Lc3/u;->b(Lc3/o;)Lc3/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Li3/e;->a(Lc3/p;Lc3/i;La3/j;)V

    return-void
.end method

.method public e()Lj3/r;
    .locals 1

    iget-object v0, p0, Lc3/u;->d:Lj3/r;

    return-object v0
.end method

.method public g(Lc3/f;)La3/i;
    .locals 4

    new-instance v0, Lc3/q;

    invoke-static {p1}, Lc3/u;->d(Lc3/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lc3/p;->a()Lc3/p$a;

    move-result-object v2

    invoke-interface {p1}, Lc3/f;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lc3/p$a;->b(Ljava/lang/String;)Lc3/p$a;

    move-result-object v2

    invoke-interface {p1}, Lc3/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lc3/p$a;->c([B)Lc3/p$a;

    move-result-object p1

    invoke-virtual {p1}, Lc3/p$a;->a()Lc3/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lc3/q;-><init>(Ljava/util/Set;Lc3/p;Lc3/t;)V

    return-object v0
.end method
