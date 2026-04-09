.class public final LJc/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJc/c;->m(Linet/ipaddr/g;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Linet/ipaddr/g;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, LJc/c$b;->a:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 9

    :try_start_0
    iget-object v0, p0, LJc/c$b;->a:Linet/ipaddr/g;

    invoke-virtual {v0}, Linet/ipaddr/g;->m1()Linet/ipaddr/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Linet/ipaddr/e;->g()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v0, p0, LJc/c$b;->a:Linet/ipaddr/g;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LJc/a$b;

    iget-object v3, p0, LJc/c$b;->a:Linet/ipaddr/g;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide v7, 0x7fffffffffffffffL

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LJc/a$b;-><init>(Linet/ipaddr/g;Ljava/lang/String;JJ)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Ll9/a;

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
