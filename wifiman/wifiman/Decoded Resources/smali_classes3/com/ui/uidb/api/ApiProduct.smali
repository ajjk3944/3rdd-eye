.class public final Lcom/ui/uidb/api/ApiProduct;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/uidb/api/ApiProduct$Btle;,
        Lcom/ui/uidb/api/ApiProduct$a;,
        Lcom/ui/uidb/api/ApiProduct$Line;,
        Lcom/ui/uidb/api/ApiProduct$Names;,
        Lcom/ui/uidb/api/ApiProduct$Triplet;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008.\u0008\u0081\u0008\u0018\u0000 L2\u00020\u0001:\u0005MNOP)B\u0083\u0002\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0008\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0016\u0008\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\u0008\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c\u0012\u0010\u0008\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\u0008\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c\u0012\u0010\u0008\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0016\u0008\u0001\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u008c\u0002\u0010\u001f\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0016\u0008\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0010\u0008\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c2\u0010\u0008\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\u0008\u0003\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c2\u0010\u0008\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c2\n\u0008\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\u0008\u0003\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010\'\u001a\u00020\u001b2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010*\u001a\u0004\u00084\u0010\"R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00085\u00107R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00106\u001a\u0004\u00088\u00107R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010:\u001a\u0004\u00089\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010>\u001a\u0004\u0008?\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010E\u001a\u0004\u0008)\u0010FR\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010:\u001a\u0004\u0008A\u0010<R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010:\u001a\u0004\u00080\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010G\u001a\u0004\u0008,\u0010HR%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00106\u001a\u0004\u0008=\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008I\u0010K\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/ui/uidb/api/ApiProduct;",
        "",
        "",
        "id",
        "Lcom/ui/uidb/api/ApiProduct$Names;",
        "names",
        "Lcom/ui/uidb/api/ApiProduct$Line;",
        "line",
        "type",
        "",
        "image",
        "video",
        "",
        "systemIds",
        "Lcom/ui/uidb/api/ApiProduct$Triplet;",
        "lookupTriplets",
        "Lcom/ui/uidb/api/ApiProductUnifi;",
        "unifi",
        "Lcom/ui/uidb/api/ApiProductUisp;",
        "uisp",
        "Lcom/ui/uidb/api/ApiProduct$Btle;",
        "btle",
        "shortnames",
        "guids",
        "Lcom/ui/uidb/api/ApiProductCompliance;",
        "compliance",
        "minAdoptVersion",
        "",
        "isArSupported",
        "<init>",
        "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)V",
        "copy",
        "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/ui/uidb/api/ApiProduct;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "d",
        "b",
        "Lcom/ui/uidb/api/ApiProduct$Names;",
        "i",
        "()Lcom/ui/uidb/api/ApiProduct$Names;",
        "c",
        "Lcom/ui/uidb/api/ApiProduct$Line;",
        "f",
        "()Lcom/ui/uidb/api/ApiProduct$Line;",
        "l",
        "e",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "o",
        "g",
        "Ljava/util/List;",
        "k",
        "()Ljava/util/List;",
        "h",
        "Lcom/ui/uidb/api/ApiProductUnifi;",
        "n",
        "()Lcom/ui/uidb/api/ApiProductUnifi;",
        "j",
        "Lcom/ui/uidb/api/ApiProductUisp;",
        "m",
        "()Lcom/ui/uidb/api/ApiProductUisp;",
        "Lcom/ui/uidb/api/ApiProduct$Btle;",
        "()Lcom/ui/uidb/api/ApiProduct$Btle;",
        "Lcom/ui/uidb/api/ApiProductCompliance;",
        "()Lcom/ui/uidb/api/ApiProductCompliance;",
        "p",
        "Ljava/lang/Boolean;",
        "()Ljava/lang/Boolean;",
        "q",
        "Names",
        "Line",
        "Triplet",
        "Btle",
        "uidb"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final q:Lcom/ui/uidb/api/ApiProduct$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/uidb/api/ApiProduct$Names;

.field private final c:Lcom/ui/uidb/api/ApiProduct$Line;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;

