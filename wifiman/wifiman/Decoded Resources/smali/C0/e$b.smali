.class public abstract LC0/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC0/e$b$a;
    }
.end annotation


# static fields
.field public static final a:LC0/e$b$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC0/e$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC0/e$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC0/e$b;->a:LC0/e$b$a;

    const/4 v0, 0x1

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->b:I

    const/4 v0, 0x2

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->c:I

    const/4 v0, 0x3

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->d:I

    const/4 v0, 0x4

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->e:I

    const/4 v0, 0x5

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->f:I

    const/4 v0, 0x6

    invoke-static {v0}, LC0/e$b;->g(I)I

    move-result v0

    sput v0, LC0/e$b;->g:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LC0/e$b;->f:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LC0/e$b;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LC0/e$b;->b:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LC0/e$b;->g:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, LC0/e$b;->d:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, LC0/e$b;->e:I

    return v0
.end method

.method public static g(I)I
    .locals 0

    return p0
.end method

.method public static final h(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
