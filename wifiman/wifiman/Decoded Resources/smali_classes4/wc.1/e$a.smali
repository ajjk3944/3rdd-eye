.class final Lwc/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/e;-><init>(Landroid/bluetooth/BluetoothManager;Landroid/content/pm/PackageManager;Ltc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwc/e;


# direct methods
.method constructor <init>(Lwc/e;)V
    .locals 0

    iput-object p1, p0, Lwc/e$a;->a:Lwc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Lgg/r;
    .locals 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwc/e$a;->a:Lwc/e;

    const-string v1, "android.bluetooth.adapter.extra.STATE"

    const/high16 v2, -0x80000000

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {v0, p1}, Lwc/e;->b(Lwc/e;I)Lwc/d$a;

    move-result-object p1

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lwc/e$a;->a(Landroid/content/Intent;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
