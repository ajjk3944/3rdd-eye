.class public final LR0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/c0;


# instance fields
.field private final b:C


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, LR0/J;->b:C

    return-void
.end method

.method public synthetic constructor <init>(CILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x2022

    .line 2
    :cond_0
    invoke-direct {p0, p1}, LR0/J;-><init>(C)V

    return-void
.end method


# virtual methods
.method public a(LL0/d;)LR0/a0;
    .locals 8

    new-instance v0, LR0/a0;

    new-instance v7, LL0/d;

    iget-char v1, p0, LR0/J;->b:C

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v1, p1}, Lkotlin/text/t;->H(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, LR0/H;->a:LR0/H$a;

    invoke-virtual {p1}, LR0/H$a;->a()LR0/H;

    move-result-object p1

    invoke-direct {v0, v7, p1}, LR0/a0;-><init>(LL0/d;LR0/H;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/J;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-char v1, p0, LR0/J;->b:C

    check-cast p1, LR0/J;

    iget-char p1, p1, LR0/J;->b:C

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-char v0, p0, LR0/J;->b:C

    invoke-static {v0}, Ljava/lang/Character;->hashCode(C)I

    move-result v0

    return v0
.end method
