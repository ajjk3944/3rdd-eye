.class public final Lfa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lfa/a;

.field public static b:Lmh/p;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfa/a;

    invoke-direct {v0}, Lfa/a;-><init>()V

    sput-object v0, Lfa/a;->a:Lfa/a;

    sget-object v0, Lfa/a$a;->a:Lfa/a$a;

    const v1, -0x27f6ce93

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lfa/a;->b:Lmh/p;

    const v0, 0x7f145b29

    sget-object v1, Lfa/a$b;->a:Lfa/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lfa/a;->c:Lmh/p;

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

    sget-object v0, Lfa/a;->b:Lmh/p;

    return-object v0
.end method

.method public final b()Lmh/p;
    .locals 1

    sget-object v0, Lfa/a;->c:Lmh/p;

    return-object v0
.end method
