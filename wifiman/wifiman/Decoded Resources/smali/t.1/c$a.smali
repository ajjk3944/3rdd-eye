.class public abstract Lt/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/c$a$a;
    }
.end annotation


# static fields
.field public static final a:Lt/c$a$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt/c$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt/c$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt/c$a;->a:Lt/c$a$a;

    const/4 v0, 0x0

    invoke-static {v0}, Lt/c$a;->b(I)I

    move-result v0

    sput v0, Lt/c$a;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, Lt/c$a;->b(I)I

    move-result v0

    sput v0, Lt/c$a;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, Lt/c$a;->b(I)I

    move-result v0

    sput v0, Lt/c$a;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lt/c$a;->b:I

    return v0
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
