.class public abstract Lxs3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lcv3;

.field public static final b:Lyr3;

.field public static final c:Law3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lf04;->E()Ln64;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcv3;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const-class v2, Lcr3;

    .line 8
    .line 9
    const-string v3, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxs3;->a:Lcv3;

    .line 15
    .line 16
    sget-object v0, Lyr3;->h:Lyr3;

    .line 17
    .line 18
    sput-object v0, Lxs3;->b:Lyr3;

    .line 19
    .line 20
    sget-object v0, Ltv2;->v:Ltv2;

    .line 21
    .line 22
    new-instance v1, Law3;

    .line 23
    .line 24
    const-class v3, Lct3;

    .line 25
    .line 26
    invoke-direct {v1, v3, v2, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lxs3;->c:Law3;

    .line 30
    .line 31
    return-void
.end method
