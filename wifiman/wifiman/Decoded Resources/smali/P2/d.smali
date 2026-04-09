.class public LP2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE2/c;LC2/g;)LE2/c;
    .locals 0

    invoke-interface {p1}, LE2/c;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO2/c;

    invoke-virtual {p1}, LO2/c;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, LL2/b;

    invoke-static {p1}, LW2/a;->e(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-direct {p2, p1}, LL2/b;-><init>([B)V

    return-object p2
.end method
