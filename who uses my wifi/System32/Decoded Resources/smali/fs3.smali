.class public abstract Lfs3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Law3;

.field public static final b:Lcv3;

.field public static final c:Lyr3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lsu2;->r:Lsu2;

    .line 2
    .line 3
    new-instance v1, Law3;

    .line 4
    .line 5
    const-class v2, Les3;

    .line 6
    .line 7
    const-class v3, Lcr3;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lfs3;->a:Law3;

    .line 13
    .line 14
    invoke-static {}, Ldy3;->F()Ln64;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcv3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 21
    .line 22
    invoke-direct {v0, v1, v3, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lfs3;->b:Lcv3;

    .line 26
    .line 27
    sget-object v0, Lyr3;->c:Lyr3;

    .line 28
    .line 29
    sput-object v0, Lfs3;->c:Lyr3;

    .line 30
    .line 31
    return-void
.end method
