.class public final LBh/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LBh/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/j;

    invoke-direct {v0}, LBh/j;-><init>()V

    sput-object v0, LBh/j;->a:LBh/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lpi/S;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LBh/k;->a(Lpi/S;)Z

    move-result p0

    return p0
.end method
