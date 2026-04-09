.class public final LIi/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/e0;
.implements LIi/u;


# static fields
.field public static final a:LIi/K0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIi/K0;

    invoke-direct {v0}, LIi/K0;-><init>()V

    sput-object v0, LIi/K0;->a:LIi/K0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public getParent()LIi/y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
