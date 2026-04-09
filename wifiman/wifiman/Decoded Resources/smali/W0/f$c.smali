.class public abstract LW0/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/f$c$a;
    }
.end annotation


# static fields
.field public static final a:LW0/f$c$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW0/f$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW0/f$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/f$c;->a:LW0/f$c$a;

    const/4 v0, 0x1

    invoke-static {v0}, LW0/f$c;->e(I)I

    move-result v0

    sput v0, LW0/f$c;->b:I

    const/4 v0, 0x2

    invoke-static {v0}, LW0/f$c;->e(I)I

    move-result v0

    sput v0, LW0/f$c;->c:I

    const/4 v0, 0x3

    invoke-static {v0}, LW0/f$c;->e(I)I

    move-result v0

    sput v0, LW0/f$c;->d:I

    const/4 v0, 0x4

    invoke-static {v0}, LW0/f$c;->e(I)I

    move-result v0

    sput v0, LW0/f$c;->e:I

    const/4 v0, 0x0

    invoke-static {v0}, LW0/f$c;->e(I)I

    move-result v0

    sput v0, LW0/f$c;->f:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LW0/f$c;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LW0/f$c;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LW0/f$c;->d:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LW0/f$c;->e:I

    return v0
.end method

.method public static e(I)I
    .locals 0

    return p0
.end method

.method public static final f(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(I)Ljava/lang/String;
    .locals 1

    sget v0, LW0/f$c;->b:I

    invoke-static {p0, v0}, LW0/f$c;->f(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Strictness.None"

    goto :goto_0

    :cond_0
    sget v0, LW0/f$c;->c:I

    invoke-static {p0, v0}, LW0/f$c;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Strictness.Loose"

    goto :goto_0

    :cond_1
    sget v0, LW0/f$c;->d:I

    invoke-static {p0, v0}, LW0/f$c;->f(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Strictness.Normal"

    goto :goto_0

    :cond_2
    sget v0, LW0/f$c;->e:I

    invoke-static {p0, v0}, LW0/f$c;->f(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Strictness.Strict"

    goto :goto_0

    :cond_3
    sget v0, LW0/f$c;->f:I

    invoke-static {p0, v0}, LW0/f$c;->f(II)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "Strictness.Unspecified"

    goto :goto_0

    :cond_4
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method
