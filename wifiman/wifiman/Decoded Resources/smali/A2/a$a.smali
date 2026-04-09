.class LA2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LA2/a;


# direct methods
.method constructor <init>(LA2/a;)V
    .locals 0

    iput-object p1, p0, LA2/a$a;->a:LA2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, LA2/a$a;->a:LA2/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LA2/a$a;->a:LA2/a;

    invoke-static {v1}, LA2/a;->a(LA2/a;)Ljava/io/Writer;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LA2/a$a;->a:LA2/a;

    invoke-static {v1}, LA2/a;->h(LA2/a;)V

    iget-object v1, p0, LA2/a$a;->a:LA2/a;

    invoke-static {v1}, LA2/a;->s(LA2/a;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LA2/a$a;->a:LA2/a;

    invoke-static {v1}, LA2/a;->v(LA2/a;)V

    iget-object v1, p0, LA2/a$a;->a:LA2/a;

    const/4 v3, 0x0

    invoke-static {v1, v3}, LA2/a;->y(LA2/a;I)I

    :cond_1
    monitor-exit v0

    return-object v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA2/a$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
