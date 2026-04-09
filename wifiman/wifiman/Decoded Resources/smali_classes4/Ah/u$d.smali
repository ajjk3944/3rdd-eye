.class public final LAh/u$d;
.super Lxi/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAh/u;->A(LBh/z;)LAh/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LAh/u$d;->a:Ljava/lang/String;

    iput-object p2, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Lxi/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAh/u$d;->e()LAh/u$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LBh/e;

    invoke-virtual {p0, p1}, LAh/u$d;->d(LBh/e;)Z

    move-result p1

    return p1
.end method

.method public d(LBh/e;)Z
    .locals 2

    const-string v0, "javaClassDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSh/F;->a:LSh/F;

    iget-object v1, p0, LAh/u$d;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LAh/x;->a:LAh/x;

    invoke-virtual {v0}, LAh/x;->f()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    sget-object v0, LAh/u$a;->HIDDEN:LAh/u$a;

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LAh/x;->i()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    sget-object v0, LAh/u$a;->VISIBLE:LAh/u$a;

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LAh/x;->c()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    sget-object v0, LAh/u$a;->DEPRECATED_LIST_METHODS:LAh/u$a;

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LAh/x;->d()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    sget-object v0, LAh/u$a;->DROP:LAh/u$a;

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_3
    :goto_0
    iget-object p1, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public e()LAh/u$a;
    .locals 1

    iget-object v0, p0, LAh/u$d;->b:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LAh/u$a;

    if-nez v0, :cond_0

    sget-object v0, LAh/u$a;->NOT_CONSIDERED:LAh/u$a;

    :cond_0
    return-object v0
.end method
