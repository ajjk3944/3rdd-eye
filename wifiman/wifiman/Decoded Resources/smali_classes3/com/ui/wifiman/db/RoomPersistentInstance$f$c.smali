.class final Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance$f;->a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;

    invoke-direct {v0}, Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)V
    .locals 1

    const-string/jumbo v0, "rowsUpdates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Lcom/ui/wifiman/db/RoomPersistentInstance$Error$UpdateFailed;

    invoke-direct {p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$Error$UpdateFailed;-><init>()V

    throw p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;->a(Ljava/lang/Integer;)V

    return-void
.end method
