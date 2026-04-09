.class public final LG8/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/h$a;->a(Ll9/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V
    .locals 0

    iput-object p1, p0, LG8/h$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LG8/h$a$a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
