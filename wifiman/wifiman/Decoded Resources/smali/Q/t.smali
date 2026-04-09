.class public final LQ/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ/t;

.field private static final b:LE/a;

.field private static final c:LE/a;

.field private static final d:LE/a;

.field private static final e:LE/a;

.field private static final f:LE/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ/t;

    invoke-direct {v0}, LQ/t;-><init>()V

    sput-object v0, LQ/t;->a:LQ/t;

    sget-object v0, LS/f;->a:LS/f;

    invoke-virtual {v0}, LS/f;->b()LE/g;

    move-result-object v1

    sput-object v1, LQ/t;->b:LE/a;

    invoke-virtual {v0}, LS/f;->e()LE/g;

    move-result-object v1

    sput-object v1, LQ/t;->c:LE/a;

    invoke-virtual {v0}, LS/f;->d()LE/g;

    move-result-object v1

    sput-object v1, LQ/t;->d:LE/a;

    invoke-virtual {v0}, LS/f;->c()LE/g;

    move-result-object v1

    sput-object v1, LQ/t;->e:LE/a;

    invoke-virtual {v0}, LS/f;->a()LE/g;

    move-result-object v0

    sput-object v0, LQ/t;->f:LE/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LE/a;
    .locals 1

    sget-object v0, LQ/t;->f:LE/a;

    return-object v0
.end method

.method public final b()LE/a;
    .locals 1

    sget-object v0, LQ/t;->b:LE/a;

    return-object v0
.end method

.method public final c()LE/a;
    .locals 1

    sget-object v0, LQ/t;->e:LE/a;

    return-object v0
.end method

.method public final d()LE/a;
    .locals 1

    sget-object v0, LQ/t;->d:LE/a;

    return-object v0
.end method

.method public final e()LE/a;
    .locals 1

    sget-object v0, LQ/t;->c:LE/a;

    return-object v0
.end method
