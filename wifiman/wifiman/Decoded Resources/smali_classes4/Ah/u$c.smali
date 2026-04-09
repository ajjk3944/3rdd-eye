.class public final LAh/u$c;
.super LDh/H;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAh/u;->q(Loi/n;)Lpi/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(LBh/G;LZh/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LDh/H;-><init>(LBh/G;LZh/c;)V

    return-void
.end method


# virtual methods
.method public G0()Lii/k$b;
    .locals 1

    sget-object v0, Lii/k$b;->b:Lii/k$b;

    return-object v0
.end method

.method public bridge synthetic r()Lii/k;
    .locals 1

    invoke-virtual {p0}, LAh/u$c;->G0()Lii/k$b;

    move-result-object v0

    return-object v0
.end method
