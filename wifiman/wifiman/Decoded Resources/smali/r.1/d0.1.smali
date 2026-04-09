.class public final Lr/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/D;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lr/d0;->a:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr/s0;)Lr/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/d0;->a(Lr/s0;)Lr/y0;

    move-result-object p1

    return-object p1
.end method

.method public a(Lr/s0;)Lr/y0;
    .locals 1

    .line 3
    new-instance p1, Lr/F0;

    iget v0, p0, Lr/d0;->a:I

    invoke-direct {p1, v0}, Lr/F0;-><init>(I)V

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/z0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lr/d0;->a(Lr/s0;)Lr/y0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lr/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lr/d0;

    iget p1, p1, Lr/d0;->a:I

    iget v0, p0, Lr/d0;->a:I

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lr/d0;->a:I

    return v0
.end method
