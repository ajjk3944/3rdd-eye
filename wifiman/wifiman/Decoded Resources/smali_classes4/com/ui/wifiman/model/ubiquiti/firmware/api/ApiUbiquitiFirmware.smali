.class public final Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$a;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Link;,
        Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u000312\u001eB\u0097\u0001\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u00a0\u0001\u0010\u0014\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001f\u001a\u0004\u0008\u001e\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008\"\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010\u0017R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010%\u001a\u0004\u0008#\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u001f\u001a\u0004\u0008!\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u001f\u001a\u0004\u0008(\u0010\u0017R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010)\u001a\u0004\u0008,\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010)\u001a\u0004\u0008-\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u001f\u001a\u0004\u0008.\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u0008\'\u00100\u00a8\u00063"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
        "",
        "",
        "id",
        "channel",
        "createdTimestamp",
        "product",
        "",
        "fileSize",
        "checksum",
        "version",
        "",
        "versionMajor",
        "versionMinor",
        "versionPatch",
        "versionPrerelease",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "links",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)V",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "e",
        "b",
        "c",
        "d",
        "g",
        "Ljava/lang/Long;",
        "()Ljava/lang/Long;",
        "f",
        "h",
        "Ljava/lang/Integer;",
        "i",
        "()Ljava/lang/Integer;",
        "j",
        "k",
        "l",
        "Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;",
        "Links",
        "Link",
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
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/Long;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/Integer;

.field private final i:Ljava/lang/Integer;

.field private final j:Ljava/lang/Integer;

.field private final k:Ljava/lang/String;

.field private final l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "channel"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "created"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "product"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "file_size"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sha256_checksum"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_major"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_minor"
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_patch"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version_prerelease"
        .end annotation
    .end param
    .param p12    # Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
        .annotation runtime LY6/g;
            name = "_links"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    iput-object p6, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    iput-object p9, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    iput-object p10, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    iput-object p11, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    iput-object p12, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "channel"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "created"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "product"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "file_size"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "sha256_checksum"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_major"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_minor"
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "version_patch"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version_prerelease"
        .end annotation
    .end param
    .param p12    # Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
        .annotation runtime LY6/g;
            name = "_links"
        .end annotation
    .end param

    new-instance v13, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    move-object v0, v13

    move-object v1, p1

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

    invoke-direct/range {v0 .. v12}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;)V

    return-object v13
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final j()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->e:Ljava/lang/Long;

    iget-object v5, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->g:Ljava/lang/String;

    iget-object v7, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->h:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->i:Ljava/lang/Integer;

    iget-object v9, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->j:Ljava/lang/Integer;

    iget-object v10, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->k:Ljava/lang/String;

    iget-object v11, p0, Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware;->l:Lcom/ui/wifiman/model/ubiquiti/firmware/api/ApiUbiquitiFirmware$Links;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "ApiUbiquitiFirmware(id="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createdTimestamp="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", product="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fileSize="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", checksum="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", versionMajor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versionMinor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versionPatch="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versionPrerelease="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", links="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
