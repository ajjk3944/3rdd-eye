.class public abstract Ln0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/n$a;
    }
.end annotation


# static fields
.field public static final a:Ln0/n$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln0/n;->a:Ln0/n$a;

    const/4 v0, 0x0

    invoke-static {v0}, Ln0/n;->d(I)I

    move-result v0

    sput v0, Ln0/n;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, Ln0/n;->d(I)I

    move-result v0

    sput v0, Ln0/n;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, Ln0/n;->d(I)I

    move-result v0

    sput v0, Ln0/n;->d:I

    const/4 v0, 0x3

    invoke-static {v0}, Ln0/n;->d(I)I

    move-result v0

    sput v0, Ln0/n;->e:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Ln0/n;->e:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Ln0/n;->b:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Ln0/n;->c:I

    return v0
.end method

.method public static d(I)I
    .locals 0

    return p0
.end method

.method public static final e(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
