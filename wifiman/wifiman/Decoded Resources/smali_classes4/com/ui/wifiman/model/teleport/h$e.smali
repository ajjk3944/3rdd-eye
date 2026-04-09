.class public final Lcom/ui/wifiman/model/teleport/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->C()Z

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-ne p1, v1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    check-cast p2, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/h;->C()Z

    move-result p2

    if-ne p2, v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    invoke-static {p1, v0}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
