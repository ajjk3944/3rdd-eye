.class final Lcom/ui/wifiman/model/speedtest/internet/b$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->u(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$z;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/internet/f;
    .locals 16

    const-string v0, "token"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/wifiman/model/speedtest/internet/b$z;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    const/16 v14, 0xffd

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Lcom/ui/wifiman/model/speedtest/internet/f;->k(Lcom/ui/wifiman/model/speedtest/internet/f;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/internet/f;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$z;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/internet/f;

    move-result-object p1

    return-object p1
.end method
