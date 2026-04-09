.class final Lqg/i0$a;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final b:Ljava/lang/Object;

.field final c:Lkg/n;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lqg/i0$a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lqg/i0$a;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/i0$a;->c:Lkg/n;

    iget-object v1, p0, Lqg/i0$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null Publisher"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, LDj/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    instance-of v1, v0, Lkg/q;

    if-eqz v1, :cond_1

    :try_start_1
    check-cast v0, Lkg/q;

    invoke-interface {v0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    invoke-static {p1}, Lyg/d;->complete(LDj/b;)V

    return-void

    :cond_0
    new-instance v1, Lyg/e;

    invoke-direct {v1, p1, v0}, Lyg/e;-><init>(LDj/b;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, LDj/b;->j(LDj/c;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, LDj/a;->b(LDj/b;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method
