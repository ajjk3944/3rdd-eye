.class final Lcom/ui/wifiman/model/wifi/scan/a$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/a$n;->a(Lgg/i;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfe/u;


# direct methods
.method constructor <init>(Lfe/u;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$n$a;->a:Lfe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$Error;

    if-eqz v0, :cond_0

    const-string v0, "Wifi Survey manager - Failed to obtain Wizard scan results"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, Lcom/ui/wifiman/model/wifi/scan/a$n$a;->a:Lfe/u;

    invoke-interface {v0}, Lfe/u;->a()Lgg/y;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, p1, v0}, Lgg/i;->e2(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$n$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
