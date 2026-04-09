.class public final Lqg/i;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/i$f;,
        Lqg/i$c;,
        Lqg/i$e;,
        Lqg/i$d;,
        Lqg/i$h;,
        Lqg/i$g;,
        Lqg/i$b;,
        Lqg/i$i;
    }
.end annotation


# instance fields
.field final b:Lgg/k;

.field final c:Lgg/a;


# direct methods
.method public constructor <init>(Lgg/k;Lgg/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/i;->b:Lgg/k;

    iput-object p2, p0, Lqg/i;->c:Lgg/a;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 2

    sget-object v0, Lqg/i$a;->a:[I

    iget-object v1, p0, Lqg/i;->c:Lgg/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v0, Lqg/i$c;

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    invoke-direct {v0, p1, v1}, Lqg/i$c;-><init>(LDj/b;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lqg/i$f;

    invoke-direct {v0, p1}, Lqg/i$f;-><init>(LDj/b;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lqg/i$d;

    invoke-direct {v0, p1}, Lqg/i$d;-><init>(LDj/b;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lqg/i$e;

    invoke-direct {v0, p1}, Lqg/i$e;-><init>(LDj/b;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lqg/i$g;

    invoke-direct {v0, p1}, Lqg/i$g;-><init>(LDj/b;)V

    :goto_0
    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    :try_start_0
    iget-object p1, p0, Lqg/i;->b:Lgg/k;

    invoke-interface {p1, v0}, Lgg/k;->a(Lgg/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lqg/i$b;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
