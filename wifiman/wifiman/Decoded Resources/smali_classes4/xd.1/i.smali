.class public final Lxd/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/i$a;
    }
.end annotation


# instance fields
.field private final a:Lbe/e;

.field private final b:Lkd/d;


# direct methods
.method public constructor <init>(Lbe/e;Lkd/d;)V
    .locals 1

    const-string v0, "unifiWifimanApiManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publicIPService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/i;->a:Lbe/e;

    iput-object p2, p0, Lxd/i;->b:Lkd/d;

    return-void
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
    .locals 2

    const-string p2, "state"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LAg/c;->a:LAg/c;

    iget-object v0, p0, Lxd/i;->a:Lbe/e;

    invoke-interface {v0}, Lbe/e;->c()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lxd/i;->b:Lkd/d;

    invoke-interface {v1}, Lkd/d;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->o0()Lgg/z;

    move-result-object p2

    new-instance v0, Lxd/i$b;

    invoke-direct {v0, p1}, Lxd/i$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V

    invoke-virtual {p2, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
