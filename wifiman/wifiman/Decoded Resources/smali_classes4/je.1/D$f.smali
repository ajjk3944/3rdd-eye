.class final Lje/D$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/D;-><init>(Lje/u;Lfe/u;LT7/d;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lje/D;


# direct methods
.method constructor <init>(Lje/D;)V
    .locals 0

    iput-object p1, p0, Lje/D$f;->a:Lje/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lje/D;Lje/r;)Z
    .locals 0

    invoke-static {p0, p1}, Lje/D$f;->c(Lje/D;Lje/r;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lje/D;Lje/r;)Z
    .locals 4

    invoke-static {p0}, Lje/D;->d(Lje/D;)Ljava/util/concurrent/LinkedBlockingDeque;

    move-result-object v0

    new-instance v1, LWc/c;

    invoke-static {p0}, Lje/D;->e(Lje/D;)LT7/d;

    move-result-object p0

    invoke-interface {p0}, LT7/d;->a()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingDeque;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lje/D$f;->b(Lje/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final b(Lje/r;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lje/D$f;->a:Lje/D;

    new-instance v1, Lje/E;

    invoke-direct {v1, v0, p1}, Lje/E;-><init>(Lje/D;Lje/r;)V

    invoke-static {v0, v1}, Lje/D;->f(Lje/D;Lmh/a;)V

    return-void
.end method
