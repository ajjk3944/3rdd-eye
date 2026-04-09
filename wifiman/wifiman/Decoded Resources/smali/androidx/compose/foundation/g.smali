.class final Landroidx/compose/foundation/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/I;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/g$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/foundation/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/g;

    invoke-direct {v0}, Landroidx/compose/foundation/g;-><init>()V

    sput-object v0, Landroidx/compose/foundation/g;->a:Landroidx/compose/foundation/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly/k;)LE0/j;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/g$a;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/g$a;-><init>(Ly/k;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
