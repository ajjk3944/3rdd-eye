.class public final Lhf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhf/a;

.field public static b:Lmh/q;

.field public static c:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhf/a;

    invoke-direct {v0}, Lhf/a;-><init>()V

    sput-object v0, Lhf/a;->a:Lhf/a;

    sget-object v0, Lhf/a$a;->a:Lhf/a$a;

    const v1, -0x5484d809

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lhf/a;->b:Lmh/q;

    const v0, 0x33f1cb38

    sget-object v1, Lhf/a$b;->a:Lhf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lhf/a;->c:Lmh/q;

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

    sget-object v0, Lhf/a;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, Lhf/a;->c:Lmh/q;

    return-object v0
.end method
