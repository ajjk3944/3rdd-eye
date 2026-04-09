.class public final LCc/p$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p$l;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/p;

.field final synthetic b:Lmh/l;

.field final synthetic c:LCc/l;

.field final synthetic d:Lh9/a;


# direct methods
.method public constructor <init>(LCc/p;Lmh/l;LCc/l;Lh9/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$l$a;->a:LCc/p;

    iput-object p2, p0, LCc/p$l$a;->b:Lmh/l;

    iput-object p3, p0, LCc/p$l$a;->c:LCc/l;

    iput-object p4, p0, LCc/p$l$a;->d:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, LCc/p$l$a;->a:LCc/p;

    invoke-static {v0}, LCc/p;->g(LCc/p;)LOb/a;

    move-result-object v0

    iget-object v1, p0, LCc/p$l$a;->a:LCc/p;

    iget-object v2, p0, LCc/p$l$a;->b:Lmh/l;

    iget-object v3, p0, LCc/p$l$a;->c:LCc/l;

    invoke-interface {v2, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCc/l;

    invoke-static {v1, v2}, LCc/p;->j(LCc/p;LCc/l;)LOb/c;

    move-result-object v1

    invoke-interface {v0, v1}, LOb/a;->b(LOb/c;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const-string v0, "Failed to update device info"

    new-instance v1, Ljava/lang/IllegalStateException;

    iget-object v2, p0, LCc/p$l$a;->d:Lh9/a;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to update device info "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
