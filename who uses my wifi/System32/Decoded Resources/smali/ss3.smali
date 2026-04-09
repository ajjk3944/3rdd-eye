.class public abstract Lss3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Law3;

.field public static final b:Lcv3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ltv2;->u:Ltv2;

    .line 2
    .line 3
    new-instance v1, Law3;

    .line 4
    .line 5
    const-class v2, Lrs3;

    .line 6
    .line 7
    const-class v3, Lcr3;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lss3;->a:Law3;

    .line 13
    .line 14
    invoke-static {}, Lry3;->E()Ln64;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcv3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 21
    .line 22
    invoke-direct {v0, v1, v3, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lss3;->b:Lcv3;

    .line 26
    .line 27
    return-void
.end method
