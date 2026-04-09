.class public final Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001b\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u008c\u0002\u0010\u001a\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010&\u001a\u0004\u0008(\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010&\u001a\u0004\u0008*\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010&\u001a\u0004\u0008+\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010&\u001a\u0004\u0008,\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010&\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010&\u001a\u0004\u0008/\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00080\u0010&\u001a\u0004\u0008%\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010&\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010&\u001a\u0004\u00083\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010&\u001a\u0004\u00085\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010&\u001a\u0004\u00086\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010&\u001a\u0004\u00087\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00082\u0010&\u001a\u0004\u0008.\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010&\u001a\u0004\u00088\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00088\u0010&\u001a\u0004\u00084\u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010&\u001a\u0004\u00080\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010&\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010&\u001a\u0004\u00089\u0010\u001dR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010&\u001a\u0004\u0008)\u0010\u001dR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010&\u001a\u0004\u0008:\u0010\u001d\u00a8\u0006;"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;",
        "",
        "",
        "ssid",
        "bssid",
        "frequency",
        "channel",
        "channelCenter",
        "channelCeter2",
        "supportedBandwidth",
        "bandwidth",
        "spatialStreams",
        "rssi",
        "mcs",
        "transmitPower",
        "wifiRTTSupported",
        "channelUtilization",
        "stationCount",
        "ieeeMode",
        "encryption",
        "encryptionCipher",
        "supportedDataRates",
        "capabilities",
        "ubntFlags",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "o",
        "b",
        "c",
        "j",
        "d",
        "e",
        "f",
        "g",
        "q",
        "h",
        "i",
        "n",
        "m",
        "k",
        "l",
        "s",
        "u",
        "p",
        "r",
        "t",
        "wifiman-wizard_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final r:Ljava/lang/String;

.field private final s:Ljava/lang/String;

.field private final t:Ljava/lang/String;

.field private final u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ssid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "bssid"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "freq"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_s0"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_s1"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sbw"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "bw"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "nss"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "rssi"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "mcs"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "tpc"
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "rtt"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_util"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sta_cnt"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "std"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "akm"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "cipher"
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sdr"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "cap"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ubnt_flags"
        .end annotation
    .end param

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    move-object v1, p11

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    move-object v1, p12

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    move-object v1, p13

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;
    .locals 23
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ssid"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "bssid"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "freq"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_s0"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_s1"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sbw"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "bw"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "nss"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "rssi"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "mcs"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "tpc"
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "rtt"
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ch_util"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sta_cnt"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "std"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "akm"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "cipher"
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sdr"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "cap"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "ubnt_flags"
        .end annotation
    .end param

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    new-instance v22, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-object/from16 v0, v22

    invoke-direct/range {v0 .. v21}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v22
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    if-nez v2, :cond_12

    move v2, v1

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    if-nez v2, :cond_14

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b:Ljava/lang/String;

    iget-object v3, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c:Ljava/lang/String;

    iget-object v4, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d:Ljava/lang/String;

    iget-object v5, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e:Ljava/lang/String;

    iget-object v6, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f:Ljava/lang/String;

    iget-object v7, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g:Ljava/lang/String;

    iget-object v8, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h:Ljava/lang/String;

    iget-object v9, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i:Ljava/lang/String;

    iget-object v10, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j:Ljava/lang/String;

    iget-object v11, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k:Ljava/lang/String;

    iget-object v12, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l:Ljava/lang/String;

    iget-object v13, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    iget-object v14, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n:Ljava/lang/String;

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v15

    const-string v15, "Result(ssid="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frequency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelCenter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelCeter2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedBandwidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bandwidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", spatialStreams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rssi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mcs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", transmitPower="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", wifiRTTSupported="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelUtilization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stationCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ieeeMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", encryption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", encryptionCipher="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportedDataRates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", capabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ubntFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m:Ljava/lang/String;

    return-object v0
.end method
