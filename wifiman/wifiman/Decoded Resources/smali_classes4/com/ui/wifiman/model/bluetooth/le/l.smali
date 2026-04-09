.class public final Lcom/ui/wifiman/model/bluetooth/le/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/le/l$a;,
        Lcom/ui/wifiman/model/bluetooth/le/l$b;,
        Lcom/ui/wifiman/model/bluetooth/le/l$c;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/bluetooth/le/l;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/le/l;

    invoke-direct {v0}, Lcom/ui/wifiman/model/bluetooth/le/l;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/le/l;->a:Lcom/ui/wifiman/model/bluetooth/le/l;

    invoke-static {}, Lcom/ui/wifiman/model/bluetooth/le/l$c;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/wifiman/model/bluetooth/le/l$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/bluetooth/le/l$c;->getId()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sput-object v2, Lcom/ui/wifiman/model/bluetooth/le/l;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/le/l;->b:Ljava/util/Map;

    return-object v0
.end method
