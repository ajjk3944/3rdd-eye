.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 19

    move-object/from16 v5, p1

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p0

    iget-object v0, v15, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    move-object v6, v1

    invoke-direct {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    const v17, 0xffcf

    const/16 v18, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    invoke-static/range {v0 .. v18}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g$b;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$f;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object p1

    return-object p1
.end method
