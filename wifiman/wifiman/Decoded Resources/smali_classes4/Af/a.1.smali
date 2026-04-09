.class public final LAf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LAf/a;

.field public static b:Lmh/q;

.field public static c:Lmh/q;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LAf/a;

    invoke-direct {v0}, LAf/a;-><init>()V

    sput-object v0, LAf/a;->a:LAf/a;

    sget-object v0, LAf/a$a;->a:LAf/a$a;

    const v1, -0x1f89f207

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LAf/a;->b:Lmh/q;

    const v0, 0x493950fb

    sget-object v1, LAf/a$b;->a:LAf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LAf/a;->c:Lmh/q;

    const v0, -0x27dc06b8

    sget-object v1, LAf/a$c;->a:LAf/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LAf/a;->d:Lmh/p;

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

    sget-object v0, LAf/a;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, LAf/a;->c:Lmh/q;

    return-object v0
.end method
