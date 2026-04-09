.class final Lo5/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final synthetic a:[Lth/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/H;

    const-string/jumbo v1, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v2, 0x0

    const-class v3, Lo5/x$c;

    const-string/jumbo v4, "dataStore"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/H;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->i(Lkotlin/jvm/internal/G;)Lth/o;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lo5/x$c;->a:[Lth/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lo5/x$c;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lo5/x$c;Landroid/content/Context;)LO1/e;
    .locals 0

    invoke-direct {p0, p1}, Lo5/x$c;->b(Landroid/content/Context;)LO1/e;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Context;)LO1/e;
    .locals 3

    invoke-static {}, Lo5/x;->f()Lph/c;

    move-result-object v0

    sget-object v1, Lo5/x$c;->a:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p1, v1}, Lph/c;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO1/e;

    return-object p1
.end method
