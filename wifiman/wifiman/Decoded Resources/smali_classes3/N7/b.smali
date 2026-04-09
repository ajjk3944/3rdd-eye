.class public final LN7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN7/b;

.field private static final b:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN7/b;

    invoke-direct {v0}, LN7/b;-><init>()V

    sput-object v0, LN7/b;->a:LN7/b;

    new-instance v0, LN7/b$a;

    invoke-direct {v0}, LN7/b$a;-><init>()V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lgg/b;->l()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete {\n        Syste\u2026E)\n    }\n        .cache()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LN7/b;->b:Lgg/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lgg/b;
    .locals 1

    sget-object v0, LN7/b;->b:Lgg/b;

    return-object v0
.end method
