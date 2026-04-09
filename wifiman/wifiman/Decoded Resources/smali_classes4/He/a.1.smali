.class public final LHe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LHe/a;

.field public static b:Lmh/p;

.field public static c:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LHe/a;

    invoke-direct {v0}, LHe/a;-><init>()V

    sput-object v0, LHe/a;->a:LHe/a;

    sget-object v0, LHe/a$a;->a:LHe/a$a;

    const v1, -0x5f9bbea9

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LHe/a;->b:Lmh/p;

    const v0, 0x1d6e2eaa

    sget-object v1, LHe/a$b;->a:LHe/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LHe/a;->c:Lmh/q;

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

    sget-object v0, LHe/a;->b:Lmh/p;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, LHe/a;->c:Lmh/q;

    return-object v0
.end method
