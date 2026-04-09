.class LI6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/j;->N0(LO6/i;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LO6/i;

.field final synthetic b:LI6/j;


# direct methods
.method constructor <init>(LI6/j;LO6/i;)V
    .locals 0

    iput-object p1, p0, LI6/j$a;->b:LI6/j;

    iput-object p2, p0, LI6/j$a;->a:LO6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LI6/j$a;->b:LI6/j;

    iget-object v2, p0, LI6/j$a;->a:LO6/i;

    invoke-virtual {v1, p1, v2}, LI6/j;->b(Lgg/t;LO6/i;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-interface {p1, v1}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    const-string/jumbo p1, "QueueOperation terminated with an unexpected exception"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, LI6/q;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :goto_1
    iget-object v2, p0, LI6/j$a;->b:LI6/j;

    invoke-virtual {v2, v1}, LI6/j;->c(Landroid/os/DeadObjectException;)Lcom/polidea/rxandroidble3/exceptions/BleException;

    move-result-object v2

    invoke-interface {p1, v2}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    const-string/jumbo p1, "QueueOperation terminated with a DeadObjectException"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, LI6/q;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
