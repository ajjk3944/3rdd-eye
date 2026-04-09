.class public final LQ/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ/n;

.field private static final b:LP/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LQ/n;

    invoke-direct {v0}, LQ/n;-><init>()V

    sput-object v0, LQ/n;->a:LQ/n;

    new-instance v0, LP/g;

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x3da3d70a    # 0.08f

    const v3, 0x3e23d70a    # 0.16f

    invoke-direct {v0, v3, v1, v2, v1}, LP/g;-><init>(FFFF)V

    sput-object v0, LQ/n;->b:LP/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LP/g;
    .locals 1

    sget-object v0, LQ/n;->b:LP/g;

    return-object v0
.end method
