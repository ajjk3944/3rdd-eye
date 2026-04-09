.class public final Lq7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/a;->a(Ls7/g;JLr7/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls7/g;

.field final synthetic b:Lq7/a;

.field final synthetic c:Lr7/a;

.field final synthetic d:J


# direct methods
.method public constructor <init>(Ls7/g;Lq7/a;Lr7/a;J)V
    .locals 0

    iput-object p1, p0, Lq7/a$b;->a:Ls7/g;

    iput-object p2, p0, Lq7/a$b;->b:Lq7/a;

    iput-object p3, p0, Lq7/a$b;->c:Lr7/a;

    iput-wide p4, p0, Lq7/a$b;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq7/a$b;->a:Ls7/g;

    invoke-virtual {v0}, Ls7/g;->c()Ls7/c;

    move-result-object v0

    invoke-virtual {v0}, Ls7/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq7/a$b;->b:Lq7/a;

    invoke-static {v0}, Lq7/a;->e(Lq7/a;)Lv7/e;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq7/a$b;->b:Lq7/a;

    invoke-static {v1}, Lq7/a;->e(Lq7/a;)Lv7/e;

    move-result-object v1

    iget-wide v2, p0, Lq7/a$b;->d:J

    iget-object v4, p0, Lq7/a$b;->c:Lr7/a;

    invoke-interface {v1, v2, v3, v4}, Lv7/e;->b(JLjava/lang/Object;)V

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lq7/a$b;->b:Lq7/a;

    invoke-static {v0}, Lq7/a;->g(Lq7/a;)LFg/c;

    move-result-object v0

    new-instance v1, Lq7/a$a$b;

    iget-object v2, p0, Lq7/a$b;->c:Lr7/a;

    invoke-direct {v1, v2}, Lq7/a$a$b;-><init>(Lr7/a;)V

    invoke-virtual {v0, v1}, LFg/c;->k2(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
