.class final Lcom/ui/wifiman/model/wifi/scan/a$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wifi/scan/a;-><init>(Lme/f;Lje/B;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/wmw/WifimanWizard;Lme/F;Loe/a;Lfe/u;)V
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

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$n;->a:Lfe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 2

    const-string v0, "errorStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/wifi/scan/a$n$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wifi/scan/a$n;->a:Lfe/u;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wifi/scan/a$n$a;-><init>(Lfe/u;)V

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$n;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
