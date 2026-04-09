.class public final Lcom/ui/wifiman/model/speedtest/internet/b$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;-><init>(Lzd/a;Lyd/a;Lwd/f;LP7/a;Lvd/a;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;Ltd/d;Lud/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$A;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$A;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/b;->h(Lcom/ui/wifiman/model/speedtest/internet/b;)Ltd/d;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$A;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-static {v1}, Lcom/ui/wifiman/model/speedtest/internet/b;->j(Lcom/ui/wifiman/model/speedtest/internet/b;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ltd/d;->d(Ljava/lang/String;)LKa/f$a;

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
