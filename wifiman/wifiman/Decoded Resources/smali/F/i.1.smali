.class public final LF/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF/i;

.field public static b:Lmh/q;

.field public static c:Lmh/q;

.field public static d:Lmh/q;

.field public static e:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF/i;

    invoke-direct {v0}, LF/i;-><init>()V

    sput-object v0, LF/i;->a:LF/i;

    sget-object v0, LF/i$a;->a:LF/i$a;

    const v1, 0x3b79c49c

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LF/i;->b:Lmh/q;

    const v0, 0x7d8127ef

    sget-object v1, LF/i$b;->a:LF/i$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LF/i;->c:Lmh/q;

    const v0, 0x19e074df

    sget-object v1, LF/i$c;->a:LF/i$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LF/i;->d:Lmh/q;

    const v0, -0x213864e

    sget-object v1, LF/i$d;->a:LF/i$d;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LF/i;->e:Lmh/q;

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

    sget-object v0, LF/i;->b:Lmh/q;

    return-object v0
.end method

.method public final b()Lmh/q;
    .locals 1

    sget-object v0, LF/i;->c:Lmh/q;

    return-object v0
.end method
