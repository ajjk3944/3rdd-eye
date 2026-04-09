.class public final LTe/K0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTe/K0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/K0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LTe/K0$d;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LTe/K0$d;

    invoke-direct {v0}, LTe/K0$d;-><init>()V

    sput-object v0, LTe/K0$d;->a:LTe/K0$d;

    const-string v1, "chartThroughputUnavailable"

    sput-object v1, LTe/K0$d;->b:Ljava/lang/String;

    invoke-virtual {v0}, LTe/K0$d;->getType()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LTe/K0$d;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    sget-object v0, LTe/K0$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    sget-object v0, LTe/K0$d;->b:Ljava/lang/String;

    return-object v0
.end method
