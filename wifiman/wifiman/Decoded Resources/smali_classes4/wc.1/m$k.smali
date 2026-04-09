.class final Lwc/m$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m;-><init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwc/m$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/m$k;

    invoke-direct {v0}, Lwc/m$k;-><init>()V

    sput-object v0, Lwc/m$k;->a:Lwc/m$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "Bluetooth Discovery subscribed"

    invoke-static {v1, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lwc/m$k;->a(LDj/c;)V

    return-void
.end method
