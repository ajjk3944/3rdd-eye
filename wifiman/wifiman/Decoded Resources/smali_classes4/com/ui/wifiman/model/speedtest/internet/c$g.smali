.class public final Lcom/ui/wifiman/model/speedtest/internet/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;->s()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$g;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$g;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/c;->m(Lcom/ui/wifiman/model/speedtest/internet/c;)Ltd/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ltd/d;->b(Ljava/lang/String;)LIa/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
