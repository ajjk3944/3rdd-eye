.class public final synthetic LBd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/b;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBd/f;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LBd/f;->a:Lcom/ui/wifiman/model/speedtest/internet/b;

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$m;->k(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
