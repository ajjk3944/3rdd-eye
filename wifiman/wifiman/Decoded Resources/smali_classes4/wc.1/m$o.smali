.class final Lwc/m$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m;-><init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwc/m$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/m$o;

    invoke-direct {v0}, Lwc/m$o;-><init>()V

    sput-object v0, Lwc/m$o;->a:Lwc/m$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Lwc/d$b;

    invoke-virtual {p0, p1, p2, p3}, Lwc/m$o;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;Lwc/d$b;)Lwc/h$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;Ljava/lang/Boolean;Lwc/d$b;)Lwc/h$a;
    .locals 1

    const-string v0, "scanning"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paused"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiverStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p3, Lwc/d$b$b;

    if-eqz p3, :cond_0

    sget-object p1, Lwc/h$a;->UNAVAILABLE:Lwc/h$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p1, Lwc/h$a;->SCANNING:Lwc/h$a;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lwc/h$a;->PAUSED:Lwc/h$a;

    goto :goto_0

    :cond_2
    sget-object p1, Lwc/h$a;->IDLE:Lwc/h$a;

    :goto_0
    return-object p1
.end method
