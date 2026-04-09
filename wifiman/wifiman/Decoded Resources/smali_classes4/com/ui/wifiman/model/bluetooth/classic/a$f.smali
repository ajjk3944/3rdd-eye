.class final Lcom/ui/wifiman/model/bluetooth/classic/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/classic/a;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothManager;Lwc/d;Ltc/a;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/classic/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;
    .locals 3

    const-string v0, "vendorDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->h(Lcom/ui/wifiman/model/bluetooth/classic/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;

    iget-object v2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a$f;->a:Lcom/ui/wifiman/model/bluetooth/classic/a;

    invoke-direct {v1, p1, v2}, Lcom/ui/wifiman/model/bluetooth/classic/a$f$a;-><init>(Lcom/ui/wifiman/model/vendor/d$a;Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/vendor/d$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$f;->a(Lcom/ui/wifiman/model/vendor/d$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
