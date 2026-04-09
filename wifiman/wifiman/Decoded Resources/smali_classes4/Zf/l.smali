.class public final synthetic LZf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:Linet/ipaddr/j;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/j;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZf/l;->a:Linet/ipaddr/j;

    iput p2, p0, LZf/l;->b:I

    iput p3, p0, LZf/l;->c:I

    iput p4, p0, LZf/l;->d:I

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 4

    iget-object v0, p0, LZf/l;->a:Linet/ipaddr/j;

    iget v1, p0, LZf/l;->b:I

    iget v2, p0, LZf/l;->c:I

    iget v3, p0, LZf/l;->d:I

    invoke-static {v0, v1, v2, v3, p1}, Linet/ipaddr/j;->R1(Linet/ipaddr/j;IIII)I

    move-result p1

    return p1
.end method
