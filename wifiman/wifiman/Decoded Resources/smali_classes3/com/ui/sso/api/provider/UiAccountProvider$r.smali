.class final Lcom/ui/sso/api/provider/UiAccountProvider$r;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/UiAccountProvider;->onCreate()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/provider/UiAccountProvider;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/UiAccountProvider;J)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/UiAccountProvider$r;->a:Lcom/ui/sso/api/provider/UiAccountProvider;

    iput-wide p2, p0, Lcom/ui/sso/api/provider/UiAccountProvider$r;->b:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/sso/api/provider/UiAccountProvider$r;->a:Lcom/ui/sso/api/provider/UiAccountProvider;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/ui/sso/api/provider/UiAccountProvider$r;->b:J

    sub-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "UiAccountProvider \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' created in "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/UiAccountProvider$r;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
