.class public final Lsf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsf/a;

.field public static b:Lmh/q;

.field public static c:Lmh/q;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsf/a;

    invoke-direct {v0}, Lsf/a;-><init>()V

    sput-object v0, Lsf/a;->a:Lsf/a;

    sget-object v0, Lsf/a$a;->a:Lsf/a$a;

    const v1, -0x678cd8d9

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lsf/a;->b:Lmh/q;

    const v0, 0x41d103c4

    sget-object v1, Lsf/a$b;->a:Lsf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lsf/a;->c:Lmh/q;

    const v0, 0x1793593

    sget-object v1, Lsf/a$c;->a:Lsf/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lsf/a;->d:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    sget-object v0, Lsf/a;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, Lsf/a;->c:Lmh/q;

    return-object v0
.end method
