.class public abstract LG7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/HashMap;)V
    .locals 11

    const-string/jumbo v0, "x"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x50be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "Track"

    const/16 v3, 0x50be

    const-string/jumbo v4, "track"

    const-string/jumbo v5, "udp"

    invoke-direct {v1, v3, v4, v5, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x514a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "CRTech NLM"

    const/16 v3, 0x514a

    const-string/jumbo v4, "crtech-nlm"

    const-string/jumbo v6, "tcp"

    invoke-direct {v1, v3, v4, v6, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x514a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x514a

    const/4 v3, 0x0

    const-string/jumbo v4, "Reserved"

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5207

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "athand-mmp"

    const-string v7, "At Hand MMP"

    const/16 v8, 0x5207

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5207

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "athand-mmp"

    const-string v7, "AT Hand MMP"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irtrans"

    const-string/jumbo v7, "IRTrans Control"

    const/16 v8, 0x5208

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "irtrans"

    const-string/jumbo v7, "IRTrans Control"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5212

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "notezilla-lan"

    const-string/jumbo v7, "Notezilla.Lan Server"

    const/16 v8, 0x5212

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5212

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5212

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "trinket-agent"

    const-string v7, "Distributed artificial intelligence"

    const/16 v8, 0x52dc

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x52dc

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cohesity-agent"

    const-string v7, "Cohesity backup agents"

    const/16 v8, 0x52dd

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x52dd

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aigairserver"

    const-string/jumbo v7, "Services for Air Server"

    const/16 v8, 0x52e5

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x52e5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x52e5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5431

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rdm-tfs"

    const-string/jumbo v7, "Raima RDM TFS"

    const/16 v8, 0x5431

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5431

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5431

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5432

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dfserver"

    const-string/jumbo v7, "MineScape Design File Server"

    const/16 v8, 0x5432

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5432

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dfserver"

    const-string/jumbo v7, "MineScape Design File Server"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5456

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vofr-gateway"

    const-string/jumbo v7, "VoFR Gateway"

    const/16 v8, 0x5456

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5456

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vofr-gateway"

    const-string/jumbo v7, "VoFR Gateway"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5528

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tvpm"

    const-string/jumbo v7, "TVNC Pro Multiplexing"

    const/16 v8, 0x5528

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5528

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tvpm"

    const-string/jumbo v7, "TVNC Pro Multiplexing"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5529

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sal"

    const-string/jumbo v7, "Safe AutoLogon"

    const/16 v8, 0x5529

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5555

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webphone"

    const-string/jumbo v7, "webphone"

    const/16 v8, 0x5555

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5555

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "webphone"

    const-string/jumbo v7, "webphone"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5556

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-is"

    const-string/jumbo v7, "NetSpeak Corp. Directory Services"

    const/16 v8, 0x5556

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5556

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-is"

    const-string/jumbo v7, "NetSpeak Corp. Directory Services"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5557

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-cs"

    const-string/jumbo v7, "NetSpeak Corp. Connection Services"

    const/16 v8, 0x5557

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5557

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-cs"

    const-string/jumbo v7, "NetSpeak Corp. Connection Services"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5558

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-acd"

    const-string/jumbo v7, "NetSpeak Corp. Automatic Call Distribution"

    const/16 v8, 0x5558

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5558

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-acd"

    const-string/jumbo v7, "NetSpeak Corp. Automatic Call Distribution"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5559

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-cps"

    const-string/jumbo v7, "NetSpeak Corp. Credit Processing System"

    const/16 v8, 0x5559

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5559

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "netspeak-cps"

    const-string/jumbo v7, "NetSpeak Corp. Credit Processing System"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snapenetio"

    const-string/jumbo v7, "SNAPenetIO"

    const/16 v8, 0x55f0

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snapenetio"

    const-string/jumbo v7, "SNAPenetIO"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optocontrol"

    const-string/jumbo v7, "OptoControl"

    const/16 v8, 0x55f1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optocontrol"

    const-string/jumbo v7, "OptoControl"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost002"

    const-string/jumbo v7, "Opto Host Port 2"

    const/16 v8, 0x55f2

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost002"

    const-string/jumbo v7, "Opto Host Port 2"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost003"

    const-string/jumbo v7, "Opto Host Port 3"

    const/16 v8, 0x55f3

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost003"

    const-string/jumbo v7, "Opto Host Port 3"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost004"

    const-string/jumbo v7, "Opto Host Port 4"

    const/16 v8, 0x55f4

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost004"

    const-string/jumbo v7, "Opto Host Port 4"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost004"

    const-string/jumbo v7, "Opto Host Port 5"

    const/16 v8, 0x55f5

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x55f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "optohost004"

    const-string/jumbo v7, "Opto Host Port 5"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x566d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dcap"

    const-string/jumbo v7, "dCache Access Protocol"

    const/16 v8, 0x566d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x566d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x566d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5670

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gsidcap"

    const-string/jumbo v7, "GSI dCache Access Protocol"

    const/16 v8, 0x5670

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5670

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5670

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x56ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "easyengine"

    const-string/jumbo v7, "EasyEngine is CLI tool to manage WordPress Sites on Nginx server"

    const/16 v8, 0x56ce

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x56ce

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x56ce

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5701

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wnn6"

    const-string/jumbo v7, "wnn6"

    const/16 v8, 0x5701

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5701

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wnn6"

    const-string/jumbo v7, "wnn6"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5721

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cis"

    const-string v7, "CompactIS Tunnel"

    const/16 v8, 0x5721

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5721

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cis"

    const-string v7, "CompactIS Tunnel"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x573d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "showcockpit-net"

    const-string/jumbo v7, "ShowCockpit Networking"

    const/16 v8, 0x573d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x573d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "showcockpit-net"

    const-string/jumbo v7, "ShowCockpit Networking"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x573e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x573e

    const-string/jumbo v7, "Unassigned"

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x573f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shrewd-control"

    const-string/jumbo v8, "Initium Labs Security and Automation Control"

    const/16 v9, 0x573f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x573f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shrewd-stream"

    const-string/jumbo v8, "Initium Labs Security and Automation Streaming"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5747

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cis-secure"

    const-string v8, "CompactIS Secure Tunnel"

    const/16 v9, 0x5747

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5747

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cis-secure"

    const-string v8, "CompactIS Secure Tunnel"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wibukey"

    const-string/jumbo v8, "WibuKey Standard WkLan"

    const/16 v9, 0x574b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wibukey"

    const-string/jumbo v8, "WibuKey Standard WkLan"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "codemeter"

    const-string v8, "CodeMeter Standard"

    const/16 v9, 0x574e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "codemeter"

    const-string v8, "CodeMeter Standard"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "codemeter-cmwan"

    const-string/jumbo v8, "TPC/IP requests of copy protection software to a server"

    const/16 v9, 0x574f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x574f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x574f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5809

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caldsoft-backup"

    const-string v8, "CaldSoft Backup server file transfer"

    const/16 v9, 0x5809

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5809

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5809

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x581b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-wconf"

    const-string/jumbo v8, "Vocaltec Web Conference"

    const/16 v9, 0x581b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x581b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-phone"

    const-string/jumbo v8, "Vocaltec Internet Phone"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x58eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talikaserver"

    const-string/jumbo v8, "Talika Main Server"

    const/16 v9, 0x58eb

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x58eb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "talikaserver"

    const-string/jumbo v8, "Talika Main Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5910

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aws-brf"

    const-string/jumbo v8, "Telerate Information Platform LAN"

    const/16 v9, 0x5910

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5910

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aws-brf"

    const-string/jumbo v8, "Telerate Information Platform LAN"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brf-gw"

    const-string/jumbo v8, "Telerate Information Platform WAN"

    const/16 v9, 0x59a7

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59a7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "brf-gw"

    const-string/jumbo v8, "Telerate Information Platform WAN"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport1"

    const-string/jumbo v8, "Inova LightLink Server Type 1"

    const/16 v9, 0x59d8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59d8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport1"

    const-string/jumbo v8, "Inova LightLink Server Type 1"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport2"

    const-string/jumbo v8, "Inova LightLink Server Type 2"

    const/16 v9, 0x59d9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59d9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport2"

    const-string/jumbo v8, "Inova LightLink Server Type 2"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport3"

    const-string/jumbo v8, "Inova LightLink Server Type 3"

    const/16 v9, 0x59da

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59da

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport3"

    const-string/jumbo v8, "Inova LightLink Server Type 3"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport4"

    const-string/jumbo v8, "Inova LightLink Server Type 4"

    const/16 v9, 0x59db

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59db

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport4"

    const-string/jumbo v8, "Inova LightLink Server Type 4"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport5"

    const-string/jumbo v8, "Inova LightLink Server Type 5"

    const/16 v9, 0x59dc

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59dc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport5"

    const-string/jumbo v8, "Inova LightLink Server Type 5"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport6"

    const-string/jumbo v8, "Inova LightLink Server Type 6"

    const/16 v9, 0x59dd

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x59dd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inovaport6"

    const-string/jumbo v8, "Inova LightLink Server Type 6"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5a0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gntp"

    const-string/jumbo v8, "Generic Notification Transport Protocol"

    const/16 v9, 0x5a0d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5a0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5a0d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5ae8

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ae8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "s102"

    const-string/jumbo v8, "S102 application"

    const/16 v9, 0x5ae8

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5afe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "5afe-dir"

    const-string v8, "5AFE SDN Directory"

    const/16 v9, 0x5afe

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5afe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "5afe-disc"

    const-string v8, "5AFE SDN Directory discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elxmgmt"

    const-string/jumbo v8, "Emulex HBAnyware Remote Management"

    const/16 v9, 0x5b25

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b25

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "elxmgmt"

    const-string/jumbo v8, "Emulex HBAnyware Remote Management"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-dbase"

    const-string/jumbo v8, "Novar Data"

    const/16 v9, 0x5b68

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-dbase"

    const-string/jumbo v8, "Novar Data"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-alarm"

    const-string/jumbo v8, "Novar Alarm"

    const/16 v9, 0x5b69

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-alarm"

    const-string/jumbo v8, "Novar Alarm"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-global"

    const-string/jumbo v8, "Novar Global"

    const/16 v9, 0x5b6a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5b6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "novar-global"

    const-string/jumbo v8, "Novar Global"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aequus"

    const-string v8, "Aequus Service"

    const/16 v9, 0x5ba0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ba0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5ba0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aequus-alt"

    const-string v8, "Aequus Service Mgmt"

    const/16 v9, 0x5ba1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5ba1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5ba1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5bfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "areaguard-neo"

    const-string v8, "AreaGuard Neo - WebServer"

    const/16 v9, 0x5bfa

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5bfa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5bfa

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ltp"

    const-string/jumbo v8, "med-ltp"

    const/16 v9, 0x5dc0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ltp"

    const-string/jumbo v8, "med-ltp"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-fsp-rx"

    const-string/jumbo v8, "med-fsp-rx"

    const/16 v9, 0x5dc1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-fsp-rx"

    const-string/jumbo v8, "med-fsp-rx"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-fsp-tx"

    const-string/jumbo v8, "med-fsp-tx"

    const/16 v9, 0x5dc2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-fsp-tx"

    const-string/jumbo v8, "med-fsp-tx"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-supp"

    const-string/jumbo v8, "med-supp"

    const/16 v9, 0x5dc3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-supp"

    const-string/jumbo v8, "med-supp"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ovw"

    const-string/jumbo v8, "med-ovw"

    const/16 v9, 0x5dc4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ovw"

    const-string/jumbo v8, "med-ovw"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ci"

    const-string/jumbo v8, "med-ci"

    const/16 v9, 0x5dc5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-ci"

    const-string/jumbo v8, "med-ci"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-net-svc"

    const-string/jumbo v8, "med-net-svc"

    const/16 v9, 0x5dc6

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5dc6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "med-net-svc"

    const-string/jumbo v8, "med-net-svc"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5eb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filesphere"

    const-string/jumbo v8, "fileSphere"

    const/16 v9, 0x5eb2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5eb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filesphere"

    const-string/jumbo v8, "fileSphere"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5eb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vista-4gl"

    const-string/jumbo v8, "Vista 4GL"

    const/16 v9, 0x5eb9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5eb9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vista-4gl"

    const-string/jumbo v8, "Vista 4GL"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ild"

    const-string/jumbo v8, "Isolv Local Directory"

    const/16 v9, 0x5f01

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ild"

    const-string/jumbo v8, "Isolv Local Directory"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hid"

    const-string/jumbo v8, "Transport of Human Interface Device data streams"

    const/16 v9, 0x5f02

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f02

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5f02

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vrmg-ip"

    const-string/jumbo v8, "Verimag mobile class protocol over TCP"

    const/16 v9, 0x5f03

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f03

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x5f03

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f42

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "intel-rci"

    const-string/jumbo v9, "Intel RCI"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "intel_rci"

    const-string/jumbo v9, "Intel RCI"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "intel-rci"

    const-string/jumbo v9, "Intel RCI"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "intel_rci"

    const-string/jumbo v9, "Intel RCI"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tonidods"

    const-string/jumbo v8, "Tonido Domain Server"

    const/16 v9, 0x5f91

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5f91

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tonidods"

    const-string/jumbo v8, "Tonido Domain Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5fea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "binkp"

    const-string v8, "BINKP"

    const/16 v9, 0x5fea

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x5fea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "binkp"

    const-string v8, "BINKP"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bilobit"

    const-string/jumbo v8, "bilobit Service"

    const/16 v9, 0x6001

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bilobit-update"

    const-string/jumbo v8, "bilobit Service Update"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x605a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sdtvwcam"

    const-string/jumbo v8, "Service used by SmarDTV to communicate between a CAM and a second screen application"

    const/16 v9, 0x605a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x605a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x605a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6064

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canditv"

    const-string v8, "Canditv Message Service"

    const/16 v9, 0x6064

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6064

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "canditv"

    const-string v8, "Canditv Message Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6065

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flashfiler"

    const-string/jumbo v8, "FlashFiler"

    const/16 v9, 0x6065

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6065

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flashfiler"

    const-string/jumbo v8, "FlashFiler"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6066

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "proactivate"

    const-string/jumbo v8, "Turbopower Proactivate"

    const/16 v9, 0x6066

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6066

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "proactivate"

    const-string/jumbo v8, "Turbopower Proactivate"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6067

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6067

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6068

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tcc-http"

    const-string/jumbo v8, "TCC User HTTP Service"

    const/16 v9, 0x6068

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6068

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tcc-http"

    const-string/jumbo v8, "TCC User HTTP Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6097

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6097

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x60b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cslg"

    const-string v8, "Citrix StorageLink Gateway"

    const/16 v9, 0x60b2

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x60b2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x60b2

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6112

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6112

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6112

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "assoc-disc"

    const-string v8, "Device Association Discovery"

    const/16 v9, 0x6112

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x615a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "find"

    const-string/jumbo v8, "Find Identification of Network Devices"

    const/16 v9, 0x615a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x615a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "find"

    const-string/jumbo v8, "Find Identification of Network Devices"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase1"

    const-string/jumbo v8, "icl-twobase1"

    const/16 v9, 0x61a8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61a8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase1"

    const-string/jumbo v8, "icl-twobase1"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase2"

    const-string/jumbo v8, "icl-twobase2"

    const/16 v9, 0x61a9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61a9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase2"

    const-string/jumbo v8, "icl-twobase2"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61aa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase3"

    const-string/jumbo v8, "icl-twobase3"

    const/16 v9, 0x61aa

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61aa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase3"

    const-string/jumbo v8, "icl-twobase3"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase4"

    const-string/jumbo v8, "icl-twobase4"

    const/16 v9, 0x61ab

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ab

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase4"

    const-string/jumbo v8, "icl-twobase4"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase5"

    const-string/jumbo v8, "icl-twobase5"

    const/16 v9, 0x61ac

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase5"

    const-string/jumbo v8, "icl-twobase5"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase6"

    const-string/jumbo v8, "icl-twobase6"

    const/16 v9, 0x61ad

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase6"

    const-string/jumbo v8, "icl-twobase6"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase7"

    const-string/jumbo v8, "icl-twobase7"

    const/16 v9, 0x61ae

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase7"

    const-string/jumbo v8, "icl-twobase7"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61af

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase8"

    const-string/jumbo v8, "icl-twobase8"

    const/16 v9, 0x61af

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61af

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase8"

    const-string/jumbo v8, "icl-twobase8"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase9"

    const-string/jumbo v8, "icl-twobase9"

    const/16 v9, 0x61b0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase9"

    const-string/jumbo v8, "icl-twobase9"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase10"

    const-string/jumbo v8, "icl-twobase10"

    const/16 v9, 0x61b1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x61b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "icl-twobase10"

    const-string/jumbo v8, "icl-twobase10"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x620c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "db2c-tls"

    const-string/jumbo v8, "IBM Db2 Client Interface - Encrypted"

    const/16 v9, 0x620c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x620c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x620c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x637f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "RNSAP User Adaptation for Iurh"

    const/16 v8, 0x637f

    const-string/jumbo v9, "rna"

    const-string/jumbo v10, "sctp"

    invoke-direct {v1, v8, v9, v10, v2}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x63e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sauterdongle"

    const-string/jumbo v8, "Sauter Dongle"

    const/16 v9, 0x63e8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x63e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x63e8

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6404

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idtp"

    const-string/jumbo v8, "Identifier Tracing Protocol"

    const/16 v9, 0x6404

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6404

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6404

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x64c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-hos"

    const-string/jumbo v8, "Vocaltec Address Server"

    const/16 v9, 0x64c1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x64c1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vocaltec-hos"

    const-string/jumbo v8, "Vocaltec Address Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tasp-net"

    const-string/jumbo v8, "TASP Network Comm"

    const/16 v9, 0x652c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tasp-net"

    const-string/jumbo v8, "TASP Network Comm"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "niobserver"

    const-string/jumbo v8, "NIObserver"

    const/16 v9, 0x652d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "niobserver"

    const-string/jumbo v8, "NIObserver"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nilinkanalyst"

    const-string/jumbo v8, "NILinkAnalyst"

    const/16 v9, 0x652e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nilinkanalyst"

    const-string/jumbo v8, "NILinkAnalyst"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "niprobe"

    const-string/jumbo v8, "NIProbe"

    const/16 v9, 0x652f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x652f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "niprobe"

    const-string/jumbo v8, "NIProbe"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6562

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bf-game"

    const-string v8, "Bitfighter game server"

    const/16 v9, 0x6562

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6562

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6562

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6563

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bf-master"

    const-string v8, "Bitfighter master server"

    const/16 v9, 0x6563

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6563

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6563

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6590

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quake"

    const-string/jumbo v8, "quake"

    const/16 v9, 0x6590

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6590

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "quake"

    const-string/jumbo v8, "quake"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6615

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scscp"

    const-string/jumbo v8, "Symbolic Computation Software Composability Protocol"

    const/16 v9, 0x6615

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6615

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "scscp"

    const-string/jumbo v8, "Symbolic Computation Software Composability Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6660

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wnn6-ds"

    const-string/jumbo v8, "wnn6-ds"

    const/16 v9, 0x6660

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6660

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wnn6-ds"

    const-string/jumbo v8, "wnn6-ds"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6691

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cockroach"

    const-string v8, "CockroachDB"

    const/16 v9, 0x6691

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6691

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6691

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6694

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ezproxy"

    const-string/jumbo v8, "eZproxy"

    const/16 v9, 0x6694

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6694

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ezproxy"

    const-string/jumbo v8, "eZproxy"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6695

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ezmeeting"

    const-string/jumbo v8, "eZmeeting"

    const/16 v9, 0x6695

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6695

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ezmeeting"

    const-string/jumbo v8, "eZmeeting"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6696

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "k3software-svr"

    const-string/jumbo v8, "K3 Software-Server"

    const/16 v9, 0x6696

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6696

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "k3software-svr"

    const-string/jumbo v8, "K3 Software-Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6697

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "k3software-cli"

    const-string/jumbo v8, "K3 Software-Client"

    const/16 v9, 0x6697

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6697

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "k3software-cli"

    const-string/jumbo v8, "K3 Software-Client"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6698

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6698

    const-string v8, "De-registered"

    invoke-direct {v1, v2, v3, v3, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6776

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exoline-tcp"

    const-string/jumbo v8, "EXOline-TCP"

    const/16 v9, 0x6776

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6776

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exoline-udp"

    const-string/jumbo v8, "EXOline-UDP"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6777

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exoconfig"

    const-string/jumbo v8, "EXOconfig"

    const/16 v9, 0x6777

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6777

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exoconfig"

    const-string/jumbo v8, "EXOconfig"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6778

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6778

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6779

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exonet"

    const-string/jumbo v8, "EXOnet"

    const/16 v9, 0x6779

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6779

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "exonet"

    const-string/jumbo v8, "EXOnet"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6982

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "flex-lmadmin"

    const-string v8, "A protocol for managing license services"

    const/16 v9, 0x6982

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6982

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6982

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6989

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mongodb"

    const-string/jumbo v8, "Mongo database system"

    const/16 v9, 0x6989

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6989

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6989

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6ad1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imagepump"

    const-string/jumbo v8, "ImagePump"

    const/16 v9, 0x6ad1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6ad1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "imagepump"

    const-string/jumbo v8, "ImagePump"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6b32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jesmsjc"

    const-string/jumbo v8, "Job controller service"

    const/16 v9, 0x6b32

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6b32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jesmsjc"

    const-string/jumbo v8, "Job controller service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6b70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kopek-httphead"

    const-string/jumbo v8, "Kopek HTTP Head Port"

    const/16 v9, 0x6b70

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6b70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kopek-httphead"

    const-string/jumbo v8, "Kopek HTTP Head Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6c86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ars-vista"

    const-string v8, "ARS VISTA Application"

    const/16 v9, 0x6c86

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6c86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ars-vista"

    const-string v8, "ARS VISTA Application"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6ce4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "astrolink"

    const-string v8, "Astrolink Protocol"

    const/16 v9, 0x6ce4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6ce4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6ce4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tw-auth-key"

    const-string/jumbo v8, "TW Authentication/Key Distribution and"

    const/16 v9, 0x6d5f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d5f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tw-auth-key"

    const-string v8, "Attribute Certificate Services"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nxlmd"

    const-string/jumbo v8, "NX License Manager"

    const/16 v9, 0x6d60

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nxlmd"

    const-string/jumbo v8, "NX License Manager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pqsp"

    const-string/jumbo v8, "PQ Service"

    const/16 v9, 0x6d61

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d61

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6d61

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gruber-cashreg"

    const-string/jumbo v8, "Gruber cash registry protocol"

    const/16 v9, 0x6d6a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6d6a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6d6a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6db0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "thor-engine"

    const-string/jumbo v8, "thor/server - ML engine"

    const/16 v9, 0x6db0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6db0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6db0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6dd7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6dd7

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6dd7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "a27-ran-ran"

    const-string v8, "A27 cdma2000 RAN Management"

    const/16 v9, 0x6dd7

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6e28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "voxelstorm"

    const-string/jumbo v8, "VoxelStorm game server"

    const/16 v9, 0x6e28

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6e28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "voxelstorm"

    const-string/jumbo v8, "VoxelStorm game server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6e50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "siemensgsm"

    const-string/jumbo v8, "Siemens GSM"

    const/16 v9, 0x6e50

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6e50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "siemensgsm"

    const-string/jumbo v8, "Siemens GSM"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6fad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bosswave"

    const-string v8, "Building operating system services wide area verified exchange"

    const/16 v9, 0x6fad

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6fad

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x6fad

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7148

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "saltd-licensing"

    const-string/jumbo v8, "Siemens Licensing Server"

    const/16 v9, 0x7148

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7148

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7148

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x71be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sgsap"

    const-string/jumbo v9, "SGsAP in 3GPP"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x71ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otmp"

    const-string/jumbo v8, "ObTools Message Protocol"

    const/16 v9, 0x71ef

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x71ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "otmp"

    const-string/jumbo v8, "ObTools Message Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x71f0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "sbcap"

    const-string/jumbo v9, "SBcAP in 3GPP"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x71f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iuhsctpassoc"

    const-string/jumbo v8, "HNBAP and RUA Common Association"

    const/16 v9, 0x71f1

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x752f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bingbang"

    const-string/jumbo v8, "data exchange protocol for IEC61850 in wind power plants"

    const/16 v9, 0x752f

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x752f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x752f

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndmps"

    const-string/jumbo v8, "Secure Network Data Management Protocol"

    const/16 v9, 0x7530

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7530

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7530

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pago-services1"

    const-string/jumbo v8, "Pago Services 1"

    const/16 v9, 0x7531

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7531

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pago-services1"

    const-string/jumbo v8, "Pago Services 1"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7532

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pago-services2"

    const-string/jumbo v8, "Pago Services 2"

    const/16 v9, 0x7532

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7532

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pago-services2"

    const-string/jumbo v8, "Pago Services 2"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amicon-fpsu-ra"

    const-string v8, "Amicon FPSU-IP Remote Administration"

    const/16 v9, 0x7533

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7533

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amicon-fpsu-ra"

    const-string v8, "Amicon FPSU-IP Remote Administration"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "amicon-fpsu-s"

    const-string v8, "Amicon FPSU-IP VPN"

    const/16 v9, 0x7534

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7534

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7534

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7594

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rwp"

    const-string/jumbo v9, "Remote Window Protocol"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "rwp"

    const-string/jumbo v9, "Remote Window Protocol"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7634

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kingdomsonline"

    const-string/jumbo v8, "Kingdoms Online (CraigAvenue)"

    const/16 v9, 0x7634

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7634

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kingdomsonline"

    const-string/jumbo v8, "Kingdoms Online (CraigAvenue)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x76c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gs-realtime"

    const-string/jumbo v8, "GroundStar RealTime System"

    const/16 v9, 0x76c0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x76c0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x76c0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7870

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "samsung-disc"

    const-string/jumbo v8, "Samsung Convergence Discovery Protocol"

    const/16 v9, 0x7870

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7870

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7870

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7917

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovobs"

    const-string/jumbo v8, "OpenView Service Desk Client"

    const/16 v9, 0x7917

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7917

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ovobs"

    const-string/jumbo v8, "OpenView Service Desk Client"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7928

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ka-sddp"

    const-string/jumbo v8, "Kollective Agent Secure Distributed Delivery Protocol"

    const/16 v9, 0x7928

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7928

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ka-kdp"

    const-string/jumbo v8, "Kollective Agent Kollective Delivery Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x792c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "autotrac-acp"

    const-string v8, "Autotrac ACP 245"

    const/16 v9, 0x792c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x792c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x792c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7935

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7935

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7935

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "yawn"

    const-string/jumbo v8, "YaWN - Yet Another Windows Notifier"

    const/16 v9, 0x7935

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7a69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eldim"

    const-string/jumbo v8, "eldim is a secure file upload proxy"

    const/16 v9, 0x7a69

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7a69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eldim"

    const-string/jumbo v8, "eldim is a secure file upload proxy"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7aa8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pace-licensed"

    const-string/jumbo v8, "PACE license server"

    const/16 v9, 0x7aa8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7aa8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7aa8

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ab8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xqosd"

    const-string/jumbo v8, "XQoS network monitor"

    const/16 v9, 0x7ab8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ab8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "xqosd"

    const-string/jumbo v8, "XQoS network monitor"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ae1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tetrinet"

    const-string/jumbo v8, "TetriNET Protocol"

    const/16 v9, 0x7ae1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ae1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tetrinet"

    const-string/jumbo v8, "TetriNET Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7b84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-mon"

    const-string/jumbo v8, "lm mon"

    const/16 v9, 0x7b84

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7b84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "lm-mon"

    const-string/jumbo v8, "lm mon"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7bc5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dsx-monitor"

    const-string v9, "DS Expert Monitor"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "dsx_monitor"

    const-string v9, "DS Expert Monitor"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7c15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gamesmith-port"

    const-string/jumbo v8, "GameSmith Port"

    const/16 v9, 0x7c15

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7c15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gamesmith-port"

    const-string/jumbo v8, "GameSmith Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ccc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp-tx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol TX"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp_tx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol TX"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp-tx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol TX"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp_tx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol TX"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ccd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp-rx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol RX"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp_rx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol RX"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp-rx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol RX"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "iceedcp_rx"

    const-string/jumbo v9, "Embedded Device Configuration Protocol RX"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7d22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iracinghelper"

    const-string/jumbo v8, "iRacing helper service"

    const/16 v9, 0x7d22

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7d22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iracinghelper"

    const-string/jumbo v8, "iRacing helper service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7df9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t1distproc60"

    const-string/jumbo v8, "T1 Distributed Processor"

    const/16 v9, 0x7df9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7df9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "t1distproc60"

    const-string/jumbo v8, "T1 Distributed Processor"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7e90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "plex"

    const-string/jumbo v8, "Plex multimedia"

    const/16 v9, 0x7e90

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7e90

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const/16 v2, 0x7e90

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ee3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apm-link"

    const-string v8, "Access Point Manager Link"

    const/16 v9, 0x7ee3

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7ee3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "apm-link"

    const-string v8, "Access Point Manager Link"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7f7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sec-ntb-clnt"

    const-string/jumbo v8, "SecureNotebook-CLNT"

    const/16 v9, 0x7f7b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7f7b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sec-ntb-clnt"

    const-string/jumbo v8, "SecureNotebook-CLNT"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7f7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "DMExpress"

    const-string v8, "DMExpress"

    const/16 v9, 0x7f7c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7f7c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "DMExpress"

    const-string v8, "DMExpress"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7fff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-powsrm"

    const-string/jumbo v8, "FileNet BPM WS-ReliableMessaging Client"

    const/16 v9, 0x7fff

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x7fff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-powsrm"

    const-string/jumbo v8, "FileNet BPM WS-ReliableMessaging Client"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-tms"

    const-string/jumbo v8, "Filenet TMS"

    const v9, 0x8000

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-tms"

    const-string/jumbo v8, "Filenet TMS"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-rpc"

    const-string/jumbo v8, "Filenet RPC"

    const v9, 0x8001

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-rpc"

    const-string/jumbo v8, "Filenet RPC"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8002

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-nch"

    const-string/jumbo v8, "Filenet NCH"

    const v9, 0x8002

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8002

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-nch"

    const-string/jumbo v8, "Filenet NCH"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-rmi"

    const-string/jumbo v8, "FileNET RMI"

    const v9, 0x8003

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-rmi"

    const-string/jumbo v8, "FileNet RMI"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8004

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-pa"

    const-string/jumbo v8, "FileNET Process Analyzer"

    const v9, 0x8004

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8004

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-pa"

    const-string/jumbo v8, "FileNET Process Analyzer"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8005

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-cm"

    const-string/jumbo v8, "FileNET Component Manager"

    const v9, 0x8005

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8005

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-cm"

    const-string/jumbo v8, "FileNET Component Manager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8006

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-re"

    const-string/jumbo v8, "FileNET Rules Engine"

    const v9, 0x8006

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8006

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-re"

    const-string/jumbo v8, "FileNET Rules Engine"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8007

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-pch"

    const-string/jumbo v8, "Performance Clearinghouse"

    const v9, 0x8007

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8007

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-pch"

    const-string/jumbo v8, "Performance Clearinghouse"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8008

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-peior"

    const-string/jumbo v8, "FileNET BPM IOR"

    const v9, 0x8008

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8008

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-peior"

    const-string/jumbo v8, "FileNET BPM IOR"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8009

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-obrok"

    const-string/jumbo v8, "FileNet BPM CORBA"

    const v9, 0x8009

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8009

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "filenet-obrok"

    const-string/jumbo v8, "FileNet BPM CORBA"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8021

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mlsn"

    const-string/jumbo v8, "Multiple Listing Service Network"

    const v9, 0x8021

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8021

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mlsn"

    const-string/jumbo v8, "Multiple Listing Service Network"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x802b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "retp"

    const-string/jumbo v8, "Real Estate Transport Protocol"

    const v9, 0x802b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x802b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x802b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8080

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idmgratm"

    const-string v8, "Attachmate ID Manager"

    const v9, 0x8080

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8080

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "idmgratm"

    const-string v8, "Attachmate ID Manager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x80e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wg-endpt-comms"

    const-string/jumbo v8, "WatchGuard Endpoint Communications"

    const v9, 0x80e8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x80e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x80e8

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8124

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mysqlx"

    const-string/jumbo v8, "MySQL Database Extended Interface"

    const v9, 0x8124

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8124

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8124

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8163

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aurora-balaena"

    const-string v8, "Aurora (Balaena Ltd)"

    const v9, 0x8163

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8163

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "aurora-balaena"

    const-string v8, "Aurora (Balaena Ltd)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8233

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diamondport"

    const-string v8, "DiamondCentral Interface"

    const v9, 0x8233

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8233

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "diamondport"

    const-string v8, "DiamondCentral Interface"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8234

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8234

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8235

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dgi-serv"

    const-string v8, "Digital Gaslight Service"

    const v9, 0x8235

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8235

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8235

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8236

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "speedtrace"

    const-string/jumbo v8, "SpeedTrace TraceAgent"

    const v9, 0x8236

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8236

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "speedtrace-disc"

    const-string/jumbo v8, "SpeedTrace TraceAgent Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x829a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "traceroute"

    const-string/jumbo v8, "traceroute use"

    const v9, 0x829a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x829a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "traceroute"

    const-string/jumbo v8, "traceroute use"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x829b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x829b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x829b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mtrace"

    const-string/jumbo v8, "IP Multicast Traceroute"

    const v9, 0x829b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8378

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snip-slave"

    const-string/jumbo v8, "SNIP Slave"

    const v9, 0x8378

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8378

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "snip-slave"

    const-string/jumbo v8, "SNIP Slave"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8462

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "digilent-adept"

    const-string v8, "Adept IP protocol"

    const v9, 0x8462

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8462

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8462

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x85c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "turbonote-2"

    const-string/jumbo v8, "TurboNote Relay Server Default Port"

    const v9, 0x85c9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x85c9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "turbonote-2"

    const-string/jumbo v8, "TurboNote Relay Server Default Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x864a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p-net-local"

    const-string/jumbo v8, "P-Net on IP local"

    const v9, 0x864a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x864a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p-net-local"

    const-string/jumbo v8, "P-Net on IP local"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x864b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p-net-remote"

    const-string/jumbo v8, "P-Net on IP remote"

    const v9, 0x864b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x864b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "p-net-remote"

    const-string/jumbo v8, "P-Net on IP remote"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8707

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dhanalakshmi"

    const-string/jumbo v8, "dhanalakshmi.org EDI Service"

    const v9, 0x8707

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8707

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "edi_service"

    const-string/jumbo v8, "dhanalakshmi.org EDI Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8892

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-rt"

    const-string/jumbo v8, "PROFInet RT Unicast"

    const v9, 0x8892

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8892

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-rt"

    const-string/jumbo v8, "PROFInet RT Unicast"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8893

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-rtm"

    const-string/jumbo v8, "PROFInet RT Multicast"

    const v9, 0x8893

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8893

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-rtm"

    const-string/jumbo v8, "PROFInet RT Multicast"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8894

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-cm"

    const-string/jumbo v8, "PROFInet Context Manager"

    const v9, 0x8894

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8894

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "profinet-cm"

    const-string/jumbo v8, "PROFInet Context Manager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ethercat"

    const-string/jumbo v8, "EtherCAT Port"

    const v9, 0x88a4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88a4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ethercat"

    const-string/jumbo v8, "EtherCAT Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "heathview"

    const-string/jumbo v8, "HeathView"

    const v9, 0x88b8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88b8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x88b8

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-viewer"

    const-string/jumbo v8, "ReadyTech Viewer"

    const v9, 0x88b9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88b9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-viewer"

    const-string/jumbo v8, "ReadyTech Viewer"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-sound"

    const-string/jumbo v8, "ReadyTech Sound Server"

    const v9, 0x88ba

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88ba

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x88ba

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-devicemapper"

    const-string/jumbo v8, "ReadyTech DeviceMapper Server"

    const v9, 0x88bb

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x88bb

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-classmanager"

    const-string/jumbo v8, "ReadyTech ClassManager"

    const v9, 0x88bc

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-classmanager"

    const-string/jumbo v8, "ReadyTech ClassManager"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-labtracker"

    const-string/jumbo v8, "ReadyTech LabTracker"

    const v9, 0x88bd

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88bd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x88bd

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rt-helper"

    const-string/jumbo v8, "ReadyTech Helper Service"

    const v9, 0x88be

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x88be

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x88be

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x891c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "axio-disc"

    const-string v8, "Axiomatic discovery protocol"

    const v9, 0x891c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x891c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "axio-disc"

    const-string v8, "Axiomatic discovery protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kitim"

    const-string/jumbo v8, "KIT Messenger"

    const v9, 0x8a1a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8a1a

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altova-lm"

    const-string v8, "Altova License Management"

    const v9, 0x8a1b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "altova-lm-disc"

    const-string v8, "Altova License Management Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "guttersnex"

    const-string/jumbo v8, "Gutters Note Exchange"

    const v9, 0x8a1c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8a1c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "openstack-id"

    const-string/jumbo v8, "OpenStack ID Service"

    const v9, 0x8a1d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8a1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8a1d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8ca1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "allpeers"

    const-string v8, "AllPeers Network"

    const v9, 0x8ca1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8ca1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "allpeers"

    const-string v8, "AllPeers Network"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "wlcp"

    const-string/jumbo v8, "Wireless LAN Control plane Protocol (WLCP)"

    const v9, 0x8e3b

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e3b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8e3b

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "s1-control"

    const-string/jumbo v9, "S1-Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "x2-control"

    const-string/jumbo v9, "X2-Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e47

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "slmap"

    const-string/jumbo v8, "SLm Interface Application Protocol"

    const v9, 0x8e47

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e48

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nq-ap"

    const-string/jumbo v8, "Nq and Nq\' Application Protocol"

    const v9, 0x8e48

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m2ap"

    const-string/jumbo v8, "M2 Application Part"

    const v9, 0x8e5b

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m3ap"

    const-string/jumbo v8, "M3 Application Part"

    const v9, 0x8e5c

    invoke-direct {v1, v9, v2, v10, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8e6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "xw-control"

    const-string/jumbo v9, "Xw-Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8eac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "febooti-aw"

    const-string/jumbo v8, "Febooti Automation Workshop"

    const v9, 0x8eac

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8eac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8eac

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8efa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "observium-agent"

    const-string/jumbo v8, "Observium statistics collection agent"

    const v9, 0x8efa

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8efa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8efa

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8f5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mapx"

    const-string/jumbo v8, "MapX communication"

    const v9, 0x8f5c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x8f5c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x8f5c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kastenxpipe"

    const-string/jumbo v8, "KastenX Pipe"

    const v9, 0x9001

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "kastenxpipe"

    const-string/jumbo v8, "KastenX Pipe"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9260

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string v8, "3gpp-w1ap"

    const-string/jumbo v9, "W1 signalling transport"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9263

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "neckar"

    const-string/jumbo v8, "science + computing\'s Venus Administration Port"

    const v9, 0x9263

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9263

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "neckar"

    const-string/jumbo v8, "science + computing\'s Venus Administration Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x926b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "gdrive-sync"

    const-string/jumbo v8, "Google Drive Sync"

    const v9, 0x926b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x926b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x926b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x92e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eftp"

    const-string/jumbo v8, "Epipole File Transfer Protocol"

    const v9, 0x92e1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x92e1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x92e1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9316

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unisys-eportal"

    const-string/jumbo v8, "Unisys ClearPath ePortal"

    const v9, 0x9316

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9316

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "unisys-eportal"

    const-string/jumbo v8, "Unisys ClearPath ePortal"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9470

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ivs-database"

    const-string/jumbo v8, "InfoVista Server Database"

    const v9, 0x9470

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9470

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9470

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9471

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ivs-insertion"

    const-string/jumbo v8, "InfoVista Server Insertion"

    const v9, 0x9471

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9471

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9471

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9472

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cresco-control"

    const-string v8, "Cresco Controller"

    const v9, 0x9472

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9472

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crescoctrl-disc"

    const-string v8, "Cresco Controller Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9539

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy7-data"

    const-string/jumbo v8, "Galaxy7 Data Tunnel"

    const v9, 0x9539

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9539

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "galaxy7-data"

    const-string/jumbo v8, "Galaxy7 Data Tunnel"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x953a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fairview"

    const-string/jumbo v8, "Fairview Message Service"

    const v9, 0x953a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x953a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fairview"

    const-string/jumbo v8, "Fairview Message Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x953b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agpolicy"

    const-string v8, "AppGate Policy Server"

    const v9, 0x953b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x953b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "agpolicy"

    const-string v8, "AppGate Policy Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x960c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "ng-control"

    const-string/jumbo v9, "NG Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9616

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "xn-control"

    const-string/jumbo v9, "Xn Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x963e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "e1-interface"

    const-string/jumbo v9, "E1 signalling transport (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9648

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    invoke-direct {v2, v0, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "f1-control"

    const-string/jumbo v9, "F1 Control Plane (3GPP)"

    invoke-direct {v2, v0, v8, v10, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x96ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "psqlmws"

    const-string/jumbo v8, "Premier SQL Middleware Server"

    const v9, 0x96ee

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x96ee

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x96ee

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9790

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sruth"

    const-string/jumbo v8, "Sruth is a service for the distribution of routinely-\n      generated but arbitrary files based on a publish/subscribe\n      distribution model and implemented using a peer-to-peer transport\n      mechanism"

    const v9, 0x9790

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9790

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9790

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x97d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "secrmmsafecopya"

    const-string/jumbo v8, "Security approval process for use of the secRMM SafeCopy program"

    const v9, 0x97d1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x97d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x97d1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9897

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "vroa"

    const-string v8, "Children\'s hearing test/Telemedicine"

    const v9, 0x9897

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9897

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9897

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9b01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "turbonote-1"

    const-string/jumbo v8, "TurboNote Default Port"

    const v9, 0x9b01

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9b01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "turbonote-1"

    const-string/jumbo v8, "TurboNote Default Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9c40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "safetynetp"

    const-string/jumbo v8, "SafetyNET p"

    const v9, 0x9c40

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9c40

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "safetynetp"

    const-string/jumbo v8, "SafetyNET p"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9c57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9c57

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9c57

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "k-patentssensor"

    const-string/jumbo v8, "K-PatentsSensorInformation"

    const v9, 0x9c57

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9dd4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "sptx"

    const-string/jumbo v8, "Simplify Printing TX"

    const v9, 0x9dd4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9dd4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9dd4

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cscp"

    const-string v8, "CSCP"

    const v9, 0x9f89

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f89

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cscp"

    const-string v8, "CSCP"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csccredir"

    const-string v8, "CSCCREDIR"

    const v9, 0x9f8a

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f8a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csccredir"

    const-string v8, "CSCCREDIR"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csccfirewall"

    const-string v8, "CSCCFIREWALL"

    const v9, 0x9f8b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f8b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "csccfirewall"

    const-string v8, "CSCCFIREWALL"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0x9f95

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x9f95

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ortec-disc"

    const-string/jumbo v8, "ORTEC Service Discovery"

    const v9, 0x9f95

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa097

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fs-qos"

    const-string/jumbo v8, "Foursticks QoS Protocol"

    const v9, 0xa097

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa097

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "fs-qos"

    const-string/jumbo v8, "Foursticks QoS Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa0a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "tentacle"

    const-string/jumbo v8, "Tentacle Server"

    const v9, 0xa0a1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa0a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa0a1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa10e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "z-wave-s"

    const-string/jumbo v8, "Z-Wave Protocol over SSL/TLS"

    const v9, 0xa10e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa10e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "z-wave-s"

    const-string/jumbo v8, "Z-Wave Protocol over DTLS"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa342

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-cip"

    const-string v8, "Crestron Control Port"

    const v9, 0xa342

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa342

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-cip"

    const-string v8, "Crestron Control Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa343

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-ctp"

    const-string v8, "Crestron Terminal Port"

    const v9, 0xa343

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa343

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-ctp"

    const-string v8, "Crestron Terminal Port"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa344

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-cips"

    const-string v8, "Crestron Secure Control Port"

    const v9, 0xa344

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa344

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa344

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa345

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "crestron-ctps"

    const-string v8, "Crestron Secure Terminal Port"

    const v9, 0xa345

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa345

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa345

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "candp"

    const-string v8, "Computer Associates network discovery protocol"

    const v9, 0xa60c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "candp"

    const-string v8, "Computer Associates network discovery protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "candrp"

    const-string v8, "CA discovery response"

    const v9, 0xa60d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "candrp"

    const-string v8, "CA discovery response"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caerpc"

    const-string v8, "CA eTrust RPC"

    const v9, 0xa60e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa60e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "caerpc"

    const-string v8, "CA eTrust RPC"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa7f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "curiosity"

    const-string v8, "API endpoint for search application"

    const v9, 0xa7f7

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa7f7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa7f7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa7f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "recvr-rc"

    const-string/jumbo v8, "Receiver Remote Control"

    const v9, 0xa7f8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa7f8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "recvr-rc-disc"

    const-string/jumbo v8, "Receiver Remote Control Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "reachout"

    const-string/jumbo v8, "REACHOUT"

    const v9, 0xa8b4

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "reachout"

    const-string/jumbo v8, "REACHOUT"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndm-agent-port"

    const-string/jumbo v8, "NDM-AGENT-PORT"

    const v9, 0xa8b5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ndm-agent-port"

    const-string/jumbo v8, "NDM-AGENT-PORT"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ip-provision"

    const-string/jumbo v8, "IP-PROVISION"

    const v9, 0xa8b6

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ip-provision"

    const-string/jumbo v8, "IP-PROVISION"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "noit-transport"

    const-string/jumbo v8, "Reconnoiter Agent Data Transport"

    const v9, 0xa8b7

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8b7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa8b7

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shaperai"

    const-string/jumbo v8, "Shaper Automation Server Management"

    const v9, 0xa8ca

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa8ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "shaperai-disc"

    const-string/jumbo v8, "Shaper Automation Server Management Discovery"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xa9ae

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9ae

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "hmip-routing"

    const-string/jumbo v8, "HmIP LAN Routing"

    const v9, 0xa9ae

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9af

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eq3-update"

    const-string/jumbo v8, "EQ3 firmware update"

    const v9, 0xa9af

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9af

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eq3-config"

    const-string/jumbo v8, "EQ3 discovery and configuration"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ew-mgmt"

    const-string v8, "Cisco EnergyWise Management"

    const v9, 0xa9b0

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ew-disc-cmd"

    const-string v8, "Cisco EnergyWise Discovery and Command Flooding"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ciscocsdb"

    const-string v8, "Cisco NetMgmt DB Ports"

    const v9, 0xa9b1

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xa9b1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ciscocsdb"

    const-string v8, "Cisco NetMgmt DB Ports"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xac5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "z-wave-tunnel"

    const-string/jumbo v8, "Z-Wave Secure Tunnel"

    const v9, 0xac5b

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xac5b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xac5b

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcd"

    const-string/jumbo v8, "PCP server (pmcd)"

    const v9, 0xad21

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad21

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcd"

    const-string/jumbo v8, "PCP server (pmcd)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcdproxy"

    const-string/jumbo v8, "PCP server (pmcd) proxy"

    const v9, 0xad22

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmcdproxy"

    const-string/jumbo v8, "PCP server (pmcd) proxy"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "pmwebapi"

    const-string/jumbo v8, "HTTP binding for Performance Co-Pilot client API"

    const v9, 0xad23

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xad23

    invoke-direct {v1, v2, v3, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad9c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cognex-dataman"

    const-string v8, "Cognex DataMan Management Protocol"

    const v9, 0xad9c

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad9c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xad9c

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad9d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "acronis-backup"

    const-string v8, "Acronis Backup Gateway service port"

    const v9, 0xad9d

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xad9d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xad9d

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xae00

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "domiq"

    const-string v8, "DOMIQ Building Automation"

    const v9, 0xae00

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbr-debug"

    const-string/jumbo v8, "REALbasic Remote Debug"

    const v9, 0xae09

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae09

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rbr-debug"

    const-string/jumbo v8, "REALbasic Remote Debug"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xae38

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xae38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asihpi"

    const-string v8, "AudioScience HPI"

    const v9, 0xae38

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaf12

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LG7/q;

    const-string/jumbo v8, "EtherNet-IP-2"

    const-string/jumbo v9, "EtherNet/IP messaging"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "EtherNet/IP-2"

    const-string/jumbo v9, "EtherNet/IP messaging"

    invoke-direct {v2, v0, v8, v6, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "EtherNet-IP-2"

    const-string/jumbo v9, "EtherNet/IP messaging"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LG7/q;

    const-string/jumbo v8, "EtherNet/IP-2"

    const-string/jumbo v9, "EtherNet/IP messaging"

    invoke-direct {v2, v0, v8, v5, v9}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaf64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m3da"

    const-string/jumbo v8, "M3DA is used for efficient machine-to-machine communications"

    const v9, 0xaf64

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaf64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "m3da-disc"

    const-string/jumbo v8, "M3DA Discovery is used for efficient machine-to-machine communications"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmp"

    const-string/jumbo v8, "Nuance AutoStore Status Monitoring Protocol (data transfer)"

    const v9, 0xafc8

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafc8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmp-mon"

    const-string/jumbo v8, "Nuance AutoStore Status Monitoring Protocol (device monitoring)"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafc9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "asmps"

    const-string/jumbo v8, "Nuance AutoStore Status Monitoring Protocol (secure data transfer)"

    const v9, 0xafc9

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafc9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xafc9

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "rs-status"

    const-string/jumbo v8, "Redspeed Status Monitor"

    const v9, 0xafca

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xafca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xafca

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaff5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "synctest"

    const-string/jumbo v8, "Remote application control protocol"

    const v9, 0xaff5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaff5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xaff5

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "invision-ag"

    const-string/jumbo v8, "InVision AG"

    const v9, 0xaffe

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xaffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "invision-ag"

    const-string/jumbo v8, "InVision AG"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb1ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cloudcheck"

    const-string v8, "ASSIA CloudCheck WiFi Management System"

    const v9, 0xb1ca

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb1ca

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "cloudcheck-ping"

    const-string v8, "ASSIA CloudCheck WiFi Management keepalive"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb26e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eba"

    const-string/jumbo v8, "EBA PRISE"

    const v9, 0xb26e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb26e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "eba"

    const-string/jumbo v8, "EBA PRISE"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb300

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dai-shell"

    const-string/jumbo v8, "Server for the DAI family of client-server products"

    const v9, 0xb300

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb300

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xb300

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb301

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qdb2service"

    const-string/jumbo v8, "Qpuncture Data Access Service"

    const v9, 0xb301

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb301

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "qdb2service"

    const-string/jumbo v8, "Qpuncture Data Access Service"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb38e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssr-servermgr"

    const-string/jumbo v8, "SSRServerMgr"

    const v9, 0xb38e

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb38e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ssr-servermgr"

    const-string/jumbo v8, "SSRServerMgr"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb500

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inedo"

    const-string/jumbo v8, "Listen port used for Inedo agent communication"

    const v9, 0xb500

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb500

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xb500

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb796

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "spremotetablet"

    const-string v8, "Connection between a desktop computer or server and a signature tablet to capture handwritten signatures"

    const v9, 0xb796

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb796

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xb796

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb797

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mediabox"

    const-string/jumbo v8, "MediaBox Server"

    const v9, 0xb797

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb797

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mediabox"

    const-string/jumbo v8, "MediaBox Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb798

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mbus"

    const-string/jumbo v8, "Message Bus"

    const v9, 0xb798

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb798

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "mbus"

    const-string/jumbo v8, "Message Bus"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb799

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "winrm"

    const-string/jumbo v8, "Windows Remote Management Service"

    const v9, 0xb799

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb799

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xb799

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb7fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "jvl-mactalk"

    const-string v8, "Configuration of motors connected to Industrial Ethernet"

    const v9, 0xb7fc

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb7fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xb7fc

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb9c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbbrowse"

    const-string v8, "Databeam Corporation"

    const v9, 0xb9c5

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xb9c5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "dbbrowse"

    const-string v8, "Databeam Corporation"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xba08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "directplaysrvr"

    const-string v8, "Direct Play Server"

    const v9, 0xba08

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xba08

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "directplaysrvr"

    const-string v8, "Direct Play Server"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbabe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ap"

    const-string v8, "ALC Protocol"

    const v9, 0xbabe

    invoke-direct {v1, v9, v2, v6, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbabe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "ap"

    const-string v8, "ALC Protocol"

    invoke-direct {v1, v9, v2, v5, v8}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbabf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbabf

    invoke-direct {v1, v2, v3, v3, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbac0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bacnet"

    const-string v7, "Building Automation and Control Networks"

    const v8, 0xbac0

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbac0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "bacnet"

    const-string v7, "Building Automation and Control Networks"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbac1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "presonus-ucnet"

    const-string/jumbo v7, "PreSonus Universal Control Network Protocol"

    const v8, 0xbac1

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbac1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbac1

    invoke-direct {v1, v2, v3, v6, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimcontroller"

    const-string/jumbo v7, "Nimbus Controller"

    const v8, 0xbb80

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimcontroller"

    const-string/jumbo v7, "Nimbus Controller"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimspooler"

    const-string/jumbo v7, "Nimbus Spooler"

    const v8, 0xbb81

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimspooler"

    const-string/jumbo v7, "Nimbus Spooler"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimhub"

    const-string/jumbo v7, "Nimbus Hub"

    const v8, 0xbb82

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb82

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimhub"

    const-string/jumbo v7, "Nimbus Hub"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimgtw"

    const-string/jumbo v7, "Nimbus Gateway"

    const v8, 0xbb83

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb83

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimgtw"

    const-string/jumbo v7, "Nimbus Gateway"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimbusdb"

    const-string/jumbo v7, "NimbusDB Connector"

    const v8, 0xbb84

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb84

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbb84

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nimbusdbctrl"

    const-string/jumbo v7, "NimbusDB Control"

    const v8, 0xbb85

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbb85

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbb85

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "juka"

    const-string/jumbo v7, "Juliar Programming Language Protocol"

    const v8, 0xbbb0

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbbb0

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string v2, "3gpp-cbsp"

    const-string v7, "3GPP Cell Broadcast Service Protocol"

    const v8, 0xbbb1

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbbb1

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "weandsf"

    const-string/jumbo v7, "WeFi Access Network Discovery and Selection Function"

    const v8, 0xbbb2

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbbb2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbbb2

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbc00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isnetserv"

    const-string/jumbo v7, "Image Systems Network Services"

    const v8, 0xbc00

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbc00

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "isnetserv"

    const-string/jumbo v7, "Image Systems Network Services"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbc01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp5"

    const-string v7, "Bloomberg locator"

    const v8, 0xbc01

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbc01

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "blp5"

    const-string v7, "Bloomberg locator"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbdac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "com-bardac-dw"

    const-string/jumbo v7, "com-bardac-dw"

    const v8, 0xbdac

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbdac

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "com-bardac-dw"

    const-string/jumbo v7, "com-bardac-dw"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbdeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iqobject"

    const-string/jumbo v7, "iqobject"

    const v8, 0xbdeb

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbdeb

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "iqobject"

    const-string/jumbo v7, "iqobject"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbe0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "robotraconteur"

    const-string/jumbo v7, "Robot Raconteur transport"

    const v8, 0xbe0d

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbe0d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "robotraconteur"

    const-string/jumbo v7, "Robot Raconteur transport"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbf68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "matahari"

    const-string/jumbo v7, "Matahari Broker"

    const v8, 0xbf68

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbf68

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbf68

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbf69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nusrp"

    const-string/jumbo v7, "Nuance Unity Service Request Protocol"

    const v8, 0xbf69

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbf69

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "nusdp-disc"

    const-string/jumbo v7, "Nuance Unity Service Discovery Protocol"

    invoke-direct {v1, v8, v2, v5, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const-string/jumbo v2, "inspider"

    const-string/jumbo v7, "InSpider System"

    const v8, 0xbffe

    invoke-direct {v1, v8, v2, v6, v7}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbffe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbffe

    invoke-direct {v1, v2, v3, v5, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xbfff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LG7/q;

    const v2, 0xbfff

    const-string/jumbo v4, "IANA Reserved"

    invoke-direct {v1, v2, v3, v3, v4}, LG7/q;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
