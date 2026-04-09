.class final Lqg/k$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/Throwable;

.field final synthetic b:Lqg/k$a;


# direct methods
.method constructor <init>(Lqg/k$a;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lqg/k$a$b;->b:Lqg/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lqg/k$a$b;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/k$a$b;->b:Lqg/k$a;

    iget-object v0, v0, Lqg/k$a;->a:LDj/b;

    iget-object v1, p0, Lqg/k$a$b;->a:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, LDj/b;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/k$a$b;->b:Lqg/k$a;

    iget-object v0, v0, Lqg/k$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lqg/k$a$b;->b:Lqg/k$a;

    iget-object v1, v1, Lqg/k$a;->d:Lgg/y$c;

    invoke-interface {v1}, Lhg/c;->dispose()V

    throw v0
.end method
