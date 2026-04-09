.class public final Lq9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq9/a;

.field public static b:Lmh/p;

.field public static c:Lmh/p;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq9/a;

    invoke-direct {v0}, Lq9/a;-><init>()V

    sput-object v0, Lq9/a;->a:Lq9/a;

    sget-object v0, Lq9/a$a;->a:Lq9/a$a;

    const v1, -0x86e9394

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lq9/a;->b:Lmh/p;

    const v0, -0x4fb8a47

    sget-object v1, Lq9/a$b;->a:Lq9/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lq9/a;->c:Lmh/p;

    const v0, 0x4db7ffb5    # 3.8587357E8f

    sget-object v1, Lq9/a$c;->a:Lq9/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lq9/a;->d:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, Lq9/a;->b:Lmh/p;

    return-object v0
.end method
