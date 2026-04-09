.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;,
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;,
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008*\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0003JK%B\u0097\u0001\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0010\u0008\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\u0008\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u00a0\u0001\u0010\u0019\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0010\u0008\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\u0008\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010 H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010&\u001a\u0004\u0008.\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010&\u001a\u0004\u00080\u0010(R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010&\u001a\u0004\u00081\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00082\u0010&\u001a\u0004\u00083\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00105\u001a\u0004\u00089\u00107R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008-\u0010<R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010;\u001a\u0004\u0008/\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010@R\u0019\u0010C\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010A\u001a\u0004\u00084\u0010BR\u0019\u0010D\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010A\u001a\u0004\u00082\u0010BR\u0019\u0010E\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u00080\u0010A\u001a\u0004\u0008:\u0010BR\u0019\u0010F\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010A\u001a\u0004\u00088\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010(R\u0013\u0010H\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u00107R\u0013\u0010I\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\u0008>\u00107\u00a8\u0006L"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;",
        "",
        "_latencyMs",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;",
        "server",
        "_statusLatency",
        "_statusDownload",
        "_statusUpload",
        "_statusSummary",
        "",
        "_downloadMbps",
        "_uploadMbps",
        "",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
        "progressDownload",
        "progressUpload",
        "",
        "timestamp",
        "<init>",
        "(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V",
        "id",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;",
        "s",
        "(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;",
        "copy",
        "(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Integer;",
        "m",
        "()Ljava/lang/Integer;",
        "b",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;",
        "e",
        "()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;",
        "c",
        "o",
        "d",
        "n",
        "q",
        "f",
        "p",
        "g",
        "Ljava/lang/Double;",
        "l",
        "()Ljava/lang/Double;",
        "h",
        "r",
        "i",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "j",
        "k",
        "Ljava/lang/Long;",
        "()Ljava/lang/Long;",
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;",
        "()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;",
        "statusLatency",
        "statusDownload",
        "statusUpload",
        "statusSummary",
        "latencyMs",
        "downloadMbps",
        "uploadMbps",
        "Server",
        "Progress",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

.field private final c:Ljava/lang/Integer;

.field private final d:Ljava/lang/Integer;

.field private final e:Ljava/lang/Integer;

.field private final f:Ljava/lang/Integer;

.field private final g:Ljava/lang/Double;

.field private final h:Ljava/lang/Double;

.field private final i:Ljava/util/List;

.field private final j:Ljava/util/List;

.field private final k:Ljava/lang/Long;

.field private final l:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field private final m:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field private final n:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

.field private final o:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "latency"
        .end annotation
    .end param
    .param p2    # Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;
        .annotation runtime LY6/g;
            name = "server"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_ping"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_download"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_upload"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_summary"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Double;
        .annotation runtime LY6/g;
            name = "xput_download"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Double;
        .annotation runtime LY6/g;
            name = "xput_upload"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "download-progress"
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "upload-progress"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "timestamp"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    iput-object p7, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    iput-object p8, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    iput-object p9, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    iput-object p10, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    iput-object p11, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    invoke-direct {p0, p3}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->s(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->l:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-direct {p0, p4}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->s(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->m:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-direct {p0, p5}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->s(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->n:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-direct {p0, p6}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->s(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->o:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-void
.end method

.method private final s(Ljava/lang/Integer;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 3

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->PENDING:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->getId()I

    move-result v1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    goto :goto_3

    :cond_1
    :goto_0
    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->IN_PROGRESS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->getId()I

    move-result v1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_1
    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->COMPLETED:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->getId()I

    move-result v1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v0, 0x0

    :goto_3
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Double;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;
    .locals 13
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "latency"
        .end annotation
    .end param
    .param p2    # Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;
        .annotation runtime LY6/g;
            name = "server"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_ping"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_download"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_upload"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "status_summary"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Double;
        .annotation runtime LY6/g;
            name = "xput_download"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Double;
        .annotation runtime LY6/g;
            name = "xput_upload"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "download-progress"
        .end annotation
    .end param
    .param p10    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "upload-progress"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "timestamp"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;"
        }
    .end annotation

    new-instance v12, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;

    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;-><init>(Ljava/lang/Integer;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V

    return-object v12
.end method

.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    return-object v0
.end method

.method public final e()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->m:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object v0
.end method

.method public final g()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->l:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object v0
.end method

.method public final h()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->o:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->n:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    return-object v0
.end method

.method public final j()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    return-object v0
.end method

.method public final k()Ljava/lang/Double;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final l()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    return-object v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final n()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final o()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final p()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final r()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g:Ljava/lang/Double;

    iget-object v7, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h:Ljava/lang/Double;

    iget-object v8, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i:Ljava/util/List;

    iget-object v9, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->j:Ljava/util/List;

    iget-object v10, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k:Ljava/lang/Long;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "State(_latencyMs="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", server="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _statusLatency="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _statusDownload="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _statusUpload="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _statusSummary="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _downloadMbps="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _uploadMbps="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressDownload="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressUpload="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
