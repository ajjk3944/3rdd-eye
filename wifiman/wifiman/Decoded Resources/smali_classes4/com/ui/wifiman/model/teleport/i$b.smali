.class final Lcom/ui/wifiman/model/teleport/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/i;-><init>(Lcom/ui/wifiman/model/teleport/session/TeleportSession;LFd/D;Lcom/ui/wifiman/model/teleport/k;LLd/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/i$b;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/i$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/i$b;->a:Lcom/ui/wifiman/model/teleport/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    sget-object v0, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/i$b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
