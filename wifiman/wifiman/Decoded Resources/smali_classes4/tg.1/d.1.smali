.class public final Ltg/d;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d$a;,
        Ltg/d$b;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:I

.field final d:Lzg/g;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;ILzg/g;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/d;->b:Lkg/n;

    iput-object p4, p0, Ltg/d;->d:Lzg/g;

    const/16 p1, 0x8

    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ltg/d;->c:I

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 6

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    iget-object v1, p0, Ltg/d;->b:Lkg/n;

    invoke-static {v0, p1, v1}, Ltg/a0;->b(Lgg/v;Lgg/x;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/d;->d:Lzg/g;

    sget-object v1, Lzg/g;->IMMEDIATE:Lzg/g;

    if-ne v0, v1, :cond_1

    new-instance v0, LCg/c;

    invoke-direct {v0, p1}, LCg/c;-><init>(Lgg/x;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/d$b;

    iget-object v2, p0, Ltg/d;->b:Lkg/n;

    iget v3, p0, Ltg/d;->c:I

    invoke-direct {v1, v0, v2, v3}, Ltg/d$b;-><init>(Lgg/x;Lkg/n;I)V

    invoke-interface {p1, v1}, Lgg/v;->d(Lgg/x;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/d$a;

    iget-object v2, p0, Ltg/d;->b:Lkg/n;

    iget v3, p0, Ltg/d;->c:I

    iget-object v4, p0, Ltg/d;->d:Lzg/g;

    sget-object v5, Lzg/g;->END:Lzg/g;

    if-ne v4, v5, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    invoke-direct {v1, p1, v2, v3, v4}, Ltg/d$a;-><init>(Lgg/x;Lkg/n;IZ)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    :goto_1
    return-void
.end method
