.class final LCc/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;-><init>(LOb/a;LDc/e;Lle/g;Lwc/h;Lcom/ui/wifiman/model/bluetooth/le/a;Lmc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCc/p$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCc/p$c;

    invoke-direct {v0}, LCc/p$c;-><init>()V

    sput-object v0, LCc/p$c;->a:LCc/p$c;

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

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/Set;

    invoke-virtual {p0, p1, p2, p3}, LCc/p$c;->b(Ljava/util/Map;Ljava/util/List;Ljava/util/Set;)LCc/p$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Map;Ljava/util/List;Ljava/util/Set;)LCc/p$a;
    .locals 1

    const-string v0, "networkDevices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessPoints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothDevices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCc/p$a;

    invoke-direct {v0, p1, p2, p3}, LCc/p$a;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/Set;)V

    return-object v0
.end method
