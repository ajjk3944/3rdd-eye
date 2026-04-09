.class public final LGf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LGf/a;

.field public static b:Lmh/p;

.field public static c:Lmh/p;

.field public static d:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LGf/a;

    invoke-direct {v0}, LGf/a;-><init>()V

    sput-object v0, LGf/a;->a:LGf/a;

    sget-object v0, LGf/a$a;->a:LGf/a$a;

    const v1, -0x5363981

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LGf/a;->b:Lmh/p;

    const v0, 0x495ad149

    sget-object v1, LGf/a$b;->a:LGf/a$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LGf/a;->c:Lmh/p;

    const v0, 0x656054c0

    sget-object v1, LGf/a$c;->a:LGf/a$c;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LGf/a;->d:Lmh/p;

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

    sget-object v0, LGf/a;->b:Lmh/p;

    return-object v0
.end method
