.class final Lyd/b$s;
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


# instance fields
.field final synthetic a:Lyd/b;


# direct methods
.method constructor <init>(Lyd/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$s;->a:Lyd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/D;
    .locals 1

    const-string v0, "updatedResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyd/b$s;->a:Lyd/b;

    invoke-static {v0}, Lyd/b;->d(Lyd/b;)Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/speedtest/result/e;->h(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object v0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p0, p1}, Lyd/b$s;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
