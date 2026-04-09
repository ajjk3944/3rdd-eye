.class final Lwc/m$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m;-><init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwc/d;

.field final synthetic b:Lwc/m;


# direct methods
.method constructor <init>(Lwc/d;Lwc/m;)V
    .locals 0

    iput-object p1, p0, Lwc/m$m;->a:Lwc/d;

    iput-object p2, p0, Lwc/m$m;->b:Lwc/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string v0, "paused"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lwc/m$m;->a:Lwc/d;

    invoke-interface {p1}, Lwc/d;->a()Lgg/i;

    move-result-object p1

    new-instance v0, Lwc/m$m$a;

    iget-object v1, p0, Lwc/m$m;->b:Lwc/m;

    invoke-direct {v0, v1}, Lwc/m$m$a;-><init>(Lwc/m;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lwc/m$m;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
