.class public abstract Lo/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/A;

.field private static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/A;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/A;-><init>(I)V

    sput-object v0, Lo/p;->a:Lo/A;

    new-array v0, v1, [I

    sput-object v0, Lo/p;->b:[I

    return-void
.end method

.method public static final a()[I
    .locals 1

    sget-object v0, Lo/p;->b:[I

    return-object v0
.end method

.method public static final b()Lo/A;
    .locals 4

    new-instance v0, Lo/A;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
