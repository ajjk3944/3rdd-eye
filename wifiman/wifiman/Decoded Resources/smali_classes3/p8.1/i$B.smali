.class public final Lp8/i$B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lp8/i$B;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LCc/a;

    invoke-interface {p1}, LCc/a;->l()Lh9/a;

    move-result-object p1

    check-cast p2, LCc/a;

    invoke-interface {p2}, LCc/a;->l()Lh9/a;

    move-result-object p2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    const/4 v1, -0x1

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lp8/i$B;->a:Z

    if-eqz p1, :cond_2

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    :goto_0
    move p1, v0

    goto :goto_1

    :cond_3
    if-nez p2, :cond_4

    iget-boolean p1, p0, Lp8/i$B;->a:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_4
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    :goto_1
    return p1
.end method
