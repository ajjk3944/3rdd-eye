.class final Lcom/ui/wifiman/model/wifi/scan/a$k;
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
.field final synthetic a:Lje/B;


# direct methods
.method constructor <init>(Lje/B;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$k;->a:Lje/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wmw/g;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ui/wmw/g;->d()Lcom/ui/wmw/wifi/a$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ui/wmw/wifi/a$a;->a()Lgg/i;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/wifi/scan/a$k;->a:Lje/B;

    invoke-virtual {p1}, Lje/B;->f()Lgg/i;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wifi/scan/a$k;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
