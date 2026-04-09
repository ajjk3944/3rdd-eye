.class public final Lcom/ui/speedtest/UiSpeedtestLib;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/speedtest/UiSpeedtestLib$Error;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/speedtest/UiSpeedtestLib;

.field private static b:Li9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/speedtest/UiSpeedtestLib;

    invoke-direct {v0}, Lcom/ui/speedtest/UiSpeedtestLib;-><init>()V

    sput-object v0, Lcom/ui/speedtest/UiSpeedtestLib;->a:Lcom/ui/speedtest/UiSpeedtestLib;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/a;
    .locals 1

    sget-object v0, Lcom/ui/speedtest/UiSpeedtestLib;->b:Li9/a;

    return-object v0
.end method

.method public final b(Li9/a;)V
    .locals 0

    sput-object p1, Lcom/ui/speedtest/UiSpeedtestLib;->b:Li9/a;

    return-void
.end method
