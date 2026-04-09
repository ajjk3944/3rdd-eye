.class public final LM8/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM8/r;
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

    iput-boolean p1, p0, LM8/r$d;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lle/i;

    invoke-virtual {p1}, Lle/i;->hashCode()I

    move-result p1

    check-cast p2, Lle/i;

    invoke-virtual {p2}, Lle/i;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    return p1
.end method
