.class final Lwc/m$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m$i;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwc/m$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/m$i$a;

    invoke-direct {v0}, Lwc/m$i$a;-><init>()V

    sput-object v0, Lwc/m$i$a;->a:Lwc/m$i$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$Error;

    if-eqz v0, :cond_0

    const-string v0, "Bluetooth scanner failed with expected error"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

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

    invoke-virtual {p0, p1}, Lwc/m$i$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
