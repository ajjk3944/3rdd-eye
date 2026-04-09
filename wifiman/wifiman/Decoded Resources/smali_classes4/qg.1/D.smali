.class public final Lqg/D;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/D$b;,
        Lqg/D$c;,
        Lqg/D$a;
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/D;->b:Ljava/lang/Iterable;

    return-void
.end method

.method public static h2(LDj/b;Ljava/util/Iterator;)V
    .locals 2

    :try_start_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-static {p0}, Lyg/d;->complete(LDj/b;)V

    return-void

    :cond_0
    instance-of v0, p0, LDg/a;

    if-eqz v0, :cond_1

    new-instance v0, Lqg/D$b;

    move-object v1, p0

    check-cast v1, LDg/a;

    invoke-direct {v0, v1, p1}, Lqg/D$b;-><init>(LDg/a;Ljava/util/Iterator;)V

    invoke-interface {p0, v0}, LDj/b;->j(LDj/c;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lqg/D$c;

    invoke-direct {v0, p0, p1}, Lqg/D$c;-><init>(LDj/b;Ljava/util/Iterator;)V

    invoke-interface {p0, v0}, LDj/b;->j(LDj/c;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1, p0}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqg/D;->b:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v0}, Lqg/D;->h2(LDj/b;Ljava/util/Iterator;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
