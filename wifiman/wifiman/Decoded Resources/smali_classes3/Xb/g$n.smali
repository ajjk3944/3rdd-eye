.class LXb/g$n;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXb/g;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LXb/g;


# direct methods
.method constructor <init>(LXb/g;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LXb/g$n;->d:LXb/g;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM speedTestMeasurement"

    return-object v0
.end method
