.class final Lcom/ui/wifiman/model/bluetooth/le/f$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/bluetooth/le/f;-><init>(Landroid/bluetooth/BluetoothManager;Lwc/d;Lcom/ui/wifiman/model/vendor/d$b;LAc/a;Lxa/o;Landroid/content/pm/PackageManager;Lcom/ui/wifiman/model/bluetooth/le/j$a;Lcom/ui/wifiman/model/android/permissions/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/bluetooth/le/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/le/f$i;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(J)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f$i;->c(J)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(J)LYg/J;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BLeScan - connected devices get took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " millis"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, v0, p1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/bluetooth/le/f$i;->b(Ljava/util/List;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Lgg/D;
    .locals 2

    const-string v0, "scanResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/le/f$i;->a:Lcom/ui/wifiman/model/bluetooth/le/f;

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/f$i$b;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/bluetooth/le/f$i$b;-><init>(Lcom/ui/wifiman/model/bluetooth/le/f;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/g;

    invoke-direct {v1}, Lcom/ui/wifiman/model/bluetooth/le/g;-><init>()V

    invoke-static {v0, v1}, Lk9/e;->f(Lgg/z;Lmh/l;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/le/f$i$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/bluetooth/le/f$i$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
