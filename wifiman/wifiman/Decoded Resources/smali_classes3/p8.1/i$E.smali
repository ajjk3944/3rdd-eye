.class public final Lp8/i$E;
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

    iput-boolean p1, p0, Lp8/i$E;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LCc/a;

    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lwc/a;->k()LU7/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p2, LCc/a;

    invoke-interface {p2}, LCc/a;->p()Lwc/a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lwc/a;->k()LU7/a;

    move-result-object v0

    :cond_1
    if-nez p1, :cond_2

    if-nez v0, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    const/4 p2, 0x1

    const/4 v1, -0x1

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lp8/i$E;->a:Z

    if-eqz p1, :cond_4

    :cond_3
    move p1, v1

    goto :goto_2

    :cond_4
    :goto_1
    move p1, p2

    goto :goto_2

    :cond_5
    if-nez v0, :cond_6

    iget-boolean p1, p0, Lp8/i$E;->a:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_6
    invoke-interface {p1, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    :goto_2
    return p1
.end method
