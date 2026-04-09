.class final Lcom/ui/wifiman/model/speedtest/result/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/result/f;->e(Lb8/c;Ljava/lang/String;Ljava/lang/Integer;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/f$d;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 2

    const-string v0, "resultsStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/c;->a:LAg/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/f$d;->a:Lcom/ui/wifiman/model/speedtest/result/f;

    invoke-static {v1}, Lcom/ui/wifiman/model/speedtest/result/f;->j(Lcom/ui/wifiman/model/speedtest/result/f;)Lxa/o;

    move-result-object v1

    invoke-interface {v1}, Lxa/o;->b()Lgg/i;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
