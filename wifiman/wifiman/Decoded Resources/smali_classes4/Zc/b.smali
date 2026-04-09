.class public final LZc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZc/a;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method public constructor <init>(Lkd/d;)V
    .locals 1

    const-string v0, "publicIpService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lkd/d;->a()Lgg/i;

    move-result-object p1

    sget-object v0, LZc/b$a;->a:LZc/b$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lb8/a$b;->a:Lb8/a$b;

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

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

    iput-object p1, p0, LZc/b;->a:Lgg/i;

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LZc/b;->a:Lgg/i;

    return-object v0
.end method
