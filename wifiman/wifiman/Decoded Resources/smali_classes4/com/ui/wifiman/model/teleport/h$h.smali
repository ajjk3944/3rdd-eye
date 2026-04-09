.class public final Lcom/ui/wifiman/model/teleport/h$h;
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


# instance fields
.field final synthetic a:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/h$h;->a:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$h;->a:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->t()LRd/a;

    move-result-object v0

    instance-of v1, v0, LRd/a$b$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v1, v0, LRd/a$b$b;

    if-nez v1, :cond_3

    instance-of v1, v0, LRd/a$a;

    if-nez v1, :cond_3

    instance-of v0, v0, LRd/a$c;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->y()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/n$b$a;

    if-eqz v0, :cond_4

    move p1, v3

    goto :goto_1

    :cond_4
    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/n$b$b;

    if-eqz p1, :cond_a

    move p1, v2

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_2
    check-cast p2, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/h;->t()LRd/a;

    move-result-object v0

    instance-of v1, v0, LRd/a$b$a;

    if-eqz v1, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_5

    :cond_5
    instance-of v1, v0, LRd/a$b$b;

    if-nez v1, :cond_7

    instance-of v1, v0, LRd/a$a;

    if-nez v1, :cond_7

    instance-of v0, v0, LRd/a$c;

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_3
    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/h;->y()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object p2

    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/n$b$a;

    if-eqz v0, :cond_8

    move v2, v3

    goto :goto_4

    :cond_8
    instance-of p2, p2, Lcom/ui/wifiman/model/teleport/n$b$b;

    if-eqz p2, :cond_9

    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_5
    invoke-static {p1, p2}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_6
    return v0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
