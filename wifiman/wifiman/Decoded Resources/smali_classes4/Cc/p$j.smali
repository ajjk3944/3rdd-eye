.class public final LCc/p$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;-><init>(LOb/a;LDc/e;Lle/g;Lwc/h;Lcom/ui/wifiman/model/bluetooth/le/a;Lmc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmc/a;


# direct methods
.method public constructor <init>(Lmc/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$j;->a:Lmc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 7

    :try_start_0
    new-instance v6, LCc/j;

    iget-object v0, p0, LCc/p$j;->a:Lmc/a;

    invoke-interface {v0}, Lmc/a;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, LCc/p$j;->a:Lmc/a;

    invoke-interface {v0}, Lmc/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, LCc/p$j;->a:Lmc/a;

    invoke-interface {v0}, Lmc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v3

    iget-object v0, p0, LCc/p$j;->a:Lmc/a;

    invoke-interface {v0}, Lmc/a;->d()LCc/b;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LCc/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;)V

    invoke-interface {p1, v6}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
