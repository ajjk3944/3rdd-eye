.class final LD8/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/k$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/k$c;

    invoke-direct {v0}, LD8/k$c;-><init>()V

    sput-object v0, LD8/k$c;->a:LD8/k$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Ll9/a;)Ll9/a;
    .locals 10

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Laf/O;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Laf/O;

    if-nez v5, :cond_0

    if-nez v6, :cond_0

    new-instance p1, Ll9/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ll9/a;

    new-instance p2, Laf/P;

    new-instance v1, Ls9/d$b;

    const v0, 0x7f11027d

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {}, LCi/a;->a()LCi/f;

    move-result-object v4

    const/16 v8, 0x42

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v9}, Laf/P;-><init>(Ls9/d;LDe/g;LW7/e;LCi/c;Laf/O;Laf/O;Laf/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LD8/k$c;->a(Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
