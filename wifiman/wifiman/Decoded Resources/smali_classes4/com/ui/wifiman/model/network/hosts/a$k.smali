.class public final Lcom/ui/wifiman/model/network/hosts/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/network/hosts/a;->b(JI)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/network/hosts/a;

.field final synthetic b:J

.field final synthetic c:I


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/network/hosts/a;JI)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->a:Lcom/ui/wifiman/model/network/hosts/a;

    iput-wide p2, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->b:J

    iput p4, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->a:Lcom/ui/wifiman/model/network/hosts/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/network/hosts/a;->g(Lcom/ui/wifiman/model/network/hosts/a;)LRb/a;

    move-result-object v1

    iget-wide v2, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->b:J

    iget v4, p0, Lcom/ui/wifiman/model/network/hosts/a$k;->c:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-interface/range {v1 .. v6}, LRb/a;->d(JIJ)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
