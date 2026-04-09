.class public final Lxb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/E;


# instance fields
.field private final a:Lxb/a;


# direct methods
.method public constructor <init>(Lxb/a;)V
    .locals 1

    const-string/jumbo v0, "exceptionMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb/f;->a:Lxb/a;

    return-void
.end method

.method public static final synthetic b(Lxb/f;)Lxb/a;
    .locals 0

    iget-object p0, p0, Lxb/f;->a:Lxb/a;

    return-object p0
.end method


# virtual methods
.method public a(Lgg/z;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxb/f$a;

    invoke-direct {v0, p0}, Lxb/f$a;-><init>(Lxb/f;)V

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
