.class public abstract Lqw3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Law3;

.field public static final b:Law3;

.field public static final c:Lcv3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ltt3;->s:Ltt3;

    .line 2
    .line 3
    new-instance v1, Law3;

    .line 4
    .line 5
    const-class v2, Lpw3;

    .line 6
    .line 7
    const-class v3, Lsw3;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lqw3;->a:Law3;

    .line 13
    .line 14
    sget-object v0, Lvt3;->s:Lvt3;

    .line 15
    .line 16
    new-instance v1, Law3;

    .line 17
    .line 18
    const-class v3, Llr3;

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lqw3;->b:Law3;

    .line 24
    .line 25
    invoke-static {}, Lnx3;->F()Ln64;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcv3;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 32
    .line 33
    invoke-direct {v0, v1, v3, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lqw3;->c:Lcv3;

    .line 37
    .line 38
    return-void
.end method
