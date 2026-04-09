.class public final LIc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIc/a;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method public constructor <init>(LZc/f;)V
    .locals 1

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object v0, LIc/b$a;->a:LIc/b$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LIc/b;->a:Lgg/i;

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LIc/b;->a:Lgg/i;

    return-object v0
.end method
