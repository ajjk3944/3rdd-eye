.class public abstract Lm24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Law3;

.field public static final b:Law3;

.field public static final c:Lbv3;

.field public static final d:Lcv3;

.field public static final e:Lyr3;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lvt3;->C:Lvt3;

    .line 2
    .line 3
    new-instance v1, Law3;

    .line 4
    .line 5
    const-class v2, Lk24;

    .line 6
    .line 7
    const-class v3, Lnr3;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lm24;->a:Law3;

    .line 13
    .line 14
    sget-object v0, Ltt3;->D:Ltt3;

    .line 15
    .line 16
    new-instance v1, Law3;

    .line 17
    .line 18
    const-class v2, Ll24;

    .line 19
    .line 20
    const-class v4, Lor3;

    .line 21
    .line 22
    invoke-direct {v1, v2, v4, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lm24;->b:Law3;

    .line 26
    .line 27
    invoke-static {}, Lx04;->K()Ln64;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lbv3;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    .line 34
    .line 35
    invoke-direct {v0, v1, v3, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lm24;->c:Lbv3;

    .line 39
    .line 40
    invoke-static {}, Lz04;->H()Ln64;

    .line 41
    .line 42
    .line 43
    new-instance v0, Lcv3;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    .line 47
    .line 48
    invoke-direct {v0, v1, v4, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lm24;->d:Lcv3;

    .line 52
    .line 53
    sget-object v0, Lyr3;->q:Lyr3;

    .line 54
    .line 55
    sput-object v0, Lm24;->e:Lyr3;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    sput v0, Lm24;->f:I

    .line 59
    .line 60
    return-void
.end method
