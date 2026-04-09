.class final Lxb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/E;


# instance fields
.field private final a:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "httpExceptionTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb/d;->a:Lmh/l;

    return-void
.end method

.method public static final synthetic b(Lxb/d;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lxb/d;->a:Lmh/l;

    return-object p0
.end method


# virtual methods
.method public a(Lgg/z;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/d$a;

    invoke-direct {v0, p0}, Lxb/d$a;-><init>(Lxb/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
