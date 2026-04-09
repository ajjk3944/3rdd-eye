.class final Ltd/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/g;->a(LLi/g;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ltd/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/g$b;

    invoke-direct {v0}, Ltd/g$b;-><init>()V

    sput-object v0, Ltd/g$b;->a:Ltd/g$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 1

    const-string v0, "err"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/speedtest/UiSpeedtestLib$Error;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/speedtest/UiSpeedtestLib$Error;

    invoke-static {p1}, Ltd/f;->a(Lcom/ui/speedtest/UiSpeedtestLib$Error;)Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ltd/g$b;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