.field private final g:Ljava/util/List;

.field private final h:Ljava/util/List;

.field private final i:Lcom/ui/uidb/api/ApiProductUnifi;

.field private final j:Lcom/ui/uidb/api/ApiProductUisp;

.field private final k:Lcom/ui/uidb/api/ApiProduct$Btle;

.field private final l:Ljava/util/List;

.field private final m:Ljava/util/List;

.field private final n:Lcom/ui/uidb/api/ApiProductCompliance;

.field private final o:Ljava/util/Map;

.field private final p:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/uidb/api/ApiProduct$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/uidb/api/ApiProduct$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/uidb/api/ApiProduct;->q:Lcom/ui/uidb/api/ApiProduct$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Lcom/ui/uidb/api/ApiProduct$Names;
        .annotation runtime LY6/g;
            name = "product"
        .end annotation
    .end param
    .param p3    # Lcom/ui/uidb/api/ApiProduct$Line;
        .annotation runtime LY6/g;
            name = "line"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "deviceType"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "images"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "videos"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "sysids"
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "triplets"
        .end annotation
    .end param
    .param p9    # Lcom/ui/uidb/api/ApiProductUnifi;
        .annotation runtime LY6/g;
            name = "unifi"
        .end annotation
    .end param
    .param p10    # Lcom/ui/uidb/api/ApiProductUisp;
        .annotation runtime LY6/g;
            name = "uisp"
        .end annotation
    .end param
    .param p11    # Lcom/ui/uidb/api/ApiProduct$Btle;
        .annotation runtime LY6/g;
            name = "btle"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "shortnames"
        .end annotation
    .end param
    .param p13    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "guids"
        .end annotation
    .end param
    .param p14    # Lcom/ui/uidb/api/ApiProductCompliance;
        .annotation runtime LY6/g;
            name = "compliance"
        .end annotation
    .end param
    .param p15    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "minAdoptVersion"
        .end annotation
    .end param
    .param p16    # Ljava/lang/Boolean;
        .annotation runtime LY6/g;
            name = "isARSupported"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ui/uidb/api/ApiProduct$Names;",
            "Lcom/ui/uidb/api/ApiProduct$Line;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ui/uidb/api/ApiProduct$Triplet;",
            ">;",
            "Lcom/ui/uidb/api/ApiProductUnifi;",
            "Lcom/ui/uidb/api/ApiProductUisp;",
            "Lcom/ui/uidb/api/ApiProduct$Btle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ui/uidb/api/ApiProductCompliance;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    move-object v1, p3

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    move-object v1, p4

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    move-object v1, p6

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    move-object v1, p7

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    move-object v1, p8

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    move-object v1, p9

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    move-object v1, p10

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    move-object v1, p11

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    move-object v1, p12

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    move-object v1, p13

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/uidb/api/ApiProduct$Btle;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    return-object v0
.end method

