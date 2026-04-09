.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "err"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v2, :cond_5

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v6, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xfffb

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    goto/16 :goto_0

    :cond_0
    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->m()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v2, :cond_1

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v8, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xffef

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    goto/16 :goto_0

    :cond_1
    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v2, :cond_2

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v9, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xffdf

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    goto/16 :goto_0

    :cond_2
    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->q()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v2, :cond_3

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v10, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xffbf

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    goto :goto_0

    :cond_3
    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/advanced/b;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a;

    if-nez v2, :cond_4

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v11, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xff7f

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v11, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xff7f

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    goto :goto_1

    :cond_5
    instance-of v2, v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;

    if-eqz v2, :cond_6

    iget-object v2, v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/advanced/b;

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    move-object v6, v2

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    const v20, 0xfffb

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v21}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v1

    invoke-static {v1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    goto :goto_1

    :cond_6
    invoke-static/range {p1 .. p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
