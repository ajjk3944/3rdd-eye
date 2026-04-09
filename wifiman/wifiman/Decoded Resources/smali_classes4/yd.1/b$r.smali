.class public final Lyd/b$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V
    .locals 0

    iput-object p1, p0, Lyd/b$r;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    :try_start_0
    iget-object v0, v1, Lyd/b$r;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v3, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ui/wifiman/model/speedtest/result/b;

    iget-object v0, v1, Lyd/b$r;->a:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    instance-of v3, v0, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    goto :goto_1

    :cond_1
    instance-of v3, v0, Lqd/d;

    if-eqz v3, :cond_2

    check-cast v0, Lqd/d;

    invoke-virtual {v0}, Lqd/d;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    goto :goto_1

    :cond_2
    instance-of v3, v0, LCd/n;

    if-eqz v3, :cond_3

    check-cast v0, LCd/n;

    invoke-virtual {v0}, LCd/n;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    goto :goto_1

    :cond_3
    instance-of v3, v0, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/advanced/b;->v()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    :goto_1
    instance-of v3, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v3, :cond_4

    move-object v4, v0

    check-cast v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwd/f$b;

    invoke-virtual {v0}, Lwd/f$b;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lwd/f$b;->b()Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0xf9

    const/16 v17, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, Lcom/ui/wifiman/model/speedtest/result/b;->b(Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object v0

    invoke-interface {v2, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    const-string v0, "result not yet reported"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "unknown speedtest type"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const-string v0, "result must be already prepared"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-interface {v2, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
