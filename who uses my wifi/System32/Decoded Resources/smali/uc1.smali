.class public final Luc1;
.super Lez;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final n:Lgw3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lpz;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpz;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lqb1;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, v2}, Lqb1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lgw3;

    .line 15
    .line 16
    const-string v3, "ClientTelemetry.API"

    .line 17
    .line 18
    invoke-direct {v2, v3, v1, v0}, Lgw3;-><init>(Ljava/lang/String;Lqb1;Lpz;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Luc1;->n:Lgw3;

    .line 22
    .line 23
    return-void
.end method
