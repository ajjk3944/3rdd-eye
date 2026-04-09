.class public final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->f()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$d;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b$d;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    const-string v1, "sessionCookies"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->a(Ljava/lang/String;Ljava/lang/String;)V

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
