.class public abstract Lr/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/t$a;
    }
.end annotation


# static fields
.field public static final a:Lr/t$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr/t;->a:Lr/t$a;

    const/4 v0, 0x5

    invoke-static {v0}, Lr/t;->b(I)I

    move-result v0

    sput v0, Lr/t;->b:I

    const/4 v0, 0x4

    invoke-static {v0}, Lr/t;->b(I)I

    move-result v0

    sput v0, Lr/t;->c:I

    const/4 v0, 0x0

    invoke-static {v0}, Lr/t;->b(I)I

    move-result v0

    sput v0, Lr/t;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lr/t;->d:I

    return v0
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method

.method public static final c(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ArcMode(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
