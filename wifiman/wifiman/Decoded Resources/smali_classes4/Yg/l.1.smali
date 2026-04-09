.class final LYg/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LYg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYg/l;

    invoke-direct {v0}, LYg/l;-><init>()V

    sput-object v0, LYg/l;->a:LYg/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()LYg/k;
    .locals 4

    new-instance v0, LYg/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v3, v1, v2}, LYg/k;-><init>(III)V

    return-object v0
.end method
