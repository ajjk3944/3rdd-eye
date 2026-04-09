.class public final LT7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT7/a$a;
    }
.end annotation


# static fields
.field public static final b:LT7/a$a;

.field private static final c:LT7/a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT7/a;->b:LT7/a$a;

    new-instance v0, LT7/a;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {v0, v1}, LT7/a;-><init>(I)V

    sput-object v0, LT7/a;->c:LT7/a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LT7/a;->a:I

    return-void
.end method

.method public static final synthetic a()LT7/a;
    .locals 1

    sget-object v0, LT7/a;->c:LT7/a;

    return-object v0
.end method


# virtual methods
.method public final b(I)Z
    .locals 1

    iget v0, p0, LT7/a;->a:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(I)Z
    .locals 1

    iget v0, p0, LT7/a;->a:I

    if-ge v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
