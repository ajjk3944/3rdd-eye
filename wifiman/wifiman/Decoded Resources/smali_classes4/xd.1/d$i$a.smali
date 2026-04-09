.class final Lxd/d$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d$i;->a(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/d$i$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lxd/d;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/internet/f;

.field final synthetic c:LCc/j;

.field final synthetic d:Lxd/c;


# direct methods
.method constructor <init>(Lxd/d;Lcom/ui/wifiman/model/speedtest/internet/f;LCc/j;Lxd/c;)V
    .locals 0

    iput-object p1, p0, Lxd/d$i$a;->a:Lxd/d;

    iput-object p2, p0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    iput-object p3, p0, Lxd/d$i$a;->c:LCc/j;

    iput-object p4, p0, Lxd/d$i$a;->d:Lxd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lle/i;)Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;
    .locals 0

    invoke-static {p0}, Lxd/d$i$a;->c(Lle/i;)Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lle/i;)Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;
    .locals 3

    const-string v0, "wifi"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v1

    invoke-virtual {v1}, LS8/e;->a()LS8/c;

    move-result-object v1

    sget-object v2, Lxd/d$i$a$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const-string v1, "g6"

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string v1, "g5"

    goto :goto_0

    :cond_2
    const-string v1, "g2"

    :goto_0
    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, LS8/l;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    :goto_1
    invoke-direct {v0, v1, p0}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc8/b;

    invoke-virtual {p0, p1}, Lxd/d$i$a;->b(Lc8/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lc8/b;)Lgg/D;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lxd/d$i$a;->a:Lxd/d;

    invoke-static {v1}, Lxd/d;->b(Lxd/d;)Ldc/a;

    move-result-object v1

    invoke-virtual {v1}, Ldc/a;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/internet/f;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "wifiman/android"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Android "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/f;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d$a$b;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v3, LYg/J;->a:LYg/J;

    iget-object v3, v0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/f;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v7, v3

    goto :goto_2

    :cond_2
    move-object v7, v5

    :goto_2
    iget-object v3, v0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    const/16 v4, 0x8

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    int-to-long v10, v4

    div-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v8, v3

    goto :goto_3

    :cond_3
    move-object v8, v5

    :goto_3
    iget-object v3, v0, Lxd/d$i$a;->b:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    int-to-long v3, v4

    div-long/2addr v9, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v9, v3

    goto :goto_4

    :cond_4
    move-object v9, v5

    :goto_4
    iget-object v3, v0, Lxd/d$i$a;->a:Lxd/d;

    invoke-static {v3}, Lxd/d;->a(Lxd/d;)Ldc/a;

    move-result-object v3

    invoke-virtual {v3}, Ldc/a;->b()Ljava/lang/String;

    move-result-object v11

    iget-object v3, v0, Lxd/d$i$a;->a:Lxd/d;

    invoke-static {v3}, Lxd/d;->a(Lxd/d;)Ldc/a;

    move-result-object v3

    invoke-virtual {v3}, Ldc/a;->d()Ljava/lang/String;

    move-result-object v12

    iget-object v3, v0, Lxd/d$i$a;->c:LCc/j;

    invoke-virtual {v3}, LCc/j;->b()Ljava/lang/String;

    move-result-object v13

    iget-object v3, v0, Lxd/d$i$a;->c:LCc/j;

    invoke-virtual {v3}, LCc/j;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object v3

    move-object v14, v3

    goto :goto_5

    :cond_5
    move-object v14, v5

    :goto_5
    sget-object v16, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iget-object v3, v0, Lxd/d$i$a;->d:Lxd/c;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lxd/c;->b()LSd/d$b;

    move-result-object v3

    if-eqz v3, :cond_a

    iget-object v4, v0, Lxd/d$i$a;->d:Lxd/c;

    new-instance v10, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    invoke-virtual {v3}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ui/wifiman/model/ubiquiti/console/e;->c()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v3}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v15

    invoke-virtual {v15}, Lcom/ui/wifiman/model/ubiquiti/console/e;->m()Lxa/a$d;

    move-result-object v15

    if-eqz v15, :cond_6

    invoke-interface {v15}, Lua/a;->I()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v19, v15

    goto :goto_6

    :cond_6
    move-object/from16 v19, v5

    :goto_6
    invoke-virtual {v4}, Lxd/c;->a()Ljd/a$b;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljd/a$b;->b()LCc/a;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-interface {v4}, LCc/a;->f()Lxa/a$d;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-interface {v4}, Lua/a;->I()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v20, v4

    goto :goto_7

    :cond_7
    move-object/from16 v20, v5

    :goto_7
    invoke-virtual {v3}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b()Lcom/ui/common/semver/SemVer;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v21, v4

    goto :goto_8

    :cond_8
    move-object/from16 v21, v5

    :goto_8
    invoke-virtual {v3}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e;->e()Lcom/ui/common/semver/SemVer;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_9
    move-object/from16 v22, v5

    move-object/from16 v17, v10

    invoke-direct/range {v17 .. v22}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v20, v10

    goto :goto_9

    :cond_a
    move-object/from16 v20, v5

    :goto_9
    iget-object v3, v0, Lxd/d$i$a;->d:Lxd/c;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lxd/c;->c()Lzi/j;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lxd/e;

    invoke-direct {v4}, Lxd/e;-><init>()V

    invoke-static {v3, v4}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_b

    :goto_a
    move-object/from16 v21, v3

    goto :goto_b

    :cond_b
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    goto :goto_a

    :goto_b
    new-instance v22, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;

    const-string v15, "android"

    const-string v17, "ui-speed"

    const/16 v18, 0x0

    const-string v19, "1.3.1"

    move-object/from16 v10, v22

    invoke-direct/range {v10 .. v21}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;Ljava/util/List;)V

    new-instance v11, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;

    const-string v4, "mobile"

    const-string v5, "android"

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;)V

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v1, v11}, Lc8/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;)Lgg/z;

    move-result-object v1

    sget-object v2, Lxd/d$i$a$a;->a:Lxd/d$i$a$a;

    invoke-virtual {v1, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v1

    return-object v1
.end method
