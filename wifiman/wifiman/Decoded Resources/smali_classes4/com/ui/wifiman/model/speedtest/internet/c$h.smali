.class final Lcom/ui/wifiman/model/speedtest/internet/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;->s()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$h;->a:Lcom/ui/wifiman/model/speedtest/internet/c$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a;)Lgg/D;
    .locals 2

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/ui/wifiman/model/speedtest/internet/c$h$a;-><init>(LIa/a;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$h;->a(LIa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
