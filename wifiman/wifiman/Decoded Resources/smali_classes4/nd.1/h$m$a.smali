.class public final Lnd/h$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h$m;->a(LWb/j;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LWb/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;LWb/j;)V
    .locals 0

    iput-object p1, p0, Lnd/h$m$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lnd/h$m$a;->b:LWb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 7

    :try_start_0
    new-instance v0, LWb/g;

    iget-object v1, p0, Lnd/h$m$a;->a:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, LWb/g;-><init>(Ljava/lang/String;J)V

    iget-object v1, p0, Lnd/h$m$a;->b:LWb/j;

    invoke-interface {v1, v0}, LWb/j;->b(LWb/g;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ge v1, v2, :cond_1

    iget-object v1, p0, Lnd/h$m$a;->b:LWb/j;

    invoke-interface {v1, v0}, LWb/j;->e(LWb/g;)J

    move-result-wide v0

    const-wide/16 v5, -0x1

    cmp-long v0, v0, v5

    if-eqz v0, :cond_0

    const-string v0, "Signal mapper place name created"

    invoke-static {v0, v4, v3, v4}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "failed to created a place name"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v0, "Signal mapper place name timestamp updated"

    invoke-static {v0, v4, v3, v4}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

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
