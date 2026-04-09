.class public abstract LW0/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/f$d$a;
    }
.end annotation


# static fields
.field public static final a:LW0/f$d$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW0/f$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW0/f$d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/f$d;->a:LW0/f$d$a;

    const/4 v0, 0x1

    invoke-static {v0}, LW0/f$d;->c(I)I

    move-result v0

    sput v0, LW0/f$d;->b:I

    const/4 v0, 0x2

    invoke-static {v0}, LW0/f$d;->c(I)I

    move-result v0

    sput v0, LW0/f$d;->c:I

    const/4 v0, 0x0

    invoke-static {v0}, LW0/f$d;->c(I)I

    move-result v0

    sput v0, LW0/f$d;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LW0/f$d;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LW0/f$d;->c:I

    return v0
.end method

.method public static c(I)I
    .locals 0

    return p0
.end method

.method public static final d(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    sget v0, LW0/f$d;->b:I

    invoke-static {p0, v0}, LW0/f$d;->d(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "WordBreak.None"

    goto :goto_0

    :cond_0
    sget v0, LW0/f$d;->c:I

    invoke-static {p0, v0}, LW0/f$d;->d(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "WordBreak.Phrase"

    goto :goto_0

    :cond_1
    sget v0, LW0/f$d;->d:I

    invoke-static {p0, v0}, LW0/f$d;->d(II)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "WordBreak.Unspecified"

    goto :goto_0

    :cond_2
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method
