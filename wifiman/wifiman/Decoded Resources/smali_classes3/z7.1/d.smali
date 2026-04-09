.class public final Lz7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/a;


# instance fields
.field private final b:Lo7/b;

.field private final c:Lz7/x;


# direct methods
.method public constructor <init>(Lo7/b;Lz7/x;)V
    .locals 1

    const-string/jumbo v0, "androidServices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/d;->b:Lo7/b;

    iput-object p2, p0, Lz7/d;->c:Lz7/x;

    return-void
.end method

.method public static final synthetic b(Lz7/d;)Lz7/x;
    .locals 0

    iget-object p0, p0, Lz7/d;->c:Lz7/x;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lz7/d;->b:Lo7/b;

    invoke-interface {v0}, Lo7/b;->a()Lgg/i;

    move-result-object v0

    new-instance v1, Lz7/d$a;

    invoke-direct {v1, p0, p1}, Lz7/d$a;-><init>(Lz7/d;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "@SuppressLint(\"NewApi\")\n\u2026    }\n            }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
