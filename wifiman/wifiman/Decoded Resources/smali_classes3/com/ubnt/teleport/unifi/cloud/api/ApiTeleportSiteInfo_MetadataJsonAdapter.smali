.class public final Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010\u001a\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;",
        "LY6/h;",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        "LY6/r;",
        "moshi",
        "<init>",
        "(LY6/r;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "LY6/k;",
        "reader",
        "l",
        "(LY6/k;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "",
        "b",
        "LY6/h;",
        "nullableLongAdapter",
        "c",
        "nullableStringAdapter",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;",
        "d",
        "nullableOwnerAdapter",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;",
        "e",
        "nullableLocationAdapter",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:LY6/k$b;

.field private final b:LY6/h;

.field private final c:LY6/h;

.field private final d:LY6/h;

.field private final e:LY6/h;


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 10

    const-string/jumbo v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LY6/h;-><init>()V

    const-string/jumbo v8, "consoleType"

    const-string/jumbo v9, "location"

    const-string/jumbo v1, "consoleFingerprintEngineId"

    const-string/jumbo v2, "consoleDeviceIconId"

    const-string/jumbo v3, "consoleUidbIconId"

    const-string/jumbo v4, "owner"

    const-string/jumbo v5, "wanIp"

    const-string/jumbo v6, "name"

    const-string/jumbo v7, "localNetworkName"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v0

    const-string/jumbo v1, "of(\"consoleFingerprintEn\u2026consoleType\", \"location\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string/jumbo v1, "imageEngine"

    const-class v2, Ljava/lang/Long;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v1, "moshi.adapter(Long::clas\u2026mptySet(), \"imageEngine\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->b:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string/jumbo v1, "imageIdUidb"

    const-class v2, Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v1, "moshi.adapter(String::cl\u2026mptySet(), \"imageIdUidb\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string/jumbo v1, "owner"

    const-class v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v0

    const-string/jumbo v1, "moshi.adapter(ApiTelepor\u2026ava, emptySet(), \"owner\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->d:LY6/h;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    const-string/jumbo v1, "location"

    const-class v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;

    invoke-virtual {p1, v2, v0, v1}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object p1

    const-string/jumbo v0, "moshi.adapter(ApiTelepor\u2026, emptySet(), \"location\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->e:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->l(LY6/k;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    invoke-virtual {p0, p1, p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->m(LY6/o;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;
    .locals 11

    const-string/jumbo v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LY6/k;->g()V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    :goto_0
    invoke-virtual {p1}, LY6/k;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->a:LY6/k$b;

    invoke-virtual {p1, v0}, LY6/k;->p0(LY6/k$b;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->e:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->d:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Long;

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    goto :goto_0

    :pswitch_9
    invoke-virtual {p1}, LY6/k;->t0()V

    invoke-virtual {p1}, LY6/k;->u0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LY6/k;->j()V

    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-object v1, p1

    invoke-direct/range {v1 .. v10}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;)V

    return-object p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(LY6/o;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V
    .locals 2

    const-string/jumbo v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string/jumbo v0, "consoleFingerprintEngineId"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "consoleDeviceIconId"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "consoleUidbIconId"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "owner"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->d:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->e()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "wanIp"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "name"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "localNetworkName"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "consoleType"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->c:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string/jumbo v0, "location"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo_MetadataJsonAdapter;->e:LY6/h;

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ApiTeleportSiteInfo.Metadata"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
