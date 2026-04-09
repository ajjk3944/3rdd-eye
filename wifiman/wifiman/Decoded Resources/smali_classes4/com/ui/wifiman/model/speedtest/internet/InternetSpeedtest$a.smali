.class public final Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/Speedtest$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->a:Z

    iput-boolean p2, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->a:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->b:Z

    return v0
.end method
