.class final Lwd/e$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/e;->a(Lwd/f$a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwd/e;

.field final synthetic b:Lwd/f$a;


# direct methods
.method constructor <init>(Lwd/e;Lwd/f$a;)V
    .locals 0

    iput-object p1, p0, Lwd/e$j;->a:Lwd/e;

    iput-object p2, p0, Lwd/e$j;->b:Lwd/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxd/c;)Lgg/D;
    .locals 2

    const-string v0, "consoleReportInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwd/e$j;->a:Lwd/e;

    invoke-static {v0}, Lwd/e;->e(Lwd/e;)Lxd/d;

    move-result-object v0

    iget-object v1, p0, Lwd/e$j;->b:Lwd/f$a;

    invoke-virtual {v1}, Lwd/f$a;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lxd/d;->g(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxd/c;

    invoke-virtual {p0, p1}, Lwd/e$j;->a(Lxd/c;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
