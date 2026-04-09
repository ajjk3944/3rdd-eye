.class public final LQe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQe/c$a;
    }
.end annotation


# static fields
.field public static final a:LQe/c;

.field private static final b:Ljava/util/List;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LQe/c;

    invoke-direct {v0}, LQe/c;-><init>()V

    sput-object v0, LQe/c;->a:LQe/c;

    sget-object v0, LQe/c$a;->SPEED:LQe/c$a;

    sget-object v1, LQe/c$a;->SIGNAL:LQe/c$a;

    sget-object v2, LQe/c$a;->SCAN:LQe/c$a;

    sget-object v3, LQe/c$a;->DISCOVERY:LQe/c$a;

    sget-object v4, LQe/c$a;->TELEPORT:LQe/c$a;

    filled-new-array {v0, v1, v2, v3, v4}, [LQe/c$a;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LQe/c;->b:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, LQe/c;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LQe/c$a;
    .locals 1

    sget-object v0, LQe/c;->b:Ljava/util/List;

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQe/c$a;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    sget-object v0, LQe/c;->b:Ljava/util/List;

    return-object v0
.end method
