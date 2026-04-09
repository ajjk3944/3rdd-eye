.class public final Lmb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/l$a;,
        Lmb/l$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u00089\u0008\u0087\u0008\u0018\u0000 u2\u00020\u0001:\u0002ADB\u00a5\u0002\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000c\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000c\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008$\u0010%B\u0095\u0002\u0008\u0010\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000c\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000c\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008$\u0010*J\'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102J\u001d\u00106\u001a\u0002002\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020&\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020&\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u00109J\u001a\u0010?\u001a\u00020\u00042\u0008\u0010>\u001a\u0004\u0018\u00010=H\u00d6\u0003\u00a2\u0006\u0004\u0008?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010GR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010KR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008L\u0010B\u001a\u0004\u0008M\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010B\u001a\u0004\u0008O\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010B\u001a\u0004\u0008P\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008Q\u0010B\u001a\u0004\u0008R\u0010;R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010S\u001a\u0004\u0008T\u0010UR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008O\u0010B\u001a\u0004\u0008V\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010B\u001a\u0004\u0008X\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010B\u001a\u0004\u0008Y\u0010;R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008Z\u0010E\u001a\u0004\u0008Z\u0010GR\u0017\u0010\u0012\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008[\u0010E\u001a\u0004\u0008[\u0010GR\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010S\u001a\u0004\u0008H\u0010UR\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\\\u0010S\u001a\u0004\u0008]\u0010UR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008^\u0010_\u001a\u0004\u0008Q\u0010`R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008a\u0010b\u001a\u0004\u0008N\u0010cR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008d\u0010B\u001a\u0004\u0008W\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010hR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008i\u0010B\u001a\u0004\u0008j\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008k\u0010l\u001a\u0004\u0008L\u0010mR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008n\u0010B\u001a\u0004\u0008o\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006\u00a2\u0006\u000c\n\u0004\u0008p\u0010q\u001a\u0004\u0008r\u0010sR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008t\u0010B\u001a\u0004\u0008D\u0010;\u00a8\u0006v"
    }
    d2 = {
        "Lmb/l;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "owner",
        "",
        "lastConnectionStateChange",
        "hardwareId",
        "name",
        "mac",
        "ip",
        "",
        "addresses",
        "hostname",
        "directConnectDomain",
        "version",
        "isConnected",
        "isUpdating",
        "Lmb/x;",
        "controllers",
        "apps",
        "Lmb/h;",
        "location",
        "Lmb/p;",
        "hardware",
        "ncaToken",
        "Lmb/c;",
        "availableControllers",
        "timezone",
        "Lmb/f;",
        "features",
        "latestAvailableVersion",
        "Lmb/C;",
        "uidb",
        "anonid",
        "<init>",
        "(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;)V",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "n",
        "(Lmb/l;LYi/d;LXi/f;)V",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "f",
        "b",
        "Z",
        "k",
        "()Z",
        "c",
        "J",
        "getLastConnectionStateChange",
        "()J",
        "d",
        "getHardwareId",
        "e",
        "i",
        "h",
        "g",
        "getIp",
        "Ljava/util/List;",
        "getAddresses",
        "()Ljava/util/List;",
        "getHostname",
        "j",
        "getDirectConnectDomain",
        "getVersion",
        "l",
        "m",
        "o",
        "getApps",
        "p",
        "Lmb/h;",
        "()Lmb/h;",
        "q",
        "Lmb/p;",
        "()Lmb/p;",
        "r",
        "s",
        "Lmb/c;",
        "getAvailableControllers",
        "()Lmb/c;",
        "t",
        "getTimezone",
        "u",
        "Lmb/f;",
        "()Lmb/f;",
        "v",
        "getLatestAvailableVersion",
        "w",
        "Lmb/C;",
        "getUidb",
        "()Lmb/C;",
        "x",
        "Companion",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lmb/l;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lmb/l$b;

.field private static final y:[LVi/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:J

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/util/List;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Z

.field private final m:Z

.field private final n:Ljava/util/List;

.field private final o:Ljava/util/List;

.field private final p:Lmb/h;

.field private final q:Lmb/p;

.field private final r:Ljava/lang/String;

.field private final s:Lmb/c;

.field private final t:Ljava/lang/String;

.field private final u:Lmb/f;

.field private final v:Ljava/lang/String;

.field private final w:Lmb/C;

.field private final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lmb/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/l;->Companion:Lmb/l$b;

    new-instance v0, Lmb/l$c;

    invoke-direct {v0}, Lmb/l$c;-><init>()V

    sput-object v0, Lmb/l;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, LZi/f;

    sget-object v2, LZi/W0;->a:LZi/W0;

    invoke-direct {v0, v2}, LZi/f;-><init>(LVi/b;)V

    new-instance v2, LZi/f;

    sget-object v3, Lmb/x;->Companion:Lmb/x$a;

    invoke-virtual {v3}, Lmb/x$a;->serializer()LVi/b;

    move-result-object v4

    invoke-direct {v2, v4}, LZi/f;-><init>(LVi/b;)V

    new-instance v4, LZi/f;

    invoke-virtual {v3}, Lmb/x$a;->serializer()LVi/b;

    move-result-object v3

    invoke-direct {v4, v3}, LZi/f;-><init>(LVi/b;)V

    const/16 v3, 0x18

    new-array v3, v3, [LVi/b;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v1, v3, v5

    const/4 v5, 0x6

    aput-object v1, v3, v5

    const/4 v5, 0x7

    aput-object v0, v3, v5

    const/16 v0, 0x8

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v2, v3, v0

    const/16 v0, 0xe

    aput-object v4, v3, v0

    const/16 v0, 0xf

    aput-object v1, v3, v0

    const/16 v0, 0x10

    aput-object v1, v3, v0

    const/16 v0, 0x11

    aput-object v1, v3, v0

    const/16 v0, 0x12

    aput-object v1, v3, v0

    const/16 v0, 0x13

    aput-object v1, v3, v0

    const/16 v0, 0x14

    aput-object v1, v3, v0

    const/16 v0, 0x15

    aput-object v1, v3, v0

    const/16 v0, 0x16

    aput-object v1, v3, v0

    const/16 v0, 0x17

    aput-object v1, v3, v0

    sput-object v3, Lmb/l;->y:[LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;LZi/R0;)V
    .locals 6

    move-object v0, p0

    move v1, p1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_0

    .line 2
    const-string/jumbo v2, "ID"

    .line 3
    :goto_0
    iput-object v2, v0, Lmb/l;->a:Ljava/lang/String;

    goto :goto_1

    :cond_0
    move-object v2, p2

    goto :goto_0

    :goto_1
    and-int/lit8 v2, v1, 0x2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput-boolean v3, v0, Lmb/l;->b:Z

    goto :goto_2

    :cond_1
    move v2, p3

    iput-boolean v2, v0, Lmb/l;->b:Z

    :goto_2
    and-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_2

    const-wide/16 v4, 0x0

    :goto_3
    iput-wide v4, v0, Lmb/l;->c:J

    goto :goto_4

    :cond_2
    move-wide v4, p4

    goto :goto_3

    :goto_4
    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_3

    .line 4
    const-string v2, ""

    .line 5
    :goto_5
    iput-object v2, v0, Lmb/l;->d:Ljava/lang/String;

    goto :goto_6

    :cond_3
    move-object v2, p6

    goto :goto_5

    :goto_6
    and-int/lit8 v2, v1, 0x10

    const/4 v4, 0x0

    if-nez v2, :cond_4

    iput-object v4, v0, Lmb/l;->e:Ljava/lang/String;

    goto :goto_7

    :cond_4
    move-object v2, p7

    iput-object v2, v0, Lmb/l;->e:Ljava/lang/String;

    :goto_7
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_5

    iput-object v4, v0, Lmb/l;->f:Ljava/lang/String;

    goto :goto_8

    :cond_5
    move-object v2, p8

    iput-object v2, v0, Lmb/l;->f:Ljava/lang/String;

    :goto_8
    and-int/lit8 v2, v1, 0x40

    if-nez v2, :cond_6

    iput-object v4, v0, Lmb/l;->g:Ljava/lang/String;

    goto :goto_9

    :cond_6
    move-object v2, p9

    iput-object v2, v0, Lmb/l;->g:Ljava/lang/String;

    :goto_9
    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_7

    .line 6
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    .line 7
    :goto_a
    iput-object v2, v0, Lmb/l;->h:Ljava/util/List;

    goto :goto_b

    :cond_7
    move-object/from16 v2, p10

    goto :goto_a

    :goto_b
    and-int/lit16 v2, v1, 0x100

    if-nez v2, :cond_8

    iput-object v4, v0, Lmb/l;->i:Ljava/lang/String;

    goto :goto_c

    :cond_8
    move-object/from16 v2, p11

    iput-object v2, v0, Lmb/l;->i:Ljava/lang/String;

    :goto_c
    and-int/lit16 v2, v1, 0x200

    if-nez v2, :cond_9

    iput-object v4, v0, Lmb/l;->j:Ljava/lang/String;

    goto :goto_d

    :cond_9
    move-object/from16 v2, p12

    iput-object v2, v0, Lmb/l;->j:Ljava/lang/String;

    :goto_d
    and-int/lit16 v2, v1, 0x400

    if-nez v2, :cond_a

    .line 8
    const-string v2, "0.0"

    .line 9
    :goto_e
    iput-object v2, v0, Lmb/l;->k:Ljava/lang/String;

    goto :goto_f

    :cond_a
    move-object/from16 v2, p13

    goto :goto_e

    :goto_f
    and-int/lit16 v2, v1, 0x800

    if-nez v2, :cond_b

    iput-boolean v3, v0, Lmb/l;->l:Z

    goto :goto_10

    :cond_b
    move/from16 v2, p14

    iput-boolean v2, v0, Lmb/l;->l:Z

    :goto_10
    and-int/lit16 v2, v1, 0x1000

    if-nez v2, :cond_c

    iput-boolean v3, v0, Lmb/l;->m:Z

    goto :goto_11

    :cond_c
    move/from16 v2, p15

    iput-boolean v2, v0, Lmb/l;->m:Z

    :goto_11
    and-int/lit16 v2, v1, 0x2000

    if-nez v2, :cond_d

    .line 10
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    .line 11
    :goto_12
    iput-object v2, v0, Lmb/l;->n:Ljava/util/List;

    goto :goto_13

    :cond_d
    move-object/from16 v2, p16

    goto :goto_12

    :goto_13
    and-int/lit16 v2, v1, 0x4000

    if-nez v2, :cond_e

    .line 12
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    .line 13
    :goto_14
    iput-object v2, v0, Lmb/l;->o:Ljava/util/List;

    goto :goto_15

    :cond_e
    move-object/from16 v2, p17

    goto :goto_14

    :goto_15
    const v2, 0x8000

    and-int/2addr v2, v1

    if-nez v2, :cond_f

    iput-object v4, v0, Lmb/l;->p:Lmb/h;

    goto :goto_16

    :cond_f
    move-object/from16 v2, p18

    iput-object v2, v0, Lmb/l;->p:Lmb/h;

    :goto_16
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-nez v2, :cond_10

    iput-object v4, v0, Lmb/l;->q:Lmb/p;

    goto :goto_17

    :cond_10
    move-object/from16 v2, p19

    iput-object v2, v0, Lmb/l;->q:Lmb/p;

    :goto_17
    const/high16 v2, 0x20000

    and-int/2addr v2, v1

    if-nez v2, :cond_11

    iput-object v4, v0, Lmb/l;->r:Ljava/lang/String;

    goto :goto_18

    :cond_11
    move-object/from16 v2, p20

    iput-object v2, v0, Lmb/l;->r:Ljava/lang/String;

    :goto_18
    const/high16 v2, 0x40000

    and-int/2addr v2, v1

    if-nez v2, :cond_12

    iput-object v4, v0, Lmb/l;->s:Lmb/c;

    goto :goto_19

    :cond_12
    move-object/from16 v2, p21

    iput-object v2, v0, Lmb/l;->s:Lmb/c;

    :goto_19
    const/high16 v2, 0x80000

    and-int/2addr v2, v1

    if-nez v2, :cond_13

    iput-object v4, v0, Lmb/l;->t:Ljava/lang/String;

    goto :goto_1a

    :cond_13
    move-object/from16 v2, p22

    iput-object v2, v0, Lmb/l;->t:Ljava/lang/String;

    :goto_1a
    const/high16 v2, 0x100000

    and-int/2addr v2, v1

    if-nez v2, :cond_14

    iput-object v4, v0, Lmb/l;->u:Lmb/f;

    goto :goto_1b

    :cond_14
    move-object/from16 v2, p23

    iput-object v2, v0, Lmb/l;->u:Lmb/f;

    :goto_1b
    const/high16 v2, 0x200000

    and-int/2addr v2, v1

    if-nez v2, :cond_15

    iput-object v4, v0, Lmb/l;->v:Ljava/lang/String;

    goto :goto_1c

    :cond_15
    move-object/from16 v2, p24

    iput-object v2, v0, Lmb/l;->v:Ljava/lang/String;

    :goto_1c
    const/high16 v2, 0x400000

    and-int/2addr v2, v1

    if-nez v2, :cond_16

    iput-object v4, v0, Lmb/l;->w:Lmb/C;

    goto :goto_1d

    :cond_16
    move-object/from16 v2, p25

    iput-object v2, v0, Lmb/l;->w:Lmb/C;

    :goto_1d
    const/high16 v2, 0x800000

    and-int/2addr v1, v2

    if-nez v1, :cond_17

    iput-object v4, v0, Lmb/l;->x:Ljava/lang/String;

    goto :goto_1e

    :cond_17
    move-object/from16 v1, p26

    iput-object v1, v0, Lmb/l;->x:Ljava/lang/String;

    :goto_1e
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;)V
    .locals 9

    move-object v0, p0

    move-object v1, p1

    move-object v2, p5

    move-object/from16 v3, p9

    move-object/from16 v4, p12

    move-object/from16 v5, p15

    move-object/from16 v6, p16

    const-string/jumbo v7, "id"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "hardwareId"

    invoke-static {p5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "addresses"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "version"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "controllers"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v7, "apps"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object v1, v0, Lmb/l;->a:Ljava/lang/String;

    move v1, p2

    .line 16
    iput-boolean v1, v0, Lmb/l;->b:Z

    move-wide v7, p3

    .line 17
    iput-wide v7, v0, Lmb/l;->c:J

    .line 18
    iput-object v2, v0, Lmb/l;->d:Ljava/lang/String;

    move-object v1, p6

    .line 19
    iput-object v1, v0, Lmb/l;->e:Ljava/lang/String;

    move-object/from16 v1, p7

    .line 20
    iput-object v1, v0, Lmb/l;->f:Ljava/lang/String;

    move-object/from16 v1, p8

    .line 21
    iput-object v1, v0, Lmb/l;->g:Ljava/lang/String;

    .line 22
    iput-object v3, v0, Lmb/l;->h:Ljava/util/List;

    move-object/from16 v1, p10

    .line 23
    iput-object v1, v0, Lmb/l;->i:Ljava/lang/String;

    move-object/from16 v1, p11

    .line 24
    iput-object v1, v0, Lmb/l;->j:Ljava/lang/String;

    .line 25
    iput-object v4, v0, Lmb/l;->k:Ljava/lang/String;

    move/from16 v1, p13

    .line 26
    iput-boolean v1, v0, Lmb/l;->l:Z

    move/from16 v1, p14

    .line 27
    iput-boolean v1, v0, Lmb/l;->m:Z

    .line 28
    iput-object v5, v0, Lmb/l;->n:Ljava/util/List;

    .line 29
    iput-object v6, v0, Lmb/l;->o:Ljava/util/List;

    move-object/from16 v1, p17

    .line 30
    iput-object v1, v0, Lmb/l;->p:Lmb/h;

    move-object/from16 v1, p18

    .line 31
    iput-object v1, v0, Lmb/l;->q:Lmb/p;

    move-object/from16 v1, p19

    .line 32
    iput-object v1, v0, Lmb/l;->r:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 33
    iput-object v1, v0, Lmb/l;->s:Lmb/c;

    move-object/from16 v1, p21

    .line 34
    iput-object v1, v0, Lmb/l;->t:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 35
    iput-object v1, v0, Lmb/l;->u:Lmb/f;

    move-object/from16 v1, p23

    .line 36
    iput-object v1, v0, Lmb/l;->v:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 37
    iput-object v1, v0, Lmb/l;->w:Lmb/C;

    move-object/from16 v1, p25

    .line 38
    iput-object v1, v0, Lmb/l;->x:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[LVi/b;
    .locals 1

    sget-object v0, Lmb/l;->y:[LVi/b;

    return-object v0
.end method

.method public static final synthetic n(Lmb/l;LYi/d;LXi/f;)V
    .locals 6

    sget-object v0, Lmb/l;->y:[LVi/b;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lmb/l;->a:Ljava/lang/String;

    const-string/jumbo v3, "ID"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lmb/l;->a:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lmb/l;->b:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lmb/l;->b:Z

    invoke-interface {p1, p2, v1, v2}, LYi/d;->i(LXi/f;IZ)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v2, p0, Lmb/l;->c:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    :goto_2
    iget-wide v2, p0, Lmb/l;->c:J

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->p(LXi/f;IJ)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lmb/l;->d:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lmb/l;->d:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lmb/l;->e:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, LZi/W0;->a:LZi/W0;

    iget-object v3, p0, Lmb/l;->e:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lmb/l;->f:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, LZi/W0;->a:LZi/W0;

    iget-object v3, p0, Lmb/l;->f:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lmb/l;->g:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, LZi/W0;->a:LZi/W0;

    iget-object v3, p0, Lmb/l;->g:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lmb/l;->h:Ljava/util/List;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :goto_7
    aget-object v2, v0, v1

    iget-object v3, p0, Lmb/l;->h:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lmb/l;->i:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, LZi/W0;->a:LZi/W0;

    iget-object v3, p0, Lmb/l;->i:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lmb/l;->j:Ljava/lang/String;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, LZi/W0;->a:LZi/W0;

    iget-object v3, p0, Lmb/l;->j:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lmb/l;->k:Ljava/lang/String;

    const-string v3, "0.0"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :goto_a
    iget-object v2, p0, Lmb/l;->k:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    :cond_15
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-boolean v2, p0, Lmb/l;->l:Z

    if-eqz v2, :cond_17

    :goto_b
    iget-boolean v2, p0, Lmb/l;->l:Z

    invoke-interface {p1, p2, v1, v2}, LYi/d;->i(LXi/f;IZ)V

    :cond_17
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-boolean v2, p0, Lmb/l;->m:Z

    if-eqz v2, :cond_19

    :goto_c
    iget-boolean v2, p0, Lmb/l;->m:Z

    invoke-interface {p1, p2, v1, v2}, LYi/d;->i(LXi/f;IZ)V

    :cond_19
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lmb/l;->n:Ljava/util/List;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :goto_d
    aget-object v2, v0, v1

    iget-object v3, p0, Lmb/l;->n:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1b
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lmb/l;->o:Ljava/util/List;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    :goto_e
    aget-object v0, v0, v1

    iget-object v2, p0, Lmb/l;->o:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v1, p0, Lmb/l;->p:Lmb/h;

    if-eqz v1, :cond_1f

    :goto_f
    sget-object v1, Lmb/h$a;->a:Lmb/h$a;

    iget-object v2, p0, Lmb/l;->p:Lmb/h;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1f
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_10

    :cond_20
    iget-object v1, p0, Lmb/l;->q:Lmb/p;

    if-eqz v1, :cond_21

    :goto_10
    sget-object v1, Lmb/p$a;->a:Lmb/p$a;

    iget-object v2, p0, Lmb/l;->q:Lmb/p;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_21
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_11

    :cond_22
    iget-object v1, p0, Lmb/l;->r:Ljava/lang/String;

    if-eqz v1, :cond_23

    :goto_11
    sget-object v1, LZi/W0;->a:LZi/W0;

    iget-object v2, p0, Lmb/l;->r:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_23
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_24

    goto :goto_12

    :cond_24
    iget-object v1, p0, Lmb/l;->s:Lmb/c;

    if-eqz v1, :cond_25

    :goto_12
    sget-object v1, Lmb/c$a;->a:Lmb/c$a;

    iget-object v2, p0, Lmb/l;->s:Lmb/c;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_25
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_13

    :cond_26
    iget-object v1, p0, Lmb/l;->t:Ljava/lang/String;

    if-eqz v1, :cond_27

    :goto_13
    sget-object v1, LZi/W0;->a:LZi/W0;

    iget-object v2, p0, Lmb/l;->t:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_27
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_28

    goto :goto_14

    :cond_28
    iget-object v1, p0, Lmb/l;->u:Lmb/f;

    if-eqz v1, :cond_29

    :goto_14
    sget-object v1, Lmb/f$a;->a:Lmb/f$a;

    iget-object v2, p0, Lmb/l;->u:Lmb/f;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_29
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_2a

    goto :goto_15

    :cond_2a
    iget-object v1, p0, Lmb/l;->v:Ljava/lang/String;

    if-eqz v1, :cond_2b

    :goto_15
    sget-object v1, LZi/W0;->a:LZi/W0;

    iget-object v2, p0, Lmb/l;->v:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_2b
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v0

    if-eqz v0, :cond_2c

    goto :goto_16

    :cond_2c
    iget-object v0, p0, Lmb/l;->w:Lmb/C;

    if-eqz v0, :cond_2d

    :goto_16
    sget-object v0, Lmb/C$a;->a:Lmb/C$a;

    iget-object v1, p0, Lmb/l;->w:Lmb/C;

    const/16 v2, 0x16

    invoke-interface {p1, p2, v2, v0, v1}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_2d
    const/16 v0, 0x17

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_17

    :cond_2e
    iget-object v0, p0, Lmb/l;->x:Ljava/lang/String;

    if-eqz v0, :cond_2f

    :goto_17
    sget-object v0, LZi/W0;->a:LZi/W0;

    iget-object p0, p0, Lmb/l;->x:Ljava/lang/String;

    const/16 v1, 0x17

    invoke-interface {p1, p2, v1, v0, p0}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_2f
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/l;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lmb/l;->n:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lmb/f;
    .locals 1

    iget-object v0, p0, Lmb/l;->u:Lmb/f;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lmb/p;
    .locals 1

    iget-object v0, p0, Lmb/l;->q:Lmb/p;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmb/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmb/l;

    iget-object v1, p0, Lmb/l;->a:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lmb/l;->b:Z

    iget-boolean v3, p1, Lmb/l;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lmb/l;->c:J

    iget-wide v5, p1, Lmb/l;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lmb/l;->d:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lmb/l;->e:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lmb/l;->f:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lmb/l;->g:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lmb/l;->h:Ljava/util/List;

    iget-object v3, p1, Lmb/l;->h:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lmb/l;->i:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lmb/l;->j:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lmb/l;->k:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lmb/l;->l:Z

    iget-boolean v3, p1, Lmb/l;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lmb/l;->m:Z

    iget-boolean v3, p1, Lmb/l;->m:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lmb/l;->n:Ljava/util/List;

    iget-object v3, p1, Lmb/l;->n:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lmb/l;->o:Ljava/util/List;

    iget-object v3, p1, Lmb/l;->o:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lmb/l;->p:Lmb/h;

    iget-object v3, p1, Lmb/l;->p:Lmb/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lmb/l;->q:Lmb/p;

    iget-object v3, p1, Lmb/l;->q:Lmb/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lmb/l;->r:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->r:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lmb/l;->s:Lmb/c;

    iget-object v3, p1, Lmb/l;->s:Lmb/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lmb/l;->t:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->t:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lmb/l;->u:Lmb/f;

    iget-object v3, p1, Lmb/l;->u:Lmb/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lmb/l;->v:Ljava/lang/String;

    iget-object v3, p1, Lmb/l;->v:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lmb/l;->w:Lmb/C;

    iget-object v3, p1, Lmb/l;->w:Lmb/C;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lmb/l;->x:Ljava/lang/String;

    iget-object p1, p1, Lmb/l;->x:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Lmb/h;
    .locals 1

    iget-object v0, p0, Lmb/l;->p:Lmb/h;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/l;->f:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lmb/l;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lmb/l;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lmb/l;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->e:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->f:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->g:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->h:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->i:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->j:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->k:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lmb/l;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lmb/l;->m:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->n:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->o:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->p:Lmb/h;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lmb/h;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->q:Lmb/p;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lmb/p;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->r:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->s:Lmb/c;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lmb/c;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->t:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->u:Lmb/f;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lmb/f;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->v:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->w:Lmb/C;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Lmb/C;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmb/l;->x:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/l;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/l;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lmb/l;->b:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lmb/l;->l:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lmb/l;->m:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lmb/l;->a:Ljava/lang/String;

    iget-boolean v2, v0, Lmb/l;->b:Z

    iget-wide v3, v0, Lmb/l;->c:J

    iget-object v5, v0, Lmb/l;->d:Ljava/lang/String;

    iget-object v6, v0, Lmb/l;->e:Ljava/lang/String;

    iget-object v7, v0, Lmb/l;->f:Ljava/lang/String;

    iget-object v8, v0, Lmb/l;->g:Ljava/lang/String;

    iget-object v9, v0, Lmb/l;->h:Ljava/util/List;

    iget-object v10, v0, Lmb/l;->i:Ljava/lang/String;

    iget-object v11, v0, Lmb/l;->j:Ljava/lang/String;

    iget-object v12, v0, Lmb/l;->k:Ljava/lang/String;

    iget-boolean v13, v0, Lmb/l;->l:Z

    iget-boolean v14, v0, Lmb/l;->m:Z

    iget-object v15, v0, Lmb/l;->n:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lmb/l;->o:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lmb/l;->p:Lmb/h;

    move-object/from16 v18, v15

    iget-object v15, v0, Lmb/l;->q:Lmb/p;

    move-object/from16 v19, v15

    iget-object v15, v0, Lmb/l;->r:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lmb/l;->s:Lmb/c;

    move-object/from16 v21, v15

    iget-object v15, v0, Lmb/l;->t:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lmb/l;->u:Lmb/f;

    move-object/from16 v23, v15

    iget-object v15, v0, Lmb/l;->v:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lmb/l;->w:Lmb/C;

    move-object/from16 v25, v15

    iget-object v15, v0, Lmb/l;->x:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v15

    const-string v15, "Device(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lastConnectionStateChange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", hardwareId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addresses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hostname="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", directConnectDomain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isConnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isUpdating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", controllers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", apps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hardware="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ncaToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", availableControllers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timezone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latestAvailableVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uidb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", anonid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string/jumbo v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lmb/l;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lmb/l;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lmb/l;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->h:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lmb/l;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lmb/l;->l:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lmb/l;->m:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lmb/l;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmb/l;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lmb/l;->p:Lmb/h;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lmb/h;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lmb/l;->q:Lmb/p;

    if-nez v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lmb/p;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lmb/l;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->s:Lmb/c;

    if-nez v0, :cond_4

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lmb/c;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object v0, p0, Lmb/l;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->u:Lmb/f;

    if-nez v0, :cond_5

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lmb/f;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v0, p0, Lmb/l;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lmb/l;->w:Lmb/C;

    if-nez v0, :cond_6

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lmb/C;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object p2, p0, Lmb/l;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
