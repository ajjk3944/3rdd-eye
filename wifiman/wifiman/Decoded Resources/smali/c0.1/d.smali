.class final Lc0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/m;
.implements LT/S0;


# instance fields
.field private a:Lc0/k;

.field private b:Lc0/h;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Object;

.field private e:[Ljava/lang/Object;

.field private f:Lc0/h$a;

.field private final g:Lmh/a;


# direct methods
.method public constructor <init>(Lc0/k;Lc0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/d;->a:Lc0/k;

    iput-object p2, p0, Lc0/d;->b:Lc0/h;

    iput-object p3, p0, Lc0/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lc0/d;->e:[Ljava/lang/Object;

    new-instance p1, Lc0/d$a;

    invoke-direct {p1, p0}, Lc0/d$a;-><init>(Lc0/d;)V

    iput-object p1, p0, Lc0/d;->g:Lmh/a;

    return-void
.end method

.method public static final synthetic e(Lc0/d;)Lc0/k;
    .locals 0

    iget-object p0, p0, Lc0/d;->a:Lc0/k;

    return-object p0
.end method

.method public static final synthetic f(Lc0/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lc0/d;->d:Ljava/lang/Object;

    return-object p0
.end method

.method private final h()V
    .locals 3

    iget-object v0, p0, Lc0/d;->b:Lc0/h;

    iget-object v1, p0, Lc0/d;->f:Lc0/h$a;

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc0/d;->g:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lc0/c;->a(Lc0/h;Ljava/lang/Object;)V

    iget-object v1, p0, Lc0/d;->c:Ljava/lang/String;

    iget-object v2, p0, Lc0/d;->g:Lmh/a;

    invoke-interface {v0, v1, v2}, Lc0/h;->e(Ljava/lang/String;Lmh/a;)Lc0/h$a;

    move-result-object v0

    iput-object v0, p0, Lc0/d;->f:Lc0/h$a;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "entry("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/d;->f:Lc0/h$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") is not null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lc0/d;->b:Lc0/h;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lc0/h;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lc0/d;->f:Lc0/h$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc0/h$a;->a()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lc0/d;->f:Lc0/h$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc0/h$a;->a()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    invoke-direct {p0}, Lc0/d;->h()V

    return-void
.end method

.method public final g([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc0/d;->e:[Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc0/d;->d:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final i(Lc0/k;Lc0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc0/d;->b:Lc0/h;

    const/4 v1, 0x1

    if-eq v0, p2, :cond_0

    iput-object p2, p0, Lc0/d;->b:Lc0/h;

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lc0/d;->c:Ljava/lang/String;

    invoke-static {v0, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p3, p0, Lc0/d;->c:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    iput-object p1, p0, Lc0/d;->a:Lc0/k;

    iput-object p4, p0, Lc0/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lc0/d;->e:[Ljava/lang/Object;

    iget-object p1, p0, Lc0/d;->f:Lc0/h$a;

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lc0/h$a;->a()V

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lc0/d;->f:Lc0/h$a;

    invoke-direct {p0}, Lc0/d;->h()V

    :cond_3
    return-void
.end method
