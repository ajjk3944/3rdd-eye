.class public final LKc/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKc/e;->s(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LKc/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;LKc/e;)V
    .locals 0

    iput-object p1, p0, LKc/e$d;->a:Ljava/lang/String;

    iput-object p2, p0, LKc/e$d;->b:LKc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, LKc/e$d;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iget-object v1, p0, LKc/e$d;->b:LKc/e;

    invoke-static {v1}, LKc/e;->i(LKc/e;)LKc/a$a;

    move-result-object v1

    invoke-virtual {v1}, LKc/a$a;->b()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/net/InetAddress;->isReachable(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ll9/a;

    new-instance v2, LKc/a$b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v2, v0, v3, v4}, LKc/a$b;-><init>(Linet/ipaddr/g;J)V

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
