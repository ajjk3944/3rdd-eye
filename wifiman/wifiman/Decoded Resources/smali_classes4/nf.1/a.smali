.class public final Lnf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lnf/a;

.field public static b:Lmh/p;

.field public static c:Lmh/q;

.field public static d:Lmh/r;

.field public static e:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnf/a;

    invoke-direct {v0}, Lnf/a;-><init>()V

    sput-object v0, Lnf/a;->a:Lnf/a;

    sget-object v0, Lnf/a$a;->a:Lnf/a$a;

    const v1, 0x547558c7

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lnf/a;->b:Lmh/p;

    const v0, 0x760df2cb

    sget-object v1, Lnf/a$b;->a:Lnf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lnf/a;->c:Lmh/q;

    const v0, 0x7a7b34d6

    sget-object v1, Lnf/a$c;->a:Lnf/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lnf/a;->d:Lmh/r;

    const v0, 0x17290df8

    sget-object v1, Lnf/a$d;->a:Lnf/a$d;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lnf/a;->e:Lmh/p;

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

    sget-object v0, Lnf/a;->b:Lmh/p;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, Lnf/a;->c:Lmh/q;

    return-object v0
.end method

.method public final c()Lmh/r;
    .locals 1

    sget-object v0, Lnf/a;->d:Lmh/r;

    return-object v0
.end method
