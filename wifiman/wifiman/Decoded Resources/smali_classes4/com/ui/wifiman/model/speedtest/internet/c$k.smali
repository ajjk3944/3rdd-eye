.class final Lcom/ui/wifiman/model/speedtest/internet/c$k;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)LWc/b;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/internet/c$k;->c(Ljava/lang/Throwable;)LWc/b;

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

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$k;->b(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/c;->g(Lcom/ui/wifiman/model/speedtest/internet/c;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/c$k$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/internet/c$k;->a:Lcom/ui/wifiman/model/speedtest/internet/c;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$k$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/c;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/d;

    invoke-direct {v1}, Lcom/ui/wifiman/model/speedtest/internet/d;-><init>()V

    invoke-virtual {v0, v1}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LWc/b$b;

    invoke-direct {v1, p1}, LWc/b$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, LWc/b$a$a;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "ISP Server unavailable"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
