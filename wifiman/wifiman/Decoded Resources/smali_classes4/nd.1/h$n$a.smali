.class public final Lnd/h$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h$n;->a(LWb/j;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LWb/j;

.field final synthetic b:Lnd/h;

.field final synthetic c:Lnd/f;


# direct methods
.method public constructor <init>(LWb/j;Lnd/h;Lnd/f;)V
    .locals 0

    iput-object p1, p0, Lnd/h$n$a;->a:LWb/j;

    iput-object p2, p0, Lnd/h$n$a;->b:Lnd/h;

    iput-object p3, p0, Lnd/h$n$a;->c:Lnd/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lnd/h$n$a;->a:LWb/j;

    iget-object v1, p0, Lnd/h$n$a;->b:Lnd/h;

    iget-object v2, p0, Lnd/h$n$a;->c:Lnd/f;

    invoke-static {v1, v2}, Lnd/h;->m(Lnd/h;Lnd/f;)LWb/f;

    move-result-object v1

    invoke-interface {v0, v1}, LWb/j;->c(LWb/f;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnd/h$n$a;->c:Lnd/f;

    invoke-virtual {v0}, Lnd/f;->j()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Signal mapper place "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " created"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "failed to created a place"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
