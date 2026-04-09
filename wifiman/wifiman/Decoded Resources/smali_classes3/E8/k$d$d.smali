.class final LE8/k$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k$d;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/k$a;


# direct methods
.method constructor <init>(LE8/k$a;)V
    .locals 0

    iput-object p1, p0, LE8/k$d$d;->a:LE8/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "speedtestState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/k$d$d;->a:LE8/k$a;

    invoke-virtual {v0, p1}, LE8/k$a;->j(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1}, LE8/k$d$d;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
