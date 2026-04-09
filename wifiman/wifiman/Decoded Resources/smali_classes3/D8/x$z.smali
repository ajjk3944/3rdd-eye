.class final LD8/x$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/x$z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/x$z;

    invoke-direct {v0}, LD8/x$z;-><init>()V

    sput-object v0, LD8/x$z;->a:LD8/x$z;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;

    check-cast p3, Ll9/a;

    check-cast p4, Ll9/a;

    check-cast p5, Ll9/a;

    invoke-virtual/range {p0 .. p5}, LD8/x$z;->b(Ljava/lang/Boolean;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;Ll9/a;Ll9/a;Ll9/a;)Laf/e0$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;Ll9/a;Ll9/a;Ll9/a;)Laf/e0$a;
    .locals 10

    const-string/jumbo v0, "hasConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "speedtestServerSelection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LD8/x$b;

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p5}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p5

    move-object v1, p5

    check-cast v1, Ljava/lang/Boolean;

    instance-of p5, p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$a;

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object v3, v0

    goto :goto_1

    :cond_0
    instance-of p5, p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    if-eqz p5, :cond_2

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$b;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;->h()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance p5, Ls9/d$c;

    invoke-direct {p5, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    move-object p5, v0

    :goto_0
    move-object v3, p5

    goto :goto_1

    :cond_2
    instance-of p5, p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    if-eqz p5, :cond_6

    check-cast p2, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c$c;->a()Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance p5, Ls9/d$c;

    invoke-direct {p5, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :goto_1
    if-eqz p3, :cond_5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    sget-object p1, LE8/C;->a:LE8/C;

    invoke-virtual {p3}, LD8/x$b;->e()Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object p2

    invoke-virtual {p1, p2}, LE8/C;->g(Lcom/ui/wifiman/model/speedtest/result/b;)Ls9/d;

    move-result-object v4

    invoke-virtual {p3}, LD8/x$b;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p2

    invoke-virtual {p1, p2, v0, p4}, LE8/C;->c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;

    move-result-object v5

    new-instance v6, Ls9/d$a;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, LD8/x$z$a;

    invoke-direct {p2, p3}, LD8/x$z$a;-><init>(LD8/x$b;)V

    invoke-direct {v6, p1, p2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-virtual {p3}, LD8/x$b;->d()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object p2, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {p2, p1}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 p2, 0x0

    invoke-static {p1, p2}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move-object v7, p1

    goto :goto_4

    :cond_4
    :goto_3
    new-instance p1, Ls9/d$b;

    const p2, 0x7f1103c7

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :goto_4
    invoke-virtual {p3}, LD8/x$b;->a()Lhf/h;

    move-result-object v9

    invoke-virtual {p3}, LD8/x$b;->b()Lhf/h;

    move-result-object v8

    new-instance p1, Laf/e0$a$a$b;

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Laf/e0$a$a$b;-><init>(Ljava/lang/Boolean;ZLs9/d;Ls9/d;Ls9/d;Ls9/d;Ls9/d;Lhf/h;Lhf/h;)V

    goto :goto_5

    :cond_5
    new-instance p2, Laf/e0$a$a$a;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p2, v1, p1, v3}, Laf/e0$a$a$a;-><init>(Ljava/lang/Boolean;ZLs9/d;)V

    move-object p1, p2

    :goto_5
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
