.class public final Lz7/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/k;->a(Ljava/lang/Integer;)Ljava/net/DatagramSocket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/k;


# direct methods
.method public constructor <init>(Lz7/k;)V
    .locals 0

    iput-object p1, p0, Lz7/k$a;->a:Lz7/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p2, Lz7/m;

    iget-object v0, p0, Lz7/k$a;->a:Lz7/k;

    invoke-static {v0, p2}, Lz7/k;->b(Lz7/k;Lz7/m;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lz7/m;

    iget-object v0, p0, Lz7/k$a;->a:Lz7/k;

    invoke-static {v0, p1}, Lz7/k;->b(Lz7/k;Lz7/m;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
