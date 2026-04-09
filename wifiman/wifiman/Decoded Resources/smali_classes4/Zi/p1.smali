.class public final LZi/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final b:LZi/p1;


# instance fields
.field private final synthetic a:LZi/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZi/p1;

    invoke-direct {v0}, LZi/p1;-><init>()V

    sput-object v0, LZi/p1;->b:LZi/p1;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LZi/v0;

    const-string v1, "kotlin.Unit"

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-direct {v0, v1, v2}, LZi/v0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LZi/p1;->a:LZi/v0;

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, LZi/p1;->a:LZi/v0;

    invoke-virtual {v0}, LZi/v0;->a()LXi/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/p1;->g(LYi/e;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYg/J;

    invoke-virtual {p0, p1, p2}, LZi/p1;->h(LYi/f;LYg/J;)V

    return-void
.end method

.method public g(LYi/e;)V
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/p1;->a:LZi/v0;

    invoke-virtual {v0, p1}, LZi/v0;->c(LYi/e;)Ljava/lang/Object;

    return-void
.end method

.method public h(LYi/f;LYg/J;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZi/p1;->a:LZi/v0;

    invoke-virtual {v0, p1, p2}, LZi/v0;->e(LYi/f;Ljava/lang/Object;)V

    return-void
.end method