.method public final b()Lcom/ui/uidb/api/ApiProductCompliance;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)Lcom/ui/uidb/api/ApiProduct;
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Lcom/ui/uidb/api/ApiProduct$Names;
        .annotation runtime LY6/g;
            name = "product"
        .end annotation
    .end param
    .param p3    # Lcom/ui/uidb/api/ApiProduct$Line;
        .annotation runtime LY6/g;
            name = "line"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "deviceType"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "images"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "videos"
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "sysids"
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "triplets"
        .end annotation
    .end param
    .param p9    # Lcom/ui/uidb/api/ApiProductUnifi;
        .annotation runtime LY6/g;
            name = "unifi"
        .end annotation
    .end param
    .param p10    # Lcom/ui/uidb/api/ApiProductUisp;
        .annotation runtime LY6/g;
            name = "uisp"
        .end annotation
    .end param
    .param p11    # Lcom/ui/uidb/api/ApiProduct$Btle;
        .annotation runtime LY6/g;
            name = "btle"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "shortnames"
        .end annotation
    .end param
    .param p13    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "guids"
        .end annotation
    .end param
    .param p14    # Lcom/ui/uidb/api/ApiProductCompliance;
        .annotation runtime LY6/g;
            name = "compliance"
        .end annotation
    .end param
    .param p15    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "minAdoptVersion"
        .end annotation
    .end param
    .param p16    # Ljava/lang/Boolean;
        .annotation runtime LY6/g;
            name = "isARSupported"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ui/uidb/api/ApiProduct$Names;",
            "Lcom/ui/uidb/api/ApiProduct$Line;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ui/uidb/api/ApiProduct$Triplet;",
            ">;",
            "Lcom/ui/uidb/api/ApiProductUnifi;",
            "Lcom/ui/uidb/api/ApiProductUisp;",
            "Lcom/ui/uidb/api/ApiProduct$Btle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/ui/uidb/api/ApiProductCompliance;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/ui/uidb/api/ApiProduct;"
        }
    .end annotation

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

    new-instance v17, Lcom/ui/uidb/api/ApiProduct;

    move-object/from16 v0, v17

    invoke-direct/range {v0 .. v16}, Lcom/ui/uidb/api/ApiProduct;-><init>(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct$Names;Lcom/ui/uidb/api/ApiProduct$Line;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductUnifi;Lcom/ui/uidb/api/ApiProductUisp;Lcom/ui/uidb/api/ApiProduct$Btle;Ljava/util/List;Ljava/util/List;Lcom/ui/uidb/api/ApiProductCompliance;Ljava/util/Map;Ljava/lang/Boolean;)V

    return-object v17
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/uidb/api/ApiProduct;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/uidb/api/ApiProduct;

    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final f()Lcom/ui/uidb/api/ApiProduct$Line;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    return-object v0
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Names;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Line;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUnifi;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUisp;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct$Btle;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductCompliance;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    if-nez v2, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/ui/uidb/api/ApiProduct$Names;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Lcom/ui/uidb/api/ApiProductUisp;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    return-object v0
.end method

.method public final n()Lcom/ui/uidb/api/ApiProductUnifi;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    return-object v0
.end method

.method public final o()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    return-object v0
.end method

.method public final p()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/uidb/api/ApiProduct;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/ui/uidb/api/ApiProduct;->b:Lcom/ui/uidb/api/ApiProduct$Names;

    iget-object v3, v0, Lcom/ui/uidb/api/ApiProduct;->c:Lcom/ui/uidb/api/ApiProduct$Line;

    iget-object v4, v0, Lcom/ui/uidb/api/ApiProduct;->d:Ljava/lang/String;

    iget-object v5, v0, Lcom/ui/uidb/api/ApiProduct;->e:Ljava/util/Map;

    iget-object v6, v0, Lcom/ui/uidb/api/ApiProduct;->f:Ljava/util/Map;

    iget-object v7, v0, Lcom/ui/uidb/api/ApiProduct;->g:Ljava/util/List;

    iget-object v8, v0, Lcom/ui/uidb/api/ApiProduct;->h:Ljava/util/List;

    iget-object v9, v0, Lcom/ui/uidb/api/ApiProduct;->i:Lcom/ui/uidb/api/ApiProductUnifi;

    iget-object v10, v0, Lcom/ui/uidb/api/ApiProduct;->j:Lcom/ui/uidb/api/ApiProductUisp;

    iget-object v11, v0, Lcom/ui/uidb/api/ApiProduct;->k:Lcom/ui/uidb/api/ApiProduct$Btle;

    iget-object v12, v0, Lcom/ui/uidb/api/ApiProduct;->l:Ljava/util/List;

    iget-object v13, v0, Lcom/ui/uidb/api/ApiProduct;->m:Ljava/util/List;

    iget-object v14, v0, Lcom/ui/uidb/api/ApiProduct;->n:Lcom/ui/uidb/api/ApiProductCompliance;

    iget-object v15, v0, Lcom/ui/uidb/api/ApiProduct;->o:Ljava/util/Map;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/ui/uidb/api/ApiProduct;->p:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v15

    const-string v15, "ApiProduct(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", names="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", line="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", video="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", systemIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lookupTriplets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unifi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uisp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", btle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shortnames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", guids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", compliance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minAdoptVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isArSupported="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
