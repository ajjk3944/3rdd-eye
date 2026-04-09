.class public abstract Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;
.super Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;
    }
.end annotation


# instance fields
.field private final b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    .line 2
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->t()Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    return-void
.end method

.method protected constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;-><init>()V

    .line 4
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;->k(Lkotlin/reflect/jvm/internal/impl/protobuf/h$c;)Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    return-void
.end method

.method static synthetic C(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;)Lkotlin/reflect/jvm/internal/impl/protobuf/g;
    .locals 0

    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    return-object p0
.end method

.method private d0(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V
    .locals 1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->b()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object p1

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/o;->c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected E()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->n()Z

    move-result v0

    return v0
.end method

.method protected F()I
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->k()I

    move-result v0

    return v0
.end method

.method public final J(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;
    .locals 2

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->d0(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->h(Lkotlin/reflect/jvm/internal/impl/protobuf/g$b;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->b:Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;I)Ljava/lang/Object;
    .locals 2

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->d0(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    iget-object v1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;

    invoke-virtual {v0, v1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->i(Lkotlin/reflect/jvm/internal/impl/protobuf/g$b;I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)I
    .locals 1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->d0(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->j(Lkotlin/reflect/jvm/internal/impl/protobuf/g$b;)I

    move-result p1

    return p1
.end method

.method public final S(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Z
    .locals 1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->d0(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->m(Lkotlin/reflect/jvm/internal/impl/protobuf/g$b;)Z

    move-result p1

    return p1
.end method

.method protected T()Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d$a;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;ZLkotlin/reflect/jvm/internal/impl/protobuf/h$a;)V

    return-object v0
.end method

.method protected s()V
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/g;->q()V

    return-void
.end method

.method protected y(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z
    .locals 6

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/protobuf/o;->c()Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/impl/protobuf/h;->o(Lkotlin/reflect/jvm/internal/impl/protobuf/g;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/CodedOutputStream;Lkotlin/reflect/jvm/internal/impl/protobuf/f;I)Z

    move-result p1

    return p1
.end method
