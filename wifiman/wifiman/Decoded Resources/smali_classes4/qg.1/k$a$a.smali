.class final Lqg/k$a$a;
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
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lqg/k$a;


# direct methods
.method constructor <init>(Lqg/k$a;)V
    .locals 0

    iput-object p1, p0, Lqg/k$a$a;->a:Lqg/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lqg/k$a$a;->a:Lqg/k$a;

    iget-object v0, v0, Lqg/k$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/k$a$a;->a:Lqg/k$a;

    iget-object v0, v0, Lqg/k$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lqg/k$a$a;->a:Lqg/k$a;

    iget-object v1, v1, Lqg/k$a;->d:Lgg/y$c;

    invoke-interface {v1}, Lhg/c;->dispose()V

    throw v0
.end method
