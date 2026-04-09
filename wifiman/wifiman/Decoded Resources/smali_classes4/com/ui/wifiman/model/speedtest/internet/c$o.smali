.class final Lcom/ui/wifiman/model/speedtest/internet/c$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/internet/c$o$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$o;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$o;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$o;->a:Lcom/ui/wifiman/model/speedtest/internet/c$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;LWc/b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;
    .locals 20

    const-string v0, "<destruct>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYb/a;

    invoke-virtual/range {p2 .. p2}, LWc/b;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYb/a;->k()LYb/a$b;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    const/4 v4, -0x1

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    sget-object v5, Lcom/ui/wifiman/model/speedtest/internet/c$o$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    :goto_1
    if-eq v3, v4, :cond_7

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v1, 0x2

    if-eq v3, v1, :cond_6

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    invoke-virtual {v0}, LYb/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LYb/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LYb/a;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, LYb/a;->e()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, LYb/a;->f()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v3, LW7/c;

    new-instance v4, LW7/c$a;

    invoke-virtual {v0}, LYb/a;->e()Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v0}, LYb/a;->f()Ljava/lang/Double;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-direct {v4, v5, v6, v10, v11}, LW7/c$a;-><init>(DD)V

    invoke-direct {v3, v4, v2, v1, v2}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v3

    goto :goto_2

    :cond_2
    move-object v10, v2

    :goto_2
    invoke-virtual {v0}, LYb/a;->g()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, LYb/a;->h()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, LYb/a;->i()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_3
    move-object v13, v2

    invoke-virtual {v0}, LYb/a;->l()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    const/16 v18, 0x400

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v19}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)V

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url is required"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    goto :goto_3

    :cond_7
    if-eqz v1, :cond_8

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;)V

    move-object v1, v0

    goto :goto_3

    :cond_8
    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;->a:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    :goto_3
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, LWc/b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/internet/c$o;->a(Ll9/a;LWc/b;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;

    move-result-object p1

    return-object p1
.end method
