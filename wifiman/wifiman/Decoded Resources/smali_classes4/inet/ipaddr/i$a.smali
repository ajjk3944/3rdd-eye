.class public abstract Linet/ipaddr/i$a;
.super Lbg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Linet/ipaddr/i;


# direct methods
.method protected constructor <init>(Linet/ipaddr/i;)V
    .locals 0

    invoke-direct {p0}, Lbg/a;-><init>()V

    iput-object p1, p0, Linet/ipaddr/i$a;->a:Linet/ipaddr/i;

    return-void
.end method


# virtual methods
.method protected bridge synthetic B([LZf/d;Ljava/lang/Integer;Z)Linet/ipaddr/a;
    .locals 0

    check-cast p1, [Linet/ipaddr/k;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/i$a;->b0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected C0(IILjava/lang/Integer;Ljava/lang/CharSequence;IIZZIII)Linet/ipaddr/k;
    .locals 10

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/format/validate/f;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    check-cast v0, Linet/ipaddr/k;

    move-object v1, v0

    move-object v2, p4

    move/from16 v3, p7

    move/from16 v4, p8

    move/from16 v5, p9

    move/from16 v6, p10

    move/from16 v7, p11

    move v8, p5

    move/from16 v9, p6

    invoke-virtual/range {v1 .. v9}, Linet/ipaddr/k;->S2(Ljava/lang/CharSequence;ZZIIIII)V

    move/from16 v3, p8

    move/from16 v4, p9

    move/from16 v5, p11

    move v6, p5

    move/from16 v7, p6

    invoke-virtual/range {v1 .. v7}, Linet/ipaddr/k;->U2(Ljava/lang/CharSequence;ZIIII)V

    return-object v0
.end method

.method public abstract E(Linet/ipaddr/j;)Linet/ipaddr/g;
.end method

.method protected E0([BILjava/lang/Integer;)Linet/ipaddr/j;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lbg/a;->C([BILjava/lang/Integer;Z)LZf/c;

    move-result-object p1

    check-cast p1, Linet/ipaddr/j;

    return-object p1
.end method

.method protected F(Linet/ipaddr/j;LZf/f;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/i$a;->E(Linet/ipaddr/j;)Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Linet/ipaddr/g;->J(LZf/f;)V

    return-object p1
.end method

.method protected abstract G0([Linet/ipaddr/k;)Linet/ipaddr/j;
.end method

.method protected abstract J(Linet/ipaddr/j;Ljava/lang/CharSequence;)Linet/ipaddr/g;
.end method

.method protected K(Linet/ipaddr/j;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->J(Linet/ipaddr/j;Ljava/lang/CharSequence;)Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1, p3}, Linet/ipaddr/g;->J(LZf/f;)V

    return-object p1
.end method

.method protected K0(ILjava/lang/Integer;Ljava/lang/CharSequence;IZII)Linet/ipaddr/k;
    .locals 6

    invoke-interface {p0, p1, p2}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object p1

    check-cast p1, Linet/ipaddr/k;

    move-object v0, p1

    move-object v1, p3

    move v2, p5

    move v3, p6

    move v4, p7

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Linet/ipaddr/k;->R2(Ljava/lang/CharSequence;ZIII)V

    invoke-virtual/range {v0 .. v5}, Linet/ipaddr/k;->T2(Ljava/lang/CharSequence;ZIII)V

    return-object p1
.end method

.method protected abstract M0()I
.end method

.method protected P([BLjava/lang/CharSequence;)Linet/ipaddr/g;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/i$a;->M0()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Linet/ipaddr/i$a;->E0([BILjava/lang/Integer;)Linet/ipaddr/j;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->J(Linet/ipaddr/j;Ljava/lang/CharSequence;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected S([Linet/ipaddr/k;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/i$a;->G0([Linet/ipaddr/k;)Linet/ipaddr/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Linet/ipaddr/i$a;->E(Linet/ipaddr/j;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected T([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->f0([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Linet/ipaddr/i$a;->E(Linet/ipaddr/j;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected b0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/i$a;->q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Linet/ipaddr/i$a;->E(Linet/ipaddr/j;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected abstract d0(Linet/ipaddr/j;[Linet/ipaddr/k;)Linet/ipaddr/j;
.end method

.method public e()Linet/ipaddr/i;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/i$a;->a:Linet/ipaddr/i;

    return-object v0
.end method

.method protected f0([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/j;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Linet/ipaddr/i$a;->q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic h(LZf/c;LZf/f;)Linet/ipaddr/a;
    .locals 0

    check-cast p1, Linet/ipaddr/j;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->F(Linet/ipaddr/j;LZf/f;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;
    .locals 0

    check-cast p1, Linet/ipaddr/j;

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/i$a;->K(Linet/ipaddr/j;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic m([BLjava/lang/CharSequence;)Linet/ipaddr/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->P([BLjava/lang/CharSequence;)Linet/ipaddr/g;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic p([LZf/d;Ljava/lang/Integer;)LZf/c;
    .locals 0

    check-cast p1, [Linet/ipaddr/k;

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/i$a;->f0([Linet/ipaddr/k;Ljava/lang/Integer;)Linet/ipaddr/j;

    move-result-object p1

    return-object p1
.end method

.method protected abstract q0([Linet/ipaddr/k;Ljava/lang/Integer;Z)Linet/ipaddr/j;
.end method

.method protected bridge synthetic s(IILjava/lang/Integer;Ljava/lang/CharSequence;IIZZIII)LZf/d;
    .locals 0

    invoke-virtual/range {p0 .. p11}, Linet/ipaddr/i$a;->C0(IILjava/lang/Integer;Ljava/lang/CharSequence;IIZZIII)Linet/ipaddr/k;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic v(ILjava/lang/Integer;Ljava/lang/CharSequence;IZII)LZf/d;
    .locals 0

    invoke-virtual/range {p0 .. p7}, Linet/ipaddr/i$a;->K0(ILjava/lang/Integer;Ljava/lang/CharSequence;IZII)Linet/ipaddr/k;

    move-result-object p1

    return-object p1
.end method
