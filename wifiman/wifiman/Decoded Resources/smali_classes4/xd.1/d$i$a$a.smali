.class final Lxd/d$i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d$i$a;->b(Lc8/b;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lxd/d$i$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd/d$i$a$a;

    invoke-direct {v0}, Lxd/d$i$a$a;-><init>()V

    sput-object v0, Lxd/d$i$a$a;->a:Lxd/d$i$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;)LIa/l;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LIa/l;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LIa/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;

    invoke-virtual {p0, p1}, Lxd/d$i$a$a;->a(Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;)LIa/l;

    move-result-object p1

    return-object p1
.end method
