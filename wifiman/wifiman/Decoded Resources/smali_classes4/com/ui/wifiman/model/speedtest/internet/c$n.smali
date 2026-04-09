.class final Lcom/ui/wifiman/model/speedtest/internet/c$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;-><init>(Ltd/d;LYb/b;Lpc/a;LZc/f;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$n;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)LWc/b;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/internet/c$n;->c(Ljava/lang/Throwable;)LWc/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Throwable;)LWc/b;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$n;->b(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/s;)LDj/a;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "<destruct>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/a;

    invoke-virtual/range {p1 .. p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    instance-of v4, v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v5

    :cond_1
    iput-object v5, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v5, :cond_4

    invoke-virtual {v1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    iget-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->m()LW7/c;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, LW7/c;

    iget-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->m()LW7/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, LW7/c;->a(LW7/c;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    const/16 v17, 0xeff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->g(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object v1

    iput-object v1, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_3
    iget-object v1, v0, Lcom/ui/wifiman/model/speedtest/internet/c$n;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {v1}, Lcom/ui/wifiman/model/speedtest/internet/c;->g(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;

    iget-object v4, v0, Lcom/ui/wifiman/model/speedtest/internet/c$n;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {v2, v4, v3}, Lcom/ui/wifiman/model/speedtest/internet/c$n$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, v2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/speedtest/internet/e;

    invoke-direct {v2}, Lcom/ui/wifiman/model/speedtest/internet/e;-><init>()V

    invoke-virtual {v1, v2}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v1

    invoke-virtual {v1}, Lgg/z;->W()Lgg/i;

    move-result-object v1

    new-instance v2, LWc/b$b;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-direct {v2, v3}, LWc/b$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance v1, LWc/b$a$a;

    new-instance v2, Ljava/lang/Exception;

    const-string v3, "Manual Server unavailable"

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_2
    return-object v1
.end method
