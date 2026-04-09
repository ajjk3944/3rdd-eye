.class final Lcom/ui/wifiman/model/speedtest/internet/b$y;
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


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/b$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$y;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/b$y;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/b$y;->a:Lcom/ui/wifiman/model/speedtest/internet/b$y;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a$c;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-virtual {p1}, LIa/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/a$c;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$y;->a(LIa/a$c;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    return-object p1
.end method
