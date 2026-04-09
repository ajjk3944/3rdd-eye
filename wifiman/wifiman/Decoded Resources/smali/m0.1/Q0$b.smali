.class public final Lm0/Q0$b;
.super Lm0/Q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ll0/i;


# direct methods
.method public constructor <init>(Ll0/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lm0/Q0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lm0/Q0$b;->a:Ll0/i;

    return-void
.end method


# virtual methods
.method public a()Ll0/i;
    .locals 1

    iget-object v0, p0, Lm0/Q0$b;->a:Ll0/i;

    return-object v0
.end method

.method public final b()Ll0/i;
    .locals 1

    iget-object v0, p0, Lm0/Q0$b;->a:Ll0/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm0/Q0$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lm0/Q0$b;->a:Ll0/i;

    check-cast p1, Lm0/Q0$b;

    iget-object p1, p1, Lm0/Q0$b;->a:Ll0/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lm0/Q0$b;->a:Ll0/i;

    invoke-virtual {v0}, Ll0/i;->hashCode()I

    move-result v0

    return v0
.end method
