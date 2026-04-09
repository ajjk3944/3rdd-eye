.class public final Lxf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lxf/a;

.field public static b:Lmh/p;

.field public static c:Lmh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxf/a;

    invoke-direct {v0}, Lxf/a;-><init>()V

    sput-object v0, Lxf/a;->a:Lxf/a;

    sget-object v0, Lxf/a$a;->a:Lxf/a$a;

    const v1, -0x185d193

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lxf/a;->b:Lmh/p;

    const v0, -0x3d20f2fc

    sget-object v1, Lxf/a$b;->a:Lxf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lxf/a;->c:Lmh/r;

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

    sget-object v0, Lxf/a;->b:Lmh/p;

    return-object v0
.end method

.method public final b()Lmh/r;
    .locals 1

    sget-object v0, Lxf/a;->c:Lmh/r;

    return-object v0
.end method
