.class final Lyd/b$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lyd/b$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyd/b$t;

    invoke-direct {v0}, Lyd/b$t;-><init>()V

    sput-object v0, Lyd/b$t;->a:Lyd/b$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p0, p1}, Lyd/b$t;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    return-object p1
.end method
